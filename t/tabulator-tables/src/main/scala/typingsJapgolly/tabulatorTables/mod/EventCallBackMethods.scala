package typingsJapgolly.tabulatorTables.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Element
import org.scalajs.dom.UIEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCallBackMethods extends StObject {
  
  def ajaxError(): Unit
  
  def cellClick(event: UIEvent, cell: CellComponent): Unit
  
  def cellContext(event: UIEvent, cell: CellComponent): Unit
  
  def cellDblClick(event: UIEvent, cell: CellComponent): Unit
  
  def cellDblTap(event: UIEvent, cell: CellComponent): Unit
  
  def cellEditCancelled(cell: CellComponent): Unit
  
  def cellEdited(cell: CellComponent): Unit
  
  def cellEditing(cell: CellComponent): Unit
  
  def cellMouseDown(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseEnter(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseLeave(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseMove(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseOut(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseOver(event: UIEvent, cell: CellComponent): Unit
  
  def cellMouseUp(event: UIEvent, cell: CellComponent): Unit
  
  def cellTap(event: UIEvent, cell: CellComponent): Unit
  
  def cellTapHold(event: UIEvent, cell: CellComponent): Unit
  
  def clipboardCopied(clipboard: String): Unit
  
  def clipboardPasteError(clipboard: String): Unit
  
  def clipboardPasted(clipboard: String, rowData: js.Array[Any], rows: js.Array[RowComponent]): Unit
  
  def columnMoved(column: ColumnComponent, columns: js.Array[ColumnComponent]): Unit
  
  def columnResized(column: ColumnComponent): Unit
  
  def columnTitleChanged(column: ColumnComponent): Unit
  
  def columnVisibilityChanged(column: ColumnComponent, visible: Boolean): Unit
  
  def dataChanged(data: js.Array[Any]): Unit
  
  def dataFiltered(filters: js.Array[Filter], rows: js.Array[RowComponent]): Unit
  
  def dataFiltering(filters: js.Array[Filter]): Unit
  
  def dataGrouped(groups: js.Array[GroupComponent]): Unit
  
  def dataGrouping(): Unit
  
  def dataLoadError(error: js.Error): Unit
  
  def dataLoaded(data: js.Array[Any]): Unit
  
  def dataLoading(data: js.Array[Any]): Unit
  
  def dataProcessed(): Unit
  
  def dataProcessing(): Unit
  
  def dataSorted(sorters: js.Array[SorterFromTable], rows: js.Array[RowComponent]): Unit
  
  def dataSorting(sorters: js.Array[SorterFromTable]): Unit
  
  def dataTreeRowCollapsed(row: RowComponent, level: Double): Unit
  
  def dataTreeRowExpanded(row: RowComponent, level: Double): Unit
  
  def downloadComplete(): Unit
  
  def groupClick(event: UIEvent, group: GroupComponent): Unit
  
  def groupContext(event: UIEvent, group: GroupComponent): Unit
  
  def groupDblClick(event: UIEvent, group: GroupComponent): Unit
  
  def groupDblTap(event: UIEvent, group: GroupComponent): Unit
  
  def groupMouseDown(event: UIEvent, group: GroupComponent): Unit
  
  def groupMouseUp(event: UIEvent, group: GroupComponent): Unit
  
  def groupTap(event: UIEvent, group: GroupComponent): Unit
  
  def groupTapHold(event: UIEvent, group: GroupComponent): Unit
  
  def groupVisibilityChanged(group: GroupComponent, visible: Boolean): Unit
  
  def headerClick(event: UIEvent, column: ColumnComponent): Unit
  
  def headerContext(event: UIEvent, column: ColumnComponent): Unit
  
  def headerDblClick(event: UIEvent, column: ColumnComponent): Unit
  
  def headerDblTap(event: UIEvent, column: ColumnComponent): Unit
  
  def headerMouseDown(event: UIEvent, column: ColumnComponent): Unit
  
  def headerMouseUp(event: UIEvent, column: ColumnComponent): Unit
  
  def headerTap(event: UIEvent, column: ColumnComponent): Unit
  
  def headerTapHold(event: UIEvent, column: ColumnComponent): Unit
  
  def historyRedo(action: HistoryAction, component: Any, data: js.Array[Any]): Unit
  
  def historyUndo(action: HistoryAction, component: Any, data: js.Array[Any]): Unit
  
  def htmlImported(): Unit
  
  def htmlImporting(): Unit
  
  def localized(locale: String, lang: Any): Unit
  
  def movableRowsElementDrop(event: UIEvent, element: Element, row: RowComponent): Unit
  
  def movableRowsReceived(fromRow: RowComponent, toRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivedFailed(fromRow: RowComponent, toRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivingStart(fromRow: RowComponent, fromTable: Tabulator): Unit
  
  def movableRowsReceivingStop(fromTable: Tabulator): Unit
  
  def movableRowsSendingStart(toTables: js.Array[Tabulator]): Unit
  
  def movableRowsSendingStop(toTables: js.Array[Tabulator]): Unit
  
  def movableRowsSent(fromRow: RowComponent, toRow: RowComponent, toTable: Tabulator): Unit
  
  def movableRowsSentFailed(fromRow: RowComponent, toRow: RowComponent, toTable: Tabulator): Unit
  
  def pageLoaded(pageNo: Double): Unit
  
  def renderComplete(): Unit
  
  def renderStarted(): Unit
  
  def rowAdded(row: RowComponent): Unit
  
  def rowClick(event: UIEvent, row: RowComponent): Unit
  
  def rowContext(event: UIEvent, row: RowComponent): Unit
  
  def rowDblClick(event: UIEvent, row: RowComponent): Unit
  
  def rowDblTap(event: UIEvent, row: RowComponent): Unit
  
  def rowDeleted(row: RowComponent): Unit
  
  def rowDeselected(row: RowComponent): Unit
  
  def rowMouseDown(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseEnter(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseLeave(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseMove(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseOut(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseOver(event: UIEvent, row: RowComponent): Unit
  
  def rowMouseUp(event: UIEvent, row: RowComponent): Unit
  
  def rowMoved(row: RowComponent): Unit
  
  def rowMoving(row: RowComponent): Unit
  
  def rowResized(row: RowComponent): Unit
  
  def rowSelected(row: RowComponent): Unit
  
  def rowSelectionChanged(): Unit
  
  def rowTap(event: UIEvent, row: RowComponent): Unit
  
  def rowTapHold(event: UIEvent, row: RowComponent): Unit
  
  def rowUpdated(row: RowComponent): Unit
  
  def scrollHorizontal(left: Double): Unit
  
  def scrollVertical(top: Double): Unit
  
  def tableBuilding(): Unit
  
  def tableBuilt(): Unit
  
  def tableDestroyed(): Unit
  
  def validationFailed(cell: CellComponent, value: Any, validators: js.Array[Validator]): Unit
}
object EventCallBackMethods {
  
  inline def apply(
    ajaxError: Callback,
    cellClick: (UIEvent, CellComponent) => Callback,
    cellContext: (UIEvent, CellComponent) => Callback,
    cellDblClick: (UIEvent, CellComponent) => Callback,
    cellDblTap: (UIEvent, CellComponent) => Callback,
    cellEditCancelled: CellComponent => Callback,
    cellEdited: CellComponent => Callback,
    cellEditing: CellComponent => Callback,
    cellMouseDown: (UIEvent, CellComponent) => Callback,
    cellMouseEnter: (UIEvent, CellComponent) => Callback,
    cellMouseLeave: (UIEvent, CellComponent) => Callback,
    cellMouseMove: (UIEvent, CellComponent) => Callback,
    cellMouseOut: (UIEvent, CellComponent) => Callback,
    cellMouseOver: (UIEvent, CellComponent) => Callback,
    cellMouseUp: (UIEvent, CellComponent) => Callback,
    cellTap: (UIEvent, CellComponent) => Callback,
    cellTapHold: (UIEvent, CellComponent) => Callback,
    clipboardCopied: String => Callback,
    clipboardPasteError: String => Callback,
    clipboardPasted: (String, js.Array[Any], js.Array[RowComponent]) => Callback,
    columnMoved: (ColumnComponent, js.Array[ColumnComponent]) => Callback,
    columnResized: ColumnComponent => Callback,
    columnTitleChanged: ColumnComponent => Callback,
    columnVisibilityChanged: (ColumnComponent, Boolean) => Callback,
    dataChanged: js.Array[Any] => Callback,
    dataFiltered: (js.Array[Filter], js.Array[RowComponent]) => Callback,
    dataFiltering: js.Array[Filter] => Callback,
    dataGrouped: js.Array[GroupComponent] => Callback,
    dataGrouping: Callback,
    dataLoadError: js.Error => Callback,
    dataLoaded: js.Array[Any] => Callback,
    dataLoading: js.Array[Any] => Callback,
    dataProcessed: Callback,
    dataProcessing: Callback,
    dataSorted: (js.Array[SorterFromTable], js.Array[RowComponent]) => Callback,
    dataSorting: js.Array[SorterFromTable] => Callback,
    dataTreeRowCollapsed: (RowComponent, Double) => Callback,
    dataTreeRowExpanded: (RowComponent, Double) => Callback,
    downloadComplete: Callback,
    groupClick: (UIEvent, GroupComponent) => Callback,
    groupContext: (UIEvent, GroupComponent) => Callback,
    groupDblClick: (UIEvent, GroupComponent) => Callback,
    groupDblTap: (UIEvent, GroupComponent) => Callback,
    groupMouseDown: (UIEvent, GroupComponent) => Callback,
    groupMouseUp: (UIEvent, GroupComponent) => Callback,
    groupTap: (UIEvent, GroupComponent) => Callback,
    groupTapHold: (UIEvent, GroupComponent) => Callback,
    groupVisibilityChanged: (GroupComponent, Boolean) => Callback,
    headerClick: (UIEvent, ColumnComponent) => Callback,
    headerContext: (UIEvent, ColumnComponent) => Callback,
    headerDblClick: (UIEvent, ColumnComponent) => Callback,
    headerDblTap: (UIEvent, ColumnComponent) => Callback,
    headerMouseDown: (UIEvent, ColumnComponent) => Callback,
    headerMouseUp: (UIEvent, ColumnComponent) => Callback,
    headerTap: (UIEvent, ColumnComponent) => Callback,
    headerTapHold: (UIEvent, ColumnComponent) => Callback,
    historyRedo: (HistoryAction, Any, js.Array[Any]) => Callback,
    historyUndo: (HistoryAction, Any, js.Array[Any]) => Callback,
    htmlImported: Callback,
    htmlImporting: Callback,
    localized: (String, Any) => Callback,
    movableRowsElementDrop: (UIEvent, Element, RowComponent) => Callback,
    movableRowsReceived: (RowComponent, RowComponent, Tabulator) => Callback,
    movableRowsReceivedFailed: (RowComponent, RowComponent, Tabulator) => Callback,
    movableRowsReceivingStart: (RowComponent, Tabulator) => Callback,
    movableRowsReceivingStop: Tabulator => Callback,
    movableRowsSendingStart: js.Array[Tabulator] => Callback,
    movableRowsSendingStop: js.Array[Tabulator] => Callback,
    movableRowsSent: (RowComponent, RowComponent, Tabulator) => Callback,
    movableRowsSentFailed: (RowComponent, RowComponent, Tabulator) => Callback,
    pageLoaded: Double => Callback,
    renderComplete: Callback,
    renderStarted: Callback,
    rowAdded: RowComponent => Callback,
    rowClick: (UIEvent, RowComponent) => Callback,
    rowContext: (UIEvent, RowComponent) => Callback,
    rowDblClick: (UIEvent, RowComponent) => Callback,
    rowDblTap: (UIEvent, RowComponent) => Callback,
    rowDeleted: RowComponent => Callback,
    rowDeselected: RowComponent => Callback,
    rowMouseDown: (UIEvent, RowComponent) => Callback,
    rowMouseEnter: (UIEvent, RowComponent) => Callback,
    rowMouseLeave: (UIEvent, RowComponent) => Callback,
    rowMouseMove: (UIEvent, RowComponent) => Callback,
    rowMouseOut: (UIEvent, RowComponent) => Callback,
    rowMouseOver: (UIEvent, RowComponent) => Callback,
    rowMouseUp: (UIEvent, RowComponent) => Callback,
    rowMoved: RowComponent => Callback,
    rowMoving: RowComponent => Callback,
    rowResized: RowComponent => Callback,
    rowSelected: RowComponent => Callback,
    rowSelectionChanged: Callback,
    rowTap: (UIEvent, RowComponent) => Callback,
    rowTapHold: (UIEvent, RowComponent) => Callback,
    rowUpdated: RowComponent => Callback,
    scrollHorizontal: Double => Callback,
    scrollVertical: Double => Callback,
    tableBuilding: Callback,
    tableBuilt: Callback,
    tableDestroyed: Callback,
    validationFailed: (CellComponent, Any, js.Array[Validator]) => Callback
  ): EventCallBackMethods = {
    val __obj = js.Dynamic.literal(ajaxError = ajaxError.toJsFn, cellClick = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellClick(t0, t1)).runNow()), cellContext = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellContext(t0, t1)).runNow()), cellDblClick = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellDblClick(t0, t1)).runNow()), cellDblTap = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellDblTap(t0, t1)).runNow()), cellEditCancelled = js.Any.fromFunction1((t0: CellComponent) => cellEditCancelled(t0).runNow()), cellEdited = js.Any.fromFunction1((t0: CellComponent) => cellEdited(t0).runNow()), cellEditing = js.Any.fromFunction1((t0: CellComponent) => cellEditing(t0).runNow()), cellMouseDown = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseDown(t0, t1)).runNow()), cellMouseEnter = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseEnter(t0, t1)).runNow()), cellMouseLeave = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseLeave(t0, t1)).runNow()), cellMouseMove = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseMove(t0, t1)).runNow()), cellMouseOut = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseOut(t0, t1)).runNow()), cellMouseOver = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseOver(t0, t1)).runNow()), cellMouseUp = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellMouseUp(t0, t1)).runNow()), cellTap = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellTap(t0, t1)).runNow()), cellTapHold = js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (cellTapHold(t0, t1)).runNow()), clipboardCopied = js.Any.fromFunction1((t0: String) => clipboardCopied(t0).runNow()), clipboardPasteError = js.Any.fromFunction1((t0: String) => clipboardPasteError(t0).runNow()), clipboardPasted = js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: js.Array[RowComponent]) => (clipboardPasted(t0, t1, t2)).runNow()), columnMoved = js.Any.fromFunction2((t0: ColumnComponent, t1: js.Array[ColumnComponent]) => (columnMoved(t0, t1)).runNow()), columnResized = js.Any.fromFunction1((t0: ColumnComponent) => columnResized(t0).runNow()), columnTitleChanged = js.Any.fromFunction1((t0: ColumnComponent) => columnTitleChanged(t0).runNow()), columnVisibilityChanged = js.Any.fromFunction2((t0: ColumnComponent, t1: Boolean) => (columnVisibilityChanged(t0, t1)).runNow()), dataChanged = js.Any.fromFunction1((t0: js.Array[Any]) => dataChanged(t0).runNow()), dataFiltered = js.Any.fromFunction2((t0: js.Array[Filter], t1: js.Array[RowComponent]) => (dataFiltered(t0, t1)).runNow()), dataFiltering = js.Any.fromFunction1((t0: js.Array[Filter]) => dataFiltering(t0).runNow()), dataGrouped = js.Any.fromFunction1((t0: js.Array[GroupComponent]) => dataGrouped(t0).runNow()), dataGrouping = dataGrouping.toJsFn, dataLoadError = js.Any.fromFunction1((t0: js.Error) => dataLoadError(t0).runNow()), dataLoaded = js.Any.fromFunction1((t0: js.Array[Any]) => dataLoaded(t0).runNow()), dataLoading = js.Any.fromFunction1((t0: js.Array[Any]) => dataLoading(t0).runNow()), dataProcessed = dataProcessed.toJsFn, dataProcessing = dataProcessing.toJsFn, dataSorted = js.Any.fromFunction2((t0: js.Array[SorterFromTable], t1: js.Array[RowComponent]) => (dataSorted(t0, t1)).runNow()), dataSorting = js.Any.fromFunction1((t0: js.Array[SorterFromTable]) => dataSorting(t0).runNow()), dataTreeRowCollapsed = js.Any.fromFunction2((t0: RowComponent, t1: Double) => (dataTreeRowCollapsed(t0, t1)).runNow()), dataTreeRowExpanded = js.Any.fromFunction2((t0: RowComponent, t1: Double) => (dataTreeRowExpanded(t0, t1)).runNow()), downloadComplete = downloadComplete.toJsFn, groupClick = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupClick(t0, t1)).runNow()), groupContext = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupContext(t0, t1)).runNow()), groupDblClick = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupDblClick(t0, t1)).runNow()), groupDblTap = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupDblTap(t0, t1)).runNow()), groupMouseDown = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupMouseDown(t0, t1)).runNow()), groupMouseUp = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupMouseUp(t0, t1)).runNow()), groupTap = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupTap(t0, t1)).runNow()), groupTapHold = js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (groupTapHold(t0, t1)).runNow()), groupVisibilityChanged = js.Any.fromFunction2((t0: GroupComponent, t1: Boolean) => (groupVisibilityChanged(t0, t1)).runNow()), headerClick = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerClick(t0, t1)).runNow()), headerContext = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerContext(t0, t1)).runNow()), headerDblClick = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerDblClick(t0, t1)).runNow()), headerDblTap = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerDblTap(t0, t1)).runNow()), headerMouseDown = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerMouseDown(t0, t1)).runNow()), headerMouseUp = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerMouseUp(t0, t1)).runNow()), headerTap = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerTap(t0, t1)).runNow()), headerTapHold = js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (headerTapHold(t0, t1)).runNow()), historyRedo = js.Any.fromFunction3((t0: HistoryAction, t1: Any, t2: js.Array[Any]) => (historyRedo(t0, t1, t2)).runNow()), historyUndo = js.Any.fromFunction3((t0: HistoryAction, t1: Any, t2: js.Array[Any]) => (historyUndo(t0, t1, t2)).runNow()), htmlImported = htmlImported.toJsFn, htmlImporting = htmlImporting.toJsFn, localized = js.Any.fromFunction2((t0: String, t1: Any) => (localized(t0, t1)).runNow()), movableRowsElementDrop = js.Any.fromFunction3((t0: UIEvent, t1: Element, t2: RowComponent) => (movableRowsElementDrop(t0, t1, t2)).runNow()), movableRowsReceived = js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (movableRowsReceived(t0, t1, t2)).runNow()), movableRowsReceivedFailed = js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (movableRowsReceivedFailed(t0, t1, t2)).runNow()), movableRowsReceivingStart = js.Any.fromFunction2((t0: RowComponent, t1: Tabulator) => (movableRowsReceivingStart(t0, t1)).runNow()), movableRowsReceivingStop = js.Any.fromFunction1((t0: Tabulator) => movableRowsReceivingStop(t0).runNow()), movableRowsSendingStart = js.Any.fromFunction1((t0: js.Array[Tabulator]) => movableRowsSendingStart(t0).runNow()), movableRowsSendingStop = js.Any.fromFunction1((t0: js.Array[Tabulator]) => movableRowsSendingStop(t0).runNow()), movableRowsSent = js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (movableRowsSent(t0, t1, t2)).runNow()), movableRowsSentFailed = js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (movableRowsSentFailed(t0, t1, t2)).runNow()), pageLoaded = js.Any.fromFunction1((t0: Double) => pageLoaded(t0).runNow()), renderComplete = renderComplete.toJsFn, renderStarted = renderStarted.toJsFn, rowAdded = js.Any.fromFunction1((t0: RowComponent) => rowAdded(t0).runNow()), rowClick = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowClick(t0, t1)).runNow()), rowContext = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowContext(t0, t1)).runNow()), rowDblClick = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowDblClick(t0, t1)).runNow()), rowDblTap = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowDblTap(t0, t1)).runNow()), rowDeleted = js.Any.fromFunction1((t0: RowComponent) => rowDeleted(t0).runNow()), rowDeselected = js.Any.fromFunction1((t0: RowComponent) => rowDeselected(t0).runNow()), rowMouseDown = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseDown(t0, t1)).runNow()), rowMouseEnter = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseEnter(t0, t1)).runNow()), rowMouseLeave = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseLeave(t0, t1)).runNow()), rowMouseMove = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseMove(t0, t1)).runNow()), rowMouseOut = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseOut(t0, t1)).runNow()), rowMouseOver = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseOver(t0, t1)).runNow()), rowMouseUp = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowMouseUp(t0, t1)).runNow()), rowMoved = js.Any.fromFunction1((t0: RowComponent) => rowMoved(t0).runNow()), rowMoving = js.Any.fromFunction1((t0: RowComponent) => rowMoving(t0).runNow()), rowResized = js.Any.fromFunction1((t0: RowComponent) => rowResized(t0).runNow()), rowSelected = js.Any.fromFunction1((t0: RowComponent) => rowSelected(t0).runNow()), rowSelectionChanged = rowSelectionChanged.toJsFn, rowTap = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowTap(t0, t1)).runNow()), rowTapHold = js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (rowTapHold(t0, t1)).runNow()), rowUpdated = js.Any.fromFunction1((t0: RowComponent) => rowUpdated(t0).runNow()), scrollHorizontal = js.Any.fromFunction1((t0: Double) => scrollHorizontal(t0).runNow()), scrollVertical = js.Any.fromFunction1((t0: Double) => scrollVertical(t0).runNow()), tableBuilding = tableBuilding.toJsFn, tableBuilt = tableBuilt.toJsFn, tableDestroyed = tableDestroyed.toJsFn, validationFailed = js.Any.fromFunction3((t0: CellComponent, t1: Any, t2: js.Array[Validator]) => (validationFailed(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[EventCallBackMethods]
  }
  
  extension [Self <: EventCallBackMethods](x: Self) {
    
    inline def setAjaxError(value: Callback): Self = StObject.set(x, "ajaxError", value.toJsFn)
    
    inline def setCellClick(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellClick", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellContext(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellContext", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellDblClick(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellDblClick", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellDblTap(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellDblTap", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellEditCancelled(value: CellComponent => Callback): Self = StObject.set(x, "cellEditCancelled", js.Any.fromFunction1((t0: CellComponent) => value(t0).runNow()))
    
    inline def setCellEdited(value: CellComponent => Callback): Self = StObject.set(x, "cellEdited", js.Any.fromFunction1((t0: CellComponent) => value(t0).runNow()))
    
    inline def setCellEditing(value: CellComponent => Callback): Self = StObject.set(x, "cellEditing", js.Any.fromFunction1((t0: CellComponent) => value(t0).runNow()))
    
    inline def setCellMouseDown(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseDown", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseEnter(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseEnter", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseLeave(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseLeave", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseMove(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseMove", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseOut(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseOut", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseOver(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseOver", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellMouseUp(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellMouseUp", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellTap(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellTap", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setCellTapHold(value: (UIEvent, CellComponent) => Callback): Self = StObject.set(x, "cellTapHold", js.Any.fromFunction2((t0: UIEvent, t1: CellComponent) => (value(t0, t1)).runNow()))
    
    inline def setClipboardCopied(value: String => Callback): Self = StObject.set(x, "clipboardCopied", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClipboardPasteError(value: String => Callback): Self = StObject.set(x, "clipboardPasteError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setClipboardPasted(value: (String, js.Array[Any], js.Array[RowComponent]) => Callback): Self = StObject.set(x, "clipboardPasted", js.Any.fromFunction3((t0: String, t1: js.Array[Any], t2: js.Array[RowComponent]) => (value(t0, t1, t2)).runNow()))
    
    inline def setColumnMoved(value: (ColumnComponent, js.Array[ColumnComponent]) => Callback): Self = StObject.set(x, "columnMoved", js.Any.fromFunction2((t0: ColumnComponent, t1: js.Array[ColumnComponent]) => (value(t0, t1)).runNow()))
    
    inline def setColumnResized(value: ColumnComponent => Callback): Self = StObject.set(x, "columnResized", js.Any.fromFunction1((t0: ColumnComponent) => value(t0).runNow()))
    
    inline def setColumnTitleChanged(value: ColumnComponent => Callback): Self = StObject.set(x, "columnTitleChanged", js.Any.fromFunction1((t0: ColumnComponent) => value(t0).runNow()))
    
    inline def setColumnVisibilityChanged(value: (ColumnComponent, Boolean) => Callback): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2((t0: ColumnComponent, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setDataChanged(value: js.Array[Any] => Callback): Self = StObject.set(x, "dataChanged", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setDataFiltered(value: (js.Array[Filter], js.Array[RowComponent]) => Callback): Self = StObject.set(x, "dataFiltered", js.Any.fromFunction2((t0: js.Array[Filter], t1: js.Array[RowComponent]) => (value(t0, t1)).runNow()))
    
    inline def setDataFiltering(value: js.Array[Filter] => Callback): Self = StObject.set(x, "dataFiltering", js.Any.fromFunction1((t0: js.Array[Filter]) => value(t0).runNow()))
    
    inline def setDataGrouped(value: js.Array[GroupComponent] => Callback): Self = StObject.set(x, "dataGrouped", js.Any.fromFunction1((t0: js.Array[GroupComponent]) => value(t0).runNow()))
    
    inline def setDataGrouping(value: Callback): Self = StObject.set(x, "dataGrouping", value.toJsFn)
    
    inline def setDataLoadError(value: js.Error => Callback): Self = StObject.set(x, "dataLoadError", js.Any.fromFunction1((t0: js.Error) => value(t0).runNow()))
    
    inline def setDataLoaded(value: js.Array[Any] => Callback): Self = StObject.set(x, "dataLoaded", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setDataLoading(value: js.Array[Any] => Callback): Self = StObject.set(x, "dataLoading", js.Any.fromFunction1((t0: js.Array[Any]) => value(t0).runNow()))
    
    inline def setDataProcessed(value: Callback): Self = StObject.set(x, "dataProcessed", value.toJsFn)
    
    inline def setDataProcessing(value: Callback): Self = StObject.set(x, "dataProcessing", value.toJsFn)
    
    inline def setDataSorted(value: (js.Array[SorterFromTable], js.Array[RowComponent]) => Callback): Self = StObject.set(x, "dataSorted", js.Any.fromFunction2((t0: js.Array[SorterFromTable], t1: js.Array[RowComponent]) => (value(t0, t1)).runNow()))
    
    inline def setDataSorting(value: js.Array[SorterFromTable] => Callback): Self = StObject.set(x, "dataSorting", js.Any.fromFunction1((t0: js.Array[SorterFromTable]) => value(t0).runNow()))
    
    inline def setDataTreeRowCollapsed(value: (RowComponent, Double) => Callback): Self = StObject.set(x, "dataTreeRowCollapsed", js.Any.fromFunction2((t0: RowComponent, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDataTreeRowExpanded(value: (RowComponent, Double) => Callback): Self = StObject.set(x, "dataTreeRowExpanded", js.Any.fromFunction2((t0: RowComponent, t1: Double) => (value(t0, t1)).runNow()))
    
    inline def setDownloadComplete(value: Callback): Self = StObject.set(x, "downloadComplete", value.toJsFn)
    
    inline def setGroupClick(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupClick", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupContext(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupContext", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupDblClick(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupDblClick", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupDblTap(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupDblTap", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupMouseDown(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupMouseDown", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupMouseUp(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupMouseUp", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupTap(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupTap", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupTapHold(value: (UIEvent, GroupComponent) => Callback): Self = StObject.set(x, "groupTapHold", js.Any.fromFunction2((t0: UIEvent, t1: GroupComponent) => (value(t0, t1)).runNow()))
    
    inline def setGroupVisibilityChanged(value: (GroupComponent, Boolean) => Callback): Self = StObject.set(x, "groupVisibilityChanged", js.Any.fromFunction2((t0: GroupComponent, t1: Boolean) => (value(t0, t1)).runNow()))
    
    inline def setHeaderClick(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerClick", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderContext(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerContext", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderDblClick(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerDblClick", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderDblTap(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerDblTap", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderMouseDown(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerMouseDown", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderMouseUp(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerMouseUp", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderTap(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerTap", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHeaderTapHold(value: (UIEvent, ColumnComponent) => Callback): Self = StObject.set(x, "headerTapHold", js.Any.fromFunction2((t0: UIEvent, t1: ColumnComponent) => (value(t0, t1)).runNow()))
    
    inline def setHistoryRedo(value: (HistoryAction, Any, js.Array[Any]) => Callback): Self = StObject.set(x, "historyRedo", js.Any.fromFunction3((t0: HistoryAction, t1: Any, t2: js.Array[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setHistoryUndo(value: (HistoryAction, Any, js.Array[Any]) => Callback): Self = StObject.set(x, "historyUndo", js.Any.fromFunction3((t0: HistoryAction, t1: Any, t2: js.Array[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setHtmlImported(value: Callback): Self = StObject.set(x, "htmlImported", value.toJsFn)
    
    inline def setHtmlImporting(value: Callback): Self = StObject.set(x, "htmlImporting", value.toJsFn)
    
    inline def setLocalized(value: (String, Any) => Callback): Self = StObject.set(x, "localized", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setMovableRowsElementDrop(value: (UIEvent, Element, RowComponent) => Callback): Self = StObject.set(x, "movableRowsElementDrop", js.Any.fromFunction3((t0: UIEvent, t1: Element, t2: RowComponent) => (value(t0, t1, t2)).runNow()))
    
    inline def setMovableRowsReceived(value: (RowComponent, RowComponent, Tabulator) => Callback): Self = StObject.set(x, "movableRowsReceived", js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (value(t0, t1, t2)).runNow()))
    
    inline def setMovableRowsReceivedFailed(value: (RowComponent, RowComponent, Tabulator) => Callback): Self = StObject.set(x, "movableRowsReceivedFailed", js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (value(t0, t1, t2)).runNow()))
    
    inline def setMovableRowsReceivingStart(value: (RowComponent, Tabulator) => Callback): Self = StObject.set(x, "movableRowsReceivingStart", js.Any.fromFunction2((t0: RowComponent, t1: Tabulator) => (value(t0, t1)).runNow()))
    
    inline def setMovableRowsReceivingStop(value: Tabulator => Callback): Self = StObject.set(x, "movableRowsReceivingStop", js.Any.fromFunction1((t0: Tabulator) => value(t0).runNow()))
    
    inline def setMovableRowsSendingStart(value: js.Array[Tabulator] => Callback): Self = StObject.set(x, "movableRowsSendingStart", js.Any.fromFunction1((t0: js.Array[Tabulator]) => value(t0).runNow()))
    
    inline def setMovableRowsSendingStop(value: js.Array[Tabulator] => Callback): Self = StObject.set(x, "movableRowsSendingStop", js.Any.fromFunction1((t0: js.Array[Tabulator]) => value(t0).runNow()))
    
    inline def setMovableRowsSent(value: (RowComponent, RowComponent, Tabulator) => Callback): Self = StObject.set(x, "movableRowsSent", js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (value(t0, t1, t2)).runNow()))
    
    inline def setMovableRowsSentFailed(value: (RowComponent, RowComponent, Tabulator) => Callback): Self = StObject.set(x, "movableRowsSentFailed", js.Any.fromFunction3((t0: RowComponent, t1: RowComponent, t2: Tabulator) => (value(t0, t1, t2)).runNow()))
    
    inline def setPageLoaded(value: Double => Callback): Self = StObject.set(x, "pageLoaded", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setRenderComplete(value: Callback): Self = StObject.set(x, "renderComplete", value.toJsFn)
    
    inline def setRenderStarted(value: Callback): Self = StObject.set(x, "renderStarted", value.toJsFn)
    
    inline def setRowAdded(value: RowComponent => Callback): Self = StObject.set(x, "rowAdded", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowClick(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowClick", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowContext(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowContext", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowDblClick(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowDblClick", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowDblTap(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowDblTap", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowDeleted(value: RowComponent => Callback): Self = StObject.set(x, "rowDeleted", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowDeselected(value: RowComponent => Callback): Self = StObject.set(x, "rowDeselected", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowMouseDown(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseDown", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseEnter(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseEnter", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseLeave(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseLeave", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseMove(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseMove", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseOut(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseOut", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseOver(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseOver", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMouseUp(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowMouseUp", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowMoved(value: RowComponent => Callback): Self = StObject.set(x, "rowMoved", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowMoving(value: RowComponent => Callback): Self = StObject.set(x, "rowMoving", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowResized(value: RowComponent => Callback): Self = StObject.set(x, "rowResized", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowSelected(value: RowComponent => Callback): Self = StObject.set(x, "rowSelected", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setRowSelectionChanged(value: Callback): Self = StObject.set(x, "rowSelectionChanged", value.toJsFn)
    
    inline def setRowTap(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowTap", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowTapHold(value: (UIEvent, RowComponent) => Callback): Self = StObject.set(x, "rowTapHold", js.Any.fromFunction2((t0: UIEvent, t1: RowComponent) => (value(t0, t1)).runNow()))
    
    inline def setRowUpdated(value: RowComponent => Callback): Self = StObject.set(x, "rowUpdated", js.Any.fromFunction1((t0: RowComponent) => value(t0).runNow()))
    
    inline def setScrollHorizontal(value: Double => Callback): Self = StObject.set(x, "scrollHorizontal", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setScrollVertical(value: Double => Callback): Self = StObject.set(x, "scrollVertical", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setTableBuilding(value: Callback): Self = StObject.set(x, "tableBuilding", value.toJsFn)
    
    inline def setTableBuilt(value: Callback): Self = StObject.set(x, "tableBuilt", value.toJsFn)
    
    inline def setTableDestroyed(value: Callback): Self = StObject.set(x, "tableDestroyed", value.toJsFn)
    
    inline def setValidationFailed(value: (CellComponent, Any, js.Array[Validator]) => Callback): Self = StObject.set(x, "validationFailed", js.Any.fromFunction3((t0: CellComponent, t1: Any, t2: js.Array[Validator]) => (value(t0, t1, t2)).runNow()))
  }
}
