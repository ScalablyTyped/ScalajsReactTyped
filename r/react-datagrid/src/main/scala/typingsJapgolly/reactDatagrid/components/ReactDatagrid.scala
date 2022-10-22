package typingsJapgolly.reactDatagrid.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CSSProperties
import typingsJapgolly.reactDatagrid.anon.PageSize
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.Column
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.DataGridProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.PaginationToolbarProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.RowProps
import typingsJapgolly.reactDatagrid.mod.ReactDataGrid.SortInfo
import typingsJapgolly.reactDatagrid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDatagrid {
  
  inline def apply(
    columns: js.Array[Column],
    dataSource: js.Array[Any] | String | (js.Function1[/* query */ PageSize, js.Promise[js.Array[Any]]]),
    idProperty: String
  ): Builder = {
    val __props = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], idProperty = idProperty.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DataGridProps]))
  }
  
  @JSImport("react-datagrid", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^] {
    
    inline def dataSourceCount(value: Double): this.type = set("dataSourceCount", value.asInstanceOf[js.Any])
    
    inline def defaultPage(value: Double): this.type = set("defaultPage", value.asInstanceOf[js.Any])
    
    inline def defaultPageSize(value: Double): this.type = set("defaultPageSize", value.asInstanceOf[js.Any])
    
    inline def emptyText(value: String): this.type = set("emptyText", value.asInstanceOf[js.Any])
    
    inline def groupBy(value: js.Array[Any]): this.type = set("groupBy", value.asInstanceOf[js.Any])
    
    inline def groupByVarargs(value: Any*): this.type = set("groupBy", js.Array(value*))
    
    inline def liveFilter(value: Boolean): this.type = set("liveFilter", value.asInstanceOf[js.Any])
    
    inline def loadMaskOverHeader(value: Boolean): this.type = set("loadMaskOverHeader", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def onColumnOrderChange(value: (/* index */ Double, /* dropIndex */ Double) => Callback): this.type = set("onColumnOrderChange", js.Any.fromFunction2((t0: /* index */ Double, t1: /* dropIndex */ Double) => (value(t0, t1)).runNow()))
    
    inline def onColumnResize(
      value: (/* firstCol */ Column, /* firstSize */ Double, /* secondCol */ Column, /* secondSize */ Double) => Callback
    ): this.type = set("onColumnResize", js.Any.fromFunction4((t0: /* firstCol */ Column, t1: /* firstSize */ Double, t2: /* secondCol */ Column, t3: /* secondSize */ Double) => (value(t0, t1, t2, t3)).runNow()))
    
    inline def onColumnVisibilityChange(value: (/* column */ Column, /* visibility */ Boolean) => Callback): this.type = set("onColumnVisibilityChange", js.Any.fromFunction2((t0: /* column */ Column, t1: /* visibility */ Boolean) => (value(t0, t1)).runNow()))
    
    inline def onFilter(value: (/* column */ Column, /* value */ Any, /* allFilterValues */ js.Array[Any]) => Callback): this.type = set("onFilter", js.Any.fromFunction3((t0: /* column */ Column, t1: /* value */ Any, t2: /* allFilterValues */ js.Array[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def onPageChange(value: /* page */ Double => Callback): this.type = set("onPageChange", js.Any.fromFunction1((t0: /* page */ Double) => value(t0).runNow()))
    
    inline def onPageSizeChange(value: (/* pageSize */ Double, DataGridProps) => Callback): this.type = set("onPageSizeChange", js.Any.fromFunction2((t0: /* pageSize */ Double, t1: DataGridProps) => (value(t0, t1)).runNow()))
    
    inline def onSelectionChange(value: (/* newSelected */ js.Object, /* data */ Any) => Callback): this.type = set("onSelectionChange", js.Any.fromFunction2((t0: /* newSelected */ js.Object, t1: /* data */ Any) => (value(t0, t1)).runNow()))
    
    inline def onSortChange(value: /* sortInfo */ js.Array[SortInfo] => Callback): this.type = set("onSortChange", js.Any.fromFunction1((t0: /* sortInfo */ js.Array[SortInfo]) => value(t0).runNow()))
    
    inline def page(value: Double): this.type = set("page", value.asInstanceOf[js.Any])
    
    inline def pageSize(value: Double): this.type = set("pageSize", value.asInstanceOf[js.Any])
    
    inline def pagination(value: Boolean): this.type = set("pagination", value.asInstanceOf[js.Any])
    
    inline def paginationToolbarProps(value: PaginationToolbarProps): this.type = set("paginationToolbarProps", value.asInstanceOf[js.Any])
    
    inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    inline def rowStyle(value: CSSProperties | (js.Function2[/* data */ Any, /* props */ RowProps, CSSProperties])): this.type = set("rowStyle", value.asInstanceOf[js.Any])
    
    inline def rowStyleFunction2(value: (/* data */ Any, /* props */ RowProps) => CSSProperties): this.type = set("rowStyle", js.Any.fromFunction2(value))
    
    inline def selected(value: js.Object): this.type = set("selected", value.asInstanceOf[js.Any])
    
    inline def showCellBorders(value: Boolean | String): this.type = set("showCellBorders", value.asInstanceOf[js.Any])
    
    inline def sortInfo(value: js.Array[SortInfo]): this.type = set("sortInfo", value.asInstanceOf[js.Any])
    
    inline def sortInfoVarargs(value: SortInfo*): this.type = set("sortInfo", js.Array(value*))
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def withColumnMenu(value: Boolean): this.type = set("withColumnMenu", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DataGridProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
