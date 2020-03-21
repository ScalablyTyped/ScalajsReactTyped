package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadsheetOptions extends js.Object {
  var activeSheet: js.UndefOr[String] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeEvent, Unit]] = js.undefined
  var changeFormat: js.UndefOr[js.Function1[/* e */ SpreadsheetChangeFormatEvent, Unit]] = js.undefined
  var changing: js.UndefOr[js.Function1[/* e */ SpreadsheetChangingEvent, Unit]] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var columns: js.UndefOr[Double] = js.undefined
  var copy: js.UndefOr[js.Function1[/* e */ SpreadsheetCopyEvent, Unit]] = js.undefined
  var cut: js.UndefOr[js.Function1[/* e */ SpreadsheetCutEvent, Unit]] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SpreadsheetDataBoundEvent, Unit]] = js.undefined
  var defaultCellStyle: js.UndefOr[SpreadsheetDefaultCellStyle] = js.undefined
  var deleteColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteColumnEvent, Unit]] = js.undefined
  var deleteRow: js.UndefOr[js.Function1[/* e */ SpreadsheetDeleteRowEvent, Unit]] = js.undefined
  var excel: js.UndefOr[SpreadsheetExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelExportEvent, Unit]] = js.undefined
  var excelImport: js.UndefOr[js.Function1[/* e */ SpreadsheetExcelImportEvent, Unit]] = js.undefined
  var headerHeight: js.UndefOr[Double] = js.undefined
  var headerWidth: js.UndefOr[Double] = js.undefined
  var hideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetHideColumnEvent, Unit]] = js.undefined
  var hideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetHideRowEvent, Unit]] = js.undefined
  var insertColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertColumnEvent, Unit]] = js.undefined
  var insertRow: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertRowEvent, Unit]] = js.undefined
  var insertSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetInsertSheetEvent, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var paste: js.UndefOr[js.Function1[/* e */ SpreadsheetPasteEvent, Unit]] = js.undefined
  var pdf: js.UndefOr[SpreadsheetPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ SpreadsheetPdfExportEvent, Unit]] = js.undefined
  var removeSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRemoveSheetEvent, Unit]] = js.undefined
  var renameSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetRenameSheetEvent, Unit]] = js.undefined
  var render: js.UndefOr[js.Function1[/* e */ SpreadsheetRenderEvent, Unit]] = js.undefined
  var rowHeight: js.UndefOr[Double] = js.undefined
  var rows: js.UndefOr[Double] = js.undefined
  var select: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectEvent, Unit]] = js.undefined
  var selectSheet: js.UndefOr[js.Function1[/* e */ SpreadsheetSelectSheetEvent, Unit]] = js.undefined
  var sheets: js.UndefOr[js.Array[SpreadsheetSheet]] = js.undefined
  var sheetsbar: js.UndefOr[Boolean] = js.undefined
  var toolbar: js.UndefOr[Boolean | SpreadsheetToolbar] = js.undefined
  var unhideColumn: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideColumnEvent, Unit]] = js.undefined
  var unhideRow: js.UndefOr[js.Function1[/* e */ SpreadsheetUnhideRowEvent, Unit]] = js.undefined
}

