package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.SchedulerDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchedulerOptions extends StObject {
  
  var add: js.UndefOr[js.Function1[/* e */ SchedulerAddEvent, Unit]] = js.undefined
  
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  
  var autoBind: js.UndefOr[Boolean] = js.undefined
  
  var cancel: js.UndefOr[js.Function1[/* e */ SchedulerCancelEvent, Unit]] = js.undefined
  
  var change: js.UndefOr[js.Function1[/* e */ SchedulerChangeEvent, Unit]] = js.undefined
  
  var currentTimeMarker: js.UndefOr[Boolean | SchedulerCurrentTimeMarker] = js.undefined
  
  var dataBinding: js.UndefOr[js.Function1[/* e */ SchedulerDataBindingEvent, Unit]] = js.undefined
  
  var dataBound: js.UndefOr[js.Function1[/* e */ SchedulerDataBoundEvent, Unit]] = js.undefined
  
  var dataSource: js.UndefOr[Any | SchedulerDataSource] = js.undefined
  
  var date: js.UndefOr[js.Date] = js.undefined
  
  var dateHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var edit: js.UndefOr[js.Function1[/* e */ SchedulerEditEvent, Unit]] = js.undefined
  
  var editable: js.UndefOr[Boolean | SchedulerEditable] = js.undefined
  
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  var eventTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var footer: js.UndefOr[Boolean | SchedulerFooter] = js.undefined
  
  var group: js.UndefOr[SchedulerGroup] = js.undefined
  
  var groupHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var height: js.UndefOr[Double | String] = js.undefined
  
  var majorTick: js.UndefOr[Double] = js.undefined
  
  var majorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var max: js.UndefOr[js.Date] = js.undefined
  
  var messages: js.UndefOr[SchedulerMessages] = js.undefined
  
  var min: js.UndefOr[js.Date] = js.undefined
  
  var minorTickCount: js.UndefOr[Double] = js.undefined
  
  var minorTimeHeaderTemplate: js.UndefOr[String | js.Function] = js.undefined
  
  var mobile: js.UndefOr[Boolean | String] = js.undefined
  
  var move: js.UndefOr[js.Function1[/* e */ SchedulerMoveEvent, Unit]] = js.undefined
  
  var moveEnd: js.UndefOr[js.Function1[/* e */ SchedulerMoveEndEvent, Unit]] = js.undefined
  
  var moveStart: js.UndefOr[js.Function1[/* e */ SchedulerMoveStartEvent, Unit]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var navigate: js.UndefOr[js.Function1[/* e */ SchedulerNavigateEvent, Unit]] = js.undefined
  
  var pdf: js.UndefOr[SchedulerPdf] = js.undefined
  
  var pdfExport: js.UndefOr[js.Function1[/* e */ SchedulerPdfExportEvent, Unit]] = js.undefined
  
  var remove: js.UndefOr[js.Function1[/* e */ SchedulerRemoveEvent, Unit]] = js.undefined
  
  var resize: js.UndefOr[js.Function1[/* e */ SchedulerResizeEvent, Unit]] = js.undefined
  
  var resizeEnd: js.UndefOr[js.Function1[/* e */ SchedulerResizeEndEvent, Unit]] = js.undefined
  
  var resizeStart: js.UndefOr[js.Function1[/* e */ SchedulerResizeStartEvent, Unit]] = js.undefined
  
  var resources: js.UndefOr[js.Array[SchedulerResource]] = js.undefined
  
  var save: js.UndefOr[js.Function1[/* e */ SchedulerSaveEvent, Unit]] = js.undefined
  
  var selectable: js.UndefOr[Boolean] = js.undefined
  
  var showWorkHours: js.UndefOr[Boolean] = js.undefined
  
  var snap: js.UndefOr[Boolean] = js.undefined
  
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  var timezone: js.UndefOr[String] = js.undefined
  
  var toolbar: js.UndefOr[js.Array[SchedulerToolbarItem]] = js.undefined
  
  var views: js.UndefOr[js.Array[SchedulerView]] = js.undefined
  
  var width: js.UndefOr[Double | String] = js.undefined
  
  var workDayEnd: js.UndefOr[js.Date] = js.undefined
  
  var workDayStart: js.UndefOr[js.Date] = js.undefined
  
  var workWeekEnd: js.UndefOr[Double] = js.undefined
  
  var workWeekStart: js.UndefOr[Double] = js.undefined
}
object SchedulerOptions {
  
  inline def apply(): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchedulerOptions]
  }
  
  extension [Self <: SchedulerOptions](x: Self) {
    
    inline def setAdd(value: /* e */ SchedulerAddEvent => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: /* e */ SchedulerAddEvent) => value(t0).runNow()))
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setAllDayEventTemplate(value: String | js.Function): Self = StObject.set(x, "allDayEventTemplate", value.asInstanceOf[js.Any])
    
    inline def setAllDayEventTemplateUndefined: Self = StObject.set(x, "allDayEventTemplate", js.undefined)
    
    inline def setAllDaySlot(value: Boolean): Self = StObject.set(x, "allDaySlot", value.asInstanceOf[js.Any])
    
    inline def setAllDaySlotUndefined: Self = StObject.set(x, "allDaySlot", js.undefined)
    
    inline def setAutoBind(value: Boolean): Self = StObject.set(x, "autoBind", value.asInstanceOf[js.Any])
    
    inline def setAutoBindUndefined: Self = StObject.set(x, "autoBind", js.undefined)
    
    inline def setCancel(value: /* e */ SchedulerCancelEvent => Callback): Self = StObject.set(x, "cancel", js.Any.fromFunction1((t0: /* e */ SchedulerCancelEvent) => value(t0).runNow()))
    
    inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    inline def setChange(value: /* e */ SchedulerChangeEvent => Callback): Self = StObject.set(x, "change", js.Any.fromFunction1((t0: /* e */ SchedulerChangeEvent) => value(t0).runNow()))
    
    inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
    
    inline def setCurrentTimeMarker(value: Boolean | SchedulerCurrentTimeMarker): Self = StObject.set(x, "currentTimeMarker", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeMarkerUndefined: Self = StObject.set(x, "currentTimeMarker", js.undefined)
    
    inline def setDataBinding(value: /* e */ SchedulerDataBindingEvent => Callback): Self = StObject.set(x, "dataBinding", js.Any.fromFunction1((t0: /* e */ SchedulerDataBindingEvent) => value(t0).runNow()))
    
    inline def setDataBindingUndefined: Self = StObject.set(x, "dataBinding", js.undefined)
    
    inline def setDataBound(value: /* e */ SchedulerDataBoundEvent => Callback): Self = StObject.set(x, "dataBound", js.Any.fromFunction1((t0: /* e */ SchedulerDataBoundEvent) => value(t0).runNow()))
    
    inline def setDataBoundUndefined: Self = StObject.set(x, "dataBound", js.undefined)
    
    inline def setDataSource(value: Any | SchedulerDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDate(value: js.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDateHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "dateHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setDateHeaderTemplateUndefined: Self = StObject.set(x, "dateHeaderTemplate", js.undefined)
    
    inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    inline def setEdit(value: /* e */ SchedulerEditEvent => Callback): Self = StObject.set(x, "edit", js.Any.fromFunction1((t0: /* e */ SchedulerEditEvent) => value(t0).runNow()))
    
    inline def setEditUndefined: Self = StObject.set(x, "edit", js.undefined)
    
    inline def setEditable(value: Boolean | SchedulerEditable): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEventTemplate(value: String | js.Function): Self = StObject.set(x, "eventTemplate", value.asInstanceOf[js.Any])
    
    inline def setEventTemplateUndefined: Self = StObject.set(x, "eventTemplate", js.undefined)
    
    inline def setFooter(value: Boolean | SchedulerFooter): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
    
    inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
    
    inline def setGroup(value: SchedulerGroup): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "groupHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupHeaderTemplateUndefined: Self = StObject.set(x, "groupHeaderTemplate", js.undefined)
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMajorTick(value: Double): Self = StObject.set(x, "majorTick", value.asInstanceOf[js.Any])
    
    inline def setMajorTickUndefined: Self = StObject.set(x, "majorTick", js.undefined)
    
    inline def setMajorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "majorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setMajorTimeHeaderTemplateUndefined: Self = StObject.set(x, "majorTimeHeaderTemplate", js.undefined)
    
    inline def setMax(value: js.Date): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMessages(value: SchedulerMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMin(value: js.Date): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setMinorTickCount(value: Double): Self = StObject.set(x, "minorTickCount", value.asInstanceOf[js.Any])
    
    inline def setMinorTickCountUndefined: Self = StObject.set(x, "minorTickCount", js.undefined)
    
    inline def setMinorTimeHeaderTemplate(value: String | js.Function): Self = StObject.set(x, "minorTimeHeaderTemplate", value.asInstanceOf[js.Any])
    
    inline def setMinorTimeHeaderTemplateUndefined: Self = StObject.set(x, "minorTimeHeaderTemplate", js.undefined)
    
    inline def setMobile(value: Boolean | String): Self = StObject.set(x, "mobile", value.asInstanceOf[js.Any])
    
    inline def setMobileUndefined: Self = StObject.set(x, "mobile", js.undefined)
    
    inline def setMove(value: /* e */ SchedulerMoveEvent => Callback): Self = StObject.set(x, "move", js.Any.fromFunction1((t0: /* e */ SchedulerMoveEvent) => value(t0).runNow()))
    
    inline def setMoveEnd(value: /* e */ SchedulerMoveEndEvent => Callback): Self = StObject.set(x, "moveEnd", js.Any.fromFunction1((t0: /* e */ SchedulerMoveEndEvent) => value(t0).runNow()))
    
    inline def setMoveEndUndefined: Self = StObject.set(x, "moveEnd", js.undefined)
    
    inline def setMoveStart(value: /* e */ SchedulerMoveStartEvent => Callback): Self = StObject.set(x, "moveStart", js.Any.fromFunction1((t0: /* e */ SchedulerMoveStartEvent) => value(t0).runNow()))
    
    inline def setMoveStartUndefined: Self = StObject.set(x, "moveStart", js.undefined)
    
    inline def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNavigate(value: /* e */ SchedulerNavigateEvent => Callback): Self = StObject.set(x, "navigate", js.Any.fromFunction1((t0: /* e */ SchedulerNavigateEvent) => value(t0).runNow()))
    
    inline def setNavigateUndefined: Self = StObject.set(x, "navigate", js.undefined)
    
    inline def setPdf(value: SchedulerPdf): Self = StObject.set(x, "pdf", value.asInstanceOf[js.Any])
    
    inline def setPdfExport(value: /* e */ SchedulerPdfExportEvent => Callback): Self = StObject.set(x, "pdfExport", js.Any.fromFunction1((t0: /* e */ SchedulerPdfExportEvent) => value(t0).runNow()))
    
    inline def setPdfExportUndefined: Self = StObject.set(x, "pdfExport", js.undefined)
    
    inline def setPdfUndefined: Self = StObject.set(x, "pdf", js.undefined)
    
    inline def setRemove(value: /* e */ SchedulerRemoveEvent => Callback): Self = StObject.set(x, "remove", js.Any.fromFunction1((t0: /* e */ SchedulerRemoveEvent) => value(t0).runNow()))
    
    inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
    
    inline def setResize(value: /* e */ SchedulerResizeEvent => Callback): Self = StObject.set(x, "resize", js.Any.fromFunction1((t0: /* e */ SchedulerResizeEvent) => value(t0).runNow()))
    
    inline def setResizeEnd(value: /* e */ SchedulerResizeEndEvent => Callback): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1((t0: /* e */ SchedulerResizeEndEvent) => value(t0).runNow()))
    
    inline def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
    
    inline def setResizeStart(value: /* e */ SchedulerResizeStartEvent => Callback): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1((t0: /* e */ SchedulerResizeStartEvent) => value(t0).runNow()))
    
    inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
    
    inline def setResizeUndefined: Self = StObject.set(x, "resize", js.undefined)
    
    inline def setResources(value: js.Array[SchedulerResource]): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
    
    inline def setResourcesUndefined: Self = StObject.set(x, "resources", js.undefined)
    
    inline def setResourcesVarargs(value: SchedulerResource*): Self = StObject.set(x, "resources", js.Array(value*))
    
    inline def setSave(value: /* e */ SchedulerSaveEvent => Callback): Self = StObject.set(x, "save", js.Any.fromFunction1((t0: /* e */ SchedulerSaveEvent) => value(t0).runNow()))
    
    inline def setSaveUndefined: Self = StObject.set(x, "save", js.undefined)
    
    inline def setSelectable(value: Boolean): Self = StObject.set(x, "selectable", value.asInstanceOf[js.Any])
    
    inline def setSelectableUndefined: Self = StObject.set(x, "selectable", js.undefined)
    
    inline def setShowWorkHours(value: Boolean): Self = StObject.set(x, "showWorkHours", value.asInstanceOf[js.Any])
    
    inline def setShowWorkHoursUndefined: Self = StObject.set(x, "showWorkHours", js.undefined)
    
    inline def setSnap(value: Boolean): Self = StObject.set(x, "snap", value.asInstanceOf[js.Any])
    
    inline def setSnapUndefined: Self = StObject.set(x, "snap", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "timezone", js.undefined)
    
    inline def setToolbar(value: js.Array[SchedulerToolbarItem]): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
    
    inline def setToolbarVarargs(value: SchedulerToolbarItem*): Self = StObject.set(x, "toolbar", js.Array(value*))
    
    inline def setViews(value: js.Array[SchedulerView]): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    
    inline def setViewsVarargs(value: SchedulerView*): Self = StObject.set(x, "views", js.Array(value*))
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorkDayEnd(value: js.Date): Self = StObject.set(x, "workDayEnd", value.asInstanceOf[js.Any])
    
    inline def setWorkDayEndUndefined: Self = StObject.set(x, "workDayEnd", js.undefined)
    
    inline def setWorkDayStart(value: js.Date): Self = StObject.set(x, "workDayStart", value.asInstanceOf[js.Any])
    
    inline def setWorkDayStartUndefined: Self = StObject.set(x, "workDayStart", js.undefined)
    
    inline def setWorkWeekEnd(value: Double): Self = StObject.set(x, "workWeekEnd", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekEndUndefined: Self = StObject.set(x, "workWeekEnd", js.undefined)
    
    inline def setWorkWeekStart(value: Double): Self = StObject.set(x, "workWeekStart", value.asInstanceOf[js.Any])
    
    inline def setWorkWeekStartUndefined: Self = StObject.set(x, "workWeekStart", js.undefined)
  }
}
