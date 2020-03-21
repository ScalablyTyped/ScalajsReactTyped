package typingsJapgolly.rcTable.bodyRowMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.CustomizeComponent
import typingsJapgolly.rcTable.interfaceMod.GetComponentProps
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.StickyOffsets
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyRowProps[RecordType] extends js.Object {
  var cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var childrenColumnName: String
  var className: js.UndefOr[String] = js.undefined
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var indent: js.UndefOr[Double] = js.undefined
  var index: Double
  var onRow: GetComponentProps[RecordType]
  var record: RecordType
  var recordKey: Key
  var rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]]
  var rowKey: typingsJapgolly.react.mod.Key
  var stickyOffsets: StickyOffsets
  var style: js.UndefOr[CSSProperties] = js.undefined
  def rowExpandable(record: RecordType): Boolean
}

object BodyRowProps {
  @scala.inline
  def apply[RecordType](
    cellComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    childrenColumnName: String,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[Key],
    index: Double,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]],
    record: RecordType,
    recordKey: Key,
    rowComponent: CustomizeComponent[HTMLAttributes[HTMLElement]],
    rowExpandable: RecordType => CallbackTo[Boolean],
    rowKey: typingsJapgolly.react.mod.Key,
    stickyOffsets: StickyOffsets,
    className: String = null,
    indent: Int | Double = null,
    style: CSSProperties = null
  ): BodyRowProps[RecordType] = {
    val __obj = js.Dynamic.literal(cellComponent = cellComponent.asInstanceOf[js.Any], childrenColumnName = childrenColumnName.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], record = record.asInstanceOf[js.Any], recordKey = recordKey.asInstanceOf[js.Any], rowComponent = rowComponent.asInstanceOf[js.Any], rowKey = rowKey.asInstanceOf[js.Any], stickyOffsets = stickyOffsets.asInstanceOf[js.Any])
    __obj.updateDynamic("getRowKey")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => getRowKey(t0, t1).runNow()))
    __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => onRow(t0, t1).runNow()))
    __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1((t0: RecordType) => rowExpandable(t0).runNow()))
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (indent != null) __obj.updateDynamic("indent")(indent.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRowProps[RecordType]]
  }
}

