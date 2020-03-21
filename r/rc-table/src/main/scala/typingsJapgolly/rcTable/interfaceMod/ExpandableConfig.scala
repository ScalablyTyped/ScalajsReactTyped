package typingsJapgolly.rcTable.interfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExpandableConfig[RecordType] extends LegacyExpandableProps[RecordType] {
  var rowExpandable: js.UndefOr[js.Function1[/* record */ RecordType, Boolean]] = js.undefined
}

object ExpandableConfig {
  @scala.inline
  def apply[RecordType](
    childrenColumnName: String = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => CallbackTo[Node] = null,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => CallbackTo[String] = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => CallbackTo[Node] = null,
    indentSize: Int | Double = null,
    onExpand: (/* expanded */ Boolean, RecordType) => Callback = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Callback = null,
    rowExpandable: /* record */ RecordType => CallbackTo[Boolean] = null
  ): ExpandableConfig[RecordType] = {
    val __obj = js.Dynamic.literal()
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps[RecordType]) => expandIcon(t0).runNow()))
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double) => expandedRowClassName(t0, t1, t2).runNow()))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double, t3: /* expanded */ scala.Boolean) => expandedRowRender(t0, t1, t2, t3).runNow()))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expanded */ scala.Boolean, t1: RecordType) => onExpand(t0, t1).runNow()))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[typingsJapgolly.rcTable.interfaceMod.Key]) => onExpandedRowsChange(t0).runNow()))
    if (rowExpandable != null) __obj.updateDynamic("rowExpandable")(js.Any.fromFunction1((t0: /* record */ RecordType) => rowExpandable(t0).runNow()))
    __obj.asInstanceOf[ExpandableConfig[RecordType]]
  }
}

