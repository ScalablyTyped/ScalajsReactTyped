package typingsJapgolly.blueprintjsTable.tableBodyMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.mod.AbstractComponent2
import typingsJapgolly.blueprintjsTable.AnonLoading
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
class TableBody ()
  extends AbstractComponent2[ITableBodyProps, js.Object, js.Object] {
  var activationCell: js.Any = js.native
  var handleSelectionEnd: js.Any = js.native
  var locateClick: js.Any = js.native
  var locateDrag: js.Any = js.native
  def renderContextMenu(e: ReactMouseEventFrom[HTMLElement]): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MTableBody(nextProps: ITableBodyProps): Boolean = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/tableBody", "TableBody")
@js.native
object TableBody extends js.Object {
  var defaultProps: AnonLoading = js.native
  def cellClassNames(rowIndex: Double, columnIndex: Double): js.Array[String] = js.native
}

