package typingsJapgolly.rcTable.interfaceMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderedCell[RecordType] extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var props: js.UndefOr[CellType[RecordType]] = js.undefined
}

object RenderedCell {
  @scala.inline
  def apply[RecordType](children: VdomNode = null, props: CellType[RecordType] = null): RenderedCell[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderedCell[RecordType]]
  }
}

