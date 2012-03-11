/**
 * File: NameVornameComparator.java
 * Authors:
 *   Lukas Diener - 11-123-213
 *   Michael Kohler - 11-108-289
 *
 * Klasse zum Vergleichen zweier Objekte (Records) vom Typ StudentIn
 * bezueglich des Namen und Vornamen (in dieser Reihenfolge).
 *
 */

public class NameVornameComparator implements java.util.Comparator<StudentIn> {

  /**
   * Setzt den Namen und Vornamen zusammen. Wir koennen diesen String
   * dann vergleichen. Es muss nicht separat gemacht werden.
   */
  private String joinName(StudentIn obj) {
	  return obj.getName() + " " + obj.getVorname();
  }

  /** Vergleicht Objekt a mit Objekt b und
   *  liefert -1 (wenn a<b), 0 (wenn a=b) oder +1 (wenn a>b) */
  public int compare(StudentIn a, StudentIn b) {
    return joinName(a).compareTo(joinName(b));
  }

}
