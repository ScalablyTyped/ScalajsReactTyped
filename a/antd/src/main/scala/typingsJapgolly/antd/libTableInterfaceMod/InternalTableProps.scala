package typingsJapgolly.antd.libTableInterfaceMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.antd.Anon_ScrollToFirstRowOnChange
import typingsJapgolly.antd.antdNumbers.`false`
import typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.antd.libTableCreateStoreMod.Store
import typingsJapgolly.csstype.csstypeMod.TableLayoutProperty
import typingsJapgolly.react.reactMod.CSSProperties
import typingsJapgolly.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined antd.antd/lib/table/interface.TableProps<T> & antd.antd/lib/table/interface.WithStore */
trait InternalTableProps[T] extends js.Object {
  var bodyStyle: js.UndefOr[CSSProperties] = js.undefined
  var bordered: js.UndefOr[Boolean] = js.undefined
  var checkboxPropsCache: CheckboxPropsCache
  var children: js.UndefOr[Node] = js.undefined
  var childrenColumnName: js.UndefOr[String] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var columns: js.UndefOr[js.Array[ColumnProps[T]]] = js.undefined
  var components: js.UndefOr[TableComponents] = js.undefined
  var dataSource: js.UndefOr[js.Array[T]] = js.undefined
  var defaultExpandAllRows: js.UndefOr[Boolean] = js.undefined
  var defaultExpandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var dropdownPrefixCls: js.UndefOr[String] = js.undefined
  var expandIcon: js.UndefOr[js.Function1[/* props */ ExpandIconProps[T], Node]] = js.undefined
  var expandIconAsCell: js.UndefOr[Boolean] = js.undefined
  var expandIconColumnIndex: js.UndefOr[Double] = js.undefined
  var expandRowByClick: js.UndefOr[Boolean] = js.undefined
  var expandedRowKeys: js.UndefOr[js.Array[Double | String]] = js.undefined
  var expandedRowRender: js.UndefOr[
    js.Function4[/* record */ T, /* index */ Double, /* indent */ Double, /* expanded */ Boolean, Node]
  ] = js.undefined
  var footer: js.UndefOr[js.Function1[/* currentPageData */ js.Array[T], Node]] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ HTMLElement, HTMLElement]] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var loading: js.UndefOr[Boolean | SpinProps] = js.undefined
  var locale: js.UndefOr[TableLocale] = js.undefined
  var onChange: js.UndefOr[
    js.Function4[
      /* pagination */ PaginationConfig, 
      /* filters */ Record[String, js.Array[String]], 
      /* sorter */ SorterResult[T], 
      /* extra */ TableCurrentDataSource[T], 
      Unit
    ]
  ] = js.undefined
  var onExpand: js.UndefOr[js.Function2[/* expanded */ Boolean, /* record */ T, Unit]] = js.undefined
  var onExpandedRowsChange: js.UndefOr[js.Function1[/* expandedRowKeys */ js.Array[Double | String], Unit]] = js.undefined
  var onHeaderRow: js.UndefOr[js.Function1[/* columns */ js.Array[ColumnProps[T]], TableEventListeners]] = js.undefined
  var onRow: js.UndefOr[js.Function2[/* record */ T, /* index */ Double, TableEventListeners]] = js.undefined
  var onRowClick: js.UndefOr[js.Function3[/* record */ T, /* index */ Double, /* event */ Event, Unit]] = js.undefined
  var pagination: js.UndefOr[PaginationConfig | `false`] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var rowClassName: js.UndefOr[js.Function2[/* record */ T, /* index */ Double, String]] = js.undefined
  var rowKey: js.UndefOr[String | (js.Function2[/* record */ T, /* index */ Double, String])] = js.undefined
  var rowSelection: js.UndefOr[TableRowSelection[T]] = js.undefined
  var scroll: js.UndefOr[Anon_ScrollToFirstRowOnChange] = js.undefined
  var showHeader: js.UndefOr[Boolean] = js.undefined
  var size: js.UndefOr[TableSize] = js.undefined
  var sortDirections: js.UndefOr[js.Array[SortOrder]] = js.undefined
  var store: Store
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tableLayout: js.UndefOr[TableLayoutProperty] = js.undefined
  var title: js.UndefOr[js.Function1[/* currentPageData */ js.Array[T], Node]] = js.undefined
  var useFixedHeader: js.UndefOr[Boolean] = js.undefined
  def setCheckboxPropsCache(cache: CheckboxPropsCache): Unit
}

