package data;
import java.util.Collection;
import util.GrupoDTO;
import util.GrupoAssembler;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class GrupoDAO extends HibernateDaoSupport {
 public boolean insert(GrupoDTO grupDTO) {
   getHibernateTemplate().saveOrUpdate(grupDTO);
   return true;
 }
 public boolean delete(GrupoDTO grupDTO) {
   getHibernateTemplate().delete(grupDTO);
   return true;
 }
 public GrupoDTO findById(int id) {
   GrupoDTO grup;
   grup = (GrupoDTO)getHibernateTemplate().get(GrupoDTO.class,new Integer(id));
   return grup;
 }
 public boolean update(GrupoDTO grupDTO) {
   getHibernateTemplate().saveOrUpdate(grupDTO);
   return true;
 }
 public Collection findAll() {
   return getHibernateTemplate().find("from GrupoDTO");
 }
}