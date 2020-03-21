package typingsJapgolly.tabulatorTables.Tabulator

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.std.Record
import typingsJapgolly.tabulatorTables.AnonColumnCalcs
import typingsJapgolly.tabulatorTables.PickFilterfieldvalue
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`false`
import typingsJapgolly.tabulatorTables.tabulatorTablesBooleans.`true`
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.active
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.add
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.arrow
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.both
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.bottom
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.cell
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.click
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.collapse
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.columns
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.cookie
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.copy
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.delete
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.filter
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.fitColumns
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.fitData
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.fitDataFill
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.fitDataStretch
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.form
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.group
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.header
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.hide
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.highlight
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.insert
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.json
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.load
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.local
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.middle
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.page
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.paste
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.remote
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.replace
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.scroll
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.selected
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sort
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.table
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.top
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.update
import typingsJapgolly.tabulatorTables.tabulatorTablesStrings.visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.tabulatorTables.Tabulator.OptionsCell because var conflicts: cellClick, cellContext, cellDblClick, cellDblTap, cellEditCancelled, cellEdited, cellEditing, cellMouseEnter, cellMouseLeave, cellMouseMove, cellMouseOut, cellMouseOver, cellTap, cellTapHold. Inlined  */ trait Options
  extends OptionsCells
     with OptionsGeneral
     with OptionsHistory
     with OptionsLocale
     with OptionsDownload
     with OptionsColumns
     with OptionsRows
     with OptionsData
     with OptionsSorting
     with OptionsFiltering
     with OptionsRowGrouping
     with OptionsPagination
     with OptionsPersistentConfiguration
     with OptionsClipboard
     with OptionsDataTree
     with OptionsHTML

