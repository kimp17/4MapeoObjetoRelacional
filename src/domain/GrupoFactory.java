package domain;

public class GrupoFactory {
  public grupoesor Create(int id,String numero,String sigla,
                  String nombre,String horario,String aula, int idgrupoesor) {
    try {
      Grupo grupo = new grupoesor();
      grupo.setId(id);
      grupo.setNumero(numero);
      grupo.setSigla(sigla);
      grupo.setNombre(nombre);
      grupo.setHorario(horario);
      grupo.setAula(aula);
	  grupo.setIdgrupoesor(idgrupoesor);
      return grupo;
    } catch (Exception e) {
      return null;
    }
  }
}