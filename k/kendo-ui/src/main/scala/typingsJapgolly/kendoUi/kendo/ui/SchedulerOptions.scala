package typingsJapgolly.kendoUi.kendo.ui

import japgolly.scalajs.react.Callback
import typingsJapgolly.kendoUi.kendo.data.SchedulerDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerOptions extends js.Object {
  var add: js.UndefOr[js.Function1[/* e */ SchedulerAddEvent, Unit]] = js.undefined
  var allDayEventTemplate: js.UndefOr[String | js.Function] = js.undefined
  var allDaySlot: js.UndefOr[Boolean] = js.undefined
  var autoBind: js.UndefOr[Boolean] = js.undefined
  var cancel: js.UndefOr[js.Function1[/* e */ SchedulerCancelEvent, Unit]] = js.undefined
  var change: js.UndefOr[js.Function1[/* e */ SchedulerChangeEvent, Unit]] = js.undefined
  var currentTimeMarker: js.UndefOr[Boolean | SchedulerCurrentTimeMarker] = js.undefined
  var dataBinding: js.UndefOr[js.Function1[/* e */ SchedulerDataBindingEvent, Unit]] = js.undefined
  var dataBound: js.UndefOr[js.Function1[/* e */ SchedulerDataBoundEvent, Unit]] = js.undefined
  var dataSource: js.UndefOr[js.Any | SchedulerDataSource] = js.undefined
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
  @scala.inline
  def apply(
    add: /* e */ SchedulerAddEvent => Callback = null,
    allDayEventTemplate: String | js.Function = null,
    allDaySlot: js.UndefOr[Boolean] = js.undefined,
    autoBind: js.UndefOr[Boolean] = js.undefined,
    cancel: /* e */ SchedulerCancelEvent => Callback = null,
    change: /* e */ SchedulerChangeEvent => Callback = null,
    currentTimeMarker: Boolean | SchedulerCurrentTimeMarker = null,
    dataBinding: /* e */ SchedulerDataBindingEvent => Callback = null,
    dataBound: /* e */ SchedulerDataBoundEvent => Callback = null,
    dataSource: js.Any | SchedulerDataSource = null,
    date: js.Date = null,
    dateHeaderTemplate: String | js.Function = null,
    edit: /* e */ SchedulerEditEvent => Callback = null,
    editable: Boolean | SchedulerEditable = null,
    endTime: js.Date = null,
    eventTemplate: String | js.Function = null,
    footer: Boolean | SchedulerFooter = null,
    group: SchedulerGroup = null,
    groupHeaderTemplate: String | js.Function = null,
    height: Double | String = null,
    majorTick: Int | Double = null,
    majorTimeHeaderTemplate: String | js.Function = null,
    max: js.Date = null,
    messages: SchedulerMessages = null,
    min: js.Date = null,
    minorTickCount: Int | Double = null,
    minorTimeHeaderTemplate: String | js.Function = null,
    mobile: Boolean | String = null,
    move: /* e */ SchedulerMoveEvent => Callback = null,
    moveEnd: /* e */ SchedulerMoveEndEvent => Callback = null,
    moveStart: /* e */ SchedulerMoveStartEvent => Callback = null,
    name: String = null,
    navigate: /* e */ SchedulerNavigateEvent => Callback = null,
    pdf: SchedulerPdf = null,
    pdfExport: /* e */ SchedulerPdfExportEvent => Callback = null,
    remove: /* e */ SchedulerRemoveEvent => Callback = null,
    resize: /* e */ SchedulerResizeEvent => Callback = null,
    resizeEnd: /* e */ SchedulerResizeEndEvent => Callback = null,
    resizeStart: /* e */ SchedulerResizeStartEvent => Callback = null,
    resources: js.Array[SchedulerResource] = null,
    save: /* e */ SchedulerSaveEvent => Callback = null,
    selectable: js.UndefOr[Boolean] = js.undefined,
    showWorkHours: js.UndefOr[Boolean] = js.undefined,
    snap: js.UndefOr[Boolean] = js.undefined,
    startTime: js.Date = null,
    timezone: String = null,
    toolbar: js.Array[SchedulerToolbarItem] = null,
    views: js.Array[SchedulerView] = null,
    width: Double | String = null,
    workDayEnd: js.Date = null,
    workDayStart: js.Date = null,
    workWeekEnd: Int | Double = null,
    workWeekStart: Int | Double = null
  ): SchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (add != null) __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerAddEvent) => add(t0).runNow()))
    if (allDayEventTemplate != null) __obj.updateDynamic("allDayEventTemplate")(allDayEventTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(allDaySlot)) __obj.updateDynamic("allDaySlot")(allDaySlot.asInstanceOf[js.Any])
    if (!js.isUndefined(autoBind)) __obj.updateDynamic("autoBind")(autoBind.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerCancelEvent) => cancel(t0).runNow()))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerChangeEvent) => change(t0).runNow()))
    if (currentTimeMarker != null) __obj.updateDynamic("currentTimeMarker")(currentTimeMarker.asInstanceOf[js.Any])
    if (dataBinding != null) __obj.updateDynamic("dataBinding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerDataBindingEvent) => dataBinding(t0).runNow()))
    if (dataBound != null) __obj.updateDynamic("dataBound")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerDataBoundEvent) => dataBound(t0).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (dateHeaderTemplate != null) __obj.updateDynamic("dateHeaderTemplate")(dateHeaderTemplate.asInstanceOf[js.Any])
    if (edit != null) __obj.updateDynamic("edit")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerEditEvent) => edit(t0).runNow()))
    if (editable != null) __obj.updateDynamic("editable")(editable.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventTemplate != null) __obj.updateDynamic("eventTemplate")(eventTemplate.asInstanceOf[js.Any])
    if (footer != null) __obj.updateDynamic("footer")(footer.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (groupHeaderTemplate != null) __obj.updateDynamic("groupHeaderTemplate")(groupHeaderTemplate.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (majorTick != null) __obj.updateDynamic("majorTick")(majorTick.asInstanceOf[js.Any])
    if (majorTimeHeaderTemplate != null) __obj.updateDynamic("majorTimeHeaderTemplate")(majorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minorTickCount != null) __obj.updateDynamic("minorTickCount")(minorTickCount.asInstanceOf[js.Any])
    if (minorTimeHeaderTemplate != null) __obj.updateDynamic("minorTimeHeaderTemplate")(minorTimeHeaderTemplate.asInstanceOf[js.Any])
    if (mobile != null) __obj.updateDynamic("mobile")(mobile.asInstanceOf[js.Any])
    if (move != null) __obj.updateDynamic("move")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerMoveEvent) => move(t0).runNow()))
    if (moveEnd != null) __obj.updateDynamic("moveEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerMoveEndEvent) => moveEnd(t0).runNow()))
    if (moveStart != null) __obj.updateDynamic("moveStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerMoveStartEvent) => moveStart(t0).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (navigate != null) __obj.updateDynamic("navigate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerNavigateEvent) => navigate(t0).runNow()))
    if (pdf != null) __obj.updateDynamic("pdf")(pdf.asInstanceOf[js.Any])
    if (pdfExport != null) __obj.updateDynamic("pdfExport")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerPdfExportEvent) => pdfExport(t0).runNow()))
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerRemoveEvent) => remove(t0).runNow()))
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerResizeEvent) => resize(t0).runNow()))
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerResizeEndEvent) => resizeEnd(t0).runNow()))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerResizeStartEvent) => resizeStart(t0).runNow()))
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (save != null) __obj.updateDynamic("save")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.kendoUi.kendo.ui.SchedulerSaveEvent) => save(t0).runNow()))
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable.asInstanceOf[js.Any])
    if (!js.isUndefined(showWorkHours)) __obj.updateDynamic("showWorkHours")(showWorkHours.asInstanceOf[js.Any])
    if (!js.isUndefined(snap)) __obj.updateDynamic("snap")(snap.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (timezone != null) __obj.updateDynamic("timezone")(timezone.asInstanceOf[js.Any])
    if (toolbar != null) __obj.updateDynamic("toolbar")(toolbar.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workDayEnd != null) __obj.updateDynamic("workDayEnd")(workDayEnd.asInstanceOf[js.Any])
    if (workDayStart != null) __obj.updateDynamic("workDayStart")(workDayStart.asInstanceOf[js.Any])
    if (workWeekEnd != null) __obj.updateDynamic("workWeekEnd")(workWeekEnd.asInstanceOf[js.Any])
    if (workWeekStart != null) __obj.updateDynamic("workWeekStart")(workWeekStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchedulerOptions]
  }
}

