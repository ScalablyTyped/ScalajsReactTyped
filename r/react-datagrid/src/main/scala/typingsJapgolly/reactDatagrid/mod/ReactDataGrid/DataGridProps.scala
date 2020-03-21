package typingsJapgolly.reactDatagrid.mod.ReactDataGrid

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.react.mod.Props
import typingsJapgolly.reactDatagrid.AnonPageSize
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataGridProps extends Props[DataGrid] {
  /**
    * Array - an array of columns that are going to be rendered in the
    * grid.
    */
  var columns: js.Array[Column]
  /**
    * Array/String/Function/Promise - for local data, an array of object
    * to render in the grid. For remote data, a string url, or a function
    * that returns a promise.
    */
  var dataSource: js.Array[_] | String | (js.Function1[/* query */ AnonPageSize, js.Promise[js.Array[_]]])
  var dataSourceCount: js.UndefOr[Double] = js.undefined
  var defaultPage: js.UndefOr[Double] = js.undefined
  var defaultPageSize: js.UndefOr[Double] = js.undefined
  /**
    * Empty text for no records.
    */
  var emptyText: js.UndefOr[String] = js.undefined
  /**
    * Group rows by matching values.
    */
  var groupBy: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * String - the name of the property where the id is found for each
    * object in the data array.
    */
  var idProperty: String
  /**
    * To apply the filter while typing.
    */
  var liveFilter: js.UndefOr[Boolean] = js.undefined
  /**
    * If you dont want loadMask over header, specify
    */
  var loadMaskOverHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Loading grid.
    */
  var loading: js.UndefOr[Boolean] = js.undefined
  /**
    * If you want to enable column reordering, just specify the
    * onColumnOrderChange prop on the grid:
    */
  var onColumnOrderChange: js.UndefOr[js.Function2[/* index */ Double, /* dropIndex */ Double, Unit]] = js.undefined
  /**
    * If you want to enable column resized, just specify the
    * onColumnResize prop on the grid:
    */
  var onColumnResize: js.UndefOr[
    js.Function4[
      /* firstCol */ Column, 
      /* firstSize */ Double, 
      /* secondCol */ Column, 
      /* secondSize */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * When a column is shown/hidden, you can be notified using the
    * onColumnVisibilityChange callback prop.
    */
  var onColumnVisibilityChange: js.UndefOr[js.Function2[/* column */ Column, /* visibility */ Boolean, Unit]] = js.undefined
  /**
    * If you want to enable filter, just specify the
    * onFilter prop on the grid:
    */
  var onFilter: js.UndefOr[
    js.Function3[/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[_], Unit]
  ] = js.undefined
  /**
    * handle page changes.
    */
  var onPageChange: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
  /**
    * handle page size changes.
    */
  var onPageSizeChange: js.UndefOr[js.Function2[/* pageSize */ Double, /* props */ DataGridProps, Unit]] = js.undefined
  /**
    * If you want to enable selection, just specify the
    * onSelectionChange prop on the grid:
    */
  var onSelectionChange: js.UndefOr[js.Function2[/* newSelected */ js.Object, /* data */ js.Any, Unit]] = js.undefined
  /**
    * Sorting the data array is not done by the grid. You can however
    * pass in sort info so the grid renders with sorting icons as needed.
    */
  var onSortChange: js.UndefOr[js.Function1[/* sortInfo */ js.Array[SortInfo], Unit]] = js.undefined
  /**
    * Number - controlled alternative for defaultPage. When page changes,
    * onPageChange(page) is called.
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * Number - controlled alternative for defaultPageSize. When pageSize
    * changes, onPageSizeChange(pageSize) is called.
    */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * When you have remote data, pagination is setup by default. If you
    * want to disable pagination, specify the pagination prop with a false
    * value.
    */
  var pagination: js.UndefOr[Boolean] = js.undefined
  /**
    * Customize the pagination toolbar.
    */
  var paginationToolbarProps: js.UndefOr[PaginationToolbarProps] = js.undefined
  /**
    * Custom row height.
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
    * Object/Function - you can specify either a style object to be
    * applied to all rows, or a function. The function is called with
    * (data, props) (so you have access to props.index for example) and
    * is expected to return a style object.
    */
  var rowStyle: js.UndefOr[
    CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties])
  ] = js.undefined
  /**
    * The current selection.
    */
  var selected: js.UndefOr[js.Object] = js.undefined
  /**
    * Show cell borders. Other valid values: 'horizontal', 'vertical'.
    */
  var showCellBorders: js.UndefOr[Boolean | String] = js.undefined
  /**
    * Array - an array with sorting information.
    */
  var sortInfo: js.UndefOr[js.Array[SortInfo]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /**
    * Boolean - show a column menu to show/hide columns.
    */
  var withColumnMenu: js.UndefOr[Boolean] = js.undefined
}

object DataGridProps {
  @scala.inline
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ AnonPageSize, js.Promise[js.Array[_]]]),
    idProperty: String,
    children: VdomNode = null,
    dataSourceCount: Int | Double = null,
    defaultPage: Int | Double = null,
    defaultPageSize: Int | Double = null,
    emptyText: String = null,
    groupBy: js.Array[_] = null,
    key: Key = null,
    liveFilter: js.UndefOr[Boolean] = js.undefined,
    loadMaskOverHeader: js.UndefOr[Boolean] = js.undefined,
    loading: js.UndefOr[Boolean] = js.undefined,
    onColumnOrderChange: (/* index */ Double, /* dropIndex */ Double) => Callback = null,
    onColumnResize: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Callback = null,
    onColumnVisibilityChange: (/* column */ Column, /* visibility */ Boolean) => Callback = null,
    onFilter: (/* column */ Column, /* value */ js.Any, /* allFilterValues */ js.Array[js.Any]) => Callback = null,
    onPageChange: /* page */ Double => Callback = null,
    onPageSizeChange: (/* pageSize */ Double, /* props */ DataGridProps) => Callback = null,
    onSelectionChange: (/* newSelected */ js.Object, /* data */ js.Any) => Callback = null,
    onSortChange: /* sortInfo */ js.Array[SortInfo] => Callback = null,
    page: Int | Double = null,
    pageSize: Int | Double = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    paginationToolbarProps: PaginationToolbarProps = null,
    ref: LegacyRef[DataGrid] = null,
    rowHeight: Int | Double = null,
    rowStyle: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties]) = null,
    selected: js.Object = null,
    showCellBorders: Boolean | String = null,
    sortInfo: js.Array[SortInfo] = null,
    style: CSSProperties = null,
    withColumnMenu: js.UndefOr[Boolean] = js.undefined
  ): DataGridProps = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (dataSourceCount != null) __obj.updateDynamic("dataSourceCount")(dataSourceCount.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(liveFilter)) __obj.updateDynamic("liveFilter")(liveFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(loadMaskOverHeader)) __obj.updateDynamic("loadMaskOverHeader")(loadMaskOverHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (onColumnOrderChange != null) __obj.updateDynamic("onColumnOrderChange")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* dropIndex */ scala.Double) => onColumnOrderChange(t0, t1).runNow()))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction4((t0: /* firstCol */ typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column, t1: /* firstSize */ scala.Double, t2: /* secondCol */ typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column, t3: /* secondSize */ scala.Double) => onColumnResize(t0, t1, t2, t3).runNow()))
    if (onColumnVisibilityChange != null) __obj.updateDynamic("onColumnVisibilityChange")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column, t1: /* visibility */ scala.Boolean) => onColumnVisibilityChange(t0, t1).runNow()))
    if (onFilter != null) __obj.updateDynamic("onFilter")(js.Any.fromFunction3((t0: /* column */ typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column, t1: /* value */ js.Any, t2: /* allFilterValues */ js.Array[js.Any]) => onFilter(t0, t1, t2).runNow()))
    if (onPageChange != null) __obj.updateDynamic("onPageChange")(js.Any.fromFunction1((t0: /* page */ scala.Double) => onPageChange(t0).runNow()))
    if (onPageSizeChange != null) __obj.updateDynamic("onPageSizeChange")(js.Any.fromFunction2((t0: /* pageSize */ scala.Double, t1: /* props */ typingsJapgolly.reactDatagrid.mod.ReactDataGrid.DataGridProps) => onPageSizeChange(t0, t1).runNow()))
    if (onSelectionChange != null) __obj.updateDynamic("onSelectionChange")(js.Any.fromFunction2((t0: /* newSelected */ js.Object, t1: /* data */ js.Any) => onSelectionChange(t0, t1).runNow()))
    if (onSortChange != null) __obj.updateDynamic("onSortChange")(js.Any.fromFunction1((t0: /* sortInfo */ js.Array[typingsJapgolly.reactDatagrid.mod.ReactDataGrid.SortInfo]) => onSortChange(t0).runNow()))
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationToolbarProps != null) __obj.updateDynamic("paginationToolbarProps")(paginationToolbarProps.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (showCellBorders != null) __obj.updateDynamic("showCellBorders")(showCellBorders.asInstanceOf[js.Any])
    if (sortInfo != null) __obj.updateDynamic("sortInfo")(sortInfo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withColumnMenu)) __obj.updateDynamic("withColumnMenu")(withColumnMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataGridProps]
  }
}

