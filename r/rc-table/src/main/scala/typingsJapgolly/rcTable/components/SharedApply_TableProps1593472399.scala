package typingsJapgolly.rcTable.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.rcTable.AnonBody
import typingsJapgolly.rcTable.AnonX
import typingsJapgolly.rcTable.interfaceMod.ColumnType
import typingsJapgolly.rcTable.interfaceMod.ColumnsType
import typingsJapgolly.rcTable.interfaceMod.DefaultRecordType
import typingsJapgolly.rcTable.interfaceMod.ExpandableConfig
import typingsJapgolly.rcTable.interfaceMod.GetRowKey
import typingsJapgolly.rcTable.interfaceMod.Key
import typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps
import typingsJapgolly.rcTable.interfaceMod.RowClassName
import typingsJapgolly.rcTable.interfaceMod.TableComponents
import typingsJapgolly.rcTable.interfaceMod.TableLayout
import typingsJapgolly.rcTable.tableMod.TableProps
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_TableProps1593472399 () {
  val componentImport: js.Any
  def apply[RecordType /* <: DefaultRecordType */](
    childrenColumnName: String = null,
    className: String = null,
    columns: ColumnsType[RecordType] = null,
    components: TableComponents[RecordType] = null,
    data: js.Array[RecordType] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Key] = null,
    emptyText: Node | js.Function0[Node] = null,
    expandIcon: /* props */ RenderExpandIconProps[RecordType] => CallbackTo[Node] = null,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandable: ExpandableConfig[RecordType] = null,
    expandedRowClassName: (RecordType, /* index */ Double, /* indent */ Double) => CallbackTo[String] = null,
    expandedRowKeys: js.Array[Key] = null,
    expandedRowRender: (RecordType, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => CallbackTo[Node] = null,
    footer: /* data */ js.Array[RecordType] => CallbackTo[Node] = null,
    id: String = null,
    indentSize: Int | Double = null,
    internalHooks: String = null,
    internalRefs: AnonBody = null,
    onExpand: (/* expanded */ Boolean, RecordType) => Callback = null,
    onExpandedRowsChange: /* expandedKeys */ js.Array[Key] => Callback = null,
    onHeaderRow: (js.Array[ColumnType[RecordType]], /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]] = null,
    onRow: (RecordType, /* index */ js.UndefOr[Double]) => CallbackTo[HTMLAttributes[HTMLElement]] = null,
    prefixCls: String = null,
    rowClassName: String | RowClassName[RecordType] = null,
    rowKey: String | GetRowKey[RecordType] = null,
    scroll: AnonX = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    summary: /* data */ js.Array[RecordType] => CallbackTo[Node] = null,
    tableLayout: TableLayout = null,
    title: /* data */ js.Array[RecordType] => CallbackTo[Node] = null,
    transformColumns: /* columns */ ColumnsType[RecordType] => CallbackTo[ColumnsType[RecordType]] = null,
    key: js.UndefOr[japgolly.scalajs.react.Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    TableProps[RecordType], 
    MountedWithRawType[TableProps[RecordType], js.Object, RawMounted[TableProps[RecordType], js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.rcTable.interfaceMod.RenderExpandIconProps[RecordType]) => expandIcon(t0).runNow()))
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.asInstanceOf[js.Any])
    if (expandable != null) __obj.updateDynamic("expandable")(expandable.asInstanceOf[js.Any])
    if (expandedRowClassName != null) __obj.updateDynamic("expandedRowClassName")(js.Any.fromFunction3((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double) => expandedRowClassName(t0, t1, t2).runNow()))
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4((t0: RecordType, t1: /* index */ scala.Double, t2: /* indent */ scala.Double, t3: /* expanded */ scala.Boolean) => expandedRowRender(t0, t1, t2, t3).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* data */ js.Array[RecordType]) => footer(t0).runNow()))
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (internalHooks != null) __obj.updateDynamic("internalHooks")(internalHooks.asInstanceOf[js.Any])
    if (internalRefs != null) __obj.updateDynamic("internalRefs")(internalRefs.asInstanceOf[js.Any])
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expanded */ scala.Boolean, t1: RecordType) => onExpand(t0, t1).runNow()))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1((t0: /* expandedKeys */ js.Array[typingsJapgolly.rcTable.interfaceMod.Key]) => onExpandedRowsChange(t0).runNow()))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction2((t0: js.Array[typingsJapgolly.rcTable.interfaceMod.ColumnType[RecordType]], t1: /* index */ js.UndefOr[scala.Double]) => onHeaderRow(t0, t1).runNow()))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: RecordType, t1: /* index */ js.UndefOr[scala.Double]) => onRow(t0, t1).runNow()))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(rowClassName.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(js.Any.fromFunction1((t0: /* data */ js.Array[RecordType]) => summary(t0).runNow()))
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1((t0: /* data */ js.Array[RecordType]) => title(t0).runNow()))
    if (transformColumns != null) __obj.updateDynamic("transformColumns")(js.Any.fromFunction1((t0: /* columns */ typingsJapgolly.rcTable.interfaceMod.ColumnsType[RecordType]) => transformColumns(t0).runNow()))
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.rcTable.tableMod.TableProps[RecordType], 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.rcTable.tableMod.TableProps[RecordType]])(children: _*)
  }
}

