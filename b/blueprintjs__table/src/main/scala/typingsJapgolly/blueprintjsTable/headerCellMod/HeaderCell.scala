package typingsJapgolly.blueprintjsTable.headerCellMod

import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Element
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
@js.native
class HeaderCell ()
  extends Component[IInternalHeaderCellProps, IHeaderCellState, js.Any] {
  def renderContextMenu(_event: ReactMouseEventFrom[HTMLElement]): Element = js.native
  @JSName("shouldComponentUpdate")
  def shouldComponentUpdate_MHeaderCell(nextProps: IHeaderCellProps): Boolean = js.native
}

