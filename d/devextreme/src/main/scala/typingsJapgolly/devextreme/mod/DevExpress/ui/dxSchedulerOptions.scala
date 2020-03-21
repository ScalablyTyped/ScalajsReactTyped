package typingsJapgolly.devextreme.mod.DevExpress.ui

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.raw.Element
import typingsJapgolly.devextreme.AnonAgendaDuration
import typingsJapgolly.devextreme.AnonAllowAdding
import typingsJapgolly.devextreme.AnonAllowMultiple
import typingsJapgolly.devextreme.AnonAppointmentCount
import typingsJapgolly.devextreme.AnonAppointmentData
import typingsJapgolly.devextreme.AnonAppointmentDataAppointmentElement
import typingsJapgolly.devextreme.AnonAppointmentDataCancel
import typingsJapgolly.devextreme.AnonAppointmentDataComponent
import typingsJapgolly.devextreme.AnonAppointmentElement
import typingsJapgolly.devextreme.AnonAutoScroll
import typingsJapgolly.devextreme.AnonCellData
import typingsJapgolly.devextreme.AnonCellDataCellElement
import typingsJapgolly.devextreme.AnonComponentElement
import typingsJapgolly.devextreme.AnonElement
import typingsJapgolly.devextreme.AnonElementForm
import typingsJapgolly.devextreme.AnonEndDate
import typingsJapgolly.devextreme.AnonForm
import typingsJapgolly.devextreme.AnonModel
import typingsJapgolly.devextreme.AnonName
import typingsJapgolly.devextreme.AnonOldData
import typingsJapgolly.devextreme.AnonTargetedAppointmentData
import typingsJapgolly.devextreme.devextremeNumbers.`0`
import typingsJapgolly.devextreme.devextremeNumbers.`1`
import typingsJapgolly.devextreme.devextremeNumbers.`2`
import typingsJapgolly.devextreme.devextremeNumbers.`3`
import typingsJapgolly.devextreme.devextremeNumbers.`4`
import typingsJapgolly.devextreme.devextremeNumbers.`5`
import typingsJapgolly.devextreme.devextremeNumbers.`6`
import typingsJapgolly.devextreme.devextremeStrings.agenda
import typingsJapgolly.devextreme.devextremeStrings.auto
import typingsJapgolly.devextreme.devextremeStrings.day
import typingsJapgolly.devextreme.devextremeStrings.dialog
import typingsJapgolly.devextreme.devextremeStrings.month
import typingsJapgolly.devextreme.devextremeStrings.occurrence
import typingsJapgolly.devextreme.devextremeStrings.series
import typingsJapgolly.devextreme.devextremeStrings.timelineDay
import typingsJapgolly.devextreme.devextremeStrings.timelineMonth
import typingsJapgolly.devextreme.devextremeStrings.timelineWeek
import typingsJapgolly.devextreme.devextremeStrings.timelineWorkWeek
import typingsJapgolly.devextreme.devextremeStrings.unlimited
import typingsJapgolly.devextreme.devextremeStrings.week
import typingsJapgolly.devextreme.devextremeStrings.workWeek
import typingsJapgolly.devextreme.mod.DevExpress.core.dxElement
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSource
import typingsJapgolly.devextreme.mod.DevExpress.data.DataSourceOptions
import typingsJapgolly.devextreme.mod._Global_.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxSchedulerOptions extends WidgetOptions[dxScheduler] {
  /** Specifies whether the widget adapts to small screens. */
  var adaptivityEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the data source item field whose value defines whether or not the corresponding appointment is an all-day appointment. */
  var allDayExpr: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for cell overflow indicators. */
  var appointmentCollectorTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Configures appointment reordering using drag and drop gestures. */
  var appointmentDragging: js.UndefOr[AnonAutoScroll] = js.undefined
  /** Specifies a custom template for appointments. */
  var appointmentTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies a custom template for tooltips displayed when users click an appointment or cell overflow indicator. */
  var appointmentTooltipTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies cell duration in minutes. */
  var cellDuration: js.UndefOr[Double] = js.undefined
  /** Specifies whether or not an end-user can scroll the view in both directions at the same time. */
  var crossScrollingEnabled: js.UndefOr[Boolean] = js.undefined
  /** Specifies a date displayed on the current scheduler view by default. */
  var currentDate: js.UndefOr[js.Date | Double | String] = js.undefined
  /** Specifies the currently displayed view. Accepts the view's name or type. */
  var currentView: js.UndefOr[
    agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek
  ] = js.undefined
  /** Customizes the date navigator's text. */
  var customizeDateNavigatorText: js.UndefOr[js.Function1[/* info */ AnonEndDate, String]] = js.undefined
  /** Specifies a custom template for table cells. */
  var dataCellTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Binds the widget to data. */
  var dataSource: js.UndefOr[String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions] = js.undefined
  /** Specifies a custom template for day scale items. */
  var dateCellTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the date-time values' serialization format. Use it only if you do not specify the dataSource at design time. */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source item field whose value holds the description of the corresponding appointment. */
  var descriptionExpr: js.UndefOr[String] = js.undefined
  /** @deprecated Use the appointmentTooltipTemplate option instead. */
  /** Specifies a custom template for tooltips displayed when users click a cell overflow indicator. */
  var dropDownAppointmentTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies which editing operations an end-user can perform on appointments. */
  var editing: js.UndefOr[Boolean | AnonAllowAdding] = js.undefined
  /** Specifies the name of the data source item field that defines the ending of an appointment. */
  var endDateExpr: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source item field that defines the timezone of the appointment end date. */
  var endDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  /** Specifies the last hour on the time scale. Accepts integer values from 0 to 24. */
  var endDayHour: js.UndefOr[Double] = js.undefined
  /** Specifies the first day of a week. Does not apply to the agenda view. */
  var firstDayOfWeek: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.undefined
  /** If true, appointments are grouped by date first and then by resource; opposite if false. Applies only if appointments are grouped and groupOrientation is "horizontal". */
  var groupByDate: js.UndefOr[Boolean] = js.undefined
  /** Specifies the resource kinds by which the scheduler's appointments are grouped in a timetable. */
  var groups: js.UndefOr[js.Array[String]] = js.undefined
  /** Specifies the time interval between when the date-time indicator changes its position, in milliseconds. */
  var indicatorUpdateInterval: js.UndefOr[Double] = js.undefined
  /** The latest date the widget allows you to select. */
  var max: js.UndefOr[js.Date | Double | String] = js.undefined
  /** Specifies the limit of full-sized appointments displayed per cell. Applies to all views except "agenda". */
  var maxAppointmentsPerCell: js.UndefOr[Double | auto | unlimited] = js.undefined
  /** The earliest date the widget allows you to select. */
  var min: js.UndefOr[js.Date | Double | String] = js.undefined
  /** The text or HTML markup displayed by the widget if the item collection is empty. Available for the Agenda view only. */
  var noDataText: js.UndefOr[String] = js.undefined
  /** A function that is executed after an appointment is added to the data source. */
  var onAppointmentAdded: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** A function that is executed before an appointment is added to the data source. */
  var onAppointmentAdding: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataCancel, _]] = js.undefined
  /** A function that is executed when an appointment is clicked or tapped. */
  var onAppointmentClick: js.UndefOr[(js.Function1[/* e */ AnonAppointmentElement, _]) | String] = js.undefined
  /** A function that is executed when a user attempts to open the browser's context menu for an appointment. Allows you to replace this context menu with a custom context menu. */
  var onAppointmentContextMenu: js.UndefOr[(js.Function1[/* e */ AnonTargetedAppointmentData, _]) | String] = js.undefined
  /** A function that is executed when an appointment is double-clicked or double-tapped. */
  var onAppointmentDblClick: js.UndefOr[(js.Function1[/* e */ AnonAppointmentElement, _]) | String] = js.undefined
  /** A function that is executed after an appointment is deleted from the data source. */
  var onAppointmentDeleted: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** A function that is executed before an appointment is deleted from the data source. */
  var onAppointmentDeleting: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataCancel, _]] = js.undefined
  /** @deprecated Use the onAppointmentFormOpening option instead. */
  /** A function that is executed before an appointment details form is opened. */
  var onAppointmentFormCreated: js.UndefOr[js.Function1[/* e */ AnonForm, _]] = js.undefined
  /** A function that is executed before an appointment details form is opened. */
  var onAppointmentFormOpening: js.UndefOr[js.Function1[/* e */ AnonElementForm, _]] = js.undefined
  /** A function that is executed when an appointment is rendered. */
  var onAppointmentRendered: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataAppointmentElement, _]] = js.undefined
  /** A function that is executed after an appointment is updated in the data source. */
  var onAppointmentUpdated: js.UndefOr[js.Function1[/* e */ AnonAppointmentDataComponent, _]] = js.undefined
  /** A function that is executed before an appointment is updated in the data source. */
  var onAppointmentUpdating: js.UndefOr[js.Function1[/* e */ AnonOldData, _]] = js.undefined
  /** A function that is executed when a view cell is clicked. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ AnonCellData, _]) | String] = js.undefined
  /** A function that is executed when a user attempts to open the browser's context menu for a cell. Allows you to replace this context menu with a custom context menu. */
  var onCellContextMenu: js.UndefOr[(js.Function1[/* e */ AnonCellDataCellElement, _]) | String] = js.undefined
  /** Specifies the edit mode for recurring appointments. */
  var recurrenceEditMode: js.UndefOr[dialog | occurrence | series] = js.undefined
  /** Specifies the name of the data source item field that defines exceptions for the current recurring appointment. */
  var recurrenceExceptionExpr: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source item field that defines a recurrence rule for generating recurring appointments. */
  var recurrenceRuleExpr: js.UndefOr[String] = js.undefined
  /** Specifies whether filtering is performed on the server or client side. */
  var remoteFiltering: js.UndefOr[Boolean] = js.undefined
  /** Specifies a custom template for resource headers. */
  var resourceCellTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies an array of resources available in the scheduler. */
  var resources: js.UndefOr[js.Array[AnonAllowMultiple]] = js.undefined
  /** Currently selected cells' data. */
  var selectedCellData: js.UndefOr[js.Array[_]] = js.undefined
  /** Specifies whether to apply shading to cover the timetable up to the current time. */
  var shadeUntilCurrentTime: js.UndefOr[Boolean] = js.undefined
  /** Specifies the "All-day" panel's visibility. Setting this option to false hides the panel along with the all-day appointments. */
  var showAllDayPanel: js.UndefOr[Boolean] = js.undefined
  /** Specifies the current date-time indicator's visibility. */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
  /** Specifies the name of the data source item field that defines the start of an appointment. */
  var startDateExpr: js.UndefOr[String] = js.undefined
  /** Specifies the name of the data source item field that defines the timezone of the appointment start date. */
  var startDateTimeZoneExpr: js.UndefOr[String] = js.undefined
  /** Specifies the first hour on the time scale. Accepts integer values from 0 to 24. */
  var startDayHour: js.UndefOr[Double] = js.undefined
  /** Specifies the name of the data source item field that holds the subject of an appointment. */
  var textExpr: js.UndefOr[String] = js.undefined
  /** Specifies a custom template for time scale items. */
  var timeCellTemplate: js.UndefOr[
    typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ])
  ] = js.undefined
  /** Specifies the timezone of the widget. */
  var timeZone: js.UndefOr[String] = js.undefined
  /** Specifies whether a user can switch views using tabs or a drop-down menu. */
  var useDropDownViewSwitcher: js.UndefOr[Boolean] = js.undefined
  /** Specifies and configures the views to be available in the view switcher. */
  var views: js.UndefOr[
    js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AnonAgendaDuration
    ]
  ] = js.undefined
}

object dxSchedulerOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    adaptivityEnabled: js.UndefOr[Boolean] = js.undefined,
    allDayExpr: String = null,
    appointmentCollectorTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function2[
      /* data */ AnonAppointmentCount, 
      /* collectorElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentDragging: AnonAutoScroll = null,
    appointmentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    appointmentTooltipTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* model */ AnonAppointmentData, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    bindingOptions: js.Any = null,
    cellDuration: Int | Double = null,
    crossScrollingEnabled: js.UndefOr[Boolean] = js.undefined,
    currentDate: js.Date | Double | String = null,
    currentView: agenda | day | month | timelineDay | timelineMonth | timelineWeek | timelineWorkWeek | week | workWeek = null,
    customizeDateNavigatorText: /* info */ AnonEndDate => CallbackTo[String] = null,
    dataCellTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dataSource: String | js.Array[dxSchedulerAppointment] | DataSource | DataSourceOptions = null,
    dateCellTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    dateSerializationFormat: String = null,
    descriptionExpr: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    dropDownAppointmentTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* contentElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    editing: Boolean | AnonAllowAdding = null,
    elementAttr: js.Any = null,
    endDateExpr: String = null,
    endDateTimeZoneExpr: String = null,
    endDayHour: Int | Double = null,
    firstDayOfWeek: `0` | `1` | `2` | `3` | `4` | `5` | `6` = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    groupByDate: js.UndefOr[Boolean] = js.undefined,
    groups: js.Array[String] = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    indicatorUpdateInterval: Int | Double = null,
    max: js.Date | Double | String = null,
    maxAppointmentsPerCell: Double | auto | unlimited = null,
    min: js.Date | Double | String = null,
    noDataText: String = null,
    onAppointmentAdded: /* e */ AnonAppointmentDataComponent => CallbackTo[js.Any] = null,
    onAppointmentAdding: /* e */ AnonAppointmentDataCancel => CallbackTo[js.Any] = null,
    onAppointmentClick: (js.Function1[/* e */ AnonAppointmentElement, _]) | String = null,
    onAppointmentContextMenu: (js.Function1[/* e */ AnonTargetedAppointmentData, _]) | String = null,
    onAppointmentDblClick: (js.Function1[/* e */ AnonAppointmentElement, _]) | String = null,
    onAppointmentDeleted: /* e */ AnonAppointmentDataComponent => CallbackTo[js.Any] = null,
    onAppointmentDeleting: /* e */ AnonAppointmentDataCancel => CallbackTo[js.Any] = null,
    onAppointmentFormCreated: /* e */ AnonForm => CallbackTo[js.Any] = null,
    onAppointmentFormOpening: /* e */ AnonElementForm => CallbackTo[js.Any] = null,
    onAppointmentRendered: /* e */ AnonAppointmentDataAppointmentElement => CallbackTo[js.Any] = null,
    onAppointmentUpdated: /* e */ AnonAppointmentDataComponent => CallbackTo[js.Any] = null,
    onAppointmentUpdating: /* e */ AnonOldData => CallbackTo[js.Any] = null,
    onCellClick: (js.Function1[/* e */ AnonCellData, _]) | String = null,
    onCellContextMenu: (js.Function1[/* e */ AnonCellDataCellElement, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxScheduler] => CallbackTo[js.Any] = null,
    onDisposing: /* e */ AnonModel[dxScheduler] => CallbackTo[js.Any] = null,
    onInitialized: /* e */ AnonElement[dxScheduler] => CallbackTo[js.Any] = null,
    onOptionChanged: /* e */ AnonName[dxScheduler] => CallbackTo[js.Any] = null,
    recurrenceEditMode: dialog | occurrence | series = null,
    recurrenceExceptionExpr: String = null,
    recurrenceRuleExpr: String = null,
    remoteFiltering: js.UndefOr[Boolean] = js.undefined,
    resourceCellTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    resources: js.Array[AnonAllowMultiple] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    selectedCellData: js.Array[_] = null,
    shadeUntilCurrentTime: js.UndefOr[Boolean] = js.undefined,
    showAllDayPanel: js.UndefOr[Boolean] = js.undefined,
    showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined,
    startDateExpr: String = null,
    startDateTimeZoneExpr: String = null,
    startDayHour: Int | Double = null,
    tabIndex: Int | Double = null,
    textExpr: String = null,
    timeCellTemplate: typingsJapgolly.devextreme.mod.DevExpress.core.template | (js.Function3[
      /* itemData */ js.Any, 
      /* itemIndex */ Double, 
      /* itemElement */ dxElement, 
      String | Element | JQuery
    ]) = null,
    timeZone: String = null,
    useDropDownViewSwitcher: js.UndefOr[Boolean] = js.undefined,
    views: js.Array[
      day | week | workWeek | month | timelineDay | timelineWeek | timelineWorkWeek | timelineMonth | agenda | AnonAgendaDuration
    ] = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxSchedulerOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(adaptivityEnabled)) __obj.updateDynamic("adaptivityEnabled")(adaptivityEnabled.asInstanceOf[js.Any])
    if (allDayExpr != null) __obj.updateDynamic("allDayExpr")(allDayExpr.asInstanceOf[js.Any])
    if (appointmentCollectorTemplate != null) __obj.updateDynamic("appointmentCollectorTemplate")(appointmentCollectorTemplate.asInstanceOf[js.Any])
    if (appointmentDragging != null) __obj.updateDynamic("appointmentDragging")(appointmentDragging.asInstanceOf[js.Any])
    if (appointmentTemplate != null) __obj.updateDynamic("appointmentTemplate")(appointmentTemplate.asInstanceOf[js.Any])
    if (appointmentTooltipTemplate != null) __obj.updateDynamic("appointmentTooltipTemplate")(appointmentTooltipTemplate.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (cellDuration != null) __obj.updateDynamic("cellDuration")(cellDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(crossScrollingEnabled)) __obj.updateDynamic("crossScrollingEnabled")(crossScrollingEnabled.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (currentView != null) __obj.updateDynamic("currentView")(currentView.asInstanceOf[js.Any])
    if (customizeDateNavigatorText != null) __obj.updateDynamic("customizeDateNavigatorText")(js.Any.fromFunction1((t0: /* info */ typingsJapgolly.devextreme.AnonEndDate) => customizeDateNavigatorText(t0).runNow()))
    if (dataCellTemplate != null) __obj.updateDynamic("dataCellTemplate")(dataCellTemplate.asInstanceOf[js.Any])
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateCellTemplate != null) __obj.updateDynamic("dateCellTemplate")(dateCellTemplate.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (descriptionExpr != null) __obj.updateDynamic("descriptionExpr")(descriptionExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (dropDownAppointmentTemplate != null) __obj.updateDynamic("dropDownAppointmentTemplate")(dropDownAppointmentTemplate.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (endDateExpr != null) __obj.updateDynamic("endDateExpr")(endDateExpr.asInstanceOf[js.Any])
    if (endDateTimeZoneExpr != null) __obj.updateDynamic("endDateTimeZoneExpr")(endDateTimeZoneExpr.asInstanceOf[js.Any])
    if (endDayHour != null) __obj.updateDynamic("endDayHour")(endDayHour.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(groupByDate)) __obj.updateDynamic("groupByDate")(groupByDate.asInstanceOf[js.Any])
    if (groups != null) __obj.updateDynamic("groups")(groups.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (indicatorUpdateInterval != null) __obj.updateDynamic("indicatorUpdateInterval")(indicatorUpdateInterval.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxAppointmentsPerCell != null) __obj.updateDynamic("maxAppointmentsPerCell")(maxAppointmentsPerCell.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAppointmentAdded != null) __obj.updateDynamic("onAppointmentAdded")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataComponent) => onAppointmentAdded(t0).runNow()))
    if (onAppointmentAdding != null) __obj.updateDynamic("onAppointmentAdding")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataCancel) => onAppointmentAdding(t0).runNow()))
    if (onAppointmentClick != null) __obj.updateDynamic("onAppointmentClick")(onAppointmentClick.asInstanceOf[js.Any])
    if (onAppointmentContextMenu != null) __obj.updateDynamic("onAppointmentContextMenu")(onAppointmentContextMenu.asInstanceOf[js.Any])
    if (onAppointmentDblClick != null) __obj.updateDynamic("onAppointmentDblClick")(onAppointmentDblClick.asInstanceOf[js.Any])
    if (onAppointmentDeleted != null) __obj.updateDynamic("onAppointmentDeleted")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataComponent) => onAppointmentDeleted(t0).runNow()))
    if (onAppointmentDeleting != null) __obj.updateDynamic("onAppointmentDeleting")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataCancel) => onAppointmentDeleting(t0).runNow()))
    if (onAppointmentFormCreated != null) __obj.updateDynamic("onAppointmentFormCreated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonForm) => onAppointmentFormCreated(t0).runNow()))
    if (onAppointmentFormOpening != null) __obj.updateDynamic("onAppointmentFormOpening")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElementForm) => onAppointmentFormOpening(t0).runNow()))
    if (onAppointmentRendered != null) __obj.updateDynamic("onAppointmentRendered")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataAppointmentElement) => onAppointmentRendered(t0).runNow()))
    if (onAppointmentUpdated != null) __obj.updateDynamic("onAppointmentUpdated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonAppointmentDataComponent) => onAppointmentUpdated(t0).runNow()))
    if (onAppointmentUpdating != null) __obj.updateDynamic("onAppointmentUpdating")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonOldData) => onAppointmentUpdating(t0).runNow()))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick.asInstanceOf[js.Any])
    if (onCellContextMenu != null) __obj.updateDynamic("onCellContextMenu")(onCellContextMenu.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonComponentElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScheduler]) => onContentReady(t0).runNow()))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonModel[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScheduler]) => onDisposing(t0).runNow()))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonElement[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScheduler]) => onInitialized(t0).runNow()))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.devextreme.AnonName[typingsJapgolly.devextreme.mod.DevExpress.ui.dxScheduler]) => onOptionChanged(t0).runNow()))
    if (recurrenceEditMode != null) __obj.updateDynamic("recurrenceEditMode")(recurrenceEditMode.asInstanceOf[js.Any])
    if (recurrenceExceptionExpr != null) __obj.updateDynamic("recurrenceExceptionExpr")(recurrenceExceptionExpr.asInstanceOf[js.Any])
    if (recurrenceRuleExpr != null) __obj.updateDynamic("recurrenceRuleExpr")(recurrenceRuleExpr.asInstanceOf[js.Any])
    if (!js.isUndefined(remoteFiltering)) __obj.updateDynamic("remoteFiltering")(remoteFiltering.asInstanceOf[js.Any])
    if (resourceCellTemplate != null) __obj.updateDynamic("resourceCellTemplate")(resourceCellTemplate.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (selectedCellData != null) __obj.updateDynamic("selectedCellData")(selectedCellData.asInstanceOf[js.Any])
    if (!js.isUndefined(shadeUntilCurrentTime)) __obj.updateDynamic("shadeUntilCurrentTime")(shadeUntilCurrentTime.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllDayPanel)) __obj.updateDynamic("showAllDayPanel")(showAllDayPanel.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentTimeIndicator)) __obj.updateDynamic("showCurrentTimeIndicator")(showCurrentTimeIndicator.asInstanceOf[js.Any])
    if (startDateExpr != null) __obj.updateDynamic("startDateExpr")(startDateExpr.asInstanceOf[js.Any])
    if (startDateTimeZoneExpr != null) __obj.updateDynamic("startDateTimeZoneExpr")(startDateTimeZoneExpr.asInstanceOf[js.Any])
    if (startDayHour != null) __obj.updateDynamic("startDayHour")(startDayHour.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (textExpr != null) __obj.updateDynamic("textExpr")(textExpr.asInstanceOf[js.Any])
    if (timeCellTemplate != null) __obj.updateDynamic("timeCellTemplate")(timeCellTemplate.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (!js.isUndefined(useDropDownViewSwitcher)) __obj.updateDynamic("useDropDownViewSwitcher")(useDropDownViewSwitcher.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxSchedulerOptions]
  }
}