object Options {
  @scala.inline
  def apply(
    addRowPos: bottom | top = null,
    ajaxConfig: HttpMethod | AjaxConfig = null,
    ajaxContentType: form | json | AjaxContentType = null,
    ajaxError: (/* xhr */ js.Any, /* textStatus */ js.Any, /* errorThrown */ js.Any) => Callback = null,
    ajaxFiltering: js.UndefOr[Boolean] = js.undefined,
    ajaxLoader: Boolean | js.Function0[Boolean] = null,
    ajaxLoaderError: String = null,
    ajaxLoaderLoading: String = null,
    ajaxParams: js.Object = null,
    ajaxProgressiveLoad: load | scroll = null,
    ajaxProgressiveLoadDelay: Int | Double = null,
    ajaxProgressiveLoadScrollMargin: Int | Double = null,
    ajaxRequestFunc: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => CallbackTo[js.Promise[js.Any]] = null,
    ajaxRequesting: (/* url */ String, /* params */ js.Any) => CallbackTo[Boolean] = null,
    ajaxResponse: (/* url */ String, /* params */ js.Any, /* response */ js.Any) => CallbackTo[js.Any] = null,
    ajaxSorting: js.UndefOr[Boolean] = js.undefined,
    ajaxURL: String = null,
    ajaxURLGenerator: (/* url */ String, /* config */ js.Any, /* params */ js.Any) => CallbackTo[String] = null,
    autoColumns: js.UndefOr[Boolean] = js.undefined,
    autoResize: js.UndefOr[Boolean] = js.undefined,
    blockRedraw: js.UndefOr[Callback] = js.undefined,
    cellClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellContext: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblClick: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellDblTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellEditCancelled: /* cell */ CellComponent => Callback = null,
    cellEdited: /* cell */ CellComponent => Callback = null,
    cellEditing: /* cell */ CellComponent => Callback = null,
    cellMouseEnter: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseLeave: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseMove: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOut: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellMouseOver: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTap: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    cellTapHold: (/* e */ js.Any, /* cell */ CellComponent) => Callback = null,
    clipboard: Boolean | copy | paste = null,
    clipboardCopied: js.UndefOr[Callback] = js.undefined,
    clipboardCopyConfig: AnonColumnCalcs | Boolean = null,
    clipboardCopyFormatter: table | (js.Function1[/* rowData */ js.Array[_], String]) = null,
    clipboardCopyHeader: js.UndefOr[Boolean] = js.undefined,
    clipboardCopySelector: active | table | selected | visible = null,
    clipboardCopyStyled: js.UndefOr[Boolean] = js.undefined,
    clipboardPasteAction: insert | update | replace = null,
    clipboardPasteError: js.UndefOr[Callback] = js.undefined,
    clipboardPasteParser: String | (js.Function1[/* clipboard */ js.Any, js.Array[_]]) = null,
    clipboardPasted: js.UndefOr[Callback] = js.undefined,
    columnCalcs: Boolean | both | table | group = null,
    columnHeaderSortMulti: js.UndefOr[Boolean] = js.undefined,
    columnHeaderVertAlign: top | middle | bottom = null,
    columnMinWidth: Int | Double = null,
    columnMoved: (/* column */ ColumnComponent, /* columns */ js.Array[js.Any]) => Callback = null,
    columnResized: /* column */ ColumnComponent => Callback = null,
    columnTitleChanged: /* column */ ColumnComponent => Callback = null,
    columnVisibilityChanged: (/* column */ ColumnComponent, /* visible */ Boolean) => Callback = null,
    columns: js.Array[ColumnDefinition] = null,
    data: js.Array[_] = null,
    dataEdited: /* data */ js.Any => Callback = null,
    dataFiltered: (/* filters */ js.Array[Filter], /* rows */ js.Array[RowComponent]) => Callback = null,
    dataFiltering: /* filters */ js.Array[Filter] => Callback = null,
    dataGrouped: js.UndefOr[Callback] = js.undefined,
    dataGrouping: js.UndefOr[Callback] = js.undefined,
    dataLoaded: /* data */ js.Any => Callback = null,
    dataLoading: /* data */ js.Any => Callback = null,
    dataSorted: (/* sorters */ js.Array[Sorter], /* rows */ js.Array[RowComponent]) => Callback = null,
    dataSorting: /* sorters */ js.Array[Sorter] => Callback = null,
    dataTree: js.UndefOr[Boolean] = js.undefined,
    dataTreeBranchElement: Boolean | String = null,
    dataTreeChildField: String = null,
    dataTreeChildIndent: Int | Double = null,
    dataTreeCollapseElement: String | HTMLElement | Boolean = null,
    dataTreeElementColumn: Boolean | String = null,
    dataTreeExpandElement: String | HTMLElement | Boolean = null,
    dataTreeRowCollapsed: (/* row */ RowComponent, /* level */ Double) => Callback = null,
    dataTreeRowExpanded: (/* row */ RowComponent, /* level */ Double) => Callback = null,
    dataTreeStartExpanded: Boolean | js.Array[Boolean] | (js.Function2[/* row */ RowComponent, /* level */ Double, Boolean]) = null,
    downloadComplete: js.UndefOr[Callback] = js.undefined,
    downloadConfig: AddditionalExportOptions = null,
    downloadDataFormatter: /* data */ js.Array[js.Any] => CallbackTo[js.Any] = null,
    downloadReady: (/* fileContents */ js.Any, /* blob */ js.Any) => CallbackTo[js.Any] = null,
    footerElement: String | HTMLElement = null,
    groupBy: String | (js.Function1[/* data */ js.Any, _]) = null,
    groupClick: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupClosedShowCalcs: js.UndefOr[Boolean] = js.undefined,
    groupContext: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupDblClick: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupDblTap: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupHeader: (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      String
    ]) | (js.Array[js.Function3[/* value */ _, /* count */ Double, /* data */ _, String]]) = null,
    groupStartOpen: Boolean | (js.Function4[
      /* value */ js.Any, 
      /* count */ Double, 
      /* data */ js.Any, 
      /* group */ GroupComponent, 
      Boolean
    ]) = null,
    groupTap: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupTapHold: (/* e */ js.Any, /* group */ GroupComponent) => Callback = null,
    groupToggleElement: arrow | header | `false` = null,
    groupValues: js.Array[js.Array[_]] = null,
    groupVisibilityChanged: (/* group */ GroupComponent, /* visible */ Boolean) => Callback = null,
    headerFilterPlaceholder: String = null,
    headerSort: js.UndefOr[Boolean] = js.undefined,
    headerSortTristate: js.UndefOr[Boolean] = js.undefined,
    headerVisible: js.UndefOr[Boolean] = js.undefined,
    height: String | Double | `false` = null,
    history: js.UndefOr[Boolean] = js.undefined,
    historyRedo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Callback = null,
    historyUndo: (/* action */ HistoryAction, /* component */ CellComponent | RowComponent, /* data */ js.Any) => Callback = null,
    htmlImported: /* callback */ js.Function0[Unit] => Callback = null,
    htmlImporting: /* callback */ js.Function0[Unit] => Callback = null,
    htmlOutputConfig: AddditionalExportOptions = null,
    index: Double | String = null,
    initialFilter: js.Array[Filter] = null,
    initialHeaderFilter: js.Array[PickFilterfieldvalue] = null,
    initialSort: js.Array[Sorter] = null,
    invalidOptionWarnings: js.UndefOr[Boolean] = js.undefined,
    keybindings: `false` | KeyBinding = null,
    langs: js.Any = null,
    layout: fitData | fitColumns | fitDataFill | fitDataStretch = null,
    layoutColumnsOnNewData: js.UndefOr[Boolean] = js.undefined,
    locale: Boolean | String = null,
    localized: (/* locale */ String, /* lang */ js.Any) => Callback = null,
    movableColumns: js.UndefOr[Boolean] = js.undefined,
    movableRows: js.UndefOr[Boolean] = js.undefined,
    movableRowsConnectedTables: String | (js.Array[HTMLElement | String]) | HTMLElement = null,
    movableRowsReceived: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceivedFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceiver: insert | add | update | replace | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ]) = null,
    movableRowsReceivingStart: (/* fromRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsReceivingStop: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator => Callback = null,
    movableRowsSender: `false` | delete | (js.Function3[
      /* fromRow */ RowComponent, 
      /* toRow */ RowComponent, 
      /* toTable */ typingsJapgolly.tabulatorTables.Tabulator, 
      _
    ]) = null,
    movableRowsSendingStart: /* toTables */ js.Array[js.Any] => Callback = null,
    movableRowsSendingStop: /* toTables */ js.Array[js.Any] => Callback = null,
    movableRowsSent: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    movableRowsSentFailed: (/* fromRow */ RowComponent, /* toRow */ RowComponent, /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => Callback = null,
    nestedFieldSeparator: String | Boolean = null,
    pageLoaded: /* pageno */ Double => Callback = null,
    pagination: remote | local = null,
    paginationAddRow: table | page = null,
    paginationButtonCount: Int | Double = null,
    paginationDataReceived: Record[String, String] = null,
    paginationDataSent: Record[String, String] = null,
    paginationElement: HTMLElement | String = null,
    paginationInitialPage: Int | Double = null,
    paginationSize: Int | Double = null,
    paginationSizeSelector: `true` | js.Array[Double] = null,
    persistence: `true` | PersistenceOptions = null,
    persistenceID: String = null,
    persistenceMode: local | cookie | `true` = null,
    persistenceReaderFunc: (/* id */ String, /* type */ sort | filter | group | page | columns) => CallbackTo[js.Any] = null,
    persistenceWriterFunc: (/* id */ String, /* type */ sort | filter | group | page | columns, /* data */ js.Any) => CallbackTo[js.Any] = null,
    persistentFilter: js.UndefOr[Boolean] = js.undefined,
    persistentLayout: js.UndefOr[Boolean] = js.undefined,
    persistentSort: js.UndefOr[Boolean] = js.undefined,
    placeholder: String | HTMLElement = null,
    print: js.UndefOr[Boolean] = js.undefined,
    printAsHtml: js.UndefOr[Boolean] = js.undefined,
    printConfig: AddditionalExportOptions = null,
    printCopyStyle: js.UndefOr[Boolean] = js.undefined,
    printFooter: StandardStringParam = null,
    printFormatter: (/* tableHolderElement */ js.Any, /* tableElement */ js.Any) => CallbackTo[js.Any] = null,
    printHeader: StandardStringParam = null,
    printVisibleRows: js.UndefOr[Boolean] = js.undefined,
    reactiveData: js.UndefOr[Boolean] = js.undefined,
    renderComplete: js.UndefOr[Callback] = js.undefined,
    renderStarted: js.UndefOr[Callback] = js.undefined,
    resizableColumns: `true` | `false` | header | cell = null,
    resizableRows: js.UndefOr[Boolean] = js.undefined,
    responsiveLayout: Boolean | hide | collapse = null,
    responsiveLayoutCollapseFormatter: /* data */ js.Array[js.Any] => CallbackTo[js.Any] = null,
    responsiveLayoutCollapseStartOpen: js.UndefOr[Boolean] = js.undefined,
    responsiveLayoutCollapseUseFormatters: js.UndefOr[Boolean] = js.undefined,
    restoreRedraw: js.UndefOr[Callback] = js.undefined,
    rowAdded: /* row */ RowComponent => Callback = null,
    rowClick: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowContext: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDblClick: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDblTap: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowDeleted: /* row */ RowComponent => Callback = null,
    rowDeselected: /* row */ RowComponent => Callback = null,
    rowFormatter: /* row */ RowComponent => CallbackTo[js.Any] = null,
    rowMouseEnter: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseLeave: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseMove: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseOut: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMouseOver: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowMoved: /* row */ RowComponent => Callback = null,
    rowResized: /* row */ RowComponent => Callback = null,
    rowSelected: /* row */ RowComponent => Callback = null,
    rowSelectionChanged: (/* data */ js.Array[js.Any], /* rows */ js.Array[RowComponent]) => Callback = null,
    rowTap: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowTapHold: (/* e */ js.Any, /* row */ RowComponent) => Callback = null,
    rowUpdated: /* row */ RowComponent => Callback = null,
    scrollHorizontal: /* left */ js.Any => Callback = null,
    scrollToColumnIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToColumnPosition: ScrollToColumnPosition = null,
    scrollToRowIfVisible: js.UndefOr[Boolean] = js.undefined,
    scrollToRowPosition: ScrollToRowPostition = null,
    scrollVertical: /* top */ js.Any => Callback = null,
    selectable: Boolean | Double | highlight = null,
    selectableCheck: /* row */ RowComponent => CallbackTo[Boolean] = null,
    selectablePersistence: js.UndefOr[Boolean] = js.undefined,
    selectableRangeMode: click = null,
    selectableRollingSelection: js.UndefOr[Boolean] = js.undefined,
    sortOrderReverse: js.UndefOr[Boolean] = js.undefined,
    tabEndNewRow: Boolean | JSONRecord | (js.Function1[/* row */ RowComponent, _]) = null,
    tableBuilding: js.UndefOr[Callback] = js.undefined,
    tableBuilt: js.UndefOr[Callback] = js.undefined,
    tooltipGenerationMode: load = null,
    tooltips: GlobalTooltipOption = null,
    tooltipsHeader: js.UndefOr[Boolean] = js.undefined,
    validationFailed: (/* cell */ CellComponent, /* value */ js.Any, /* validators */ js.Array[StandardValidatorType | Validator]) => Callback = null,
    virtualDom: js.UndefOr[Boolean] = js.undefined,
    virtualDomBuffer: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (addRowPos != null) __obj.updateDynamic("addRowPos")(addRowPos.asInstanceOf[js.Any])
    if (ajaxConfig != null) __obj.updateDynamic("ajaxConfig")(ajaxConfig.asInstanceOf[js.Any])
    if (ajaxContentType != null) __obj.updateDynamic("ajaxContentType")(ajaxContentType.asInstanceOf[js.Any])
    if (ajaxError != null) __obj.updateDynamic("ajaxError")(js.Any.fromFunction3((t0: /* xhr */ js.Any, t1: /* textStatus */ js.Any, t2: /* errorThrown */ js.Any) => ajaxError(t0, t1, t2).runNow()))
    if (!js.isUndefined(ajaxFiltering)) __obj.updateDynamic("ajaxFiltering")(ajaxFiltering.asInstanceOf[js.Any])
    if (ajaxLoader != null) __obj.updateDynamic("ajaxLoader")(ajaxLoader.asInstanceOf[js.Any])
    if (ajaxLoaderError != null) __obj.updateDynamic("ajaxLoaderError")(ajaxLoaderError.asInstanceOf[js.Any])
    if (ajaxLoaderLoading != null) __obj.updateDynamic("ajaxLoaderLoading")(ajaxLoaderLoading.asInstanceOf[js.Any])
    if (ajaxParams != null) __obj.updateDynamic("ajaxParams")(ajaxParams.asInstanceOf[js.Any])
    if (ajaxProgressiveLoad != null) __obj.updateDynamic("ajaxProgressiveLoad")(ajaxProgressiveLoad.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadDelay != null) __obj.updateDynamic("ajaxProgressiveLoadDelay")(ajaxProgressiveLoadDelay.asInstanceOf[js.Any])
    if (ajaxProgressiveLoadScrollMargin != null) __obj.updateDynamic("ajaxProgressiveLoadScrollMargin")(ajaxProgressiveLoadScrollMargin.asInstanceOf[js.Any])
    if (ajaxRequestFunc != null) __obj.updateDynamic("ajaxRequestFunc")(js.Any.fromFunction3((t0: /* url */ java.lang.String, t1: /* config */ js.Any, t2: /* params */ js.Any) => ajaxRequestFunc(t0, t1, t2).runNow()))
    if (ajaxRequesting != null) __obj.updateDynamic("ajaxRequesting")(js.Any.fromFunction2((t0: /* url */ java.lang.String, t1: /* params */ js.Any) => ajaxRequesting(t0, t1).runNow()))
    if (ajaxResponse != null) __obj.updateDynamic("ajaxResponse")(js.Any.fromFunction3((t0: /* url */ java.lang.String, t1: /* params */ js.Any, t2: /* response */ js.Any) => ajaxResponse(t0, t1, t2).runNow()))
    if (!js.isUndefined(ajaxSorting)) __obj.updateDynamic("ajaxSorting")(ajaxSorting.asInstanceOf[js.Any])
    if (ajaxURL != null) __obj.updateDynamic("ajaxURL")(ajaxURL.asInstanceOf[js.Any])
    if (ajaxURLGenerator != null) __obj.updateDynamic("ajaxURLGenerator")(js.Any.fromFunction3((t0: /* url */ java.lang.String, t1: /* config */ js.Any, t2: /* params */ js.Any) => ajaxURLGenerator(t0, t1, t2).runNow()))
    if (!js.isUndefined(autoColumns)) __obj.updateDynamic("autoColumns")(autoColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(autoResize)) __obj.updateDynamic("autoResize")(autoResize.asInstanceOf[js.Any])
    blockRedraw.foreach(p => __obj.updateDynamic("blockRedraw")(p.toJsFn))
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellClick(t0, t1).runNow()))
    if (cellContext != null) __obj.updateDynamic("cellContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellContext(t0, t1).runNow()))
    if (cellDblClick != null) __obj.updateDynamic("cellDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblClick(t0, t1).runNow()))
    if (cellDblTap != null) __obj.updateDynamic("cellDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellDblTap(t0, t1).runNow()))
    if (cellEditCancelled != null) __obj.updateDynamic("cellEditCancelled")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditCancelled(t0).runNow()))
    if (cellEdited != null) __obj.updateDynamic("cellEdited")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEdited(t0).runNow()))
    if (cellEditing != null) __obj.updateDynamic("cellEditing")(js.Any.fromFunction1((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellEditing(t0).runNow()))
    if (cellMouseEnter != null) __obj.updateDynamic("cellMouseEnter")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseEnter(t0, t1).runNow()))
    if (cellMouseLeave != null) __obj.updateDynamic("cellMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseLeave(t0, t1).runNow()))
    if (cellMouseMove != null) __obj.updateDynamic("cellMouseMove")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseMove(t0, t1).runNow()))
    if (cellMouseOut != null) __obj.updateDynamic("cellMouseOut")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOut(t0, t1).runNow()))
    if (cellMouseOver != null) __obj.updateDynamic("cellMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellMouseOver(t0, t1).runNow()))
    if (cellTap != null) __obj.updateDynamic("cellTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTap(t0, t1).runNow()))
    if (cellTapHold != null) __obj.updateDynamic("cellTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent) => cellTapHold(t0, t1).runNow()))
    if (clipboard != null) __obj.updateDynamic("clipboard")(clipboard.asInstanceOf[js.Any])
    clipboardCopied.foreach(p => __obj.updateDynamic("clipboardCopied")(p.toJsFn))
    if (clipboardCopyConfig != null) __obj.updateDynamic("clipboardCopyConfig")(clipboardCopyConfig.asInstanceOf[js.Any])
    if (clipboardCopyFormatter != null) __obj.updateDynamic("clipboardCopyFormatter")(clipboardCopyFormatter.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyHeader)) __obj.updateDynamic("clipboardCopyHeader")(clipboardCopyHeader.asInstanceOf[js.Any])
    if (clipboardCopySelector != null) __obj.updateDynamic("clipboardCopySelector")(clipboardCopySelector.asInstanceOf[js.Any])
    if (!js.isUndefined(clipboardCopyStyled)) __obj.updateDynamic("clipboardCopyStyled")(clipboardCopyStyled.asInstanceOf[js.Any])
    if (clipboardPasteAction != null) __obj.updateDynamic("clipboardPasteAction")(clipboardPasteAction.asInstanceOf[js.Any])
    clipboardPasteError.foreach(p => __obj.updateDynamic("clipboardPasteError")(p.toJsFn))
    if (clipboardPasteParser != null) __obj.updateDynamic("clipboardPasteParser")(clipboardPasteParser.asInstanceOf[js.Any])
    clipboardPasted.foreach(p => __obj.updateDynamic("clipboardPasted")(p.toJsFn))
    if (columnCalcs != null) __obj.updateDynamic("columnCalcs")(columnCalcs.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHeaderSortMulti)) __obj.updateDynamic("columnHeaderSortMulti")(columnHeaderSortMulti.asInstanceOf[js.Any])
    if (columnHeaderVertAlign != null) __obj.updateDynamic("columnHeaderVertAlign")(columnHeaderVertAlign.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnMoved != null) __obj.updateDynamic("columnMoved")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent, t1: /* columns */ js.Array[js.Any]) => columnMoved(t0, t1).runNow()))
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction1((t0: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => columnResized(t0).runNow()))
    if (columnTitleChanged != null) __obj.updateDynamic("columnTitleChanged")(js.Any.fromFunction1((t0: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent) => columnTitleChanged(t0).runNow()))
    if (columnVisibilityChanged != null) __obj.updateDynamic("columnVisibilityChanged")(js.Any.fromFunction2((t0: /* column */ typingsJapgolly.tabulatorTables.Tabulator.ColumnComponent, t1: /* visible */ scala.Boolean) => columnVisibilityChanged(t0, t1).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (dataEdited != null) __obj.updateDynamic("dataEdited")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataEdited(t0).runNow()))
    if (dataFiltered != null) __obj.updateDynamic("dataFiltered")(js.Any.fromFunction2((t0: /* filters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Filter], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => dataFiltered(t0, t1).runNow()))
    if (dataFiltering != null) __obj.updateDynamic("dataFiltering")(js.Any.fromFunction1((t0: /* filters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Filter]) => dataFiltering(t0).runNow()))
    dataGrouped.foreach(p => __obj.updateDynamic("dataGrouped")(p.toJsFn))
    dataGrouping.foreach(p => __obj.updateDynamic("dataGrouping")(p.toJsFn))
    if (dataLoaded != null) __obj.updateDynamic("dataLoaded")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataLoaded(t0).runNow()))
    if (dataLoading != null) __obj.updateDynamic("dataLoading")(js.Any.fromFunction1((t0: /* data */ js.Any) => dataLoading(t0).runNow()))
    if (dataSorted != null) __obj.updateDynamic("dataSorted")(js.Any.fromFunction2((t0: /* sorters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Sorter], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => dataSorted(t0, t1).runNow()))
    if (dataSorting != null) __obj.updateDynamic("dataSorting")(js.Any.fromFunction1((t0: /* sorters */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.Sorter]) => dataSorting(t0).runNow()))
    if (!js.isUndefined(dataTree)) __obj.updateDynamic("dataTree")(dataTree.asInstanceOf[js.Any])
    if (dataTreeBranchElement != null) __obj.updateDynamic("dataTreeBranchElement")(dataTreeBranchElement.asInstanceOf[js.Any])
    if (dataTreeChildField != null) __obj.updateDynamic("dataTreeChildField")(dataTreeChildField.asInstanceOf[js.Any])
    if (dataTreeChildIndent != null) __obj.updateDynamic("dataTreeChildIndent")(dataTreeChildIndent.asInstanceOf[js.Any])
    if (dataTreeCollapseElement != null) __obj.updateDynamic("dataTreeCollapseElement")(dataTreeCollapseElement.asInstanceOf[js.Any])
    if (dataTreeElementColumn != null) __obj.updateDynamic("dataTreeElementColumn")(dataTreeElementColumn.asInstanceOf[js.Any])
    if (dataTreeExpandElement != null) __obj.updateDynamic("dataTreeExpandElement")(dataTreeExpandElement.asInstanceOf[js.Any])
    if (dataTreeRowCollapsed != null) __obj.updateDynamic("dataTreeRowCollapsed")(js.Any.fromFunction2((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* level */ scala.Double) => dataTreeRowCollapsed(t0, t1).runNow()))
    if (dataTreeRowExpanded != null) __obj.updateDynamic("dataTreeRowExpanded")(js.Any.fromFunction2((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* level */ scala.Double) => dataTreeRowExpanded(t0, t1).runNow()))
    if (dataTreeStartExpanded != null) __obj.updateDynamic("dataTreeStartExpanded")(dataTreeStartExpanded.asInstanceOf[js.Any])
    downloadComplete.foreach(p => __obj.updateDynamic("downloadComplete")(p.toJsFn))
    if (downloadConfig != null) __obj.updateDynamic("downloadConfig")(downloadConfig.asInstanceOf[js.Any])
    if (downloadDataFormatter != null) __obj.updateDynamic("downloadDataFormatter")(js.Any.fromFunction1((t0: /* data */ js.Array[js.Any]) => downloadDataFormatter(t0).runNow()))
    if (downloadReady != null) __obj.updateDynamic("downloadReady")(js.Any.fromFunction2((t0: /* fileContents */ js.Any, t1: /* blob */ js.Any) => downloadReady(t0, t1).runNow()))
    if (footerElement != null) __obj.updateDynamic("footerElement")(footerElement.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    if (groupClick != null) __obj.updateDynamic("groupClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupClick(t0, t1).runNow()))
    if (!js.isUndefined(groupClosedShowCalcs)) __obj.updateDynamic("groupClosedShowCalcs")(groupClosedShowCalcs.asInstanceOf[js.Any])
    if (groupContext != null) __obj.updateDynamic("groupContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupContext(t0, t1).runNow()))
    if (groupDblClick != null) __obj.updateDynamic("groupDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupDblClick(t0, t1).runNow()))
    if (groupDblTap != null) __obj.updateDynamic("groupDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupDblTap(t0, t1).runNow()))
    if (groupHeader != null) __obj.updateDynamic("groupHeader")(groupHeader.asInstanceOf[js.Any])
    if (groupStartOpen != null) __obj.updateDynamic("groupStartOpen")(groupStartOpen.asInstanceOf[js.Any])
    if (groupTap != null) __obj.updateDynamic("groupTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupTap(t0, t1).runNow()))
    if (groupTapHold != null) __obj.updateDynamic("groupTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent) => groupTapHold(t0, t1).runNow()))
    if (groupToggleElement != null) __obj.updateDynamic("groupToggleElement")(groupToggleElement.asInstanceOf[js.Any])
    if (groupValues != null) __obj.updateDynamic("groupValues")(groupValues.asInstanceOf[js.Any])
    if (groupVisibilityChanged != null) __obj.updateDynamic("groupVisibilityChanged")(js.Any.fromFunction2((t0: /* group */ typingsJapgolly.tabulatorTables.Tabulator.GroupComponent, t1: /* visible */ scala.Boolean) => groupVisibilityChanged(t0, t1).runNow()))
    if (headerFilterPlaceholder != null) __obj.updateDynamic("headerFilterPlaceholder")(headerFilterPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSort)) __obj.updateDynamic("headerSort")(headerSort.asInstanceOf[js.Any])
    if (!js.isUndefined(headerSortTristate)) __obj.updateDynamic("headerSortTristate")(headerSortTristate.asInstanceOf[js.Any])
    if (!js.isUndefined(headerVisible)) __obj.updateDynamic("headerVisible")(headerVisible.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(history)) __obj.updateDynamic("history")(history.asInstanceOf[js.Any])
    if (historyRedo != null) __obj.updateDynamic("historyRedo")(js.Any.fromFunction3((t0: /* action */ typingsJapgolly.tabulatorTables.Tabulator.HistoryAction, t1: /* component */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent | typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* data */ js.Any) => historyRedo(t0, t1, t2).runNow()))
    if (historyUndo != null) __obj.updateDynamic("historyUndo")(js.Any.fromFunction3((t0: /* action */ typingsJapgolly.tabulatorTables.Tabulator.HistoryAction, t1: /* component */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent | typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* data */ js.Any) => historyUndo(t0, t1, t2).runNow()))
    if (htmlImported != null) __obj.updateDynamic("htmlImported")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => htmlImported(t0).runNow()))
    if (htmlImporting != null) __obj.updateDynamic("htmlImporting")(js.Any.fromFunction1((t0: /* callback */ js.Function0[scala.Unit]) => htmlImporting(t0).runNow()))
    if (htmlOutputConfig != null) __obj.updateDynamic("htmlOutputConfig")(htmlOutputConfig.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (initialFilter != null) __obj.updateDynamic("initialFilter")(initialFilter.asInstanceOf[js.Any])
    if (initialHeaderFilter != null) __obj.updateDynamic("initialHeaderFilter")(initialHeaderFilter.asInstanceOf[js.Any])
    if (initialSort != null) __obj.updateDynamic("initialSort")(initialSort.asInstanceOf[js.Any])
    if (!js.isUndefined(invalidOptionWarnings)) __obj.updateDynamic("invalidOptionWarnings")(invalidOptionWarnings.asInstanceOf[js.Any])
    if (keybindings != null) __obj.updateDynamic("keybindings")(keybindings.asInstanceOf[js.Any])
    if (langs != null) __obj.updateDynamic("langs")(langs.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (!js.isUndefined(layoutColumnsOnNewData)) __obj.updateDynamic("layoutColumnsOnNewData")(layoutColumnsOnNewData.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (localized != null) __obj.updateDynamic("localized")(js.Any.fromFunction2((t0: /* locale */ java.lang.String, t1: /* lang */ js.Any) => localized(t0, t1).runNow()))
    if (!js.isUndefined(movableColumns)) __obj.updateDynamic("movableColumns")(movableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(movableRows)) __obj.updateDynamic("movableRows")(movableRows.asInstanceOf[js.Any])
    if (movableRowsConnectedTables != null) __obj.updateDynamic("movableRowsConnectedTables")(movableRowsConnectedTables.asInstanceOf[js.Any])
    if (movableRowsReceived != null) __obj.updateDynamic("movableRowsReceived")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceived(t0, t1, t2).runNow()))
    if (movableRowsReceivedFailed != null) __obj.updateDynamic("movableRowsReceivedFailed")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivedFailed(t0, t1, t2).runNow()))
    if (movableRowsReceiver != null) __obj.updateDynamic("movableRowsReceiver")(movableRowsReceiver.asInstanceOf[js.Any])
    if (movableRowsReceivingStart != null) __obj.updateDynamic("movableRowsReceivingStart")(js.Any.fromFunction2((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivingStart(t0, t1).runNow()))
    if (movableRowsReceivingStop != null) __obj.updateDynamic("movableRowsReceivingStop")(js.Any.fromFunction1((t0: /* fromTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsReceivingStop(t0).runNow()))
    if (movableRowsSender != null) __obj.updateDynamic("movableRowsSender")(movableRowsSender.asInstanceOf[js.Any])
    if (movableRowsSendingStart != null) __obj.updateDynamic("movableRowsSendingStart")(js.Any.fromFunction1((t0: /* toTables */ js.Array[js.Any]) => movableRowsSendingStart(t0).runNow()))
    if (movableRowsSendingStop != null) __obj.updateDynamic("movableRowsSendingStop")(js.Any.fromFunction1((t0: /* toTables */ js.Array[js.Any]) => movableRowsSendingStop(t0).runNow()))
    if (movableRowsSent != null) __obj.updateDynamic("movableRowsSent")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsSent(t0, t1, t2).runNow()))
    if (movableRowsSentFailed != null) __obj.updateDynamic("movableRowsSentFailed")(js.Any.fromFunction3((t0: /* fromRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t1: /* toRow */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent, t2: /* toTable */ typingsJapgolly.tabulatorTables.Tabulator) => movableRowsSentFailed(t0, t1, t2).runNow()))
    if (nestedFieldSeparator != null) __obj.updateDynamic("nestedFieldSeparator")(nestedFieldSeparator.asInstanceOf[js.Any])
    if (pageLoaded != null) __obj.updateDynamic("pageLoaded")(js.Any.fromFunction1((t0: /* pageno */ scala.Double) => pageLoaded(t0).runNow()))
    if (pagination != null) __obj.updateDynamic("pagination")(pagination.asInstanceOf[js.Any])
    if (paginationAddRow != null) __obj.updateDynamic("paginationAddRow")(paginationAddRow.asInstanceOf[js.Any])
    if (paginationButtonCount != null) __obj.updateDynamic("paginationButtonCount")(paginationButtonCount.asInstanceOf[js.Any])
    if (paginationDataReceived != null) __obj.updateDynamic("paginationDataReceived")(paginationDataReceived.asInstanceOf[js.Any])
    if (paginationDataSent != null) __obj.updateDynamic("paginationDataSent")(paginationDataSent.asInstanceOf[js.Any])
    if (paginationElement != null) __obj.updateDynamic("paginationElement")(paginationElement.asInstanceOf[js.Any])
    if (paginationInitialPage != null) __obj.updateDynamic("paginationInitialPage")(paginationInitialPage.asInstanceOf[js.Any])
    if (paginationSize != null) __obj.updateDynamic("paginationSize")(paginationSize.asInstanceOf[js.Any])
    if (paginationSizeSelector != null) __obj.updateDynamic("paginationSizeSelector")(paginationSizeSelector.asInstanceOf[js.Any])
    if (persistence != null) __obj.updateDynamic("persistence")(persistence.asInstanceOf[js.Any])
    if (persistenceID != null) __obj.updateDynamic("persistenceID")(persistenceID.asInstanceOf[js.Any])
    if (persistenceMode != null) __obj.updateDynamic("persistenceMode")(persistenceMode.asInstanceOf[js.Any])
    if (persistenceReaderFunc != null) __obj.updateDynamic("persistenceReaderFunc")(js.Any.fromFunction2((t0: /* id */ java.lang.String, t1: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sort | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.filter | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.group | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.page | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.columns) => persistenceReaderFunc(t0, t1).runNow()))
    if (persistenceWriterFunc != null) __obj.updateDynamic("persistenceWriterFunc")(js.Any.fromFunction3((t0: /* id */ java.lang.String, t1: /* type */ typingsJapgolly.tabulatorTables.tabulatorTablesStrings.sort | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.filter | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.group | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.page | typingsJapgolly.tabulatorTables.tabulatorTablesStrings.columns, t2: /* data */ js.Any) => persistenceWriterFunc(t0, t1, t2).runNow()))
    if (!js.isUndefined(persistentFilter)) __obj.updateDynamic("persistentFilter")(persistentFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentLayout)) __obj.updateDynamic("persistentLayout")(persistentLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(persistentSort)) __obj.updateDynamic("persistentSort")(persistentSort.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (!js.isUndefined(print)) __obj.updateDynamic("print")(print.asInstanceOf[js.Any])
    if (!js.isUndefined(printAsHtml)) __obj.updateDynamic("printAsHtml")(printAsHtml.asInstanceOf[js.Any])
    if (printConfig != null) __obj.updateDynamic("printConfig")(printConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(printCopyStyle)) __obj.updateDynamic("printCopyStyle")(printCopyStyle.asInstanceOf[js.Any])
    if (printFooter != null) __obj.updateDynamic("printFooter")(printFooter.asInstanceOf[js.Any])
    if (printFormatter != null) __obj.updateDynamic("printFormatter")(js.Any.fromFunction2((t0: /* tableHolderElement */ js.Any, t1: /* tableElement */ js.Any) => printFormatter(t0, t1).runNow()))
    if (printHeader != null) __obj.updateDynamic("printHeader")(printHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(printVisibleRows)) __obj.updateDynamic("printVisibleRows")(printVisibleRows.asInstanceOf[js.Any])
    if (!js.isUndefined(reactiveData)) __obj.updateDynamic("reactiveData")(reactiveData.asInstanceOf[js.Any])
    renderComplete.foreach(p => __obj.updateDynamic("renderComplete")(p.toJsFn))
    renderStarted.foreach(p => __obj.updateDynamic("renderStarted")(p.toJsFn))
    if (resizableColumns != null) __obj.updateDynamic("resizableColumns")(resizableColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(resizableRows)) __obj.updateDynamic("resizableRows")(resizableRows.asInstanceOf[js.Any])
    if (responsiveLayout != null) __obj.updateDynamic("responsiveLayout")(responsiveLayout.asInstanceOf[js.Any])
    if (responsiveLayoutCollapseFormatter != null) __obj.updateDynamic("responsiveLayoutCollapseFormatter")(js.Any.fromFunction1((t0: /* data */ js.Array[js.Any]) => responsiveLayoutCollapseFormatter(t0).runNow()))
    if (!js.isUndefined(responsiveLayoutCollapseStartOpen)) __obj.updateDynamic("responsiveLayoutCollapseStartOpen")(responsiveLayoutCollapseStartOpen.asInstanceOf[js.Any])
    if (!js.isUndefined(responsiveLayoutCollapseUseFormatters)) __obj.updateDynamic("responsiveLayoutCollapseUseFormatters")(responsiveLayoutCollapseUseFormatters.asInstanceOf[js.Any])
    restoreRedraw.foreach(p => __obj.updateDynamic("restoreRedraw")(p.toJsFn))
    if (rowAdded != null) __obj.updateDynamic("rowAdded")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowAdded(t0).runNow()))
    if (rowClick != null) __obj.updateDynamic("rowClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowClick(t0, t1).runNow()))
    if (rowContext != null) __obj.updateDynamic("rowContext")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowContext(t0, t1).runNow()))
    if (rowDblClick != null) __obj.updateDynamic("rowDblClick")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDblClick(t0, t1).runNow()))
    if (rowDblTap != null) __obj.updateDynamic("rowDblTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDblTap(t0, t1).runNow()))
    if (rowDeleted != null) __obj.updateDynamic("rowDeleted")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDeleted(t0).runNow()))
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowDeselected(t0).runNow()))
    if (rowFormatter != null) __obj.updateDynamic("rowFormatter")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowFormatter(t0).runNow()))
    if (rowMouseEnter != null) __obj.updateDynamic("rowMouseEnter")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseEnter(t0, t1).runNow()))
    if (rowMouseLeave != null) __obj.updateDynamic("rowMouseLeave")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseLeave(t0, t1).runNow()))
    if (rowMouseMove != null) __obj.updateDynamic("rowMouseMove")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseMove(t0, t1).runNow()))
    if (rowMouseOut != null) __obj.updateDynamic("rowMouseOut")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseOut(t0, t1).runNow()))
    if (rowMouseOver != null) __obj.updateDynamic("rowMouseOver")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMouseOver(t0, t1).runNow()))
    if (rowMoved != null) __obj.updateDynamic("rowMoved")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowMoved(t0).runNow()))
    if (rowResized != null) __obj.updateDynamic("rowResized")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowResized(t0).runNow()))
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowSelected(t0).runNow()))
    if (rowSelectionChanged != null) __obj.updateDynamic("rowSelectionChanged")(js.Any.fromFunction2((t0: /* data */ js.Array[js.Any], t1: /* rows */ js.Array[typingsJapgolly.tabulatorTables.Tabulator.RowComponent]) => rowSelectionChanged(t0, t1).runNow()))
    if (rowTap != null) __obj.updateDynamic("rowTap")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowTap(t0, t1).runNow()))
    if (rowTapHold != null) __obj.updateDynamic("rowTapHold")(js.Any.fromFunction2((t0: /* e */ js.Any, t1: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowTapHold(t0, t1).runNow()))
    if (rowUpdated != null) __obj.updateDynamic("rowUpdated")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => rowUpdated(t0).runNow()))
    if (scrollHorizontal != null) __obj.updateDynamic("scrollHorizontal")(js.Any.fromFunction1((t0: /* left */ js.Any) => scrollHorizontal(t0).runNow()))
    if (!js.isUndefined(scrollToColumnIfVisible)) __obj.updateDynamic("scrollToColumnIfVisible")(scrollToColumnIfVisible.asInstanceOf[js.Any])
    if (scrollToColumnPosition != null) __obj.updateDynamic("scrollToColumnPosition")(scrollToColumnPosition.asInstanceOf[js.Any])
    if (!js.isUndefined(scrollToRowIfVisible)) __obj.updateDynamic("scrollToRowIfVisible")(scrollToRowIfVisible.asInstanceOf[js.Any])
    if (scrollToRowPosition != null) __obj.updateDynamic("scrollToRowPosition")(scrollToRowPosition.asInstanceOf[js.Any])
    if (scrollVertical != null) __obj.updateDynamic("scrollVertical")(js.Any.fromFunction1((t0: /* top */ js.Any) => scrollVertical(t0).runNow()))
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (selectableCheck != null) __obj.updateDynamic("selectableCheck")(js.Any.fromFunction1((t0: /* row */ typingsJapgolly.tabulatorTables.Tabulator.RowComponent) => selectableCheck(t0).runNow()))
    if (!js.isUndefined(selectablePersistence)) __obj.updateDynamic("selectablePersistence")(selectablePersistence.asInstanceOf[js.Any])
    if (selectableRangeMode != null) __obj.updateDynamic("selectableRangeMode")(selectableRangeMode.asInstanceOf[js.Any])
    if (!js.isUndefined(selectableRollingSelection)) __obj.updateDynamic("selectableRollingSelection")(selectableRollingSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(sortOrderReverse)) __obj.updateDynamic("sortOrderReverse")(sortOrderReverse.asInstanceOf[js.Any])
    if (tabEndNewRow != null) __obj.updateDynamic("tabEndNewRow")(tabEndNewRow.asInstanceOf[js.Any])
    tableBuilding.foreach(p => __obj.updateDynamic("tableBuilding")(p.toJsFn))
    tableBuilt.foreach(p => __obj.updateDynamic("tableBuilt")(p.toJsFn))
    if (tooltipGenerationMode != null) __obj.updateDynamic("tooltipGenerationMode")(tooltipGenerationMode.asInstanceOf[js.Any])
    if (tooltips != null) __obj.updateDynamic("tooltips")(tooltips.asInstanceOf[js.Any])
    if (!js.isUndefined(tooltipsHeader)) __obj.updateDynamic("tooltipsHeader")(tooltipsHeader.asInstanceOf[js.Any])
    if (validationFailed != null) __obj.updateDynamic("validationFailed")(js.Any.fromFunction3((t0: /* cell */ typingsJapgolly.tabulatorTables.Tabulator.CellComponent, t1: /* value */ js.Any, t2: /* validators */ js.Array[
  typingsJapgolly.tabulatorTables.Tabulator.StandardValidatorType | typingsJapgolly.tabulatorTables.Tabulator.Validator]) => validationFailed(t0, t1, t2).runNow()))
    if (!js.isUndefined(virtualDom)) __obj.updateDynamic("virtualDom")(virtualDom.asInstanceOf[js.Any])
    if (!js.isUndefined(virtualDomBuffer)) __obj.updateDynamic("virtualDomBuffer")(virtualDomBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