object SpreadsheetOptions {
  @scala.inline
  def apply(
    activeSheet: String = null,
    change: /* e */ SpreadsheetChangeEvent => Callback = null,
    changeFormat: /* e */ SpreadsheetChangeFormatEvent => Callback = null,
    changing: /* e */ SpreadsheetChangingEvent => Callback = null,
    columnWidth: Int | Double = null,
    columns: Int | Double = null,
    copy: /* e */ SpreadsheetCopyEvent => Callback = null,
    cut: /* e */ SpreadsheetCutEvent => Callback = null,
    dataBinding: /* e */ SpreadsheetDataBindingEvent => Callback = null,
    dataBound: /* e */ SpreadsheetDataBoundEvent => Callback = null,
    defaultCellStyle: SpreadsheetDefaultCellStyle = null,
    deleteColumn: /* e */ SpreadsheetDeleteColumnEvent => Callback = null,
    deleteRow: /* e */ SpreadsheetDeleteRowEvent => Callback = null,
    excel: SpreadsheetExcel = null,
    excelExport: /* e */ SpreadsheetExcelExportEvent => Callback = null,
    excelImport: /* e */ SpreadsheetExcelImportEvent => Callback = null,
    headerHeight: Int | Double = null,
    headerWidth: Int | Double = null,
    hideColumn: /* e */ SpreadsheetHideColumnEvent => Callback = null,
    hideRow: /* e */ SpreadsheetHideRowEvent => Callback = null,
    insertColumn: /* e */ SpreadsheetInsertColumnEvent => Callback = null,
    insertRow: /* e */ SpreadsheetInsertRowEvent => Callback = null,
    insertSheet: /* e */ SpreadsheetInsertSheetEvent => Callback = null,
    name: String = null,
    paste: /* e */ SpreadsheetPasteEvent => Callback = null,
    pdf: SpreadsheetPdf = null,
    pdfExport: /* e */ SpreadsheetPdfExportEvent => Callback = null,
    removeSheet: /* e */ SpreadsheetRemoveSheetEvent => Callback = null,
    renameSheet: /* e */ SpreadsheetRenameSheetEvent => Callback = null,
    render: /* e */ SpreadsheetRenderEvent => Callback = null,
    rowHeight: Int | Double = null,
    rows: Int | Double = null,
    select: /* e */ SpreadsheetSelectEvent => Callback = null,
    selectSheet: /* e */ SpreadsheetSelectSheetEvent => Callback = null,
    sheets: js.Array[SpreadsheetSheet] = null,
    sheetsbar: js.UndefOr[Boolean] = js.undefined,
    toolbar: Boolean | SpreadsheetToolbar = null,
    unhideColumn: /* e */ SpreadsheetUnhideColumnEvent => Callback = null,
    unhideRow: /* e */ SpreadsheetUnhideRowEvent => Callback = null
  ): SpreadsheetOptions = {
    val __obj = js.Dynamic.literal()
    if (activeSheet != null) __obj.updateDynamic("activeSheet")(activeSheet.asInstanceOf[js.Any])
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetChangeEvent) => change(t0).runNow()))
    if (changeFormat != null) __obj.updateDynamic("changeFormat")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetChangeFormatEvent) => changeFormat(t0).runNow()))
    if (changing != null) __obj.updateDynamic("changing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetChangingEvent) => changing(t0).runNow()))
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (copy != null) __obj.updateDynamic("copy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetCopyEvent) => copy(t0).runNow()))
    if (cut != null) __obj.updateDynamic("cut")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetCutEvent) => cut(t0).runNow()))
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetDataBindingEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetDataBoundEvent) => dataBound(t0).runNow()))
    if (defaultCellStyle != null) __obj.updateDynamic("defaultCellStyle")(defaultCellStyle.asInstanceOf[js.Any])
    if (deleteColumn != null) __obj.updateDynamic("deleteColumn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetDeleteColumnEvent) => deleteColumn(t0).runNow()))
    if (deleteRow != null) __obj.updateDynamic("deleteRow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetDeleteRowEvent) => deleteRow(t0).runNow()))
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetExcelExportEvent) => excelExport(t0).runNow()))
    if (excelImport != null) __obj.updateDynamic("excelImport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetExcelImportEvent) => excelImport(t0).runNow()))
    if (headerHeight != null) __obj.updateDynamic("headerHeight")(headerHeight.asInstanceOf[js.Any])
    if (headerWidth != null) __obj.updateDynamic("headerWidth")(headerWidth.asInstanceOf[js.Any])
    if (hideColumn != null) __obj.updateDynamic("hideColumn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetHideColumnEvent) => hideColumn(t0).runNow()))
    if (hideRow != null) __obj.updateDynamic("hideRow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetHideRowEvent) => hideRow(t0).runNow()))
    if (insertColumn != null) __obj.updateDynamic("insertColumn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetInsertColumnEvent) => insertColumn(t0).runNow()))
    if (insertRow != null) __obj.updateDynamic("insertRow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetInsertRowEvent) => insertRow(t0).runNow()))
    if (insertSheet != null) __obj.updateDynamic("insertSheet")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetInsertSheetEvent) => insertSheet(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (paste != null) __obj.updateDynamic("paste")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetPasteEvent) => paste(t0).runNow()))
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetPdfExportEvent) => pdfExport(t0).runNow()))
    if (removeSheet != null) __obj.updateDynamic("removeSheet")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetRemoveSheetEvent) => removeSheet(t0).runNow()))
    if (renameSheet != null) __obj.updateDynamic("renameSheet")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetRenameSheetEvent) => renameSheet(t0).runNow()))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetRenderEvent) => render(t0).runNow()))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rows != null) __obj.updateDynamic("rows")(rows.asInstanceOf[js.Any])
    if (select != null) __obj.updateDynamic("select")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetSelectEvent) => select(t0).runNow()))
    if (selectSheet != null) __obj.updateDynamic("selectSheet")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetSelectSheetEvent) => selectSheet(t0).runNow()))
    if (sheets != null) __obj.updateDynamic("sheets")(sheets.asInstanceOf[js.Any])
    if (!js.isUndefined(sheetsbar)) __obj.updateDynamic("sheetsbar")(sheetsbar.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (unhideColumn != null) __obj.updateDynamic("unhideColumn")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetUnhideColumnEvent) => unhideColumn(t0).runNow()))
    if (unhideRow != null) __obj.updateDynamic("unhideRow")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SpreadsheetUnhideRowEvent) => unhideRow(t0).runNow()))
    __obj.asInstanceOf[SpreadsheetOptions]
  }
}

