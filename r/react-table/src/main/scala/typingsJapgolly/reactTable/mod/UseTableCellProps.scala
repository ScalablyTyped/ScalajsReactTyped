package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UseTableCellProps[D /* <: js.Object */, V] extends StObject {
  
  var column: ColumnInstance[D] = js.native
  
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  
  def render(`type`: String): Node = js.native
  def render(`type`: String, userProps: js.Object): Node = js.native
  @JSName("render")
  def render_Cell(`type`: typingsJapgolly.reactTable.reactTableStrings.Cell): Node = js.native
  @JSName("render")
  def render_Cell(`type`: typingsJapgolly.reactTable.reactTableStrings.Cell, userProps: js.Object): Node = js.native
  
  var row: Row[D] = js.native
  
  var value: CellValue[V] = js.native
}