object InternalTableProps {
  @scala.inline
  def apply[T](
    checkboxPropsCache: CheckboxPropsCache,
    setCheckboxPropsCache: CheckboxPropsCache => Callback,
    store: Store,
    bodyStyle: CSSProperties = null,
    bordered: js.UndefOr[Boolean] = js.undefined,
    children: VdomNode = null,
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
    expandedRowRender: (/* record */ T, /* index */ Double, /* indent */ Double, /* expanded */ Boolean) => CallbackTo[Node] = null,
    footer: /* currentPageData */ js.Array[T] => CallbackTo[Node] = null,
    getPopupContainer: /* triggerNode */ HTMLElement => CallbackTo[HTMLElement] = null,
    indentSize: Int | Double = null,
    loading: Boolean | SpinProps = null,
    locale: TableLocale = null,
    onChange: (/* pagination */ PaginationConfig, /* filters */ Record[String, js.Array[String]], /* sorter */ SorterResult[T], /* extra */ TableCurrentDataSource[T]) => Callback = null,
    onExpand: (/* expanded */ Boolean, /* record */ T) => Callback = null,
    onExpandedRowsChange: /* expandedRowKeys */ js.Array[Double | String] => Callback = null,
    onHeaderRow: /* columns */ js.Array[ColumnProps[T]] => CallbackTo[TableEventListeners] = null,
    onRow: (/* record */ T, /* index */ Double) => CallbackTo[TableEventListeners] = null,
    onRowClick: (/* record */ T, /* index */ Double, /* event */ Event) => Callback = null,
    pagination: PaginationConfig | `false` = null,
    prefixCls: String = null,
    rowClassName: (/* record */ T, /* index */ Double) => CallbackTo[String] = null,
    rowKey: String | (js.Function2[/* record */ T, /* index */ Double, String]) = null,
    rowSelection: TableRowSelection[T] = null,
    scroll: Anon_ScrollToFirstRowOnChange = null,
    showHeader: js.UndefOr[Boolean] = js.undefined,
    size: TableSize = null,
    sortDirections: js.Array[SortOrder] = null,
    style: CSSProperties = null,
    tableLayout: TableLayoutProperty = null,
    title: /* currentPageData */ js.Array[T] => CallbackTo[Node] = null,
    useFixedHeader: js.UndefOr[Boolean] = js.undefined
  ): InternalTableProps[T] = {
    val __obj = js.Dynamic.literal(checkboxPropsCache = checkboxPropsCache.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.updateDynamic("setCheckboxPropsCache")(js.Any.fromFunction1((t0: typingsJapgolly.antd.libTableInterfaceMod.CheckboxPropsCache) => setCheckboxPropsCache(t0).runNow()))
    if (bodyStyle != null) __obj.updateDynamic("bodyStyle")(bodyStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(bordered)) __obj.updateDynamic("bordered")(bordered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
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
    if (expandedRowRender != null) __obj.updateDynamic("expandedRowRender")(js.Any.fromFunction4((t0: /* record */ T, t1: /* index */ scala.Double, t2: /* indent */ scala.Double, t3: /* expanded */ scala.Boolean) => expandedRowRender(t0, t1, t2, t3).runNow()))
    if (footer != null) __obj.updateDynamic("footer")(js.Any.fromFunction1((t0: /* currentPageData */ js.Array[T]) => footer(t0).runNow()))
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1((t0: /* triggerNode */ org.scalajs.dom.raw.HTMLElement) => getPopupContainer(t0).runNow()))
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction4((t0: /* pagination */ typingsJapgolly.antd.libPaginationPaginationMod.PaginationConfig, t1: /* filters */ typingsJapgolly.std.Record[java.lang.String, js.Array[java.lang.String]], t2: /* sorter */ typingsJapgolly.antd.libTableInterfaceMod.SorterResult[T], t3: /* extra */ typingsJapgolly.antd.libTableInterfaceMod.TableCurrentDataSource[T]) => onChange(t0, t1, t2, t3).runNow()))
    if (onExpand != null) __obj.updateDynamic("onExpand")(js.Any.fromFunction2((t0: /* expanded */ scala.Boolean, t1: /* record */ T) => onExpand(t0, t1).runNow()))
    if (onExpandedRowsChange != null) __obj.updateDynamic("onExpandedRowsChange")(js.Any.fromFunction1((t0: /* expandedRowKeys */ js.Array[scala.Double | java.lang.String]) => onExpandedRowsChange(t0).runNow()))
    if (onHeaderRow != null) __obj.updateDynamic("onHeaderRow")(js.Any.fromFunction1((t0: /* columns */ js.Array[typingsJapgolly.antd.libTableInterfaceMod.ColumnProps[T]]) => onHeaderRow(t0).runNow()))
    if (onRow != null) __obj.updateDynamic("onRow")(js.Any.fromFunction2((t0: /* record */ T, t1: /* index */ scala.Double) => onRow(t0, t1).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction3((t0: /* record */ T, t1: /* index */ scala.Double, t2: /* event */ org.scalajs.dom.raw.Event) => onRowClick(t0, t1, t2).runNow()))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (rowClassName != null) __obj.updateDynamic("rowClassName")(js.Any.fromFunction2((t0: /* record */ T, t1: /* index */ scala.Double) => rowClassName(t0, t1).runNow()))
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
    __obj.asInstanceOf[InternalTableProps[T]]
  }
}

