package typingsJapgolly.reactDataGrid.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import japgolly.scalajs.react.raw.React.ComponentClassP
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.StatelessComponent
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
import typingsJapgolly.reactDataGrid.AnonEnableShiftSelect
import typingsJapgolly.reactDataGrid.AnonIdx
import typingsJapgolly.reactDataGrid.mod.^
import typingsJapgolly.reactDataGrid.reactDataGridStrings.ASC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.DESC
import typingsJapgolly.reactDataGrid.reactDataGridStrings.NONE
import typingsJapgolly.reactDataGrid.reactDataGridStrings.changeRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.loopOverRow
import typingsJapgolly.reactDataGrid.reactDataGridStrings.multi
import typingsJapgolly.reactDataGrid.reactDataGridStrings.none_
import typingsJapgolly.reactDataGrid.reactDataGridStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object ReactDataGrid {
  def apply[T](
    rowGetter: js.Array[T] | (js.Function1[/* rowIdx */ Double, T]),
    rowsCount: Double,
    cellNavigationMode: none_ | loopOverRow | changeRow = null,
    columns: js.Array[Column[T]] = null,
    contextMenu: VdomElement = null,
    emptyRowsView: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    enableCellSelect: js.UndefOr[Boolean] = js.undefined,
    enableDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    enableRowSelect: Boolean | single | multi = null,
    getCellActions: (/* column */ Column[T], T) => CallbackTo[js.Array[ActionButton | ActionMenu]] = null,
    getSubRowDetails: T => CallbackTo[SubRowDetails[js.Any]] = null,
    getValidFilterValues: /* columnKey */ String => CallbackTo[js.Array[js.Any]] = null,
    headerFiltersHeight: Int | Double = null,
    headerRowHeight: Int | Double = null,
    minColumnWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    onAddFilter: /* filter */ Filter => Callback = null,
    onCellCopyPaste: /* e */ CellCopyPasteEvent => Callback = null,
    onCellDeSelected: /* coordinates */ AnonIdx => Callback = null,
    onCellExpand: /* e */ CellExpandEvent[T] => Callback = null,
    onCellSelected: /* coordinates */ AnonIdx => Callback = null,
    onCellsDragged: /* e */ CellDragEvent => Callback = null,
    onClearFilters: js.UndefOr[Callback] = js.undefined,
    onColumnResize: (/* index */ Double, /* width */ Double) => Callback = null,
    onDragHandleDoubleClick: /* e */ DragHandleDoubleClickEvent[T] => Callback = null,
    onGridRowsUpdated: /* e */ GridRowsUpdatedEvent[T] => Callback = null,
    onGridSort: (/* sortColumn */ String, /* sortDirection */ ASC | DESC | NONE) => Callback = null,
    onRowClick: (/* rowIdx */ Double, T) => Callback = null,
    onRowExpandToggle: /* props */ OnRowExpandToggle => Callback = null,
    onRowSelect: /* rows */ js.Array[T] => Callback = null,
    onRowUpdated: /* e */ RowUpdateEvent[T] => Callback = null,
    onScroll: /* scrollState */ ScrollState => Callback = null,
    rowActionsCell: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    rowGroupRenderer: ComponentType[js.Object] = null,
    rowHeight: Int | Double = null,
    rowKey: String = null,
    rowRenderer: Element | ComponentClassP[js.Object] | StatelessComponent[_] = null,
    rowScrollTimeout: Int | Double = null,
    rowSelection: AnonEnableShiftSelect[T] = null,
    selectAllRenderer: ComponentClassP[js.Object] | StatelessComponent[_] = null,
    sortColumn: String = null,
    sortDirection: ASC | DESC | NONE = null,
    toolbar: VdomElement = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[GridProps[T], ^[T], Unit, GridProps[T]] = {
    val __obj = js.Dynamic.literal(rowGetter = rowGetter.asInstanceOf[js.Any], rowsCount = rowsCount.asInstanceOf[js.Any])
  
      if (cellNavigationMode != null) __obj.updateDynamic("cellNavigationMode")(cellNavigationMode.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (contextMenu != null) __obj.updateDynamic("contextMenu")(contextMenu.rawElement.asInstanceOf[js.Any])
    if (emptyRowsView != null) __obj.updateDynamic("emptyRowsView")(emptyRowsView.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellSelect)) __obj.updateDynamic("enableCellSelect")(enableCellSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDragAndDrop)) __obj.updateDynamic("enableDragAndDrop")(enableDragAndDrop.asInstanceOf[js.Any])
    if (enableRowSelect != null) __obj.updateDynamic("enableRowSelect")(enableRowSelect.asInstanceOf[js.Any])
    if (getCellActions != null) __obj.updateDynamic("getCellActions")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Column[T], t1: T) => getCellActions(t0, t1).runNow()))
    if (getSubRowDetails != null) __obj.updateDynamic("getSubRowDetails")(js.Any.fromFunction1((t0: T) => getSubRowDetails(t0).runNow()))
    if (getValidFilterValues != null) __obj.updateDynamic("getValidFilterValues")(js.Any.fromFunction1((t0: /* columnKey */ java.lang.String) => getValidFilterValues(t0).runNow()))
    if (headerFiltersHeight != null) __obj.updateDynamic("headerFiltersHeight")(headerFiltersHeight.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (minColumnWidth != null) __obj.updateDynamic("minColumnWidth")(minColumnWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (onAddFilter != null) __obj.updateDynamic("onAddFilter")(js.Any.fromFunction1((t0: /* filter */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.Filter) => onAddFilter(t0).runNow()))
    if (onCellCopyPaste != null) __obj.updateDynamic("onCellCopyPaste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellCopyPasteEvent) => onCellCopyPaste(t0).runNow()))
    if (onCellDeSelected != null) __obj.updateDynamic("onCellDeSelected")(js.Any.fromFunction1((t0: /* coordinates */ typingsJapgolly.reactDataGrid.AnonIdx) => onCellDeSelected(t0).runNow()))
    if (onCellExpand != null) __obj.updateDynamic("onCellExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellExpandEvent[T]) => onCellExpand(t0).runNow()))
    if (onCellSelected != null) __obj.updateDynamic("onCellSelected")(js.Any.fromFunction1((t0: /* coordinates */ typingsJapgolly.reactDataGrid.AnonIdx) => onCellSelected(t0).runNow()))
    if (onCellsDragged != null) __obj.updateDynamic("onCellsDragged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.CellDragEvent) => onCellsDragged(t0).runNow()))
    onClearFilters.foreach(p => __obj.updateDynamic("onClearFilters")(p.toJsFn))
    if (onColumnResize != null) __obj.updateDynamic("onColumnResize")(js.Any.fromFunction2((t0: /* index */ scala.Double, t1: /* width */ scala.Double) => onColumnResize(t0, t1).runNow()))
    if (onDragHandleDoubleClick != null) __obj.updateDynamic("onDragHandleDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.DragHandleDoubleClickEvent[T]) => onDragHandleDoubleClick(t0).runNow()))
    if (onGridRowsUpdated != null) __obj.updateDynamic("onGridRowsUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridRowsUpdatedEvent[T]) => onGridRowsUpdated(t0).runNow()))
    if (onGridSort != null) __obj.updateDynamic("onGridSort")(js.Any.fromFunction2((t0: /* sortColumn */ java.lang.String, t1: /* sortDirection */ typingsJapgolly.reactDataGrid.reactDataGridStrings.ASC | typingsJapgolly.reactDataGrid.reactDataGridStrings.DESC | typingsJapgolly.reactDataGrid.reactDataGridStrings.NONE) => onGridSort(t0, t1).runNow()))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(js.Any.fromFunction2((t0: /* rowIdx */ scala.Double, t1: T) => onRowClick(t0, t1).runNow()))
    if (onRowExpandToggle != null) __obj.updateDynamic("onRowExpandToggle")(js.Any.fromFunction1((t0: /* props */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.OnRowExpandToggle) => onRowExpandToggle(t0).runNow()))
    if (onRowSelect != null) __obj.updateDynamic("onRowSelect")(js.Any.fromFunction1((t0: /* rows */ js.Array[T]) => onRowSelect(t0).runNow()))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.RowUpdateEvent[T]) => onRowUpdated(t0).runNow()))
    if (onScroll != null) __obj.updateDynamic("onScroll")(js.Any.fromFunction1((t0: /* scrollState */ typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.ScrollState) => onScroll(t0).runNow()))
    if (rowActionsCell != null) __obj.updateDynamic("rowActionsCell")(rowActionsCell.asInstanceOf[js.Any])
    if (rowGroupRenderer != null) __obj.updateDynamic("rowGroupRenderer")(rowGroupRenderer.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowKey != null) __obj.updateDynamic("rowKey")(rowKey.asInstanceOf[js.Any])
    if (rowRenderer != null) __obj.updateDynamic("rowRenderer")(rowRenderer.asInstanceOf[js.Any])
    if (rowScrollTimeout != null) __obj.updateDynamic("rowScrollTimeout")(rowScrollTimeout.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (selectAllRenderer != null) __obj.updateDynamic("selectAllRenderer")(selectAllRenderer.asInstanceOf[js.Any])
    if (sortColumn != null) __obj.updateDynamic("sortColumn")(sortColumn.asInstanceOf[js.Any])
    if (sortDirection != null) __obj.updateDynamic("sortDirection")(sortDirection.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.rawElement.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridProps[T], 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactDataGrid.mod.^[T]](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactDataGrid.AdazzleReactDataGrid.GridProps[T]])(children: _*)
  }
  @JSImport("react-data-grid", JSImport.Namespace)
  @js.native
  object componentImport extends js.Object
  
}

