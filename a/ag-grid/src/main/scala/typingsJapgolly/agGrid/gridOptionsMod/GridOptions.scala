package typingsJapgolly.agGrid.gridOptionsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.agGrid.AnonInstantiable
import typingsJapgolly.agGrid.AnonInstantiableAny
import typingsJapgolly.agGrid.AnonInstantiableICellRendererComp
import typingsJapgolly.agGrid.AnonInstantiableILoadingOverlayComp
import typingsJapgolly.agGrid.AnonInstantiableINoRowsOverlayComp
import typingsJapgolly.agGrid.colDefMod.ColDef
import typingsJapgolly.agGrid.colDefMod.ColGroupDef
import typingsJapgolly.agGrid.colDefMod.IAggFunc
import typingsJapgolly.agGrid.columnApiMod.ColumnApi
import typingsJapgolly.agGrid.componentProviderMod.AgGridRegisteredComponentInput
import typingsJapgolly.agGrid.componentResolverMod.ComponentHolder
import typingsJapgolly.agGrid.eventsMod.BodyScrollEvent
import typingsJapgolly.agGrid.eventsMod.CellClickedEvent
import typingsJapgolly.agGrid.eventsMod.CellContextMenuEvent
import typingsJapgolly.agGrid.eventsMod.CellDoubleClickedEvent
import typingsJapgolly.agGrid.eventsMod.CellEditingStartedEvent
import typingsJapgolly.agGrid.eventsMod.CellEditingStoppedEvent
import typingsJapgolly.agGrid.eventsMod.CellFocusedEvent
import typingsJapgolly.agGrid.eventsMod.CellMouseDownEvent
import typingsJapgolly.agGrid.eventsMod.CellMouseOutEvent
import typingsJapgolly.agGrid.eventsMod.CellMouseOverEvent
import typingsJapgolly.agGrid.eventsMod.CellValueChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnAggFuncChangeRequestEvent
import typingsJapgolly.agGrid.eventsMod.ColumnEverythingChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnGroupOpenedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnMovedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnPinnedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnPivotChangeRequestEvent
import typingsJapgolly.agGrid.eventsMod.ColumnPivotChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnPivotModeChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnResizedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnRowGroupChangeRequestEvent
import typingsJapgolly.agGrid.eventsMod.ColumnRowGroupChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnValueChangeRequestEvent
import typingsJapgolly.agGrid.eventsMod.ColumnValueChangedEvent
import typingsJapgolly.agGrid.eventsMod.ColumnVisibleEvent
import typingsJapgolly.agGrid.eventsMod.DisplayedColumnsChangedEvent
import typingsJapgolly.agGrid.eventsMod.DragStartedEvent
import typingsJapgolly.agGrid.eventsMod.DragStoppedEvent
import typingsJapgolly.agGrid.eventsMod.FilterChangedEvent
import typingsJapgolly.agGrid.eventsMod.FilterModifiedEvent
import typingsJapgolly.agGrid.eventsMod.GridColumnsChangedEvent
import typingsJapgolly.agGrid.eventsMod.GridReadyEvent
import typingsJapgolly.agGrid.eventsMod.ModelUpdatedEvent
import typingsJapgolly.agGrid.eventsMod.NewColumnsLoadedEvent
import typingsJapgolly.agGrid.eventsMod.PaginationChangedEvent
import typingsJapgolly.agGrid.eventsMod.PasteEndEvent
import typingsJapgolly.agGrid.eventsMod.PasteStartEvent
import typingsJapgolly.agGrid.eventsMod.PinnedRowDataChangedEvent
import typingsJapgolly.agGrid.eventsMod.RangeSelectionChangedEvent
import typingsJapgolly.agGrid.eventsMod.RowClickedEvent
import typingsJapgolly.agGrid.eventsMod.RowDataChangedEvent
import typingsJapgolly.agGrid.eventsMod.RowDataUpdatedEvent
import typingsJapgolly.agGrid.eventsMod.RowDoubleClickedEvent
import typingsJapgolly.agGrid.eventsMod.RowDragEvent
import typingsJapgolly.agGrid.eventsMod.RowEditingStartedEvent
import typingsJapgolly.agGrid.eventsMod.RowEditingStoppedEvent
import typingsJapgolly.agGrid.eventsMod.RowGroupOpenedEvent
import typingsJapgolly.agGrid.eventsMod.RowSelectedEvent
import typingsJapgolly.agGrid.eventsMod.RowValueChangedEvent
import typingsJapgolly.agGrid.eventsMod.SelectionChangedEvent
import typingsJapgolly.agGrid.eventsMod.SortChangedEvent
import typingsJapgolly.agGrid.eventsMod.ViewportChangedEvent
import typingsJapgolly.agGrid.eventsMod.VirtualColumnsChangedEvent
import typingsJapgolly.agGrid.eventsMod.VirtualRowRemovedEvent
import typingsJapgolly.agGrid.exportParamsMod.CsvExportParams
import typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams
import typingsJapgolly.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typingsJapgolly.agGrid.gridApiMod.GridApi
import typingsJapgolly.agGrid.gridCellMod.GridCellDef
import typingsJapgolly.agGrid.iCellRendererMod.ICellRendererFunc
import typingsJapgolly.agGrid.iComponentMod.IComponent
import typingsJapgolly.agGrid.iDatasourceMod.IDatasource
import typingsJapgolly.agGrid.iServerSideDatasourceMod.IServerSideDatasource
import typingsJapgolly.agGrid.iViewportDatasourceMod.IViewportDatasource
import typingsJapgolly.agGrid.rowNodeMod.RowNode
import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends ComponentHolder {
  var accentedSort: js.UndefOr[Boolean] = js.undefined
  var aggFuncs: js.UndefOr[StringDictionary[IAggFunc]] = js.undefined
  var aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.undefined
  var alignedGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.undefined
  var alwaysShowStatusBar: js.UndefOr[Boolean] = js.undefined
  var angularCompileFilters: js.UndefOr[Boolean] = js.undefined
  var angularCompileHeaders: js.UndefOr[Boolean] = js.undefined
  var angularCompileRows: js.UndefOr[Boolean] = js.undefined
  var animateRows: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var api: js.UndefOr[GridApi] = js.undefined
  var autoGroupColumnDef: js.UndefOr[ColDef] = js.undefined
  var autoSizePadding: js.UndefOr[Double] = js.undefined
  var batchUpdateWaitMillis: js.UndefOr[Double] = js.undefined
  var cacheBlockSize: js.UndefOr[Double] = js.undefined
  var cacheOverflowSize: js.UndefOr[Double] = js.undefined
  var cacheQuickFilter: js.UndefOr[Boolean] = js.undefined
  var clipboardDeliminator: js.UndefOr[String] = js.undefined
  var colResizeDefault: js.UndefOr[String] = js.undefined
  var colWidth: js.UndefOr[Double] = js.undefined
  var columnApi: js.UndefOr[ColumnApi] = js.undefined
  var columnDefs: js.UndefOr[js.Array[ColDef | ColGroupDef]] = js.undefined
  var columnTypes: js.UndefOr[StringDictionary[ColDef]] = js.undefined
  var components: js.UndefOr[StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var context: js.UndefOr[js.Any] = js.undefined
  var contractColumnSelection: js.UndefOr[Boolean] = js.undefined
  var datasource: js.UndefOr[IDatasource] = js.undefined
  var dateComponent: js.UndefOr[AnonInstantiable] = js.undefined
  var dateComponentFramework: js.UndefOr[js.Any] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var defaultColDef: js.UndefOr[ColDef] = js.undefined
  var defaultColGroupDef: js.UndefOr[ColGroupDef] = js.undefined
  var defaultExportParams: js.UndefOr[CsvExportParams] = js.undefined
  var defaultGroupSortComparator: js.UndefOr[js.Function2[/* nodeA */ RowNode, /* nodeB */ RowNode, Double]] = js.undefined
  var deltaRowDataMode: js.UndefOr[Boolean] = js.undefined
  var detailCellRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var detailCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var detailCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var detailRowHeight: js.UndefOr[Double] = js.undefined
  var doesDataFlower: js.UndefOr[js.Function1[/* dataItem */ js.Any, Boolean]] = js.undefined
  var doesExternalFilterPass: js.UndefOr[js.Function1[/* node */ RowNode, Boolean]] = js.undefined
  var domLayout: js.UndefOr[String] = js.undefined
  var editType: js.UndefOr[String] = js.undefined
  var embedFullWidthRows: js.UndefOr[Boolean] = js.undefined
  var enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined
  var enableCellExpressions: js.UndefOr[Boolean] = js.undefined
  var enableColResize: js.UndefOr[Boolean] = js.undefined
  var enableFilter: js.UndefOr[Boolean] = js.undefined
  var enableGroupEdit: js.UndefOr[Boolean] = js.undefined
  var enableOldSetFilterModel: js.UndefOr[Boolean] = js.undefined
  var enableRangeSelection: js.UndefOr[Boolean] = js.undefined
  var enableRtl: js.UndefOr[Boolean] = js.undefined
  var enableServerSideFilter: js.UndefOr[Boolean] = js.undefined
  var enableServerSideSorting: js.UndefOr[Boolean] = js.undefined
  var enableSorting: js.UndefOr[Boolean] = js.undefined
  var enableStatusBar: js.UndefOr[Boolean] = js.undefined
  var ensureDomOrder: js.UndefOr[Boolean] = js.undefined
  var enterMovesDown: js.UndefOr[Boolean] = js.undefined
  var enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.undefined
  var excelStyles: js.UndefOr[js.Array[_]] = js.undefined
  var floatingFilter: js.UndefOr[Boolean] = js.undefined
  var floatingFiltersHeight: js.UndefOr[Double] = js.undefined
  var forPrint: js.UndefOr[Boolean] = js.undefined
  var frameworkComponents: js.UndefOr[StringDictionary[AnonInstantiableAny]] = js.undefined
  var fullWidthCellRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var fullWidthCellRendererFramework: js.UndefOr[js.Any] = js.undefined
  var fullWidthCellRendererParams: js.UndefOr[js.Any] = js.undefined
  var functionsPassive: js.UndefOr[Boolean] = js.undefined
  var functionsReadOnly: js.UndefOr[Boolean] = js.undefined
  var getBusinessKeyForNode: js.UndefOr[js.Function1[/* node */ RowNode, String]] = js.undefined
  var getChildCount: js.UndefOr[js.Function1[/* dataItem */ js.Any, Double]] = js.undefined
  var getContextMenuItems: js.UndefOr[GetContextMenuItems] = js.undefined
  var getDataPath: js.UndefOr[GetDataPath] = js.undefined
  var getDocument: js.UndefOr[js.Function0[Document_]] = js.undefined
  var getMainMenuItems: js.UndefOr[GetMainMenuItems] = js.undefined
  var getNodeChildDetails: js.UndefOr[GetNodeChildDetails] = js.undefined
  var getRowClass: js.UndefOr[js.Function1[/* params */ js.Any, String | js.Array[String]]] = js.undefined
  var getRowHeight: js.UndefOr[js.Function] = js.undefined
  var getRowNodeId: js.UndefOr[GetRowNodeIdFunc] = js.undefined
  var getRowStyle: js.UndefOr[js.Function] = js.undefined
  var gridAutoHeight: js.UndefOr[Boolean] = js.undefined
  var groupColumnDef: js.UndefOr[ColDef] = js.undefined
  var groupDefaultExpanded: js.UndefOr[Double] = js.undefined
  var groupHeaderHeight: js.UndefOr[Double] = js.undefined
  var groupHideOpenParents: js.UndefOr[Boolean] = js.undefined
  var groupIncludeFooter: js.UndefOr[Boolean] = js.undefined
  var groupIncludeTotalFooter: js.UndefOr[Boolean] = js.undefined
  var groupMultiAutoColumn: js.UndefOr[Boolean] = js.undefined
  var groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.undefined
  var groupRemoveSingleChildren: js.UndefOr[Boolean] = js.undefined
  var groupRowAggNodes: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], _]] = js.undefined
  var groupRowInnerRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var groupRowInnerRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRenderer: js.UndefOr[AnonInstantiableICellRendererComp | ICellRendererFunc | String] = js.undefined
  var groupRowRendererFramework: js.UndefOr[js.Any] = js.undefined
  var groupRowRendererParams: js.UndefOr[js.Any] = js.undefined
  var groupSelectsChildren: js.UndefOr[Boolean] = js.undefined
  var groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var groupSuppressAutoColumn: js.UndefOr[Boolean] = js.undefined
  var groupSuppressBlankHeader: js.UndefOr[Boolean] = js.undefined
  var groupSuppressRow: js.UndefOr[Boolean] = js.undefined
  var groupUseEntireRow: js.UndefOr[Boolean] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var icons: js.UndefOr[js.Any] = js.undefined
  var infiniteInitialRowCount: js.UndefOr[Double] = js.undefined
  var isExternalFilterPresent: js.UndefOr[js.Function0[Boolean]] = js.undefined
  var isFullWidthCell: js.UndefOr[js.Function1[/* rowNode */ RowNode, Boolean]] = js.undefined
  var isRowMaster: js.UndefOr[IsRowMaster] = js.undefined
  var isRowSelectable: js.UndefOr[IsRowSelectable] = js.undefined
  var loadingOverlayComponent: js.UndefOr[AnonInstantiableILoadingOverlayComp | String] = js.undefined
  var loadingOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var localeText: js.UndefOr[js.Any] = js.undefined
  var localeTextFunc: js.UndefOr[js.Function] = js.undefined
  var masterDetail: js.UndefOr[Boolean] = js.undefined
  var maxBlocksInCache: js.UndefOr[Double] = js.undefined
  var maxColWidth: js.UndefOr[Double] = js.undefined
  var maxConcurrentDatasourceRequests: js.UndefOr[Double] = js.undefined
  var minColWidth: js.UndefOr[Double] = js.undefined
  var multiSortKey: js.UndefOr[String] = js.undefined
  var navigateToNextCell: js.UndefOr[js.Function1[/* params */ NavigateToNextCellParams, GridCellDef]] = js.undefined
  var noRowsOverlayComponent: js.UndefOr[AnonInstantiableINoRowsOverlayComp | String] = js.undefined
  var noRowsOverlayComponentFramework: js.UndefOr[js.Any] = js.undefined
  var onBodyScroll: js.UndefOr[js.Function1[/* event */ BodyScrollEvent, Unit]] = js.undefined
  var onCellClicked: js.UndefOr[js.Function1[/* event */ CellClickedEvent, Unit]] = js.undefined
  var onCellContextMenu: js.UndefOr[js.Function1[/* event */ CellContextMenuEvent, Unit]] = js.undefined
  var onCellDoubleClicked: js.UndefOr[js.Function1[/* event */ CellDoubleClickedEvent, Unit]] = js.undefined
  var onCellEditingStarted: js.UndefOr[js.Function1[/* event */ CellEditingStartedEvent, Unit]] = js.undefined
  var onCellEditingStopped: js.UndefOr[js.Function1[/* event */ CellEditingStoppedEvent, Unit]] = js.undefined
  var onCellFocused: js.UndefOr[js.Function1[/* event */ CellFocusedEvent, Unit]] = js.undefined
  var onCellMouseDown: js.UndefOr[js.Function1[/* event */ CellMouseDownEvent, Unit]] = js.undefined
  var onCellMouseOut: js.UndefOr[js.Function1[/* event */ CellMouseOutEvent, Unit]] = js.undefined
  var onCellMouseOver: js.UndefOr[js.Function1[/* event */ CellMouseOverEvent, Unit]] = js.undefined
  var onCellValueChanged: js.UndefOr[js.Function1[/* event */ CellValueChangedEvent, Unit]] = js.undefined
  var onColumnAggFuncChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnAggFuncChangeRequestEvent, Unit]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var onColumnEverythingChanged: js.UndefOr[js.Function1[/* event */ ColumnEverythingChangedEvent, Unit]] = js.undefined
  var onColumnGroupOpened: js.UndefOr[js.Function1[/* event */ ColumnGroupOpenedEvent, Unit]] = js.undefined
  var onColumnMoved: js.UndefOr[js.Function1[/* event */ ColumnMovedEvent, Unit]] = js.undefined
  var onColumnPinned: js.UndefOr[js.Function1[/* event */ ColumnPinnedEvent, Unit]] = js.undefined
  var onColumnPivotChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnPivotChangeRequestEvent, Unit]] = js.undefined
  var onColumnPivotChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotChangedEvent, Unit]] = js.undefined
  var onColumnPivotModeChanged: js.UndefOr[js.Function1[/* event */ ColumnPivotModeChangedEvent, Unit]] = js.undefined
  var onColumnResized: js.UndefOr[js.Function1[/* event */ ColumnResizedEvent, Unit]] = js.undefined
  var onColumnRowGroupChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangeRequestEvent, Unit]] = js.undefined
  var onColumnRowGroupChanged: js.UndefOr[js.Function1[/* event */ ColumnRowGroupChangedEvent, Unit]] = js.undefined
  var onColumnValueChangeRequest: js.UndefOr[js.Function1[/* event */ ColumnValueChangeRequestEvent, Unit]] = js.undefined
  var onColumnValueChanged: js.UndefOr[js.Function1[/* event */ ColumnValueChangedEvent, Unit]] = js.undefined
  var onColumnVisible: js.UndefOr[js.Function1[/* event */ ColumnVisibleEvent, Unit]] = js.undefined
  var onDisplayedColumnsChanged: js.UndefOr[js.Function1[/* event */ DisplayedColumnsChangedEvent, Unit]] = js.undefined
  var onDragStarted: js.UndefOr[js.Function1[/* event */ DragStartedEvent, Unit]] = js.undefined
  var onDragStopped: js.UndefOr[js.Function1[/* event */ DragStoppedEvent, Unit]] = js.undefined
  var onFilterChanged: js.UndefOr[js.Function1[/* event */ FilterChangedEvent, Unit]] = js.undefined
  var onFilterModified: js.UndefOr[js.Function1[/* event */ FilterModifiedEvent, Unit]] = js.undefined
  var onGridColumnsChanged: js.UndefOr[js.Function1[/* event */ GridColumnsChangedEvent, Unit]] = js.undefined
  var onGridReady: js.UndefOr[js.Function1[/* event */ GridReadyEvent, Unit]] = js.undefined
  var onGridSizeChanged: js.UndefOr[js.Function1[/* event */ js.Any, Unit]] = js.undefined
  var onModelUpdated: js.UndefOr[js.Function1[/* event */ ModelUpdatedEvent, Unit]] = js.undefined
  var onNewColumnsLoaded: js.UndefOr[js.Function1[/* event */ NewColumnsLoadedEvent, Unit]] = js.undefined
  var onPaginationChanged: js.UndefOr[js.Function1[/* event */ PaginationChangedEvent, Unit]] = js.undefined
  var onPasteEnd: js.UndefOr[js.Function1[/* event */ PasteEndEvent, Unit]] = js.undefined
  var onPasteStart: js.UndefOr[js.Function1[/* event */ PasteStartEvent, Unit]] = js.undefined
  var onPinnedRowDataChanged: js.UndefOr[js.Function1[/* event */ PinnedRowDataChangedEvent, Unit]] = js.undefined
  var onRangeSelectionChanged: js.UndefOr[js.Function1[/* event */ RangeSelectionChangedEvent, Unit]] = js.undefined
  var onRowClicked: js.UndefOr[js.Function1[/* event */ RowClickedEvent, Unit]] = js.undefined
  var onRowDataChanged: js.UndefOr[js.Function1[/* event */ RowDataChangedEvent, Unit]] = js.undefined
  var onRowDataUpdated: js.UndefOr[js.Function1[/* event */ RowDataUpdatedEvent, Unit]] = js.undefined
  var onRowDoubleClicked: js.UndefOr[js.Function1[/* event */ RowDoubleClickedEvent, Unit]] = js.undefined
  var onRowDragEnd: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragEnter: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragLeave: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowDragMove: js.UndefOr[js.Function1[/* event */ RowDragEvent, Unit]] = js.undefined
  var onRowEditingStarted: js.UndefOr[js.Function1[/* event */ RowEditingStartedEvent, Unit]] = js.undefined
  var onRowEditingStopped: js.UndefOr[js.Function1[/* event */ RowEditingStoppedEvent, Unit]] = js.undefined
  var onRowGroupOpened: js.UndefOr[js.Function1[/* event */ RowGroupOpenedEvent, Unit]] = js.undefined
  var onRowSelected: js.UndefOr[js.Function1[/* event */ RowSelectedEvent, Unit]] = js.undefined
  var onRowValueChanged: js.UndefOr[js.Function1[/* event */ RowValueChangedEvent, Unit]] = js.undefined
  var onSelectionChanged: js.UndefOr[js.Function1[/* event */ SelectionChangedEvent, Unit]] = js.undefined
  var onSortChanged: js.UndefOr[js.Function1[/* event */ SortChangedEvent, Unit]] = js.undefined
  var onViewportChanged: js.UndefOr[js.Function1[/* event */ ViewportChangedEvent, Unit]] = js.undefined
  var onVirtualColumnsChanged: js.UndefOr[js.Function1[/* event */ VirtualColumnsChangedEvent, Unit]] = js.undefined
  var onVirtualRowRemoved: js.UndefOr[js.Function1[/* event */ VirtualRowRemovedEvent, Unit]] = js.undefined
  var overlayLoadingTemplate: js.UndefOr[String] = js.undefined
  var overlayNoRowsTemplate: js.UndefOr[String] = js.undefined
  var pagination: js.UndefOr[Boolean] = js.undefined
  var paginationAutoPageSize: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var paginationNumberFormatter: js.UndefOr[js.Function1[/* params */ PaginationNumberFormatterParams, String]] = js.undefined
  var paginationPageSize: js.UndefOr[Double] = js.undefined
  var paginationStartPage: js.UndefOr[Double] = js.undefined
  var pinnedBottomRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pinnedTopRowData: js.UndefOr[js.Array[_]] = js.undefined
  var pivotColumnGroupTotals: js.UndefOr[String] = js.undefined
  var pivotGroupHeaderHeight: js.UndefOr[Double] = js.undefined
  var pivotHeaderHeight: js.UndefOr[Double] = js.undefined
  var pivotMode: js.UndefOr[Boolean] = js.undefined
  var pivotPanelShow: js.UndefOr[String] = js.undefined
  var pivotRowTotals: js.UndefOr[String] = js.undefined
  var pivotTotals: js.UndefOr[Boolean] = js.undefined
  var popupParent: js.UndefOr[HTMLElement] = js.undefined
  var postProcessPopup: js.UndefOr[js.Function1[/* params */ PostProcessPopupParams, Unit]] = js.undefined
  var postSort: js.UndefOr[js.Function1[/* nodes */ js.Array[RowNode], Unit]] = js.undefined
  var processCellForClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.undefined
  var processCellFromClipboard: js.UndefOr[js.Function1[/* params */ ProcessCellForExportParams, _]] = js.undefined
  var processDataFromClipboard: js.UndefOr[
    js.Function1[/* params */ ProcessDataFromClipboardParams, js.Array[js.Array[String]]]
  ] = js.undefined
  var processHeaderForClipboard: js.UndefOr[js.Function1[/* params */ ProcessHeaderForExportParams, _]] = js.undefined
  var processRowPostCreate: js.UndefOr[js.Function1[/* params */ ProcessRowParams, Unit]] = js.undefined
  var processSecondaryColDef: js.UndefOr[js.Function1[/* colDef */ ColDef, Unit]] = js.undefined
  var processSecondaryColGroupDef: js.UndefOr[js.Function1[/* colGroupDef */ ColGroupDef, Unit]] = js.undefined
  var purgeClosedRowNodes: js.UndefOr[Boolean] = js.undefined
  var quickFilterText: js.UndefOr[String] = js.undefined
  var rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.undefined
  var rowBuffer: js.UndefOr[Double] = js.undefined
  var rowClass: js.UndefOr[String | js.Array[String]] = js.undefined
  var rowClassRules: js.UndefOr[StringDictionary[js.Function | String]] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. *
    ****************************************************************/
  var rowData: js.UndefOr[js.Array[_]] = js.undefined
  var rowDeselection: js.UndefOr[Boolean] = js.undefined
  /****************************************************************
    * Don't forget to update ComponentUtil if changing this class. PLEASE!*
    ****************************************************************/
  var rowDragManaged: js.UndefOr[Boolean] = js.undefined
  var rowGroupPanelShow: js.UndefOr[String] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var rowModelType: js.UndefOr[String] = js.undefined
  var rowMultiSelectWithClick: js.UndefOr[Boolean] = js.undefined
  var rowSelection: js.UndefOr[String] = js.undefined
  var rowStyle: js.UndefOr[js.Any] = js.undefined
  var scrollbarWidth: js.UndefOr[Double] = js.undefined
  var sendToClipboard: js.UndefOr[js.Function1[/* params */ js.Any, Unit]] = js.undefined
  var serverSideDatasource: js.UndefOr[IServerSideDatasource] = js.undefined
  var serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.undefined
  var showToolPanel: js.UndefOr[Boolean] = js.undefined
  var singleClickEdit: js.UndefOr[Boolean] = js.undefined
  var slaveGrids: js.UndefOr[js.Array[GridOptions]] = js.undefined
  var sortingOrder: js.UndefOr[js.Array[String]] = js.undefined
  var stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.undefined
  var suppressAggAtRootLevel: js.UndefOr[Boolean] = js.undefined
  var suppressAggFuncInHeader: js.UndefOr[Boolean] = js.undefined
  var suppressAnimationFrame: js.UndefOr[Boolean] = js.undefined
  var suppressAsyncEvents: js.UndefOr[Boolean] = js.undefined
  var suppressAutoSize: js.UndefOr[Boolean] = js.undefined
  var suppressCellSelection: js.UndefOr[Boolean] = js.undefined
  var suppressChangeDetection: js.UndefOr[Boolean] = js.undefined
  var suppressClickEdit: js.UndefOr[Boolean] = js.undefined
  var suppressClipboardPaste: js.UndefOr[Boolean] = js.undefined
  var suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.undefined
  var suppressColumnVirtualisation: js.UndefOr[Boolean] = js.undefined
  var suppressContextMenu: js.UndefOr[Boolean] = js.undefined
  var suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.undefined
  var suppressCsvExport: js.UndefOr[Boolean] = js.undefined
  var suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.undefined
  var suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.undefined
  var suppressExcelExport: js.UndefOr[Boolean] = js.undefined
  var suppressFieldDotNotation: js.UndefOr[Boolean] = js.undefined
  var suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.undefined
  var suppressHorizontalScroll: js.UndefOr[Boolean] = js.undefined
  var suppressLoadingOverlay: js.UndefOr[Boolean] = js.undefined
  var suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.undefined
  var suppressMenuHide: js.UndefOr[Boolean] = js.undefined
  var suppressMiddleClickScrolls: js.UndefOr[Boolean] = js.undefined
  var suppressMovableColumns: js.UndefOr[Boolean] = js.undefined
  var suppressMultiRangeSelection: js.UndefOr[Boolean] = js.undefined
  var suppressMultiSort: js.UndefOr[Boolean] = js.undefined
  var suppressNoRowsOverlay: js.UndefOr[Boolean] = js.undefined
  var suppressPaginationPanel: js.UndefOr[Boolean] = js.undefined
  var suppressParentsInRowNodes: js.UndefOr[Boolean] = js.undefined
  var suppressPreventDefaultOnMouseWheel: js.UndefOr[Boolean] = js.undefined
  var suppressPropertyNamesCheck: js.UndefOr[Boolean] = js.undefined
  var suppressRowClickSelection: js.UndefOr[Boolean] = js.undefined
  var suppressRowDrag: js.UndefOr[Boolean] = js.undefined
  var suppressRowHoverHighlight: js.UndefOr[Boolean] = js.undefined
  var suppressRowTransform: js.UndefOr[Boolean] = js.undefined
  var suppressScrollOnNewData: js.UndefOr[Boolean] = js.undefined
  var suppressTabbing: js.UndefOr[Boolean] = js.undefined
  var suppressTouch: js.UndefOr[Boolean] = js.undefined
  var tabToNextCell: js.UndefOr[js.Function1[/* params */ TabToNextCellParams, GridCellDef]] = js.undefined
  var toolPanelSuppressColumnExpandAll: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressColumnFilter: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressColumnSelectAll: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressPivotMode: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressPivots: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressRowGroups: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressSideButtons: js.UndefOr[Boolean] = js.undefined
  var toolPanelSuppressValues: js.UndefOr[Boolean] = js.undefined
  var treeData: js.UndefOr[Boolean] = js.undefined
  var unSortIcon: js.UndefOr[Boolean] = js.undefined
  var valueCache: js.UndefOr[Boolean] = js.undefined
  var valueCacheNeverExpires: js.UndefOr[Boolean] = js.undefined
  var viewportDatasource: js.UndefOr[IViewportDatasource] = js.undefined
  var viewportRowModelBufferSize: js.UndefOr[Double] = js.undefined
  var viewportRowModelPageSize: js.UndefOr[Double] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    ComponentHolder: ComponentHolder = null,
    accentedSort: js.UndefOr[Boolean] = js.undefined,
    aggFuncs: StringDictionary[IAggFunc] = null,
    aggregateOnlyChangedColumns: js.UndefOr[Boolean] = js.undefined,
    alignedGrids: js.Array[GridOptions] = null,
    allowContextMenuWithControlKey: js.UndefOr[Boolean] = js.undefined,
    alwaysShowStatusBar: js.UndefOr[Boolean] = js.undefined,
    angularCompileFilters: js.UndefOr[Boolean] = js.undefined,
    angularCompileHeaders: js.UndefOr[Boolean] = js.undefined,
    angularCompileRows: js.UndefOr[Boolean] = js.undefined,
    animateRows: js.UndefOr[Boolean] = js.undefined,
    api: GridApi = null,
    autoGroupColumnDef: ColDef = null,
    autoSizePadding: Int | Double = null,
    batchUpdateWaitMillis: Int | Double = null,
    cacheBlockSize: Int | Double = null,
    cacheOverflowSize: Int | Double = null,
    cacheQuickFilter: js.UndefOr[Boolean] = js.undefined,
    clipboardDeliminator: String = null,
    colResizeDefault: String = null,
    colWidth: Int | Double = null,
    columnApi: ColumnApi = null,
    columnDefs: js.Array[ColDef | ColGroupDef] = null,
    columnTypes: StringDictionary[ColDef] = null,
    components: StringDictionary[AgGridRegisteredComponentInput[IComponent[_]]] = null,
    context: js.Any = null,
    contractColumnSelection: js.UndefOr[Boolean] = js.undefined,
    datasource: IDatasource = null,
    dateComponent: AnonInstantiable = null,
    dateComponentFramework: js.Any = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    defaultColDef: ColDef = null,
    defaultColGroupDef: ColGroupDef = null,
    defaultExportParams: CsvExportParams = null,
    defaultGroupSortComparator: (/* nodeA */ RowNode, /* nodeB */ RowNode) => CallbackTo[Double] = null,
    deltaRowDataMode: js.UndefOr[Boolean] = js.undefined,
    detailCellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = null,
    detailCellRendererFramework: js.Any = null,
    detailCellRendererParams: js.Any = null,
    detailRowHeight: Int | Double = null,
    doesDataFlower: /* dataItem */ js.Any => CallbackTo[Boolean] = null,
    doesExternalFilterPass: /* node */ RowNode => CallbackTo[Boolean] = null,
    domLayout: String = null,
    editType: String = null,
    embedFullWidthRows: js.UndefOr[Boolean] = js.undefined,
    enableCellChangeFlash: js.UndefOr[Boolean] = js.undefined,
    enableCellExpressions: js.UndefOr[Boolean] = js.undefined,
    enableColResize: js.UndefOr[Boolean] = js.undefined,
    enableFilter: js.UndefOr[Boolean] = js.undefined,
    enableGroupEdit: js.UndefOr[Boolean] = js.undefined,
    enableOldSetFilterModel: js.UndefOr[Boolean] = js.undefined,
    enableRangeSelection: js.UndefOr[Boolean] = js.undefined,
    enableRtl: js.UndefOr[Boolean] = js.undefined,
    enableServerSideFilter: js.UndefOr[Boolean] = js.undefined,
    enableServerSideSorting: js.UndefOr[Boolean] = js.undefined,
    enableSorting: js.UndefOr[Boolean] = js.undefined,
    enableStatusBar: js.UndefOr[Boolean] = js.undefined,
    ensureDomOrder: js.UndefOr[Boolean] = js.undefined,
    enterMovesDown: js.UndefOr[Boolean] = js.undefined,
    enterMovesDownAfterEdit: js.UndefOr[Boolean] = js.undefined,
    excelStyles: js.Array[_] = null,
    floatingFilter: js.UndefOr[Boolean] = js.undefined,
    floatingFiltersHeight: Int | Double = null,
    forPrint: js.UndefOr[Boolean] = js.undefined,
    frameworkComponents: StringDictionary[AnonInstantiableAny] = null,
    fullWidthCellRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = null,
    fullWidthCellRendererFramework: js.Any = null,
    fullWidthCellRendererParams: js.Any = null,
    functionsPassive: js.UndefOr[Boolean] = js.undefined,
    functionsReadOnly: js.UndefOr[Boolean] = js.undefined,
    getBusinessKeyForNode: /* node */ RowNode => CallbackTo[String] = null,
    getChildCount: /* dataItem */ js.Any => CallbackTo[Double] = null,
    getContextMenuItems: /* params */ GetContextMenuItemsParams => CallbackTo[js.Array[String | MenuItemDef]] = null,
    getDataPath: /* data */ js.Any => CallbackTo[js.Array[String]] = null,
    getDocument: js.UndefOr[CallbackTo[Document_]] = js.undefined,
    getMainMenuItems: /* params */ GetMainMenuItemsParams => CallbackTo[js.Array[String | MenuItemDef]] = null,
    getNodeChildDetails: /* dataItem */ js.Any => CallbackTo[NodeChildDetails] = null,
    getRowClass: /* params */ js.Any => CallbackTo[String | js.Array[String]] = null,
    getRowHeight: js.Function = null,
    getRowNodeId: /* data */ js.Any => CallbackTo[String] = null,
    getRowStyle: js.Function = null,
    gridAutoHeight: js.UndefOr[Boolean] = js.undefined,
    groupColumnDef: ColDef = null,
    groupDefaultExpanded: Int | Double = null,
    groupHeaderHeight: Int | Double = null,
    groupHideOpenParents: js.UndefOr[Boolean] = js.undefined,
    groupIncludeFooter: js.UndefOr[Boolean] = js.undefined,
    groupIncludeTotalFooter: js.UndefOr[Boolean] = js.undefined,
    groupMultiAutoColumn: js.UndefOr[Boolean] = js.undefined,
    groupRemoveLowestSingleChildren: js.UndefOr[Boolean] = js.undefined,
    groupRemoveSingleChildren: js.UndefOr[Boolean] = js.undefined,
    groupRowAggNodes: /* nodes */ js.Array[RowNode] => CallbackTo[js.Any] = null,
    groupRowInnerRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = null,
    groupRowInnerRendererFramework: js.Any = null,
    groupRowRenderer: AnonInstantiableICellRendererComp | ICellRendererFunc | String = null,
    groupRowRendererFramework: js.Any = null,
    groupRowRendererParams: js.Any = null,
    groupSelectsChildren: js.UndefOr[Boolean] = js.undefined,
    groupSelectsFiltered: js.UndefOr[Boolean] = js.undefined,
    groupSuppressAutoColumn: js.UndefOr[Boolean] = js.undefined,
    groupSuppressBlankHeader: js.UndefOr[Boolean] = js.undefined,
    groupSuppressRow: js.UndefOr[Boolean] = js.undefined,
    groupUseEntireRow: js.UndefOr[Boolean] = js.undefined,
    headerHeight: Int | Double = null,
    icons: js.Any = null,
    infiniteInitialRowCount: Int | Double = null,
    isExternalFilterPresent: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    isFullWidthCell: /* rowNode */ RowNode => CallbackTo[Boolean] = null,
    isRowMaster: /* dataItem */ js.Any => CallbackTo[Boolean] = null,
    isRowSelectable: /* node */ RowNode => CallbackTo[Boolean] = null,
    loadingOverlayComponent: AnonInstantiableILoadingOverlayComp | String = null,
    loadingOverlayComponentFramework: js.Any = null,
    localeText: js.Any = null,
    localeTextFunc: js.Function = null,
    masterDetail: js.UndefOr[Boolean] = js.undefined,
    maxBlocksInCache: Int | Double = null,
    maxColWidth: Int | Double = null,
    maxConcurrentDatasourceRequests: Int | Double = null,
    minColWidth: Int | Double = null,
    multiSortKey: String = null,
    navigateToNextCell: /* params */ NavigateToNextCellParams => CallbackTo[GridCellDef] = null,
    noRowsOverlayComponent: AnonInstantiableINoRowsOverlayComp | String = null,
    noRowsOverlayComponentFramework: js.Any = null,
    onBodyScroll: /* event */ BodyScrollEvent => Callback = null,
    onCellClicked: /* event */ CellClickedEvent => Callback = null,
    onCellContextMenu: /* event */ CellContextMenuEvent => Callback = null,
    onCellDoubleClicked: /* event */ CellDoubleClickedEvent => Callback = null,
    onCellEditingStarted: /* event */ CellEditingStartedEvent => Callback = null,
    onCellEditingStopped: /* event */ CellEditingStoppedEvent => Callback = null,
    onCellFocused: /* event */ CellFocusedEvent => Callback = null,
    onCellMouseDown: /* event */ CellMouseDownEvent => Callback = null,
    onCellMouseOut: /* event */ CellMouseOutEvent => Callback = null,
    onCellMouseOver: /* event */ CellMouseOverEvent => Callback = null,
    onCellValueChanged: /* event */ CellValueChangedEvent => Callback = null,
    onColumnAggFuncChangeRequest: /* event */ ColumnAggFuncChangeRequestEvent => Callback = null,
    onColumnEverythingChanged: /* event */ ColumnEverythingChangedEvent => Callback = null,
    onColumnGroupOpened: /* event */ ColumnGroupOpenedEvent => Callback = null,
    onColumnMoved: /* event */ ColumnMovedEvent => Callback = null,
    onColumnPinned: /* event */ ColumnPinnedEvent => Callback = null,
    onColumnPivotChangeRequest: /* event */ ColumnPivotChangeRequestEvent => Callback = null,
    onColumnPivotChanged: /* event */ ColumnPivotChangedEvent => Callback = null,
    onColumnPivotModeChanged: /* event */ ColumnPivotModeChangedEvent => Callback = null,
    onColumnResized: /* event */ ColumnResizedEvent => Callback = null,
    onColumnRowGroupChangeRequest: /* event */ ColumnRowGroupChangeRequestEvent => Callback = null,
    onColumnRowGroupChanged: /* event */ ColumnRowGroupChangedEvent => Callback = null,
    onColumnValueChangeRequest: /* event */ ColumnValueChangeRequestEvent => Callback = null,
    onColumnValueChanged: /* event */ ColumnValueChangedEvent => Callback = null,
    onColumnVisible: /* event */ ColumnVisibleEvent => Callback = null,
    onDisplayedColumnsChanged: /* event */ DisplayedColumnsChangedEvent => Callback = null,
    onDragStarted: /* event */ DragStartedEvent => Callback = null,
    onDragStopped: /* event */ DragStoppedEvent => Callback = null,
    onFilterChanged: /* event */ FilterChangedEvent => Callback = null,
    onFilterModified: /* event */ FilterModifiedEvent => Callback = null,
    onGridColumnsChanged: /* event */ GridColumnsChangedEvent => Callback = null,
    onGridReady: /* event */ GridReadyEvent => Callback = null,
    onGridSizeChanged: /* event */ js.Any => Callback = null,
    onModelUpdated: /* event */ ModelUpdatedEvent => Callback = null,
    onNewColumnsLoaded: /* event */ NewColumnsLoadedEvent => Callback = null,
    onPaginationChanged: /* event */ PaginationChangedEvent => Callback = null,
    onPasteEnd: /* event */ PasteEndEvent => Callback = null,
    onPasteStart: /* event */ PasteStartEvent => Callback = null,
    onPinnedRowDataChanged: /* event */ PinnedRowDataChangedEvent => Callback = null,
    onRangeSelectionChanged: /* event */ RangeSelectionChangedEvent => Callback = null,
    onRowClicked: /* event */ RowClickedEvent => Callback = null,
    onRowDataChanged: /* event */ RowDataChangedEvent => Callback = null,
    onRowDataUpdated: /* event */ RowDataUpdatedEvent => Callback = null,
    onRowDoubleClicked: /* event */ RowDoubleClickedEvent => Callback = null,
    onRowDragEnd: /* event */ RowDragEvent => Callback = null,
    onRowDragEnter: /* event */ RowDragEvent => Callback = null,
    onRowDragLeave: /* event */ RowDragEvent => Callback = null,
    onRowDragMove: /* event */ RowDragEvent => Callback = null,
    onRowEditingStarted: /* event */ RowEditingStartedEvent => Callback = null,
    onRowEditingStopped: /* event */ RowEditingStoppedEvent => Callback = null,
    onRowGroupOpened: /* event */ RowGroupOpenedEvent => Callback = null,
    onRowSelected: /* event */ RowSelectedEvent => Callback = null,
    onRowValueChanged: /* event */ RowValueChangedEvent => Callback = null,
    onSelectionChanged: /* event */ SelectionChangedEvent => Callback = null,
    onSortChanged: /* event */ SortChangedEvent => Callback = null,
    onViewportChanged: /* event */ ViewportChangedEvent => Callback = null,
    onVirtualColumnsChanged: /* event */ VirtualColumnsChangedEvent => Callback = null,
    onVirtualRowRemoved: /* event */ VirtualRowRemovedEvent => Callback = null,
    overlayLoadingTemplate: String = null,
    overlayNoRowsTemplate: String = null,
    pagination: js.UndefOr[Boolean] = js.undefined,
    paginationAutoPageSize: js.UndefOr[Boolean] = js.undefined,
    paginationNumberFormatter: /* params */ PaginationNumberFormatterParams => CallbackTo[String] = null,
    paginationPageSize: Int | Double = null,
    paginationStartPage: Int | Double = null,
    pinnedBottomRowData: js.Array[_] = null,
    pinnedTopRowData: js.Array[_] = null,
    pivotColumnGroupTotals: String = null,
    pivotGroupHeaderHeight: Int | Double = null,
    pivotHeaderHeight: Int | Double = null,
    pivotMode: js.UndefOr[Boolean] = js.undefined,
    pivotPanelShow: String = null,
    pivotRowTotals: String = null,
    pivotTotals: js.UndefOr[Boolean] = js.undefined,
    popupParent: HTMLElement = null,
    postProcessPopup: /* params */ PostProcessPopupParams => Callback = null,
    postSort: /* nodes */ js.Array[RowNode] => Callback = null,
    processCellForClipboard: /* params */ ProcessCellForExportParams => CallbackTo[js.Any] = null,
    processCellFromClipboard: /* params */ ProcessCellForExportParams => CallbackTo[js.Any] = null,
    processDataFromClipboard: /* params */ ProcessDataFromClipboardParams => CallbackTo[js.Array[js.Array[String]]] = null,
    processHeaderForClipboard: /* params */ ProcessHeaderForExportParams => CallbackTo[js.Any] = null,
    processRowPostCreate: /* params */ ProcessRowParams => Callback = null,
    processSecondaryColDef: /* colDef */ ColDef => Callback = null,
    processSecondaryColGroupDef: /* colGroupDef */ ColGroupDef => Callback = null,
    purgeClosedRowNodes: js.UndefOr[Boolean] = js.undefined,
    quickFilterText: String = null,
    rememberGroupStateWhenNewData: js.UndefOr[Boolean] = js.undefined,
    rowBuffer: Int | Double = null,
    rowClass: String | js.Array[String] = null,
    rowClassRules: StringDictionary[js.Function | String] = null,
    rowData: js.Array[_] = null,
    rowDeselection: js.UndefOr[Boolean] = js.undefined,
    rowDragManaged: js.UndefOr[Boolean] = js.undefined,
    rowGroupPanelShow: String = null,
    rowHeight: Int | Double = null,
    rowModelType: String = null,
    rowMultiSelectWithClick: js.UndefOr[Boolean] = js.undefined,
    rowSelection: String = null,
    rowStyle: js.Any = null,
    scrollbarWidth: Int | Double = null,
    sendToClipboard: /* params */ js.Any => Callback = null,
    serverSideDatasource: IServerSideDatasource = null,
    serverSideSortingAlwaysResets: js.UndefOr[Boolean] = js.undefined,
    showToolPanel: js.UndefOr[Boolean] = js.undefined,
    singleClickEdit: js.UndefOr[Boolean] = js.undefined,
    slaveGrids: js.Array[GridOptions] = null,
    sortingOrder: js.Array[String] = null,
    stopEditingWhenGridLosesFocus: js.UndefOr[Boolean] = js.undefined,
    suppressAggAtRootLevel: js.UndefOr[Boolean] = js.undefined,
    suppressAggFuncInHeader: js.UndefOr[Boolean] = js.undefined,
    suppressAnimationFrame: js.UndefOr[Boolean] = js.undefined,
    suppressAsyncEvents: js.UndefOr[Boolean] = js.undefined,
    suppressAutoSize: js.UndefOr[Boolean] = js.undefined,
    suppressCellSelection: js.UndefOr[Boolean] = js.undefined,
    suppressChangeDetection: js.UndefOr[Boolean] = js.undefined,
    suppressClickEdit: js.UndefOr[Boolean] = js.undefined,
    suppressClipboardPaste: js.UndefOr[Boolean] = js.undefined,
    suppressColumnMoveAnimation: js.UndefOr[Boolean] = js.undefined,
    suppressColumnVirtualisation: js.UndefOr[Boolean] = js.undefined,
    suppressContextMenu: js.UndefOr[Boolean] = js.undefined,
    suppressCopyRowsToClipboard: js.UndefOr[Boolean] = js.undefined,
    suppressCsvExport: js.UndefOr[Boolean] = js.undefined,
    suppressDragLeaveHidesColumns: js.UndefOr[Boolean] = js.undefined,
    suppressEnterpriseResetOnNewColumns: js.UndefOr[Boolean] = js.undefined,
    suppressExcelExport: js.UndefOr[Boolean] = js.undefined,
    suppressFieldDotNotation: js.UndefOr[Boolean] = js.undefined,
    suppressFocusAfterRefresh: js.UndefOr[Boolean] = js.undefined,
    suppressHorizontalScroll: js.UndefOr[Boolean] = js.undefined,
    suppressLoadingOverlay: js.UndefOr[Boolean] = js.undefined,
    suppressMakeColumnVisibleAfterUnGroup: js.UndefOr[Boolean] = js.undefined,
    suppressMenuHide: js.UndefOr[Boolean] = js.undefined
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (ComponentHolder != null) js.Dynamic.global.Object.assign(__obj, ComponentHolder)
    if (!js.isUndefined(accentedSort)) __obj.updateDynamic("accentedSort")(accentedSort.asInstanceOf[js.Any])
    if (aggFuncs != null) __obj.updateDynamic("aggFuncs")(aggFuncs.asInstanceOf[js.Any])
    if (!js.isUndefined(aggregateOnlyChangedColumns)) __obj.updateDynamic("aggregateOnlyChangedColumns")(aggregateOnlyChangedColumns.asInstanceOf[js.Any])
    if (alignedGrids != null) __obj.updateDynamic("alignedGrids")(alignedGrids.asInstanceOf[js.Any])
    if (!js.isUndefined(allowContextMenuWithControlKey)) __obj.updateDynamic("allowContextMenuWithControlKey")(allowContextMenuWithControlKey.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowStatusBar)) __obj.updateDynamic("alwaysShowStatusBar")(alwaysShowStatusBar.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileFilters)) __obj.updateDynamic("angularCompileFilters")(angularCompileFilters.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileHeaders)) __obj.updateDynamic("angularCompileHeaders")(angularCompileHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(angularCompileRows)) __obj.updateDynamic("angularCompileRows")(angularCompileRows.asInstanceOf[js.Any])
    if (!js.isUndefined(animateRows)) __obj.updateDynamic("animateRows")(animateRows.asInstanceOf[js.Any])
    if (api != null) __obj.updateDynamic("api")(api.asInstanceOf[js.Any])
    if (autoGroupColumnDef != null) __obj.updateDynamic("autoGroupColumnDef")(autoGroupColumnDef.asInstanceOf[js.Any])
    if (autoSizePadding != null) __obj.updateDynamic("autoSizePadding")(autoSizePadding.asInstanceOf[js.Any])
    if (batchUpdateWaitMillis != null) __obj.updateDynamic("batchUpdateWaitMillis")(batchUpdateWaitMillis.asInstanceOf[js.Any])
    if (cacheBlockSize != null) __obj.updateDynamic("cacheBlockSize")(cacheBlockSize.asInstanceOf[js.Any])
    if (cacheOverflowSize != null) __obj.updateDynamic("cacheOverflowSize")(cacheOverflowSize.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheQuickFilter)) __obj.updateDynamic("cacheQuickFilter")(cacheQuickFilter.asInstanceOf[js.Any])
    if (clipboardDeliminator != null) __obj.updateDynamic("clipboardDeliminator")(clipboardDeliminator.asInstanceOf[js.Any])
    if (colResizeDefault != null) __obj.updateDynamic("colResizeDefault")(colResizeDefault.asInstanceOf[js.Any])
    if (colWidth != null) __obj.updateDynamic("colWidth")(colWidth.asInstanceOf[js.Any])
    if (columnApi != null) __obj.updateDynamic("columnApi")(columnApi.asInstanceOf[js.Any])
    if (columnDefs != null) __obj.updateDynamic("columnDefs")(columnDefs.asInstanceOf[js.Any])
    if (columnTypes != null) __obj.updateDynamic("columnTypes")(columnTypes.asInstanceOf[js.Any])
    if (components != null) __obj.updateDynamic("components")(components.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(contractColumnSelection)) __obj.updateDynamic("contractColumnSelection")(contractColumnSelection.asInstanceOf[js.Any])
    if (datasource != null) __obj.updateDynamic("datasource")(datasource.asInstanceOf[js.Any])
    if (dateComponent != null) __obj.updateDynamic("dateComponent")(dateComponent.asInstanceOf[js.Any])
    if (dateComponentFramework != null) __obj.updateDynamic("dateComponentFramework")(dateComponentFramework.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (defaultColDef != null) __obj.updateDynamic("defaultColDef")(defaultColDef.asInstanceOf[js.Any])
    if (defaultColGroupDef != null) __obj.updateDynamic("defaultColGroupDef")(defaultColGroupDef.asInstanceOf[js.Any])
    if (defaultExportParams != null) __obj.updateDynamic("defaultExportParams")(defaultExportParams.asInstanceOf[js.Any])
    if (defaultGroupSortComparator != null) __obj.updateDynamic("defaultGroupSortComparator")(js.Any.fromFunction2((t0: /* nodeA */ typingsJapgolly.agGrid.rowNodeMod.RowNode, t1: /* nodeB */ typingsJapgolly.agGrid.rowNodeMod.RowNode) => defaultGroupSortComparator(t0, t1).runNow()))
    if (!js.isUndefined(deltaRowDataMode)) __obj.updateDynamic("deltaRowDataMode")(deltaRowDataMode.asInstanceOf[js.Any])
    if (detailCellRenderer != null) __obj.updateDynamic("detailCellRenderer")(detailCellRenderer.asInstanceOf[js.Any])
    if (detailCellRendererFramework != null) __obj.updateDynamic("detailCellRendererFramework")(detailCellRendererFramework.asInstanceOf[js.Any])
    if (detailCellRendererParams != null) __obj.updateDynamic("detailCellRendererParams")(detailCellRendererParams.asInstanceOf[js.Any])
    if (detailRowHeight != null) __obj.updateDynamic("detailRowHeight")(detailRowHeight.asInstanceOf[js.Any])
    if (doesDataFlower != null) __obj.updateDynamic("doesDataFlower")(js.Any.fromFunction1((t0: /* dataItem */ js.Any) => doesDataFlower(t0).runNow()))
    if (doesExternalFilterPass != null) __obj.updateDynamic("doesExternalFilterPass")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.agGrid.rowNodeMod.RowNode) => doesExternalFilterPass(t0).runNow()))
    if (domLayout != null) __obj.updateDynamic("domLayout")(domLayout.asInstanceOf[js.Any])
    if (editType != null) __obj.updateDynamic("editType")(editType.asInstanceOf[js.Any])
    if (!js.isUndefined(embedFullWidthRows)) __obj.updateDynamic("embedFullWidthRows")(embedFullWidthRows.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellChangeFlash)) __obj.updateDynamic("enableCellChangeFlash")(enableCellChangeFlash.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellExpressions)) __obj.updateDynamic("enableCellExpressions")(enableCellExpressions.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColResize)) __obj.updateDynamic("enableColResize")(enableColResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableFilter)) __obj.updateDynamic("enableFilter")(enableFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableGroupEdit)) __obj.updateDynamic("enableGroupEdit")(enableGroupEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(enableOldSetFilterModel)) __obj.updateDynamic("enableOldSetFilterModel")(enableOldSetFilterModel.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRangeSelection)) __obj.updateDynamic("enableRangeSelection")(enableRangeSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRtl)) __obj.updateDynamic("enableRtl")(enableRtl.asInstanceOf[js.Any])
    if (!js.isUndefined(enableServerSideFilter)) __obj.updateDynamic("enableServerSideFilter")(enableServerSideFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(enableServerSideSorting)) __obj.updateDynamic("enableServerSideSorting")(enableServerSideSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(enableSorting)) __obj.updateDynamic("enableSorting")(enableSorting.asInstanceOf[js.Any])
    if (!js.isUndefined(enableStatusBar)) __obj.updateDynamic("enableStatusBar")(enableStatusBar.asInstanceOf[js.Any])
    if (!js.isUndefined(ensureDomOrder)) __obj.updateDynamic("ensureDomOrder")(ensureDomOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMovesDown)) __obj.updateDynamic("enterMovesDown")(enterMovesDown.asInstanceOf[js.Any])
    if (!js.isUndefined(enterMovesDownAfterEdit)) __obj.updateDynamic("enterMovesDownAfterEdit")(enterMovesDownAfterEdit.asInstanceOf[js.Any])
    if (excelStyles != null) __obj.updateDynamic("excelStyles")(excelStyles.asInstanceOf[js.Any])
    if (!js.isUndefined(floatingFilter)) __obj.updateDynamic("floatingFilter")(floatingFilter.asInstanceOf[js.Any])
    if (floatingFiltersHeight != null) __obj.updateDynamic("floatingFiltersHeight")(floatingFiltersHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forPrint)) __obj.updateDynamic("forPrint")(forPrint.asInstanceOf[js.Any])
    if (frameworkComponents != null) __obj.updateDynamic("frameworkComponents")(frameworkComponents.asInstanceOf[js.Any])
    if (fullWidthCellRenderer != null) __obj.updateDynamic("fullWidthCellRenderer")(fullWidthCellRenderer.asInstanceOf[js.Any])
    if (fullWidthCellRendererFramework != null) __obj.updateDynamic("fullWidthCellRendererFramework")(fullWidthCellRendererFramework.asInstanceOf[js.Any])
    if (fullWidthCellRendererParams != null) __obj.updateDynamic("fullWidthCellRendererParams")(fullWidthCellRendererParams.asInstanceOf[js.Any])
    if (!js.isUndefined(functionsPassive)) __obj.updateDynamic("functionsPassive")(functionsPassive.asInstanceOf[js.Any])
    if (!js.isUndefined(functionsReadOnly)) __obj.updateDynamic("functionsReadOnly")(functionsReadOnly.asInstanceOf[js.Any])
    if (getBusinessKeyForNode != null) __obj.updateDynamic("getBusinessKeyForNode")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.agGrid.rowNodeMod.RowNode) => getBusinessKeyForNode(t0).runNow()))
    if (getChildCount != null) __obj.updateDynamic("getChildCount")(js.Any.fromFunction1((t0: /* dataItem */ js.Any) => getChildCount(t0).runNow()))
    if (getContextMenuItems != null) __obj.updateDynamic("getContextMenuItems")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.GetContextMenuItemsParams) => getContextMenuItems(t0).runNow()))
    if (getDataPath != null) __obj.updateDynamic("getDataPath")(js.Any.fromFunction1((t0: /* data */ js.Any) => getDataPath(t0).runNow()))
    getDocument.foreach(p => __obj.updateDynamic("getDocument")(p.toJsFn))
    if (getMainMenuItems != null) __obj.updateDynamic("getMainMenuItems")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.GetMainMenuItemsParams) => getMainMenuItems(t0).runNow()))
    if (getNodeChildDetails != null) __obj.updateDynamic("getNodeChildDetails")(js.Any.fromFunction1((t0: /* dataItem */ js.Any) => getNodeChildDetails(t0).runNow()))
    if (getRowClass != null) __obj.updateDynamic("getRowClass")(js.Any.fromFunction1((t0: /* params */ js.Any) => getRowClass(t0).runNow()))
    if (getRowHeight != null) __obj.updateDynamic("getRowHeight")(getRowHeight.asInstanceOf[js.Any])
    if (getRowNodeId != null) __obj.updateDynamic("getRowNodeId")(js.Any.fromFunction1((t0: /* data */ js.Any) => getRowNodeId(t0).runNow()))
    if (getRowStyle != null) __obj.updateDynamic("getRowStyle")(getRowStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(gridAutoHeight)) __obj.updateDynamic("gridAutoHeight")(gridAutoHeight.asInstanceOf[js.Any])
    if (groupColumnDef != null) __obj.updateDynamic("groupColumnDef")(groupColumnDef.asInstanceOf[js.Any])
    if (groupDefaultExpanded != null) __obj.updateDynamic("groupDefaultExpanded")(groupDefaultExpanded.asInstanceOf[js.Any])
    if (groupHeaderHeight != null) __obj.updateDynamic("groupHeaderHeight")(groupHeaderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(groupHideOpenParents)) __obj.updateDynamic("groupHideOpenParents")(groupHideOpenParents.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIncludeFooter)) __obj.updateDynamic("groupIncludeFooter")(groupIncludeFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(groupIncludeTotalFooter)) __obj.updateDynamic("groupIncludeTotalFooter")(groupIncludeTotalFooter.asInstanceOf[js.Any])
    if (!js.isUndefined(groupMultiAutoColumn)) __obj.updateDynamic("groupMultiAutoColumn")(groupMultiAutoColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(groupRemoveLowestSingleChildren)) __obj.updateDynamic("groupRemoveLowestSingleChildren")(groupRemoveLowestSingleChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(groupRemoveSingleChildren)) __obj.updateDynamic("groupRemoveSingleChildren")(groupRemoveSingleChildren.asInstanceOf[js.Any])
    if (groupRowAggNodes != null) __obj.updateDynamic("groupRowAggNodes")(js.Any.fromFunction1((t0: /* nodes */ js.Array[typingsJapgolly.agGrid.rowNodeMod.RowNode]) => groupRowAggNodes(t0).runNow()))
    if (groupRowInnerRenderer != null) __obj.updateDynamic("groupRowInnerRenderer")(groupRowInnerRenderer.asInstanceOf[js.Any])
    if (groupRowInnerRendererFramework != null) __obj.updateDynamic("groupRowInnerRendererFramework")(groupRowInnerRendererFramework.asInstanceOf[js.Any])
    if (groupRowRenderer != null) __obj.updateDynamic("groupRowRenderer")(groupRowRenderer.asInstanceOf[js.Any])
    if (groupRowRendererFramework != null) __obj.updateDynamic("groupRowRendererFramework")(groupRowRendererFramework.asInstanceOf[js.Any])
    if (groupRowRendererParams != null) __obj.updateDynamic("groupRowRendererParams")(groupRowRendererParams.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSelectsChildren)) __obj.updateDynamic("groupSelectsChildren")(groupSelectsChildren.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSelectsFiltered)) __obj.updateDynamic("groupSelectsFiltered")(groupSelectsFiltered.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressAutoColumn)) __obj.updateDynamic("groupSuppressAutoColumn")(groupSuppressAutoColumn.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressBlankHeader)) __obj.updateDynamic("groupSuppressBlankHeader")(groupSuppressBlankHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(groupSuppressRow)) __obj.updateDynamic("groupSuppressRow")(groupSuppressRow.asInstanceOf[js.Any])
    if (!js.isUndefined(groupUseEntireRow)) __obj.updateDynamic("groupUseEntireRow")(groupUseEntireRow.asInstanceOf[js.Any])
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (infiniteInitialRowCount != null) __obj.updateDynamic("infiniteInitialRowCount")(infiniteInitialRowCount.asInstanceOf[js.Any])
    isExternalFilterPresent.foreach(p => __obj.updateDynamic("isExternalFilterPresent")(p.toJsFn))
    if (isFullWidthCell != null) __obj.updateDynamic("isFullWidthCell")(js.Any.fromFunction1((t0: /* rowNode */ typingsJapgolly.agGrid.rowNodeMod.RowNode) => isFullWidthCell(t0).runNow()))
    if (isRowMaster != null) __obj.updateDynamic("isRowMaster")(js.Any.fromFunction1((t0: /* dataItem */ js.Any) => isRowMaster(t0).runNow()))
    if (isRowSelectable != null) __obj.updateDynamic("isRowSelectable")(js.Any.fromFunction1((t0: /* node */ typingsJapgolly.agGrid.rowNodeMod.RowNode) => isRowSelectable(t0).runNow()))
    if (loadingOverlayComponent != null) __obj.updateDynamic("loadingOverlayComponent")(loadingOverlayComponent.asInstanceOf[js.Any])
    if (loadingOverlayComponentFramework != null) __obj.updateDynamic("loadingOverlayComponentFramework")(loadingOverlayComponentFramework.asInstanceOf[js.Any])
    if (localeText != null) __obj.updateDynamic("localeText")(localeText.asInstanceOf[js.Any])
    if (localeTextFunc != null) __obj.updateDynamic("localeTextFunc")(localeTextFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(masterDetail)) __obj.updateDynamic("masterDetail")(masterDetail.asInstanceOf[js.Any])
    if (maxBlocksInCache != null) __obj.updateDynamic("maxBlocksInCache")(maxBlocksInCache.asInstanceOf[js.Any])
    if (maxColWidth != null) __obj.updateDynamic("maxColWidth")(maxColWidth.asInstanceOf[js.Any])
    if (maxConcurrentDatasourceRequests != null) __obj.updateDynamic("maxConcurrentDatasourceRequests")(maxConcurrentDatasourceRequests.asInstanceOf[js.Any])
    if (minColWidth != null) __obj.updateDynamic("minColWidth")(minColWidth.asInstanceOf[js.Any])
    if (multiSortKey != null) __obj.updateDynamic("multiSortKey")(multiSortKey.asInstanceOf[js.Any])
    if (navigateToNextCell != null) __obj.updateDynamic("navigateToNextCell")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.NavigateToNextCellParams) => navigateToNextCell(t0).runNow()))
    if (noRowsOverlayComponent != null) __obj.updateDynamic("noRowsOverlayComponent")(noRowsOverlayComponent.asInstanceOf[js.Any])
    if (noRowsOverlayComponentFramework != null) __obj.updateDynamic("noRowsOverlayComponentFramework")(noRowsOverlayComponentFramework.asInstanceOf[js.Any])
    if (onBodyScroll != null) __obj.updateDynamic("onBodyScroll")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.BodyScrollEvent) => onBodyScroll(t0).runNow()))
    if (onCellClicked != null) __obj.updateDynamic("onCellClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellClickedEvent) => onCellClicked(t0).runNow()))
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellContextMenuEvent) => onCellContextMenu(t0).runNow()))
    if (onCellDoubleClicked != null) __obj.updateDynamic("onCellDoubleClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellDoubleClickedEvent) => onCellDoubleClicked(t0).runNow()))
    if (onCellEditingStarted != null) __obj.updateDynamic("onCellEditingStarted")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellEditingStartedEvent) => onCellEditingStarted(t0).runNow()))
    if (onCellEditingStopped != null) __obj.updateDynamic("onCellEditingStopped")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellEditingStoppedEvent) => onCellEditingStopped(t0).runNow()))
    if (onCellFocused != null) __obj.updateDynamic("onCellFocused")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellFocusedEvent) => onCellFocused(t0).runNow()))
    if (onCellMouseDown != null) __obj.updateDynamic("onCellMouseDown")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellMouseDownEvent) => onCellMouseDown(t0).runNow()))
    if (onCellMouseOut != null) __obj.updateDynamic("onCellMouseOut")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellMouseOutEvent) => onCellMouseOut(t0).runNow()))
    if (onCellMouseOver != null) __obj.updateDynamic("onCellMouseOver")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellMouseOverEvent) => onCellMouseOver(t0).runNow()))
    if (onCellValueChanged != null) __obj.updateDynamic("onCellValueChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.CellValueChangedEvent) => onCellValueChanged(t0).runNow()))
    if (onColumnAggFuncChangeRequest != null) __obj.updateDynamic("onColumnAggFuncChangeRequest")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnAggFuncChangeRequestEvent) => onColumnAggFuncChangeRequest(t0).runNow()))
    if (onColumnEverythingChanged != null) __obj.updateDynamic("onColumnEverythingChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnEverythingChangedEvent) => onColumnEverythingChanged(t0).runNow()))
    if (onColumnGroupOpened != null) __obj.updateDynamic("onColumnGroupOpened")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnGroupOpenedEvent) => onColumnGroupOpened(t0).runNow()))
    if (onColumnMoved != null) __obj.updateDynamic("onColumnMoved")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnMovedEvent) => onColumnMoved(t0).runNow()))
    if (onColumnPinned != null) __obj.updateDynamic("onColumnPinned")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnPinnedEvent) => onColumnPinned(t0).runNow()))
    if (onColumnPivotChangeRequest != null) __obj.updateDynamic("onColumnPivotChangeRequest")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnPivotChangeRequestEvent) => onColumnPivotChangeRequest(t0).runNow()))
    if (onColumnPivotChanged != null) __obj.updateDynamic("onColumnPivotChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnPivotChangedEvent) => onColumnPivotChanged(t0).runNow()))
    if (onColumnPivotModeChanged != null) __obj.updateDynamic("onColumnPivotModeChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnPivotModeChangedEvent) => onColumnPivotModeChanged(t0).runNow()))
    if (onColumnResized != null) __obj.updateDynamic("onColumnResized")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnResizedEvent) => onColumnResized(t0).runNow()))
    if (onColumnRowGroupChangeRequest != null) __obj.updateDynamic("onColumnRowGroupChangeRequest")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnRowGroupChangeRequestEvent) => onColumnRowGroupChangeRequest(t0).runNow()))
    if (onColumnRowGroupChanged != null) __obj.updateDynamic("onColumnRowGroupChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnRowGroupChangedEvent) => onColumnRowGroupChanged(t0).runNow()))
    if (onColumnValueChangeRequest != null) __obj.updateDynamic("onColumnValueChangeRequest")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnValueChangeRequestEvent) => onColumnValueChangeRequest(t0).runNow()))
    if (onColumnValueChanged != null) __obj.updateDynamic("onColumnValueChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnValueChangedEvent) => onColumnValueChanged(t0).runNow()))
    if (onColumnVisible != null) __obj.updateDynamic("onColumnVisible")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ColumnVisibleEvent) => onColumnVisible(t0).runNow()))
    if (onDisplayedColumnsChanged != null) __obj.updateDynamic("onDisplayedColumnsChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.DisplayedColumnsChangedEvent) => onDisplayedColumnsChanged(t0).runNow()))
    if (onDragStarted != null) __obj.updateDynamic("onDragStarted")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.DragStartedEvent) => onDragStarted(t0).runNow()))
    if (onDragStopped != null) __obj.updateDynamic("onDragStopped")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.DragStoppedEvent) => onDragStopped(t0).runNow()))
    if (onFilterChanged != null) __obj.updateDynamic("onFilterChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.FilterChangedEvent) => onFilterChanged(t0).runNow()))
    if (onFilterModified != null) __obj.updateDynamic("onFilterModified")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.FilterModifiedEvent) => onFilterModified(t0).runNow()))
    if (onGridColumnsChanged != null) __obj.updateDynamic("onGridColumnsChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.GridColumnsChangedEvent) => onGridColumnsChanged(t0).runNow()))
    if (onGridReady != null) __obj.updateDynamic("onGridReady")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.GridReadyEvent) => onGridReady(t0).runNow()))
    if (onGridSizeChanged != null) __obj.updateDynamic("onGridSizeChanged")(js.Any.fromFunction1((t0: /* event */ js.Any) => onGridSizeChanged(t0).runNow()))
    if (onModelUpdated != null) __obj.updateDynamic("onModelUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ModelUpdatedEvent) => onModelUpdated(t0).runNow()))
    if (onNewColumnsLoaded != null) __obj.updateDynamic("onNewColumnsLoaded")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.NewColumnsLoadedEvent) => onNewColumnsLoaded(t0).runNow()))
    if (onPaginationChanged != null) __obj.updateDynamic("onPaginationChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.PaginationChangedEvent) => onPaginationChanged(t0).runNow()))
    if (onPasteEnd != null) __obj.updateDynamic("onPasteEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.PasteEndEvent) => onPasteEnd(t0).runNow()))
    if (onPasteStart != null) __obj.updateDynamic("onPasteStart")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.PasteStartEvent) => onPasteStart(t0).runNow()))
    if (onPinnedRowDataChanged != null) __obj.updateDynamic("onPinnedRowDataChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.PinnedRowDataChangedEvent) => onPinnedRowDataChanged(t0).runNow()))
    if (onRangeSelectionChanged != null) __obj.updateDynamic("onRangeSelectionChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RangeSelectionChangedEvent) => onRangeSelectionChanged(t0).runNow()))
    if (onRowClicked != null) __obj.updateDynamic("onRowClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowClickedEvent) => onRowClicked(t0).runNow()))
    if (onRowDataChanged != null) __obj.updateDynamic("onRowDataChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDataChangedEvent) => onRowDataChanged(t0).runNow()))
    if (onRowDataUpdated != null) __obj.updateDynamic("onRowDataUpdated")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDataUpdatedEvent) => onRowDataUpdated(t0).runNow()))
    if (onRowDoubleClicked != null) __obj.updateDynamic("onRowDoubleClicked")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDoubleClickedEvent) => onRowDoubleClicked(t0).runNow()))
    if (onRowDragEnd != null) __obj.updateDynamic("onRowDragEnd")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDragEvent) => onRowDragEnd(t0).runNow()))
    if (onRowDragEnter != null) __obj.updateDynamic("onRowDragEnter")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDragEvent) => onRowDragEnter(t0).runNow()))
    if (onRowDragLeave != null) __obj.updateDynamic("onRowDragLeave")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDragEvent) => onRowDragLeave(t0).runNow()))
    if (onRowDragMove != null) __obj.updateDynamic("onRowDragMove")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowDragEvent) => onRowDragMove(t0).runNow()))
    if (onRowEditingStarted != null) __obj.updateDynamic("onRowEditingStarted")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowEditingStartedEvent) => onRowEditingStarted(t0).runNow()))
    if (onRowEditingStopped != null) __obj.updateDynamic("onRowEditingStopped")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowEditingStoppedEvent) => onRowEditingStopped(t0).runNow()))
    if (onRowGroupOpened != null) __obj.updateDynamic("onRowGroupOpened")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowGroupOpenedEvent) => onRowGroupOpened(t0).runNow()))
    if (onRowSelected != null) __obj.updateDynamic("onRowSelected")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowSelectedEvent) => onRowSelected(t0).runNow()))
    if (onRowValueChanged != null) __obj.updateDynamic("onRowValueChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.RowValueChangedEvent) => onRowValueChanged(t0).runNow()))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.SelectionChangedEvent) => onSelectionChanged(t0).runNow()))
    if (onSortChanged != null) __obj.updateDynamic("onSortChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.SortChangedEvent) => onSortChanged(t0).runNow()))
    if (onViewportChanged != null) __obj.updateDynamic("onViewportChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.ViewportChangedEvent) => onViewportChanged(t0).runNow()))
    if (onVirtualColumnsChanged != null) __obj.updateDynamic("onVirtualColumnsChanged")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.VirtualColumnsChangedEvent) => onVirtualColumnsChanged(t0).runNow()))
    if (onVirtualRowRemoved != null) __obj.updateDynamic("onVirtualRowRemoved")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.agGrid.eventsMod.VirtualRowRemovedEvent) => onVirtualRowRemoved(t0).runNow()))
    if (overlayLoadingTemplate != null) __obj.updateDynamic("overlayLoadingTemplate")(overlayLoadingTemplate.asInstanceOf[js.Any])
    if (overlayNoRowsTemplate != null) __obj.updateDynamic("overlayNoRowsTemplate")(overlayNoRowsTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(pagination)) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (!js.isUndefined(paginationAutoPageSize)) __obj.updateDynamic("paginationAutoPageSize")(paginationAutoPageSize.asInstanceOf[js.Any])
    if (paginationNumberFormatter != null) __obj.updateDynamic("paginationNumberFormatter")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.PaginationNumberFormatterParams) => paginationNumberFormatter(t0).runNow()))
    if (paginationPageSize != null) __obj.updateDynamic("paginationPageSize")(paginationPageSize.asInstanceOf[js.Any])
    if (paginationStartPage != null) __obj.updateDynamic("paginationStartPage")(paginationStartPage.asInstanceOf[js.Any])
    if (pinnedBottomRowData != null) __obj.updateDynamic("pinnedBottomRowData")(pinnedBottomRowData.asInstanceOf[js.Any])
    if (pinnedTopRowData != null) __obj.updateDynamic("pinnedTopRowData")(pinnedTopRowData.asInstanceOf[js.Any])
    if (pivotColumnGroupTotals != null) __obj.updateDynamic("pivotColumnGroupTotals")(pivotColumnGroupTotals.asInstanceOf[js.Any])
    if (pivotGroupHeaderHeight != null) __obj.updateDynamic("pivotGroupHeaderHeight")(pivotGroupHeaderHeight.asInstanceOf[js.Any])
    if (pivotHeaderHeight != null) __obj.updateDynamic("pivotHeaderHeight")(pivotHeaderHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotMode)) __obj.updateDynamic("pivotMode")(pivotMode.asInstanceOf[js.Any])
    if (pivotPanelShow != null) __obj.updateDynamic("pivotPanelShow")(pivotPanelShow.asInstanceOf[js.Any])
    if (pivotRowTotals != null) __obj.updateDynamic("pivotRowTotals")(pivotRowTotals.asInstanceOf[js.Any])
    if (!js.isUndefined(pivotTotals)) __obj.updateDynamic("pivotTotals")(pivotTotals.asInstanceOf[js.Any])
    if (popupParent != null) __obj.updateDynamic("popupParent")(popupParent.asInstanceOf[js.Any])
    if (postProcessPopup != null) __obj.updateDynamic("postProcessPopup")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.PostProcessPopupParams) => postProcessPopup(t0).runNow()))
    if (postSort != null) __obj.updateDynamic("postSort")(js.Any.fromFunction1((t0: /* nodes */ js.Array[typingsJapgolly.agGrid.rowNodeMod.RowNode]) => postSort(t0).runNow()))
    if (processCellForClipboard != null) __obj.updateDynamic("processCellForClipboard")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams) => processCellForClipboard(t0).runNow()))
    if (processCellFromClipboard != null) __obj.updateDynamic("processCellFromClipboard")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ProcessCellForExportParams) => processCellFromClipboard(t0).runNow()))
    if (processDataFromClipboard != null) __obj.updateDynamic("processDataFromClipboard")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.ProcessDataFromClipboardParams) => processDataFromClipboard(t0).runNow()))
    if (processHeaderForClipboard != null) __obj.updateDynamic("processHeaderForClipboard")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.exportParamsMod.ProcessHeaderForExportParams) => processHeaderForClipboard(t0).runNow()))
    if (processRowPostCreate != null) __obj.updateDynamic("processRowPostCreate")(js.Any.fromFunction1((t0: /* params */ typingsJapgolly.agGrid.gridOptionsMod.ProcessRowParams) => processRowPostCreate(t0).runNow()))
    if (processSecondaryColDef != null) __obj.updateDynamic("processSecondaryColDef")(js.Any.fromFunction1((t0: /* colDef */ typingsJapgolly.agGrid.colDefMod.ColDef) => processSecondaryColDef(t0).runNow()))
    if (processSecondaryColGroupDef != null) __obj.updateDynamic("processSecondaryColGroupDef")(js.Any.fromFunction1((t0: /* colGroupDef */ typingsJapgolly.agGrid.colDefMod.ColGroupDef) => processSecondaryColGroupDef(t0).runNow()))
    if (!js.isUndefined(purgeClosedRowNodes)) __obj.updateDynamic("purgeClosedRowNodes")(purgeClosedRowNodes.asInstanceOf[js.Any])
    if (quickFilterText != null) __obj.updateDynamic("quickFilterText")(quickFilterText.asInstanceOf[js.Any])
    if (!js.isUndefined(rememberGroupStateWhenNewData)) __obj.updateDynamic("rememberGroupStateWhenNewData")(rememberGroupStateWhenNewData.asInstanceOf[js.Any])
    if (rowBuffer != null) __obj.updateDynamic("rowBuffer")(rowBuffer.asInstanceOf[js.Any])
    if (rowClass != null) __obj.updateDynamic("rowClass")(rowClass.asInstanceOf[js.Any])
    if (rowClassRules != null) __obj.updateDynamic("rowClassRules")(rowClassRules.asInstanceOf[js.Any])
    if (rowData != null) __obj.updateDynamic("rowData")(rowData.asInstanceOf[js.Any])
    if (!js.isUndefined(rowDeselection)) __obj.updateDynamic("rowDeselection")(rowDeselection.asInstanceOf[js.Any])
    if (!js.isUndefined(rowDragManaged)) __obj.updateDynamic("rowDragManaged")(rowDragManaged.asInstanceOf[js.Any])
    if (rowGroupPanelShow != null) __obj.updateDynamic("rowGroupPanelShow")(rowGroupPanelShow.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowModelType != null) __obj.updateDynamic("rowModelType")(rowModelType.asInstanceOf[js.Any])
    if (!js.isUndefined(rowMultiSelectWithClick)) __obj.updateDynamic("rowMultiSelectWithClick")(rowMultiSelectWithClick.asInstanceOf[js.Any])
    if (rowSelection != null) __obj.updateDynamic("rowSelection")(rowSelection.asInstanceOf[js.Any])
    if (rowStyle != null) __obj.updateDynamic("rowStyle")(rowStyle.asInstanceOf[js.Any])
    if (scrollbarWidth != null) __obj.updateDynamic("scrollbarWidth")(scrollbarWidth.asInstanceOf[js.Any])
    if (sendToClipboard != null) __obj.updateDynamic("sendToClipboard")(js.Any.fromFunction1((t0: /* params */ js.Any) => sendToClipboard(t0).runNow()))
    if (serverSideDatasource != null) __obj.updateDynamic("serverSideDatasource")(serverSideDatasource.asInstanceOf[js.Any])
    if (!js.isUndefined(serverSideSortingAlwaysResets)) __obj.updateDynamic("serverSideSortingAlwaysResets")(serverSideSortingAlwaysResets.asInstanceOf[js.Any])
    if (!js.isUndefined(showToolPanel)) __obj.updateDynamic("showToolPanel")(showToolPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(singleClickEdit)) __obj.updateDynamic("singleClickEdit")(singleClickEdit.asInstanceOf[js.Any])
    if (slaveGrids != null) __obj.updateDynamic("slaveGrids")(slaveGrids.asInstanceOf[js.Any])
    if (sortingOrder != null) __obj.updateDynamic("sortingOrder")(sortingOrder.asInstanceOf[js.Any])
    if (!js.isUndefined(stopEditingWhenGridLosesFocus)) __obj.updateDynamic("stopEditingWhenGridLosesFocus")(stopEditingWhenGridLosesFocus.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAggAtRootLevel)) __obj.updateDynamic("suppressAggAtRootLevel")(suppressAggAtRootLevel.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAggFuncInHeader)) __obj.updateDynamic("suppressAggFuncInHeader")(suppressAggFuncInHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAnimationFrame)) __obj.updateDynamic("suppressAnimationFrame")(suppressAnimationFrame.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAsyncEvents)) __obj.updateDynamic("suppressAsyncEvents")(suppressAsyncEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressAutoSize)) __obj.updateDynamic("suppressAutoSize")(suppressAutoSize.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCellSelection)) __obj.updateDynamic("suppressCellSelection")(suppressCellSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressChangeDetection)) __obj.updateDynamic("suppressChangeDetection")(suppressChangeDetection.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressClickEdit)) __obj.updateDynamic("suppressClickEdit")(suppressClickEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressClipboardPaste)) __obj.updateDynamic("suppressClipboardPaste")(suppressClipboardPaste.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressColumnMoveAnimation)) __obj.updateDynamic("suppressColumnMoveAnimation")(suppressColumnMoveAnimation.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressColumnVirtualisation)) __obj.updateDynamic("suppressColumnVirtualisation")(suppressColumnVirtualisation.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressContextMenu)) __obj.updateDynamic("suppressContextMenu")(suppressContextMenu.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCopyRowsToClipboard)) __obj.updateDynamic("suppressCopyRowsToClipboard")(suppressCopyRowsToClipboard.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressCsvExport)) __obj.updateDynamic("suppressCsvExport")(suppressCsvExport.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressDragLeaveHidesColumns)) __obj.updateDynamic("suppressDragLeaveHidesColumns")(suppressDragLeaveHidesColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressEnterpriseResetOnNewColumns)) __obj.updateDynamic("suppressEnterpriseResetOnNewColumns")(suppressEnterpriseResetOnNewColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressExcelExport)) __obj.updateDynamic("suppressExcelExport")(suppressExcelExport.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFieldDotNotation)) __obj.updateDynamic("suppressFieldDotNotation")(suppressFieldDotNotation.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressFocusAfterRefresh)) __obj.updateDynamic("suppressFocusAfterRefresh")(suppressFocusAfterRefresh.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressHorizontalScroll)) __obj.updateDynamic("suppressHorizontalScroll")(suppressHorizontalScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressLoadingOverlay)) __obj.updateDynamic("suppressLoadingOverlay")(suppressLoadingOverlay.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMakeColumnVisibleAfterUnGroup)) __obj.updateDynamic("suppressMakeColumnVisibleAfterUnGroup")(suppressMakeColumnVisibleAfterUnGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressMenuHide)) __obj.updateDynamic("suppressMenuHide")(suppressMenuHide.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

