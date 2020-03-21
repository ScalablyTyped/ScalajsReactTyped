package typingsJapgolly.rcTable

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIcon
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.interfaceMod.TriggerEventHandler
import typingsJapgolly.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumns[RecordType] extends js.Object {
  var children: js.UndefOr[Node] = js.undefined
  var columns: js.UndefOr[ColumnsType[RecordType]] = js.undefined
  var expandIcon: js.UndefOr[RenderExpandIcon[RecordType]] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandable: Boolean
  var expandedKeys: Set[Key]
  var getRowKey: GetRowKey[RecordType]
  var onTriggerExpand: TriggerEventHandler[RecordType]
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}

object AnonColumns {
  @scala.inline
  def apply[RecordType](
    expandable: Boolean,
    expandedKeys: Set[Key],
    getRowKey: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[Key],
    onTriggerExpand: (RecordType, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback,
    children: VdomNode = null,
    columns: ColumnsType[RecordType] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => CallbackTo[Node] = null,
    expandIconColumnIndex: Int | Double = null,
    prefixCls: String = null,
    rowExpandable: /* record */ RecordType => CallbackTo[Boolean] = null
  ): AnonColumns[RecordType] = {
    val __obj = js.Dynamic.literal(expandable = expandable.asInstanceOf[js.Any], expandedKeys = expandedKeys.asInstanceOf[js.Any])
    __obj.updateDynamic("getRowKey")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => getRowKey(t0, t1).runNow()))
    __obj.updateDynamic("onTriggerExpand")(js.Any.fromFunction2((t0: RecordType, t1: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onTriggerExpand(t0, t1).runNow()))
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps[RecordType]) => expandIcon(t0).runNow()))
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowExpandable != null) __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1((t0: /* record */ RecordType) => rowExpandable(t0).runNow()))
    __obj.asInstanceOf[AnonColumns[RecordType]]
  }
}

