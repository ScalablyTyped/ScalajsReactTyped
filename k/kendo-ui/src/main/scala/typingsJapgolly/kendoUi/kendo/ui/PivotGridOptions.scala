package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.PivotDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotGridOptions extends js.Object {
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, Unit]] = js.undefined
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var columnWidth: js.UndefOr[Double] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, Unit]] = js.undefined
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.undefined
  var dataSource: js.UndefOr[js.Any | PivotDataSource] = js.undefined
  var excel: js.UndefOr[PivotGridExcel] = js.undefined
  var excelExport: js.UndefOr[js.Function1[/* e */ PivotGridExcelExportEvent, Unit]] = js.undefined
  var expandMember: js.UndefOr[js.Function1[/* e */ PivotGridExpandMemberEvent, Unit]] = js.undefined
  var filterable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var kpiStatusTemplate: js.UndefOr[String | js.Function] = js.undefined
  var kpiTrendTemplate: js.UndefOr[String | js.Function] = js.undefined
  var messages: js.UndefOr[PivotGridMessages] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var pdf: js.UndefOr[PivotGridPdf] = js.undefined
  var pdfExport: js.UndefOr[js.Function1[/* e */ PivotGridPdfExportEvent, Unit]] = js.undefined
  var reorderable: js.UndefOr[Boolean] = js.undefined
  var rowHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  var sortable: js.UndefOr[Boolean | PivotGridSortable] = js.undefined
}

object PivotGridOptions {
  @scala.inline
  def apply(
    autoBind: js.UndefOr[Boolean] = js.undefined,
    collapseMember: /* e */ PivotGridCollapseMemberEvent => Callback = null,
    columnHeaderTemplate: String | js.Function = null,
    columnWidth: Int | Double = null,
    dataBinding: /* e */ PivotGridDataBindingEvent => Callback = null,
    dataBound: /* e */ PivotGridDataBoundEvent => Callback = null,
    dataCellTemplate: String | js.Function = null,
    dataSource: js.Any | PivotDataSource = null,
    excel: PivotGridExcel = null,
    excelExport: /* e */ PivotGridExcelExportEvent => Callback = null,
    expandMember: /* e */ PivotGridExpandMemberEvent => Callback = null,
    filterable: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    kpiStatusTemplate: String | js.Function = null,
    kpiTrendTemplate: String | js.Function = null,
    messages: PivotGridMessages = null,
    name: String = null,
    pdf: PivotGridPdf = null,
    pdfExport: /* e */ PivotGridPdfExportEvent => Callback = null,
    reorderable: js.UndefOr[Boolean] = js.undefined,
    rowHeaderTemplate: String | js.Function = null,
    sortable: Boolean | PivotGridSortable = null
  ): PivotGridOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (collapseMember != null) __obj.updateDynamic("collapseMember")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridCollapseMemberEvent) => collapseMember(t0).runNow()))
    if (columnHeaderTemplate != null) __obj.updateDynamic("columnHeaderTemplate")(columnHeaderTemplate.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridDataBindingEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridDataBoundEvent) => dataBound(t0).runNow()))
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (excel != null) __obj.updateDynamic("excel")(excel.asInstanceOf[js.Any])
    if (excelExport != null) __obj.updateDynamic("excelExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridExcelExportEvent) => excelExport(t0).runNow()))
    if (expandMember != null) __obj.updateDynamic("expandMember")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridExpandMemberEvent) => expandMember(t0).runNow()))
    if (!js.isUndefined(filterable)) __obj.updateDynamic("filterable")(filterable.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (kpiStatusTemplate != null) __obj.updateDynamic("kpiStatusTemplate")(kpiStatusTemplate.asInstanceOf[js.Any])
    if (kpiTrendTemplate != null) __obj.updateDynamic("kpiTrendTemplate")(kpiTrendTemplate.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.PivotGridPdfExportEvent) => pdfExport(t0).runNow()))
    if (!js.isUndefined(reorderable)) __obj.updateDynamic("reorderable")(reorderable.asInstanceOf[js.Any])
    if (rowHeaderTemplate != null) __obj.updateDynamic("rowHeaderTemplate")(rowHeaderTemplate.asInstanceOf[js.Any])
    if (sortable != null) __obj.updateDynamic("sortable")(sortable.asInstanceOf[js.Any])
    __obj.asInstanceOf[PivotGridOptions]
  }
}

