package typingsJapgolly.reactDatagrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDatagrid.AnonPageSize
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.DataGridProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.PaginationToolbarProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.RowProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.SortInfo
import typingsJapgolly.reactDatagrid.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDatagrid {
  def apply(
    columns: js.Array[Column],
    dataSource: js.Array[_] | String | (js.Function1[/* query */ AnonPageSize, js.Promise[js.Array[_]]]),
    idProperty: String,
    dataSourceCount: Int | Double = null,
    defaultPage: Int | Double = null,
    defaultPageSize: Int | Double = null,
    emptyText: String = null,
    groupBy: js.Array[_] = null,
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
    rowHeight: Int | Double = null,
    rowStyle: CSSProperties | (js.Function2[/* data */ js.Any, /* props */ RowProps, CSSProperties]) = null,
    selected: js.Object = null,
    showCellBorders: Boolean | String = null,
    sortInfo: js.Array[SortInfo] = null,
    style: CSSProperties = null,
    withColumnMenu: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[DataGridProps, ^, Unit, DataGridProps] = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
  
      if (dataSourceCount != null) __obj.updateDynamic("dataSourceCount")(dataSourceCount.asInstanceOf[js.Any])
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage.asInstanceOf[js.Any])
    if (defaultPageSize != null) __obj.updateDynamic("defaultPageSize")(defaultPageSize.asInstanceOf[js.Any])
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
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
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (showCellBorders != null) __obj.updateDynamic("showCellBorders")(showCellBorders.asInstanceOf[js.Any])
    if (sortInfo != null) __obj.updateDynamic("sortInfo")(sortInfo.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(withColumnMenu)) __obj.updateDynamic("withColumnMenu")(withColumnMenu.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDatagrid.mod.ReactDataGrid.DataGridProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDatagrid.mod.^](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDatagrid.mod.ReactDataGrid.DataGridProps])(children: _*)
  }
  @JSImport("react-datagrid", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

