package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.DataSource
import typingsJapgolly.kendoUi.kendoUiStrings.`inline`
import typingsJapgolly.kendoUi.kendoUiStrings.incell
import typingsJapgolly.kendoUi.kendoUiStrings.popup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridOptions extends js.Object {
  var allowCopy: js.UndefOr[Boolean | GridAllowCopy] = js.undefined
  var altRowTemplate: js.UndefOr[String | js.Function] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var beforeEdit: js.UndefOr[js.Function1[/* e */ GridBeforeEditEvent, Unit]] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ GridCancelEvent, Unit]] = js.undefined
  var cellClose: js.UndefOr[js.Function1[/* e */ GridCellCloseEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ GridChangeEvent, Unit]] = js.undefined
  var columnHide: js.UndefOr[js.Function1[/* e */ GridColumnHideEvent, Unit]] = js.undefined
  var columnLock: js.UndefOr[js.Function1[/* e */ GridColumnLockEvent, Unit]] = js.undefined
  var columnMenu: js.UndefOr[Boolean | GridColumnMenu] = js.undefined
  var columnMenuInit: js.UndefOr[js.Function1[/* e */ GridColumnMenuInitEvent, Unit]] = js.undefined
  var columnMenuOpen: js.UndefOr[js.Function1[/* e */ GridColumnMenuOpenEvent, Unit]] = js.undefined
  var columnReorder: js.UndefOr[js.Function1[/* e */ GridColumnReorderEvent, Unit]] = js.undefined
  var columnResize: js.UndefOr[js.Function1[/* e */ GridColumnResizeEvent, Unit]] = js.undefined
  var columnResizeHandleWidth: js.UndefOr[Double] = js.undefined
  var columnShow: js.UndefOr[js.Function1[/* e */ GridColumnShowEvent, Unit]] = js.undefined
  var columnUnlock: js.UndefOr[js.Function1[/* e */ GridColumnUnlockEvent, Unit]] = js.undefined
  var columns: js.UndefOr[js.Array[GridColumn]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ GridDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ GridDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | DataSource] = js.undefined
  var detailCollapse: js.UndefOr[js.Function1[/* e */ GridDetailCollapseEvent, Unit]] = js.undefined
  var detailExpand: js.UndefOr[js.Function1[/* e */ GridDetailExpandEvent, Unit]] = js.undefined
  var detailInit: js.UndefOr[js.Function1[/* e */ GridDetailInitEvent, Unit]] = js.undefined
  var detailTemplate: js.UndefOr[String | js.Function] = js.undefined
  var edit: js.UndefOr[js.Function1[/* e */ GridEditEvent, Unit]] = js.undefined
  var editable: js.UndefOr[Boolean | `inline` | incell | popup | GridEditable] = js.undefined
  var excel: js.UndefOr[GridExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ GridExcelExportEvent, Unit]] = js.undefined
  var filter: js.UndefOr[js.Function1[/* e */ GridFilterEvent, Unit]] = js.undefined
  var filterMenuInit: js.UndefOr[js.Function1[/* e */ GridFilterMenuInitEvent, Unit]] = js.undefined
  var filterMenuOpen: js.UndefOr[js.Function1[/* e */ GridFilterMenuOpenEvent, Unit]] = js.undefined
  var filterable: js.UndefOr[Boolean | GridFilterable] = js.undefined
  var group: js.UndefOr[js.Function1[/* e */ GridGroupEvent, Unit]] = js.undefined
  var groupCollapse: js.UndefOr[js.Function1[/* e */ GridGroupCollapseEvent, Unit]] = js.undefined
  var groupExpand: js.UndefOr[js.Function1[/* e */ GridGroupExpandEvent, Unit]] = js.undefined
  var groupable: js.UndefOr[Boolean | GridGroupable] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var messages: js.UndefOr[GridMessages] = js.undefined
  var mobile: js.UndefOr[Boolean | String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var navigatable: js.UndefOr[Boolean] = js.undefined
  var navigate: js.UndefOr[js.Function1[/* e */ GridNavigateEvent, Unit]] = js.undefined
  var noRecords: js.UndefOr[Boolean | GridNoRecords] = js.undefined
  var page: js.UndefOr[js.Function1[/* e */ GridPageEvent, Unit]] = js.undefined
  var pageable: js.UndefOr[Boolean | GridPageable] = js.undefined
  var pdf: js.UndefOr[GridPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ GridPdfExportEvent, Unit]] = js.undefined
  var persistSelection: js.UndefOr[Boolean] = js.undefined
  var remove: js.UndefOr[js.Function1[/* e */ GridRemoveEvent, Unit]] = js.undefined
  var reorderable: js.UndefOr[Boolean] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var rowTemplate: js.UndefOr[String | js.Function] = js.undefined
  var save: js.UndefOr[js.Function1[/* e */ GridSaveEvent, Unit]] = js.undefined
  var saveChanges: js.UndefOr[js.Function1[/* e */ GridSaveChangesEvent, Unit]] = js.undefined
  var scrollable: js.UndefOr[Boolean | GridScrollable] = js.undefined
  var selectable: js.UndefOr[Boolean | String] = js.undefined
  var sort: js.UndefOr[js.Function1[/* e */ GridSortEvent, Unit]] = js.undefined
  var sortable: js.UndefOr[Boolean | GridSortable] = js.undefined
  var toolbar: js.UndefOr[String | js.Function | (js.Array[String | GridToolbarItem])] = js.undefined
}

