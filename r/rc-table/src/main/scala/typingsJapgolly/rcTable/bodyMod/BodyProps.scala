package typingsJapgolly.rcTable.bodyMod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.GetComponentProps
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyProps[RecordType] extends js.Object {
  var childrenColumnName: String
  var data: js.Array[RecordType]
  var emptyNode: Node
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var measureColumnWidth: Boolean
  var onRow: GetComponentProps[RecordType]
  var stickyOffsets: StickyOffsets
  def rowExpandable(record: RecordType): Boolean
}

object BodyProps {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String,
    data: js.Array[RecordType],
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[Key],
    measureColumnWidth: Boolean,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    rowExpandable: RecordType => CallbackTo[Boolean],
    stickyOffsets: StickyOffsets,
    emptyNode: VdomNode = null
  ): BodyProps[RecordType] = {
    val __obj = js.Dynamic.literal(childrenColumnName = childrenColumnName.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], measureColumnWidth = measureColumnWidth.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.updateDynamic("getRowKey")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => getRowKey(t0, t1).runNow()))
    __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => onRow(t0, t1).runNow()))
    __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1((t0: RecordType) => rowExpandable(t0).runNow()))
    if (emptyNode != null) __obj.updateDynamic("emptyNode")(emptyNode.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyProps[RecordType]]
  }
}

