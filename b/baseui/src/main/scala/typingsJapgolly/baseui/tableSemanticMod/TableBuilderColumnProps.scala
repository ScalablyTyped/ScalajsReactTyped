package typingsJapgolly.baseui.tableSemanticMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderColumnProps[RowT] extends js.Object {
  var header: js.UndefOr[Node] = js.native
  var id: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var overrides: js.UndefOr[ColumnOverrides] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  def children(row: RowT): Node = js.native
  def children(row: RowT, rowIndex: Double): Node = js.native
  def children(row: js.Any): Node = js.native
  def children(row: js.Any, rowIndex: Double): Node = js.native
}

