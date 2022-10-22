package typingsJapgolly.baseui.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.baseui.anon.Filters
import typingsJapgolly.baseui.dataTableTypesMod.BatchAction
import typingsJapgolly.baseui.dataTableTypesMod.ColumnOptions
import typingsJapgolly.baseui.dataTableTypesMod.ControlRef
import typingsJapgolly.baseui.dataTableTypesMod.Row
import typingsJapgolly.baseui.dataTableTypesMod.RowAction
import typingsJapgolly.baseui.dataTableTypesMod.SortDirections
import typingsJapgolly.baseui.dataTableTypesMod.StatefulContainerProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.std.Map
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object UnstableStatefulContainer {
  
  inline def apply(children: Filters => Node, columns: js.Array[ColumnOptions[Any, Any]], rows: js.Array[Row]): Builder = {
    val __props = js.Dynamic.literal(children = js.Any.fromFunction1(children), columns = columns.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[StatefulContainerProps]))
  }
  
  @JSImport("baseui/data-table", "UnstableStatefulContainer")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def batchActions(value: js.Array[BatchAction]): this.type = set("batchActions", value.asInstanceOf[js.Any])
    
    inline def batchActionsVarargs(value: BatchAction*): this.type = set("batchActions", js.Array(value*))
    
    inline def controlRef(value: ControlRef): this.type = set("controlRef", value.asInstanceOf[js.Any])
    
    inline def emptyMessage(value: String | ComponentType[js.Object]): this.type = set("emptyMessage", value.asInstanceOf[js.Any])
    
    inline def filterable(value: Boolean): this.type = set("filterable", value.asInstanceOf[js.Any])
    
    inline def initialFilters(value: Map[String, typingsJapgolly.baseui.anon.Description]): this.type = set("initialFilters", value.asInstanceOf[js.Any])
    
    inline def initialSelectedRowIds(value: Set[Double | String]): this.type = set("initialSelectedRowIds", value.asInstanceOf[js.Any])
    
    inline def initialSortDirection(value: SortDirections): this.type = set("initialSortDirection", value.asInstanceOf[js.Any])
    
    inline def initialSortIndex(value: Double): this.type = set("initialSortIndex", value.asInstanceOf[js.Any])
    
    inline def loading(value: Boolean): this.type = set("loading", value.asInstanceOf[js.Any])
    
    inline def loadingMessage(value: String | ComponentType[js.Object]): this.type = set("loadingMessage", value.asInstanceOf[js.Any])
    
    inline def onFilterAdd(value: (/* b */ String, /* a */ typingsJapgolly.baseui.anon.Description) => Any): this.type = set("onFilterAdd", js.Any.fromFunction2(value))
    
    inline def onFilterRemove(value: /* a */ String => Any): this.type = set("onFilterRemove", js.Any.fromFunction1(value))
    
    inline def onIncludedRowsChange(value: /* rows */ js.Array[Row] => Callback): this.type = set("onIncludedRowsChange", js.Any.fromFunction1((t0: /* rows */ js.Array[Row]) => value(t0).runNow()))
    
    inline def onRowHighlightChange(value: (/* rowIndex */ Double, /* row */ Row) => Callback): this.type = set("onRowHighlightChange", js.Any.fromFunction2((t0: /* rowIndex */ Double, t1: /* row */ Row) => (value(t0, t1)).runNow()))
    
    inline def onSelectionChange(value: /* a */ js.Array[Row] => Any): this.type = set("onSelectionChange", js.Any.fromFunction1(value))
    
    inline def onSort(value: (/* columnIndex */ Double, /* sortDirection */ SortDirections) => Callback): this.type = set("onSort", js.Any.fromFunction2((t0: /* columnIndex */ Double, t1: /* sortDirection */ SortDirections) => (value(t0, t1)).runNow()))
    
    inline def onTextQueryChange(value: /* textQuery */ String => Callback): this.type = set("onTextQueryChange", js.Any.fromFunction1((t0: /* textQuery */ String) => value(t0).runNow()))
    
    inline def resizableColumnWidths(value: Boolean): this.type = set("resizableColumnWidths", value.asInstanceOf[js.Any])
    
    inline def rowActions(value: js.Array[RowAction] | (js.Function1[/* a */ Row, js.Array[RowAction]])): this.type = set("rowActions", value.asInstanceOf[js.Any])
    
    inline def rowActionsFunction1(value: /* a */ Row => js.Array[RowAction]): this.type = set("rowActions", js.Any.fromFunction1(value))
    
    inline def rowActionsVarargs(value: RowAction*): this.type = set("rowActions", js.Array(value*))
    
    inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    inline def rowHighlightIndex(value: Double): this.type = set("rowHighlightIndex", value.asInstanceOf[js.Any])
    
    inline def searchable(value: Boolean): this.type = set("searchable", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: StatefulContainerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
