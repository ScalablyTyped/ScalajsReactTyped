package typingsJapgolly.reactTable.mod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseTableCellProps[D /* <: js.Object */] extends js.Object {
  var column: ColumnInstance[D] = js.native
  var row: Row[D] = js.native
  var value: CellValue = js.native
  def getCellProps(): TableCellProps = js.native
  def getCellProps(propGetter: CellPropGetter[D]): TableCellProps = js.native
  def render(`type`: String): Node = js.native
  def render(`type`: String, userProps: js.Object): Node = js.native
  @JSName("render")
  def render_Cell(`type`: typingsJapgolly.reactTable.reactTableStrings.Cell): Node = js.native
  @JSName("render")
  def render_Cell(`type`: typingsJapgolly.reactTable.reactTableStrings.Cell, userProps: js.Object): Node = js.native
}

