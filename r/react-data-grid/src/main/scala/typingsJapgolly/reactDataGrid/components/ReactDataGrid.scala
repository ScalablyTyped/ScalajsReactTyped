package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ActionButton
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ActionMenu
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellCopyPasteEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellDragEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellExpandEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Column
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.DragHandleDoubleClickEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Filter
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridProps
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridRowsUpdatedEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.OnRowExpandToggle
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.RowUpdateEvent
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ScrollState
import typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.SubRowDetails
import typingsJapgolly.reactDataGrid.anon.EnableShiftSelect
import typingsJapgolly.reactDataGrid.anon.Idx
import typingsJapgolly.reactDataGrid.mod.^
import typingsJapgolly.reactDataGrid.reactDataGridStrings.ASC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.DESC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.NONE
import typingsJapgolly.reactDataGrid.reactDataGridStrings.changeRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.loopOverRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.multi
import typingsJapgolly.reactDataGrid.reactDataGridStrings.none_
import typingsJapgolly.reactDataGrid.reactDataGridStrings.single
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDataGrid {
  
  inline def apply[T](rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]), rowsCount: Double): Builder[T] = {
    val __props = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
    new Builder[T](js.Array(this.component, __props.asInstanceOf[GridProps[T]]))
  }
  
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder[T] (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[^[T]] {
    
    inline def cellNavigationMode(value: none_ | loopOverRow | changeRow): this.type = set("cellNavigationMode", value.asInstanceOf[js.Any])
    
    inline def columns(value: js.Array[Column[T]]): this.type = set("columns", value.asInstanceOf[js.Any])
    
    inline def columnsVarargs(value: Column[T]*): this.type = set("columns", js.Array(value*))
    
    inline def contextMenu(value: VdomElement): this.type = set("contextMenu", value.rawElement.asInstanceOf[js.Any])
    
    inline def emptyRowsView(value: (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): this.type = set("emptyRowsView", value.asInstanceOf[js.Any])
    
    inline def enableCellSelect(value: Boolean): this.type = set("enableCellSelect", value.asInstanceOf[js.Any])
    
    inline def enableDragAndDrop(value: Boolean): this.type = set("enableDragAndDrop", value.asInstanceOf[js.Any])
    
    inline def enableRowSelect(value: Boolean | single | multi): this.type = set("enableRowSelect", value.asInstanceOf[js.Any])
    
    inline def getCellActions(value: (/* column */ Column[T], T) => js.Array[ActionButton | ActionMenu]): this.type = set("getCellActions", js.Any.fromFunction2(value))
    
    inline def getSubRowDetails(value: T => SubRowDetails[Any]): this.type = set("getSubRowDetails", js.Any.fromFunction1(value))
    
    inline def getValidFilterValues(value: /* columnKey */ String => js.Array[Any]): this.type = set("getValidFilterValues", js.Any.fromFunction1(value))
    
    inline def headerFiltersHeight(value: Double): this.type = set("headerFiltersHeight", value.asInstanceOf[js.Any])
    
    inline def headerRowHeight(value: Double): this.type = set("headerRowHeight", value.asInstanceOf[js.Any])
    
    inline def minColumnWidth(value: Double): this.type = set("minColumnWidth", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: Double): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minWidth(value: Double): this.type = set("minWidth", value.asInstanceOf[js.Any])
    
    inline def onAddFilter(value: /* filter */ Filter => Callback): this.type = set("onAddFilter", js.Any.fromFunction1((t0: /* filter */ Filter) => value(t0).runNow()))
    
    inline def onCellCopyPaste(value: /* e */ CellCopyPasteEvent => Callback): this.type = set("onCellCopyPaste", js.Any.fromFunction1((t0: /* e */ CellCopyPasteEvent) => value(t0).runNow()))
    
    inline def onCellDeSelected(value: /* coordinates */ Idx => Callback): this.type = set("onCellDeSelected", js.Any.fromFunction1((t0: /* coordinates */ Idx) => value(t0).runNow()))
    
    inline def onCellExpand(value: /* e */ CellExpandEvent[T] => Callback): this.type = set("onCellExpand", js.Any.fromFunction1((t0: /* e */ CellExpandEvent[T]) => value(t0).runNow()))
    
    inline def onCellSelected(value: /* coordinates */ Idx => Callback): this.type = set("onCellSelected", js.Any.fromFunction1((t0: /* coordinates */ Idx) => value(t0).runNow()))
    
    inline def onCellsDragged(value: /* e */ CellDragEvent => Callback): this.type = set("onCellsDragged", js.Any.fromFunction1((t0: /* e */ CellDragEvent) => value(t0).runNow()))
    
    inline def onClearFilters(value: Callback): this.type = set("onClearFilters", value.toJsFn)
    
    inline def onColumnResize(value: (/* index */ Double, /* width */ Double) => Callback): this.type = set("onColumnResize", js.Any.fromFunction2((t0: /* index */ Double, t1: /* width */ Double) => (value(t0, t1)).runNow()))
    
    inline def onDragHandleDoubleClick(value: /* e */ DragHandleDoubleClickEvent[T] => Callback): this.type = set("onDragHandleDoubleClick", js.Any.fromFunction1((t0: /* e */ DragHandleDoubleClickEvent[T]) => value(t0).runNow()))
    
    inline def onGridRowsUpdated(value: /* e */ GridRowsUpdatedEvent[T] => Callback): this.type = set("onGridRowsUpdated", js.Any.fromFunction1((t0: /* e */ GridRowsUpdatedEvent[T]) => value(t0).runNow()))
    
    inline def onGridSort(value: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Callback): this.type = set("onGridSort", js.Any.fromFunction2((t0: /* sortColumn */ String, t1: /* sortDirection */ ASC | DESC | NONE) => (value(t0, t1)).runNow()))
    
    inline def onRowClick(value: (/* rowIdx */ Double, T) => Callback): this.type = set("onRowClick", js.Any.fromFunction2((t0: /* rowIdx */ Double, t1: T) => (value(t0, t1)).runNow()))
    
    inline def onRowExpandToggle(value: /* props */ OnRowExpandToggle => Callback): this.type = set("onRowExpandToggle", js.Any.fromFunction1((t0: /* props */ OnRowExpandToggle) => value(t0).runNow()))
    
    inline def onRowSelect(value: /* rows */ js.Array[T] => Callback): this.type = set("onRowSelect", js.Any.fromFunction1((t0: /* rows */ js.Array[T]) => value(t0).runNow()))
    
    inline def onRowUpdated(value: /* e */ RowUpdateEvent[T] => Callback): this.type = set("onRowUpdated", js.Any.fromFunction1((t0: /* e */ RowUpdateEvent[T]) => value(t0).runNow()))
    
    inline def onScroll(value: /* scrollState */ ScrollState => Callback): this.type = set("onScroll", js.Any.fromFunction1((t0: /* scrollState */ ScrollState) => value(t0).runNow()))
    
    inline def rowActionsCell(value: (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): this.type = set("rowActionsCell", value.asInstanceOf[js.Any])
    
    inline def rowGroupRenderer(value: ComponentType[js.Object]): this.type = set("rowGroupRenderer", value.asInstanceOf[js.Any])
    
    inline def rowHeight(value: Double): this.type = set("rowHeight", value.asInstanceOf[js.Any])
    
    inline def rowKey(value: String): this.type = set("rowKey", value.asInstanceOf[js.Any])
    
    inline def rowRenderer(value: Element | (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): this.type = set("rowRenderer", value.asInstanceOf[js.Any])
    
    inline def rowRendererVdomElement(value: VdomElement): this.type = set("rowRenderer", value.rawElement.asInstanceOf[js.Any])
    
    inline def rowScrollTimeout(value: Double): this.type = set("rowScrollTimeout", value.asInstanceOf[js.Any])
    
    inline def rowSelection(value: EnableShiftSelect[T]): this.type = set("rowSelection", value.asInstanceOf[js.Any])
    
    inline def selectAllRenderer(value: (ComponentClassP[Any & js.Object]) | FunctionComponent[Any]): this.type = set("selectAllRenderer", value.asInstanceOf[js.Any])
    
    inline def sortColumn(value: String): this.type = set("sortColumn", value.asInstanceOf[js.Any])
    
    inline def sortDirection(value: ASC | DESC | NONE): this.type = set("sortDirection", value.asInstanceOf[js.Any])
    
    inline def toolbar(value: VdomElement): this.type = set("toolbar", value.rawElement.asInstanceOf[js.Any])
  }
  
  def withProps[T](p: GridProps[T]): Builder[T] = new Builder[T](js.Array(this.component, p.asInstanceOf[js.Any]))
}
