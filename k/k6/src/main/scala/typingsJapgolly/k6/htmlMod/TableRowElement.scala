package typingsJapgolly.k6.htmlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* note: abstract class */ @JSImport("k6/html", "TableRowElement")
@js.native
open class TableRowElement () extends Element {
  
  /** Contained table cell elements. */
  def cells(): js.Array[TableCellElement] = js.native
  
  /** Index in containing table. */
  def rowIndex(): Double = js.native
  
  /** Index in containing table section. */
  def sectionRowIndex(): Double = js.native
}
