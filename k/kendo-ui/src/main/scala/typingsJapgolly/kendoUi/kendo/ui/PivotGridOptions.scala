package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.PivotDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotGridOptions extends StObject {
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var collapseMember: js.UndefOr[js.Function1[/* e */ PivotGridCollapseMemberEvent, Unit]] = js.undefined
  
  var columnHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var columnWidth: js.UndefOr[Double] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ PivotGridDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ PivotGridDataBoundEvent, Unit]] = js.undefined
  
  var dataCellTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var dataSource: js.UndefOr[Any | PivotDataSource] = js.undefined
  
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
  
  inline def apply(): PivotGridOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PivotGridOptions]
  }
  
  extension [Self <: PivotGridOptions](x: Self) {
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCollapseMember(value: /* e */ PivotGridCollapseMemberEvent => Callback): Self = StObject.set(x, "collapseMember", js.Any.fromFunction1((t0: /* e */ PivotGridCollapseMemberEvent) => value(t0).runNow()))
    
    inline def setCollapseMemberUndefined: Self = StObject.set(x, "collapseMember", js.undefined)
    
    inline def setColumnHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "columnHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setColumnHeaderTemplateUndefined: Self = StObject.set(x, "columnHeaderTemplate", js.undefined)
    
    inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
    
    inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
    
    inline def setDataBinding(value: /* e */ PivotGridDataBindingEvent => Callback): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1((t0: /* e */ PivotGridDataBindingEvent) => value(t0).runNow()))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ PivotGridDataBoundEvent => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction1((t0: /* e */ PivotGridDataBoundEvent) => value(t0).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataCellTemplate(value: String | js.Function): Self = StObject.set(x, "dataCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setDataCellTemplateUndefined: Self = StObject.set(x, "dataCellTemplate", js.undefined)
    
    inline def setDataSource(value: Any | PivotDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setExcel(value: PivotGridExcel): Self = StObject.set(x, "excel", value.asInstanceOf[js.Any])
    
    inline def setExcelExport(value: /* e */ PivotGridExcelExportEvent => Callback): Self = StObject.set(x, "excelExport", js.Any.fromFunction1((t0: /* e */ PivotGridExcelExportEvent) => value(t0).runNow()))
    
    inline def setExcelExportUndefined: Self = StObject.set(x, "excelExport", js.undefined)
    
    inline def setExcelUndefined: Self = StObject.set(x, "excel", js.undefined)
    
    inline def setExpandMember(value: /* e */ PivotGridExpandMemberEvent => Callback): Self = StObject.set(x, "expandMember", js.Any.fromFunction1((t0: /* e */ PivotGridExpandMemberEvent) => value(t0).runNow()))
    
    inline def setExpandMemberUndefined: Self = StObject.set(x, "expandMember", js.undefined)
    
    inline def setFilterable(value: Boolean): Self = StObject.set(x, "filterable", value.asInstanceOf[js.Any])
    
    inline def setFilterableUndefined: Self = StObject.set(x, "filterable", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKpiStatusTemplate(value: String | js.Function): Self = StObject.set(x, "kpiStatusTemplate", value.asInstanceOf[js.Any])
    
    inline def setKpiStatusTemplateUndefined: Self = StObject.set(x, "kpiStatusTemplate", js.undefined)
    
    inline def setKpiTrendTemplate(value: String | js.Function): Self = StObject.set(x, "kpiTrendTemplate", value.asInstanceOf[js.Any])
    
    inline def setKpiTrendTemplateUndefined: Self = StObject.set(x, "kpiTrendTemplate", js.undefined)
    
    inline def setMessages(value: PivotGridMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPdf(value: PivotGridPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ PivotGridPdfExportEvent => Callback): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1((t0: /* e */ PivotGridPdfExportEvent) => value(t0).runNow()))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setReorderable(value: Boolean): Self = StObject.set(x, "reorderable", value.asInstanceOf[js.Any])
    
    inline def setReorderableUndefined: Self = StObject.set(x, "reorderable", js.undefined)
    
    inline def setRowHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "rowHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setRowHeaderTemplateUndefined: Self = StObject.set(x, "rowHeaderTemplate", js.undefined)
    
    inline def setSortable(value: Boolean | PivotGridSortable): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
    
    inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
  }
}
