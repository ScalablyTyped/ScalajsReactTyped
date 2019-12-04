package typingsJapgolly.antd.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_ScrollToFirstRowOnChange
import typingsJapgolly.antd.antdNumbers.`false`
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.antd.libTableInterfaceMod.ColumnProps
import typingsJapgolly.antd.libTableInterfaceMod.ExpandIconProps
import typingsJapgolly.antd.libTableInterfaceMod.SortOrder
import typingsJapgolly.antd.libTableInterfaceMod.SorterResult
import typingsJapgolly.antd.libTableInterfaceMod.TableComponents
import typingsJapgolly.antd.libTableInterfaceMod.TableCurrentDataSource
import typingsJapgolly.antd.libTableInterfaceMod.TableEventListeners
import typingsJapgolly.antd.libTableInterfaceMod.TableLocale
import typingsJapgolly.antd.libTableInterfaceMod.TableProps
import typingsJapgolly.antd.libTableInterfaceMod.TableRowSelection
import typingsJapgolly.antd.libTableInterfaceMod.TableSize
import typingsJapgolly.antd.libTableMod.default
import typingsJapgolly.csstype.csstypeMod.TableLayoutProperty
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Table {
  def apply[T](
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    childrenColumnName: String = null,
    className: String = null,
    columns: js.Array[ColumnProps[T]] = null,
    components: TableComponents = null,
    dataSource: js.Array[T] = null,
    defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined,
    defaultExpandedRowKeys: js.Array[Double | String] = null,
    dropdownPrefixCls: String = null,
    expandIcon: /* props */ ExpandIconProps[T] => CallbackTo[Node] = null,
    expandIconAsCell: js.UndefOr[Boolean] = js.undefined,
    expandIconColumnIndex: Int | Double = null,
    expandRowByClick: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[Double | String] = null,
    expandedRowRender: (T, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => CallbackTo[Node] = null,
    footer: /* currentPageData */ js.Array[T] => CallbackTo[Node] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    indentSize: Int | Double = null,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ PaginationConfig, /* filters */ Record[String, js.Array[String]], /* sorter */ SorterResult[T], /* extra */ TableCurrentDataSource[T]) => Callback = null,
    onExpand: (/* expanded */ Boolean, T) => Callback = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[Double | String] => Callback = null,
    onHeaderRow: /* columns */ js.Array[ColumnProps[T]] => CallbackTo[TableEventListeners] = null,
    onRow: (T, /* index */ Double) => CallbackTo[TableEventListeners] = null,
    onRowClick: (T, /* index */ Double, /* event */ Event) => Callback = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    rowClassName: (T, /* index */ Double) => CallbackTo[String] = null,
    rowKey: String | (js.Function2[T, /* index */ Double, String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: Anon_ScrollToFirstRowOnChange = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: CSSProperties = null,
    tableLayout: TableLayoutProperty = null,
    title: /* currentPageData */ js.Array[T] => CallbackTo[Node] = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TableProps[T], default[T], Unit, TableProps[T]] = {
    val __obj = js.Dynamic.literal()
  
      if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (childrenColumnName != null) __obj.updateDynamic("childrenColumnName")(childrenColumnName.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultExpandAllRows)) __obj.updateDynamic("defaultExpandAllRows")(defaultExpandAllRows.asInstanceOf[js.Any])
    if (defaultExpandedRowKeys != null) __obj.updateDynamic("defaultExpandedRowKeys")(defaultExpandedRowKeys.asInstanceOf[js.Any])
    if (dropdownPrefixCls != null) __obj.updateDynamic("dropdownPrefixCls")(dropdownPrefixCls.asInstanceOf[js.Any])
    if (expandIcon != null) __obj.updateDynamic("expandIcon")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.antd.libTableInterfaceMod.ExpandIconProps[T]) => expandIcon(t0).runNow()))
    if (!js.isUndefined(expandIconAsCell)) __obj.updateDynamic("expandIconAsCell")(expandIconAsCell.asInstanceOf[js.Any])
    if (expandIconColumnIndex != null) __obj.updateDynamic("expandIconColumnIndex")(expandIconColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(expandRowByClick)) __obj.updateDynamic("expandRowByClick")(expandRowByClick.asInstanceOf[js.Any])
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4((t0: T, t1: /* index */ scala.Double, t2: /* indent */ scala.Double, t3: /* expanded */ scala.Boolean) => expandedRowRender(t0, t1, t2, t3).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* currentPageData */ js.Array[T]) => footer(t0).runNow()))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* pagination */ typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig, t1: /* filters */ typingsJapgolly.std.Record[java.lang.String, js.Array[java.lang.String]], t2: /* sorter */ typingsJapgolly.antd.libTableInterfaceMod.SorterResult[T], t3: /* extra */ typingsJapgolly.antd.libTableInterfaceMod.TableCurrentDataSource[T]) => onChange(t0, t1, t2, t3).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expanded */ scala.Boolean, t1: T) => onExpand(t0, t1).runNow()))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1((t0: /* expandedRowKeys */ js.Array[scala.Double | java.lang.String]) => onExpandedRowsChange(t0).runNow()))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction1((t0: /* columns */ js.Array[typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T]]) => onHeaderRow(t0).runNow()))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: T, t1: /* index */ scala.Double) => onRow(t0, t1).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3((t0: T, t1: /* index */ scala.Double, t2: /* event */ org.scalajs.dom.raw.Event) => onRowClick(t0, t1, t2).runNow()))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction2((t0: T, t1: /* index */ scala.Double) => rowClassName(t0, t1).runNow()))
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (scroll != null) __obj.updateDynamic("scroll")(scroll.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeader)) __obj.updateDynamic("showHeader")(showHeader.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sortDirections != null) __obj.updateDynamic("sortDirections")(sortDirections.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tableLayout != null) __obj.updateDynamic("tableLayout")(tableLayout.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction1((t0: /* currentPageData */ js.Array[T]) => title(t0).runNow()))
    if (!js.isUndefined(useFixedHeader)) __obj.updateDynamic("useFixedHeader")(useFixedHeader.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.antd.libTableInterfaceMod.TableProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.antd.libTableMod.default[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antd.libTableInterfaceMod.TableProps[T]])(children: _*)
  }
  @JSImport("antd/lib/table", JSImport.Default)
  @js.native
  object componentImport extends js.Object
  
}

