package typingsJapgolly.slickgrid.Slick

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions[T /* <: SlickData */] extends js.Object {
  var addNewRowCssClass: js.UndefOr[String] = js.undefined
  var alwaysAllowHorizontalScroll: js.UndefOr[Boolean] = js.undefined
  var alwaysShowVerticalScroll: js.UndefOr[Boolean] = js.undefined
  /**
  		* Delay after which cell editor is loaded. Ignored unless asyncEditorLoading is true.
  		**/
  var asyncEditorLoadDelay: js.UndefOr[Double] = js.undefined
  /**
  		* Makes cell editors load asynchronously after a small delay. This greatly increases keyboard navigation speed.
  		**/
  var asyncEditorLoading: js.UndefOr[Boolean] = js.undefined
  var asyncPostRenderCleanupDelay: js.UndefOr[Double] = js.undefined
  /**
  		*
  		**/
  var asyncPostRenderDelay: js.UndefOr[Double] = js.undefined
  /**
  		* Cell will not automatically go into edit mode when selected.
  		**/
  var autoEdit: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var autoHeight: js.UndefOr[Boolean] = js.undefined
  /**
  		* A CSS class to apply to flashing cells via flashCell().
  		**/
  var cellFlashingCssClass: js.UndefOr[String] = js.undefined
  /**
  		* A CSS class to apply to cells highlighted via setHighlightedCells().
  		**/
  var cellHighlightCssClass: js.UndefOr[String] = js.undefined
  var createFooterRow: js.UndefOr[Boolean] = js.undefined
  var createPreHeaderPanel: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var dataItemColumnValueExtractor: js.UndefOr[js.Function2[/* item */ js.Any, /* columnDef */ js.Any, _]] = js.undefined
  /**
  		*
  		**/
  var defaultColumnWidth: js.UndefOr[Double] = js.undefined
  /**
  		*
  		**/
  var defaultFormatter: js.UndefOr[Formatter[T]] = js.undefined
  var doPaging: js.UndefOr[Boolean] = js.undefined
  /**
  		* Not listed as a default under options in slick.grid.js
  		**/
  var editCommandHandler: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var editable: js.UndefOr[Boolean] = js.undefined
  var editorCellNavOnLRKeys: js.UndefOr[Boolean] = js.undefined
   // queueAndExecuteCommand
  /**
  		* A factory object responsible to creating an editor for a given cell. Must implement getEditor(column).
  		**/
  var editorFactory: js.UndefOr[EditorFactory] = js.undefined
  /**
  		* A Slick.EditorLock instance to use for controlling concurrent data edits.
  		**/
  var editorLock: js.UndefOr[EditorLock[T]] = js.undefined
  var emulatePagingWhenScrolling: js.UndefOr[Boolean] = js.undefined
  /**
  		* If true, a blank row will be displayed at the bottom - typing values in that row will add a new one. Must subscribe to onAddNewRow to save values.
  		**/
  var enableAddRow: js.UndefOr[Boolean] = js.undefined
  /**
  		* If true, async post rendering will occur and asyncPostRender delegates on columns will be called.
  		**/
  var enableAsyncPostRender: js.UndefOr[Boolean] = js.undefined
  var enableAsyncPostRenderCleanup: js.UndefOr[Boolean] = js.undefined
  /**
  		* Appears to enable cell virtualisation for optimised speed with large datasets
  		**/
  var enableCellNavigation: js.UndefOr[Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableCellRangeSelection: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableColumnReorder: js.UndefOr[Boolean] = js.undefined
  /**
  		* *WARNING*: Not contained in SlickGrid 2.1, may be deprecated
  		**/
  var enableRowReordering: js.UndefOr[js.Any] = js.undefined
  /**
  		*
  		**/
  var enableTextSelectionOnCells: js.UndefOr[Boolean] = js.undefined
  /**
  		* @see Example: Explicit Initialization
  		**/
  var explicitInitialization: js.UndefOr[Boolean] = js.undefined
  var footerRowHeight: js.UndefOr[Double] = js.undefined
  /**
  		* Force column sizes to fit into the container (preventing horizontal scrolling). Effectively sets column width to be 1/Number of Columns which on small containers may not be desirable
  		**/
  var forceFitColumns: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var forceSyncScrolling: js.UndefOr[Boolean] = js.undefined
  /**
  		* A factory object responsible to creating a formatter for a given cell. Must implement getFormatter(column).
  		**/
  var formatterFactory: js.UndefOr[FormatterFactory[T]] = js.undefined
  var frozenBottom: js.UndefOr[Boolean] = js.undefined
  var frozenColumn: js.UndefOr[Double] = js.undefined
  var frozenRow: js.UndefOr[Double] = js.undefined
  /**
  		* Will expand the table row divs to the full width of the container, table cell divs will remain aligned to the left
  		**/
  var fullWidthRows: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var headerRowHeight: js.UndefOr[Double] = js.undefined
  /**
  		*
  		**/
  var leaveSpaceForNewRows: js.UndefOr[Boolean] = js.undefined
  var minRowBuffer: js.UndefOr[Double] = js.undefined
  /**
  		* @see Example: Multi-Column Sort
  		**/
  var multiColumnSort: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var multiSelect: js.UndefOr[Boolean] = js.undefined
  var numberedMultiColumnSort: js.UndefOr[Boolean] = js.undefined
  var preHeaderPanelHeight: js.UndefOr[Double] = js.undefined
  var preserveCopiedSelectionOnPaste: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var rowHeight: js.UndefOr[Double] = js.undefined
  /**
  		*
  		**/
  var selectedCellCssClass: js.UndefOr[String] = js.undefined
  var showCellSelection: js.UndefOr[Boolean] = js.undefined
  var showFooterRow: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var showHeaderRow: js.UndefOr[Boolean] = js.undefined
  var showPreHeaderPanel: js.UndefOr[Boolean] = js.undefined
  var showTopPanel: js.UndefOr[Boolean] = js.undefined
  var sortColNumberInSeparateSpan: js.UndefOr[Boolean] = js.undefined
  var suppressActiveCellChangeOnEdit: js.UndefOr[Boolean] = js.undefined
  /**
  		* If true, the column being resized will change its width as the mouse is dragging the resize handle. If false, the column will resize after mouse drag ends.
  		**/
  var syncColumnCellResize: js.UndefOr[Boolean] = js.undefined
  /**
  		*
  		**/
  var topPanelHeight: js.UndefOr[Double] = js.undefined
  var tristateMultiColumnSort: js.UndefOr[Boolean] = js.undefined
  var viewportClass: js.UndefOr[String] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply[T /* <: SlickData */](
    addNewRowCssClass: String = null,
    alwaysAllowHorizontalScroll: js.UndefOr[Boolean] = js.undefined,
    alwaysShowVerticalScroll: js.UndefOr[Boolean] = js.undefined,
    asyncEditorLoadDelay: Int | Double = null,
    asyncEditorLoading: js.UndefOr[Boolean] = js.undefined,
    asyncPostRenderCleanupDelay: Int | Double = null,
    asyncPostRenderDelay: Int | Double = null,
    autoEdit: js.UndefOr[Boolean] = js.undefined,
    autoHeight: js.UndefOr[Boolean] = js.undefined,
    cellFlashingCssClass: String = null,
    cellHighlightCssClass: String = null,
    createFooterRow: js.UndefOr[Boolean] = js.undefined,
    createPreHeaderPanel: js.UndefOr[Boolean] = js.undefined,
    dataItemColumnValueExtractor: (/* item */ js.Any, /* columnDef */ js.Any) => CallbackTo[js.Any] = null,
    defaultColumnWidth: Int | Double = null,
    defaultFormatter: (/* row */ Double, /* cell */ Double, /* value */ js.Any, /* columnDef */ Column[T], /* dataContext */ SlickData) => CallbackTo[String] = null,
    doPaging: js.UndefOr[Boolean] = js.undefined,
    editCommandHandler: js.Any = null,
    editable: js.UndefOr[Boolean] = js.undefined,
    editorCellNavOnLRKeys: js.UndefOr[Boolean] = js.undefined,
    editorFactory: EditorFactory = null,
    editorLock: EditorLock[T] = null,
    emulatePagingWhenScrolling: js.UndefOr[Boolean] = js.undefined,
    enableAddRow: js.UndefOr[Boolean] = js.undefined,
    enableAsyncPostRender: js.UndefOr[Boolean] = js.undefined,
    enableAsyncPostRenderCleanup: js.UndefOr[Boolean] = js.undefined,
    enableCellNavigation: js.UndefOr[Boolean] = js.undefined,
    enableCellRangeSelection: js.Any = null,
    enableColumnReorder: js.UndefOr[Boolean] = js.undefined,
    enableRowReordering: js.Any = null,
    enableTextSelectionOnCells: js.UndefOr[Boolean] = js.undefined,
    explicitInitialization: js.UndefOr[Boolean] = js.undefined,
    footerRowHeight: Int | Double = null,
    forceFitColumns: js.UndefOr[Boolean] = js.undefined,
    forceSyncScrolling: js.UndefOr[Boolean] = js.undefined,
    formatterFactory: FormatterFactory[T] = null,
    frozenBottom: js.UndefOr[Boolean] = js.undefined,
    frozenColumn: Int | Double = null,
    frozenRow: Int | Double = null,
    fullWidthRows: js.UndefOr[Boolean] = js.undefined,
    headerRowHeight: Int | Double = null,
    leaveSpaceForNewRows: js.UndefOr[Boolean] = js.undefined,
    minRowBuffer: Int | Double = null,
    multiColumnSort: js.UndefOr[Boolean] = js.undefined,
    multiSelect: js.UndefOr[Boolean] = js.undefined,
    numberedMultiColumnSort: js.UndefOr[Boolean] = js.undefined,
    preHeaderPanelHeight: Int | Double = null,
    preserveCopiedSelectionOnPaste: js.UndefOr[Boolean] = js.undefined,
    rowHeight: Int | Double = null,
    selectedCellCssClass: String = null,
    showCellSelection: js.UndefOr[Boolean] = js.undefined,
    showFooterRow: js.UndefOr[Boolean] = js.undefined,
    showHeaderRow: js.UndefOr[Boolean] = js.undefined,
    showPreHeaderPanel: js.UndefOr[Boolean] = js.undefined,
    showTopPanel: js.UndefOr[Boolean] = js.undefined,
    sortColNumberInSeparateSpan: js.UndefOr[Boolean] = js.undefined,
    suppressActiveCellChangeOnEdit: js.UndefOr[Boolean] = js.undefined,
    syncColumnCellResize: js.UndefOr[Boolean] = js.undefined,
    topPanelHeight: Int | Double = null,
    tristateMultiColumnSort: js.UndefOr[Boolean] = js.undefined,
    viewportClass: String = null
  ): GridOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (addNewRowCssClass != null) __obj.updateDynamic("addNewRowCssClass")(addNewRowCssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysAllowHorizontalScroll)) __obj.updateDynamic("alwaysAllowHorizontalScroll")(alwaysAllowHorizontalScroll.asInstanceOf[js.Any])
    if (!js.isUndefined(alwaysShowVerticalScroll)) __obj.updateDynamic("alwaysShowVerticalScroll")(alwaysShowVerticalScroll.asInstanceOf[js.Any])
    if (asyncEditorLoadDelay != null) __obj.updateDynamic("asyncEditorLoadDelay")(asyncEditorLoadDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncEditorLoading)) __obj.updateDynamic("asyncEditorLoading")(asyncEditorLoading.asInstanceOf[js.Any])
    if (asyncPostRenderCleanupDelay != null) __obj.updateDynamic("asyncPostRenderCleanupDelay")(asyncPostRenderCleanupDelay.asInstanceOf[js.Any])
    if (asyncPostRenderDelay != null) __obj.updateDynamic("asyncPostRenderDelay")(asyncPostRenderDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEdit)) __obj.updateDynamic("autoEdit")(autoEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHeight)) __obj.updateDynamic("autoHeight")(autoHeight.asInstanceOf[js.Any])
    if (cellFlashingCssClass != null) __obj.updateDynamic("cellFlashingCssClass")(cellFlashingCssClass.asInstanceOf[js.Any])
    if (cellHighlightCssClass != null) __obj.updateDynamic("cellHighlightCssClass")(cellHighlightCssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(createFooterRow)) __obj.updateDynamic("createFooterRow")(createFooterRow.asInstanceOf[js.Any])
    if (!js.isUndefined(createPreHeaderPanel)) __obj.updateDynamic("createPreHeaderPanel")(createPreHeaderPanel.asInstanceOf[js.Any])
    if (dataItemColumnValueExtractor != null) __obj.updateDynamic("dataItemColumnValueExtractor")(js.Any.fromFunction2((t0: /* item */ js.Any, t1: /* columnDef */ js.Any) => dataItemColumnValueExtractor(t0, t1).runNow()))
    if (defaultColumnWidth != null) __obj.updateDynamic("defaultColumnWidth")(defaultColumnWidth.asInstanceOf[js.Any])
    if (defaultFormatter != null) __obj.updateDynamic("defaultFormatter")(js.Any.fromFunction5((t0: /* row */ scala.Double, t1: /* cell */ scala.Double, t2: /* value */ js.Any, t3: /* columnDef */ typingsJapgolly.slickgrid.Slick.Column[T], t4: /* dataContext */ typingsJapgolly.slickgrid.Slick.SlickData) => defaultFormatter(t0, t1, t2, t3, t4).runNow()))
    if (!js.isUndefined(doPaging)) __obj.updateDynamic("doPaging")(doPaging.asInstanceOf[js.Any])
    if (editCommandHandler != null) __obj.updateDynamic("editCommandHandler")(editCommandHandler.asInstanceOf[js.Any])
    if (!js.isUndefined(editable)) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (!js.isUndefined(editorCellNavOnLRKeys)) __obj.updateDynamic("editorCellNavOnLRKeys")(editorCellNavOnLRKeys.asInstanceOf[js.Any])
    if (editorFactory != null) __obj.updateDynamic("editorFactory")(editorFactory.asInstanceOf[js.Any])
    if (editorLock != null) __obj.updateDynamic("editorLock")(editorLock.asInstanceOf[js.Any])
    if (!js.isUndefined(emulatePagingWhenScrolling)) __obj.updateDynamic("emulatePagingWhenScrolling")(emulatePagingWhenScrolling.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAddRow)) __obj.updateDynamic("enableAddRow")(enableAddRow.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAsyncPostRender)) __obj.updateDynamic("enableAsyncPostRender")(enableAsyncPostRender.asInstanceOf[js.Any])
    if (!js.isUndefined(enableAsyncPostRenderCleanup)) __obj.updateDynamic("enableAsyncPostRenderCleanup")(enableAsyncPostRenderCleanup.asInstanceOf[js.Any])
    if (!js.isUndefined(enableCellNavigation)) __obj.updateDynamic("enableCellNavigation")(enableCellNavigation.asInstanceOf[js.Any])
    if (enableCellRangeSelection != null) __obj.updateDynamic("enableCellRangeSelection")(enableCellRangeSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(enableColumnReorder)) __obj.updateDynamic("enableColumnReorder")(enableColumnReorder.asInstanceOf[js.Any])
    if (enableRowReordering != null) __obj.updateDynamic("enableRowReordering")(enableRowReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTextSelectionOnCells)) __obj.updateDynamic("enableTextSelectionOnCells")(enableTextSelectionOnCells.asInstanceOf[js.Any])
    if (!js.isUndefined(explicitInitialization)) __obj.updateDynamic("explicitInitialization")(explicitInitialization.asInstanceOf[js.Any])
    if (footerRowHeight != null) __obj.updateDynamic("footerRowHeight")(footerRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(forceFitColumns)) __obj.updateDynamic("forceFitColumns")(forceFitColumns.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSyncScrolling)) __obj.updateDynamic("forceSyncScrolling")(forceSyncScrolling.asInstanceOf[js.Any])
    if (formatterFactory != null) __obj.updateDynamic("formatterFactory")(formatterFactory.asInstanceOf[js.Any])
    if (!js.isUndefined(frozenBottom)) __obj.updateDynamic("frozenBottom")(frozenBottom.asInstanceOf[js.Any])
    if (frozenColumn != null) __obj.updateDynamic("frozenColumn")(frozenColumn.asInstanceOf[js.Any])
    if (frozenRow != null) __obj.updateDynamic("frozenRow")(frozenRow.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidthRows)) __obj.updateDynamic("fullWidthRows")(fullWidthRows.asInstanceOf[js.Any])
    if (headerRowHeight != null) __obj.updateDynamic("headerRowHeight")(headerRowHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(leaveSpaceForNewRows)) __obj.updateDynamic("leaveSpaceForNewRows")(leaveSpaceForNewRows.asInstanceOf[js.Any])
    if (minRowBuffer != null) __obj.updateDynamic("minRowBuffer")(minRowBuffer.asInstanceOf[js.Any])
    if (!js.isUndefined(multiColumnSort)) __obj.updateDynamic("multiColumnSort")(multiColumnSort.asInstanceOf[js.Any])
    if (!js.isUndefined(multiSelect)) __obj.updateDynamic("multiSelect")(multiSelect.asInstanceOf[js.Any])
    if (!js.isUndefined(numberedMultiColumnSort)) __obj.updateDynamic("numberedMultiColumnSort")(numberedMultiColumnSort.asInstanceOf[js.Any])
    if (preHeaderPanelHeight != null) __obj.updateDynamic("preHeaderPanelHeight")(preHeaderPanelHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveCopiedSelectionOnPaste)) __obj.updateDynamic("preserveCopiedSelectionOnPaste")(preserveCopiedSelectionOnPaste.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (selectedCellCssClass != null) __obj.updateDynamic("selectedCellCssClass")(selectedCellCssClass.asInstanceOf[js.Any])
    if (!js.isUndefined(showCellSelection)) __obj.updateDynamic("showCellSelection")(showCellSelection.asInstanceOf[js.Any])
    if (!js.isUndefined(showFooterRow)) __obj.updateDynamic("showFooterRow")(showFooterRow.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderRow)) __obj.updateDynamic("showHeaderRow")(showHeaderRow.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreHeaderPanel)) __obj.updateDynamic("showPreHeaderPanel")(showPreHeaderPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(showTopPanel)) __obj.updateDynamic("showTopPanel")(showTopPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(sortColNumberInSeparateSpan)) __obj.updateDynamic("sortColNumberInSeparateSpan")(sortColNumberInSeparateSpan.asInstanceOf[js.Any])
    if (!js.isUndefined(suppressActiveCellChangeOnEdit)) __obj.updateDynamic("suppressActiveCellChangeOnEdit")(suppressActiveCellChangeOnEdit.asInstanceOf[js.Any])
    if (!js.isUndefined(syncColumnCellResize)) __obj.updateDynamic("syncColumnCellResize")(syncColumnCellResize.asInstanceOf[js.Any])
    if (topPanelHeight != null) __obj.updateDynamic("topPanelHeight")(topPanelHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(tristateMultiColumnSort)) __obj.updateDynamic("tristateMultiColumnSort")(tristateMultiColumnSort.asInstanceOf[js.Any])
    if (viewportClass != null) __obj.updateDynamic("viewportClass")(viewportClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions[T]]
  }
}