object GridOptions {
  @scala.inline
  def apply(
    allowCopy: Boolean | GridAllowCopy = null,
    altRowTemplate: String | js.Function = null,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    beforeEdit: /* e */ GridBeforeEditEvent => Callback = null,
    cancel: /* e */ GridCancelEvent => Callback = null,
    cellClose: /* e */ GridCellCloseEvent => Callback = null,
    change: /* e */ GridChangeEvent => Callback = null,
    columnHide: /* e */ GridColumnHideEvent => Callback = null,
    columnLock: /* e */ GridColumnLockEvent => Callback = null,
    columnMenu: Boolean | GridColumnMenu = null,
    columnMenuInit: /* e */ GridColumnMenuInitEvent => Callback = null,
    columnMenuOpen: /* e */ GridColumnMenuOpenEvent => Callback = null,
    columnReorder: /* e */ GridColumnReorderEvent => Callback = null,
    columnResize: /* e */ GridColumnResizeEvent => Callback = null,
    columnResizeHandleWidth: Int | Double = null,
    columnShow: /* e */ GridColumnShowEvent => Callback = null,
    columnUnlock: /* e */ GridColumnUnlockEvent => Callback = null,
    columns: js.Array[GridColumn] = null,
    dataBinding: /* e */ GridDataBindingEvent => Callback = null,
    dataBound: /* e */ GridDataBoundEvent => Callback = null,
    dataSource: js.Any | DataSource = null,
    detailCollapse: /* e */ GridDetailCollapseEvent => Callback = null,
    detailExpand: /* e */ GridDetailExpandEvent => Callback = null,
    detailInit: /* e */ GridDetailInitEvent => Callback = null,
    detailTemplate: String | js.Function = null,
    edit: /* e */ GridEditEvent => Callback = null,
    editable: Boolean | `inline` | incell | popup | GridEditable = null,
    excel: GridExcel = null,
    excelExport: /* e */ GridExcelExportEvent => Callback = null,
    filter: /* e */ GridFilterEvent => Callback = null,
    filterMenuInit: /* e */ GridFilterMenuInitEvent => Callback = null,
    filterMenuOpen: /* e */ GridFilterMenuOpenEvent => Callback = null,
    filterable: Boolean | GridFilterable = null,
    group: /* e */ GridGroupEvent => Callback = null,
    groupCollapse: /* e */ GridGroupCollapseEvent => Callback = null,
    groupExpand: /* e */ GridGroupExpandEvent => Callback = null,
    groupable: Boolean | GridGroupable = null,
    height: Double | String = null,
    messages: GridMessages = null,
    mobile: Boolean | String = null,
    name: String = null,
    navigatable: js.UndefOr[Boolean] = js.undefined,
    navigate: /* e */ GridNavigateEvent => Callback = null,
    noRecords: Boolean | GridNoRecords = null,
    page: /* e */ GridPageEvent => Callback = null,
    pageable: Boolean | GridPageable = null,
    pdf: GridPdf = null,
    pdfExport: /* e */ GridPdfExportEvent => Callback = null,
    persistSelection: js.UndefOr[Boolean] = js.undefined,
    remove: /* e */ GridRemoveEvent => Callback = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    resizable: js.UndefOr[Boolean] = js.undefined,
    rowTemplate: String | js.Function = null,
    save: /* e */ GridSaveEvent => Callback = null,
    saveChanges: /* e */ GridSaveChangesEvent => Callback = null,
    scrollable: Boolean | GridScrollable = null,
    selectable: Boolean | String = null,
    sort: /* e */ GridSortEvent => Callback = null,
    sortable: Boolean | GridSortable = null,
    toolbar: String | js.Function | (js.Array[String | GridToolbarItem]) = null
  ): GridOptions = {
    val __obj = js.Dynamic.literal()
    if (allowCopy != null) __obj.updateDynamic("allowCopy")(allowCopy.asInstanceOf[js.Any])
    if (altRowTemplate != null) __obj.updateDynamic("altRowTemplate")(altRowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (beforeEdit != null) __obj.updateDynamic("beforeEdit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridBeforeEditEvent) => beforeEdit(t0).runNow()))
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridCancelEvent) => cancel(t0).runNow()))
    if (cellClose != null) __obj.updateDynamic("cellClose")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridCellCloseEvent) => cellClose(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridChangeEvent) => change(t0).runNow()))
    if (columnHide != null) __obj.updateDynamic("columnHide")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnHideEvent) => columnHide(t0).runNow()))
    if (columnLock != null) __obj.updateDynamic("columnLock")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnLockEvent) => columnLock(t0).runNow()))
    if (columnMenu != null) __obj.updateDynamic("columnMenu")(columnMenu.asInstanceOf[js.Any])
    if (columnMenuInit != null) __obj.updateDynamic("columnMenuInit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnMenuInitEvent) => columnMenuInit(t0).runNow()))
    if (columnMenuOpen != null) __obj.updateDynamic("columnMenuOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnMenuOpenEvent) => columnMenuOpen(t0).runNow()))
    if (columnReorder != null) __obj.updateDynamic("columnReorder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnReorderEvent) => columnReorder(t0).runNow()))
    if (columnResize != null) __obj.updateDynamic("columnResize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnResizeEvent) => columnResize(t0).runNow()))
    if (columnResizeHandleWidth != null) __obj.updateDynamic("columnResizeHandleWidth")(columnResizeHandleWidth.asInstanceOf[js.Any])
    if (columnShow != null) __obj.updateDynamic("columnShow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnShowEvent) => columnShow(t0).runNow()))
    if (columnUnlock != null) __obj.updateDynamic("columnUnlock")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridColumnUnlockEvent) => columnUnlock(t0).runNow()))
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridDataBindingEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridDataBoundEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (detailCollapse != null) __obj.updateDynamic("detailCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridDetailCollapseEvent) => detailCollapse(t0).runNow()))
    if (detailExpand != null) __obj.updateDynamic("detailExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridDetailExpandEvent) => detailExpand(t0).runNow()))
    if (detailInit != null) __obj.updateDynamic("detailInit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridDetailInitEvent) => detailInit(t0).runNow()))
    if (detailTemplate != null) __obj.updateDynamic("detailTemplate")(detailTemplate.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridEditEvent) => edit(t0).runNow()))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridExcelExportEvent) => excelExport(t0).runNow()))
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridFilterEvent) => filter(t0).runNow()))
    if (filterMenuInit != null) __obj.updateDynamic("filterMenuInit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridFilterMenuInitEvent) => filterMenuInit(t0).runNow()))
    if (filterMenuOpen != null) __obj.updateDynamic("filterMenuOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridFilterMenuOpenEvent) => filterMenuOpen(t0).runNow()))
    if (filterable != null) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridGroupEvent) => group(t0).runNow()))
    if (groupCollapse != null) __obj.updateDynamic("groupCollapse")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridGroupCollapseEvent) => groupCollapse(t0).runNow()))
    if (groupExpand != null) __obj.updateDynamic("groupExpand")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridGroupExpandEvent) => groupExpand(t0).runNow()))
    if (groupable != null) __obj.updateDynamic("groupable")(groupable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(navigatable)) __obj.updateDynamic("navigatable")(navigatable.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridNavigateEvent) => navigate(t0).runNow()))
    if (noRecords != null) __obj.updateDynamic("noRecords")(noRecords.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridPageEvent) => page(t0).runNow()))
    if (pageable != null) __obj.updateDynamic("pageable")(pageable.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridPdfExportEvent) => pdfExport(t0).runNow()))
    if (!js.isUndefined(persistSelection)) __obj.updateDynamic("persistSelection")(persistSelection.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridRemoveEvent) => remove(t0).runNow()))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable.asInstanceOf[js.Any])
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable.asInstanceOf[js.Any])
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridSaveEvent) => save(t0).runNow()))
    if (saveChanges != null) __obj.updateDynamic("saveChanges")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridSaveChangesEvent) => saveChanges(t0).runNow()))
    if (scrollable != null) __obj.updateDynamic("scrollable")(scrollable.asInstanceOf[js.Any])
    if (selectable != null) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (sort != null) __obj.updateDynamic("sort")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.GridSortEvent) => sort(t0).runNow()))
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridOptions]
  }
}

