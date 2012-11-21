package data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import domain.GrupoRepository;
import util.GrupoDTO;
import util.GrupoAssembler;
import domain.Grupo;

public class GrupoRepositoryDAOImpl implements GrupoRepository {
 private GrupoDAO grupDAO;
 GrupoRepositoryDAOImpl(GrupoDAO grupDAO) {
   this.grupDAO = grupDAO;
 }
 public boolean insertGrupo(Grupo grup) {
   GrupoDTO profDTO = GrupoAssembler.CreateDTO(grup);
   return (grupDAO.insert(grupDTO));
 }
 public boolean deleteGrupo(Grupo grup) {
   GrupoDTO grupDTO = GrupoAssembler.CreateDTO(grup);
   return (grupDAO.delete(grupDTO));
 }
 public Grupo findGrupo(int id) {
   GrupoDTO grupDTO = grupDAO.findById(id);
   if (grupDTO!=null) {
     Grupo prof = new Grupo();
     System.out.println(grupDTO.getSigla());
     ProfesorAssembler.Update(grup,grupDTO);
     return grup;
   }
   return null;
 }
 public boolean updateGrupo(Grupo grup) {
   GrupoDTO grupDTO = GrupoAssembler.CreateDTO(grup);
   return (grupDAO.update(grupDTO));
 }
 public Collection findAllGrupos() {
   Collection gruposDTO = grupDAO.findAll();
   List grupList = new ArrayList();
   Iterator itr = gruposDTO.iterator();
   while (itr.hasNext()) {
     Grupo grup = new Grupo();
     GrupoDTO grupDTO = (GrupoDTO)itr.next();
     GrupoAssembler.Update(grup,grupDTO);
     grupList.add(grup);
   }
   return grupList;
 }
}