package typingsJapgolly.ejWebAll.ej.Schedule

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers on the beginning of every action that starts within the Schedule.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggers after the completion of every action within the Schedule.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Sets the week to display more than one week appointment summary.
    */
  var agendaViewSettings: js.UndefOr[AgendaViewSettings] = js.undefined
  /** Accepts the id value of the template layout defined for the all-day cells and customizes it.
    * @Default {null}
    */
  var allDayCellsTemplateId: js.UndefOr[String] = js.undefined
  /** When set to false, disables the appointment delete option on the Scheduler.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Schedule allows the appointments to be dragged and dropped at required time.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** When set to true, allows the user to create/edit appointments inline - simply through a single click made either on the Scheduler cells or on the existing appointmentâ€™s Subject
    * text respectively. Pressing enter key after the new Subject text   typed onto the inline created text box, will save/update the appointments appropriately.
    * @Default {false}
    */
  var allowInline: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Scheduler allows interaction through keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Triggers after an existing appointment is edited.
    */
  var appointmentChanged: js.UndefOr[js.Function1[/* e */ AppointmentChangedEventArgs, Unit]] = js.undefined
  /** Triggers after an appointment is clicked.
    */
  var appointmentClick: js.UndefOr[js.Function1[/* e */ AppointmentClickEventArgs, Unit]] = js.undefined
  /** Triggers after the new appointment is saved.
    */
  var appointmentCreated: js.UndefOr[js.Function1[/* e */ AppointmentCreatedEventArgs, Unit]] = js.undefined
  /** Allows setting draggable area for the Scheduler appointments. Also, turns on the external drag and drop, when set with some specific external drag area name.
    */
  var appointmentDragArea: js.UndefOr[String] = js.undefined
  /** Triggers on hovering the mouse over the appointments.
    */
  var appointmentHover: js.UndefOr[js.Function1[/* e */ AppointmentHoverEventArgs, Unit]] = js.undefined
  /** Triggers after the appointment is deleted.
    */
  var appointmentRemoved: js.UndefOr[js.Function1[/* e */ AppointmentRemovedEventArgs, Unit]] = js.undefined
  /** It includes the dataSource option and the fields related to Schedule appointments. The appointment fields within the appointmentSettings can accept both string and object type
    * values. To apply validation rules on the appointment window fields, then the appointment fields needs to be defined with object type values.
    */
  var appointmentSettings: js.UndefOr[AppointmentSettings] = js.undefined
  /** Template design that applies on the Schedule appointments. All the field names that are mapped from dataSource to the appropriate field properties within the appointmentSettings
    * can be used within the template.
    * @Default {null}
    */
  var appointmentTemplateId: js.UndefOr[String] = js.undefined
  /** Triggers before the appointment window opens.
    */
  var appointmentWindowOpen: js.UndefOr[js.Function1[/* e */ AppointmentWindowOpenEventArgs, Unit]] = js.undefined
  /** Triggers before the edited appointment is being saved.
    */
  var beforeAppointmentChange: js.UndefOr[js.Function1[/* e */ BeforeAppointmentChangeEventArgs, Unit]] = js.undefined
  /** Triggers before the new appointment gets saved.
    */
  var beforeAppointmentCreate: js.UndefOr[js.Function1[/* e */ BeforeAppointmentCreateEventArgs, Unit]] = js.undefined
  /** Triggers before the appointment is being removed from the Scheduler.
    */
  var beforeAppointmentRemove: js.UndefOr[js.Function1[/* e */ BeforeAppointmentRemoveEventArgs, Unit]] = js.undefined
  /** Triggers before the context menu opens.
    */
  var beforeContextMenuOpen: js.UndefOr[js.Function1[/* e */ BeforeContextMenuOpenEventArgs, Unit]] = js.undefined
  /** Blocks the user-specific time interval on the Scheduler, so that no appointments can be created on that particular time slots. It includes the dataSource option and also the
    * fields related to block intervals.
    */
  var blockoutSettings: js.UndefOr[BlockoutSettings] = js.undefined
  /** Sets various categorize colors to the Schedule appointments to differentiate it.
    */
  var categorizeSettings: js.UndefOr[CategorizeSettings] = js.undefined
  /** Triggers after the cell is clicked.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
  /** Triggers after the cell is clicked twice.
    */
  var cellDoubleClick: js.UndefOr[js.Function1[/* e */ CellDoubleClickEventArgs, Unit]] = js.undefined
  /** Sets the height for Schedule cells.
    * @Default {20px}
    */
  var cellHeight: js.UndefOr[String] = js.undefined
  /** Triggers on hovering the mouse overs the cells.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.undefined
  /** Sets the width for Schedule cells.
    */
  var cellWidth: js.UndefOr[String] = js.undefined
  /** Holds all options related to the context menu settings of Scheduler.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggers when the Scheduler completely renders on the page.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Accepts the custom CSS class name that defines specific user-defined styles and themes to be applied for partial or complete elements of the Schedule.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Sets current date of the Schedule. The Schedule displays initially with the date that is provided here.
    * @Default {new Date()}
    */
  var currentDate: js.UndefOr[js.Any] = js.undefined
  /** Sets current view of the Schedule. Schedule renders initially with the view that is specified here. The available views are day, week, workweek, month, agenda and custom view -
    * from which any one of the required view can be set to the Schedule. It accepts both string or enum values. The enum values that are accepted by
    * currentView(ej.Schedule.CurrentView) are as follows,
    * @Default {ej.Schedule.CurrentView.Week}
    */
  var currentView: js.UndefOr[String | CurrentView] = js.undefined
  /** Sets the date format for Schedule.
    */
  var dateFormat: js.UndefOr[String] = js.undefined
  /** Accepts the id value of the template layout defined for the date header cells and customizes it.
    * @Default {null}
    */
  var dateHeaderTemplateId: js.UndefOr[String] = js.undefined
  /** Triggers when the Scheduler and all its sub-components gets destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Triggers while the appointment is being dragged over the work cells.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment dragging begins.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment is dropped.
    */
  var dragStop: js.UndefOr[js.Function1[/* e */ DragStopEventArgs, Unit]] = js.undefined
  /** When set to true, enables the resize behavior of appointments within the Schedule.
    * @Default {true}
    */
  var enableAppointmentResize: js.UndefOr[Boolean] = js.undefined
  /** When set to true, enables the loading of Schedule appointments based on your demand. With this load on demand concept, the data consumption of the Schedule can be limited.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Saves the current model value to browser cookies for state maintenance. When the page gets refreshed, Schedule control values are retained.
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.undefined
  /** When set to true, the Schedule layout and behavior changes as per the common RTL conventions.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** When set to true, Schedule allows the validation of recurrence pattern to take place before it is being assigned to the appointments. For example, when one of the instance of
    * recurrence appointment is dragged beyond the next or previous instance of the same recurrence appointment, a pop-up is displayed with the validation message disallowing the drag
    * functionality.
    * @Default {true}
    */
  var enableRecurrenceValidation: js.UndefOr[Boolean] = js.undefined
  /** Sets the end hour time limit to be displayed on the Schedule.
    * @Default {24}
    */
  var endHour: js.UndefOr[Double] = js.undefined
  /** Sets specific day as the starting day of the week.
    * @Default {null}
    */
  var firstDayOfWeek: js.UndefOr[String] = js.undefined
  /** To configure resource grouping on the Schedule.
    */
  var group: js.UndefOr[Group] = js.undefined
  /** Sets the height of the Schedule. Accepts both pixel and percentage values.
    * @Default {1120px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** When set to true, enables the Schedule to observe Daylight Saving Time for supported timezones.
    * @Default {false}
    */
  var isDST: js.UndefOr[Boolean] = js.undefined
  /** When set to true, adapts the Schedule layout to fit the screen size of devices on which it renders.
    * @Default {true}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggers when any of the keyboard keys are pressed.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.undefined
  /** Sets the specific culture to the Schedule.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Sets the maximum date limit to display on the Schedule. Setting maxDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(2099, 12, 31)}
    */
  var maxDate: js.UndefOr[js.Any] = js.undefined
  /** Triggers after the menu/sub-menu items within the context menu is clicked.
    */
  var menuItemClick: js.UndefOr[js.Function1[/* e */ MenuItemClickEventArgs, Unit]] = js.undefined
  /** Sets the minimum date limit to display on the Schedule. Setting minDate with specific date value disallows the Schedule to navigate beyond that date.
    * @Default {new Date(1900, 01, 01)}
    */
  var minDate: js.UndefOr[js.Any] = js.undefined
  /** Triggers after the Schedule view or date is navigated.
    */
  var navigation: js.UndefOr[js.Function1[/* e */ NavigationEventArgs, Unit]] = js.undefined
  /** Sets the mode of Schedule rendering either in a vertical or horizontal direction. It accepts either string(&quot;vertical&quot; or &quot;horizontal&quot;) or enum values. The enum
    * values that are accepted by orientation(ej.Schedule.Orientation) are as follows,
    * @Default {ej.Schedule.Orientation.Vertical}
    */
  var orientation: js.UndefOr[String | Orientation] = js.undefined
  /** Triggers when the overflow button is clicked.
    */
  var overflowButtonClick: js.UndefOr[js.Function1[/* e */ OverflowButtonClickEventArgs, Unit]] = js.undefined
  /** Triggers while mouse hovering on the overflow button.
    */
  var overflowButtonHover: js.UndefOr[js.Function1[/* e */ OverflowButtonHoverEventArgs, Unit]] = js.undefined
  /** Holds all the options related to priority settings of the Schedule.
    */
  var prioritySettings: js.UndefOr[PrioritySettings] = js.undefined
  /** Triggers every time before the elements of the scheduler such as work cells, time cells or header cells and so on renders or re-renders on a page.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** When set to true, disables the interaction with the Schedule appointments, simply allowing the date and view navigation to occur.
    * @Default {false}
    */
  var readOnly: js.UndefOr[Boolean] = js.undefined
  /** Triggers when the reminder is raised for an appointment based on the alertBefore value.
    */
  var reminder: js.UndefOr[js.Function1[/* e */ ReminderEventArgs, Unit]] = js.undefined
  /** Holds all the options related to reminder settings of the Schedule.
    */
  var reminderSettings: js.UndefOr[ReminderSettings] = js.undefined
  /** Defines the specific start and end dates to be rendered in the Schedule control. To render such user-specified custom date ranges in the Schedule control, set the currentView
    * property to ej.Schedule.CurrentView.CustomView.
    * @Default {null}
    */
  var renderDates: js.UndefOr[RenderDates] = js.undefined
  /** Triggers while resizing the appointment.
    */
  var resize: js.UndefOr[js.Function1[/* e */ ResizeEventArgs, Unit]] = js.undefined
  /** Triggers when the appointment resizing begins.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
  /** Triggers when an appointment resizing stops.
    */
  var resizeStop: js.UndefOr[js.Function1[/* e */ ResizeStopEventArgs, Unit]] = js.undefined
  /** Template design that applies on the Schedule resource header.
    * @Default {null}
    */
  var resourceHeaderTemplateId: js.UndefOr[String] = js.undefined
  /** Holds all the options related to the resources settings of the Schedule. It is a collection of one or more resource objects, where the levels of resources are rendered on the
    * Schedule based on the order of the resource data provided within this collection.
    * @Default {null}
    */
  var resources: js.UndefOr[js.Array[Resource]] = js.undefined
  /** When set to true, displays the all-day row cells on the Schedule.
    * @Default {true}
    */
  var showAllDayRow: js.UndefOr[Boolean] = js.undefined
  /** When set to true, shows the previous/next appointment navigator button on the Scheduler.
    * @Default {true}
    */
  var showAppointmentNavigator: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the current time indicator on the Schedule.
    * @Default {true}
    */
  var showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined
  /** When set to true, shows the delete confirmation dialog before deleting an appointment.
    * @Default {true}
    */
  var showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the header bar on the Schedule.
    * @Default {true}
    */
  var showHeaderBar: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the location field additionally on Schedule appointment window.
    * @Default {false}
    */
  var showLocationField: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the other months days from the current month on the Schedule.
    * @Default {true}
    */
  var showNextPrevMonth: js.UndefOr[Boolean] = js.undefined
  /** when set to false, allows the height of the work-cells to adjust automatically (either expand or collapse) based on the number of appointment count it has.
    * @Default {true}
    */
  var showOverflowButton: js.UndefOr[Boolean] = js.undefined
  /** When set to true, displays the quick window for every single click made on the Schedule cells or appointments.
    * @Default {true}
    */
  var showQuickWindow: js.UndefOr[Boolean] = js.undefined
  /** When set to false, doesn't render the start and end timezone fields on the Schedule appointment window.
    * @Default {true}
    */
  var showTimeZoneFields: js.UndefOr[Boolean] = js.undefined
  /** When set to false, hides the weekend days on all the Scheduler views.
    * @Default {true}
    */
  var showWeekend: js.UndefOr[Boolean] = js.undefined
  /** Sets the start hour time range to be displayed on the Schedule.
    * @Default {0}
    */
  var startHour: js.UndefOr[Double] = js.undefined
  /** Sets either 12 or 24 hour time mode on the Schedule. It accepts either the string value(&quot;12&quot; or &quot;24&quot;) or the below mentioned enum values. The enum values that
    * are accepted by timeMode(ej.Schedule.TimeMode) are as follows,
    * @Default {null}
    */
  var timeMode: js.UndefOr[String | TimeMode] = js.undefined
  /** Holds all the options related to the time scale of Scheduler. The timeslots either major or minor slots can be customized with this property.
    */
  var timeScale: js.UndefOr[TimeScale] = js.undefined
  /** Sets the timezone for the Schedule.
    * @Default {null}
    */
  var timeZone: js.UndefOr[String] = js.undefined
  /** Sets the collection of timezone items to be bound to the Schedule. Only the items bound to this property gets listed out in the timezone field of the appointment window.
    */
  var timeZoneCollection: js.UndefOr[TimeZoneCollection] = js.undefined
  /** Allows to pop-up appointment details in a tooltip while hovering over the appointments.
    */
  var tooltipSettings: js.UndefOr[TooltipSettings] = js.undefined
  /** Defines the view collection to be displayed on the Schedule. By default, it displays all the views namely, Day, Week, WorkWeek and Month.
    * @Default {[Day, Week, WorkWeek, Month, Agenda]}
    */
  var views: js.UndefOr[js.Array[_]] = js.undefined
  /** Sets the width of the Schedule. Accepts both pixel and percentage values.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.undefined
  /** Accepts the id value of the template layout defined for the work cells and month cells.
    * @Default {null}
    */
  var workCellsTemplateId: js.UndefOr[String] = js.undefined
  /** To define the work hours within the Schedule control.
    */
  var workHours: js.UndefOr[WorkHours] = js.undefined
  /** Sets different day collection within workWeek view.
    * @Default {[Monday, Tuesday, Wednesday, Thursday, Friday]}
    */
  var workWeek: js.UndefOr[js.Array[_]] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Callback = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Callback = null,
    agendaViewSettings: AgendaViewSettings = null,
    allDayCellsTemplateId: String = null,
    allowDelete: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowInline: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    appointmentChanged: /* e */ AppointmentChangedEventArgs => Callback = null,
    appointmentClick: /* e */ AppointmentClickEventArgs => Callback = null,
    appointmentCreated: /* e */ AppointmentCreatedEventArgs => Callback = null,
    appointmentDragArea: String = null,
    appointmentHover: /* e */ AppointmentHoverEventArgs => Callback = null,
    appointmentRemoved: /* e */ AppointmentRemovedEventArgs => Callback = null,
    appointmentSettings: AppointmentSettings = null,
    appointmentTemplateId: String = null,
    appointmentWindowOpen: /* e */ AppointmentWindowOpenEventArgs => Callback = null,
    beforeAppointmentChange: /* e */ BeforeAppointmentChangeEventArgs => Callback = null,
    beforeAppointmentCreate: /* e */ BeforeAppointmentCreateEventArgs => Callback = null,
    beforeAppointmentRemove: /* e */ BeforeAppointmentRemoveEventArgs => Callback = null,
    beforeContextMenuOpen: /* e */ BeforeContextMenuOpenEventArgs => Callback = null,
    blockoutSettings: BlockoutSettings = null,
    categorizeSettings: CategorizeSettings = null,
    cellClick: /* e */ CellClickEventArgs => Callback = null,
    cellDoubleClick: /* e */ CellDoubleClickEventArgs => Callback = null,
    cellHeight: String = null,
    cellHover: /* e */ CellHoverEventArgs => Callback = null,
    cellWidth: String = null,
    contextMenuSettings: ContextMenuSettings = null,
    create: /* e */ CreateEventArgs => Callback = null,
    cssClass: String = null,
    currentDate: js.Any = null,
    currentView: String | CurrentView = null,
    dateFormat: String = null,
    dateHeaderTemplateId: String = null,
    destroy: /* e */ DestroyEventArgs => Callback = null,
    drag: /* e */ DragEventArgs => Callback = null,
    dragStart: /* e */ DragStartEventArgs => Callback = null,
    dragStop: /* e */ DragStopEventArgs => Callback = null,
    enableAppointmentResize: js.UndefOr[Boolean] = js.undefined,
    enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined,
    enablePersistence: js.UndefOr[Boolean] = js.undefined,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enableRecurrenceValidation: js.UndefOr[Boolean] = js.undefined,
    endHour: Int | Double = null,
    firstDayOfWeek: String = null,
    group: Group = null,
    height: String = null,
    isDST: js.UndefOr[Boolean] = js.undefined,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    keyDown: /* e */ KeyDownEventArgs => Callback = null,
    locale: String = null,
    maxDate: js.Any = null,
    menuItemClick: /* e */ MenuItemClickEventArgs => Callback = null,
    minDate: js.Any = null,
    navigation: /* e */ NavigationEventArgs => Callback = null,
    orientation: String | Orientation = null,
    overflowButtonClick: /* e */ OverflowButtonClickEventArgs => Callback = null,
    overflowButtonHover: /* e */ OverflowButtonHoverEventArgs => Callback = null,
    prioritySettings: PrioritySettings = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Callback = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    reminder: /* e */ ReminderEventArgs => Callback = null,
    reminderSettings: ReminderSettings = null,
    renderDates: RenderDates = null,
    resize: /* e */ ResizeEventArgs => Callback = null,
    resizeStart: /* e */ ResizeStartEventArgs => Callback = null,
    resizeStop: /* e */ ResizeStopEventArgs => Callback = null,
    resourceHeaderTemplateId: String = null,
    resources: js.Array[Resource] = null,
    showAllDayRow: js.UndefOr[Boolean] = js.undefined,
    showAppointmentNavigator: js.UndefOr[Boolean] = js.undefined,
    showCurrentTimeIndicator: js.UndefOr[Boolean] = js.undefined,
    showDeleteConfirmationDialog: js.UndefOr[Boolean] = js.undefined,
    showHeaderBar: js.UndefOr[Boolean] = js.undefined,
    showLocationField: js.UndefOr[Boolean] = js.undefined,
    showNextPrevMonth: js.UndefOr[Boolean] = js.undefined,
    showOverflowButton: js.UndefOr[Boolean] = js.undefined,
    showQuickWindow: js.UndefOr[Boolean] = js.undefined,
    showTimeZoneFields: js.UndefOr[Boolean] = js.undefined,
    showWeekend: js.UndefOr[Boolean] = js.undefined,
    startHour: Int | Double = null,
    timeMode: String | TimeMode = null,
    timeScale: TimeScale = null,
    timeZone: String = null,
    timeZoneCollection: TimeZoneCollection = null,
    tooltipSettings: TooltipSettings = null,
    views: js.Array[_] = null,
    width: String = null,
    workCellsTemplateId: String = null,
    workHours: WorkHours = null,
    workWeek: js.Array[_] = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ActionBeginEventArgs) => actionBegin(t0).runNow()))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ActionCompleteEventArgs) => actionComplete(t0).runNow()))
    if (agendaViewSettings != null) __obj.updateDynamic("agendaViewSettings")(agendaViewSettings.asInstanceOf[js.Any])
    if (allDayCellsTemplateId != null) __obj.updateDynamic("allDayCellsTemplateId")(allDayCellsTemplateId.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(allowInline)) __obj.updateDynamic("allowInline")(allowInline.asInstanceOf[js.Any])
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation.asInstanceOf[js.Any])
    if (appointmentChanged != null) __obj.updateDynamic("appointmentChanged")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentChangedEventArgs) => appointmentChanged(t0).runNow()))
    if (appointmentClick != null) __obj.updateDynamic("appointmentClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentClickEventArgs) => appointmentClick(t0).runNow()))
    if (appointmentCreated != null) __obj.updateDynamic("appointmentCreated")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentCreatedEventArgs) => appointmentCreated(t0).runNow()))
    if (appointmentDragArea != null) __obj.updateDynamic("appointmentDragArea")(appointmentDragArea.asInstanceOf[js.Any])
    if (appointmentHover != null) __obj.updateDynamic("appointmentHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentHoverEventArgs) => appointmentHover(t0).runNow()))
    if (appointmentRemoved != null) __obj.updateDynamic("appointmentRemoved")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentRemovedEventArgs) => appointmentRemoved(t0).runNow()))
    if (appointmentSettings != null) __obj.updateDynamic("appointmentSettings")(appointmentSettings.asInstanceOf[js.Any])
    if (appointmentTemplateId != null) __obj.updateDynamic("appointmentTemplateId")(appointmentTemplateId.asInstanceOf[js.Any])
    if (appointmentWindowOpen != null) __obj.updateDynamic("appointmentWindowOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.AppointmentWindowOpenEventArgs) => appointmentWindowOpen(t0).runNow()))
    if (beforeAppointmentChange != null) __obj.updateDynamic("beforeAppointmentChange")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.BeforeAppointmentChangeEventArgs) => beforeAppointmentChange(t0).runNow()))
    if (beforeAppointmentCreate != null) __obj.updateDynamic("beforeAppointmentCreate")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.BeforeAppointmentCreateEventArgs) => beforeAppointmentCreate(t0).runNow()))
    if (beforeAppointmentRemove != null) __obj.updateDynamic("beforeAppointmentRemove")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.BeforeAppointmentRemoveEventArgs) => beforeAppointmentRemove(t0).runNow()))
    if (beforeContextMenuOpen != null) __obj.updateDynamic("beforeContextMenuOpen")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.BeforeContextMenuOpenEventArgs) => beforeContextMenuOpen(t0).runNow()))
    if (blockoutSettings != null) __obj.updateDynamic("blockoutSettings")(blockoutSettings.asInstanceOf[js.Any])
    if (categorizeSettings != null) __obj.updateDynamic("categorizeSettings")(categorizeSettings.asInstanceOf[js.Any])
    if (cellClick != null) __obj.updateDynamic("cellClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.CellClickEventArgs) => cellClick(t0).runNow()))
    if (cellDoubleClick != null) __obj.updateDynamic("cellDoubleClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.CellDoubleClickEventArgs) => cellDoubleClick(t0).runNow()))
    if (cellHeight != null) __obj.updateDynamic("cellHeight")(cellHeight.asInstanceOf[js.Any])
    if (cellHover != null) __obj.updateDynamic("cellHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.CellHoverEventArgs) => cellHover(t0).runNow()))
    if (cellWidth != null) __obj.updateDynamic("cellWidth")(cellWidth.asInstanceOf[js.Any])
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings.asInstanceOf[js.Any])
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.CreateEventArgs) => create(t0).runNow()))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (currentDate != null) __obj.updateDynamic("currentDate")(currentDate.asInstanceOf[js.Any])
    if (currentView != null) __obj.updateDynamic("currentView")(currentView.asInstanceOf[js.Any])
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dateHeaderTemplateId != null) __obj.updateDynamic("dateHeaderTemplateId")(dateHeaderTemplateId.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.DestroyEventArgs) => destroy(t0).runNow()))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.DragEventArgs) => drag(t0).runNow()))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.DragStartEventArgs) => dragStart(t0).runNow()))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.DragStopEventArgs) => dragStop(t0).runNow()))
    if (!js.isUndefined(enableAppointmentResize)) __obj.updateDynamic("enableAppointmentResize")(enableAppointmentResize.asInstanceOf[js.Any])
    if (!js.isUndefined(enableLoadOnDemand)) __obj.updateDynamic("enableLoadOnDemand")(enableLoadOnDemand.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRecurrenceValidation)) __obj.updateDynamic("enableRecurrenceValidation")(enableRecurrenceValidation.asInstanceOf[js.Any])
    if (endHour != null) __obj.updateDynamic("endHour")(endHour.asInstanceOf[js.Any])
    if (firstDayOfWeek != null) __obj.updateDynamic("firstDayOfWeek")(firstDayOfWeek.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(isDST)) __obj.updateDynamic("isDST")(isDST.asInstanceOf[js.Any])
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive.asInstanceOf[js.Any])
    if (keyDown != null) __obj.updateDynamic("keyDown")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.KeyDownEventArgs) => keyDown(t0).runNow()))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxDate != null) __obj.updateDynamic("maxDate")(maxDate.asInstanceOf[js.Any])
    if (menuItemClick != null) __obj.updateDynamic("menuItemClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.MenuItemClickEventArgs) => menuItemClick(t0).runNow()))
    if (minDate != null) __obj.updateDynamic("minDate")(minDate.asInstanceOf[js.Any])
    if (navigation != null) __obj.updateDynamic("navigation")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.NavigationEventArgs) => navigation(t0).runNow()))
    if (orientation != null) __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    if (overflowButtonClick != null) __obj.updateDynamic("overflowButtonClick")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.OverflowButtonClickEventArgs) => overflowButtonClick(t0).runNow()))
    if (overflowButtonHover != null) __obj.updateDynamic("overflowButtonHover")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.OverflowButtonHoverEventArgs) => overflowButtonHover(t0).runNow()))
    if (prioritySettings != null) __obj.updateDynamic("prioritySettings")(prioritySettings.asInstanceOf[js.Any])
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.QueryCellInfoEventArgs) => queryCellInfo(t0).runNow()))
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (reminder != null) __obj.updateDynamic("reminder")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ReminderEventArgs) => reminder(t0).runNow()))
    if (reminderSettings != null) __obj.updateDynamic("reminderSettings")(reminderSettings.asInstanceOf[js.Any])
    if (renderDates != null) __obj.updateDynamic("renderDates")(renderDates.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ResizeEventArgs) => resize(t0).runNow()))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ResizeStartEventArgs) => resizeStart(t0).runNow()))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1((t0: /* e */ typingsJapgolly.ejWebAll.ej.Schedule.ResizeStopEventArgs) => resizeStop(t0).runNow()))
    if (resourceHeaderTemplateId != null) __obj.updateDynamic("resourceHeaderTemplateId")(resourceHeaderTemplateId.asInstanceOf[js.Any])
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (!js.isUndefined(showAllDayRow)) __obj.updateDynamic("showAllDayRow")(showAllDayRow.asInstanceOf[js.Any])
    if (!js.isUndefined(showAppointmentNavigator)) __obj.updateDynamic("showAppointmentNavigator")(showAppointmentNavigator.asInstanceOf[js.Any])
    if (!js.isUndefined(showCurrentTimeIndicator)) __obj.updateDynamic("showCurrentTimeIndicator")(showCurrentTimeIndicator.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleteConfirmationDialog)) __obj.updateDynamic("showDeleteConfirmationDialog")(showDeleteConfirmationDialog.asInstanceOf[js.Any])
    if (!js.isUndefined(showHeaderBar)) __obj.updateDynamic("showHeaderBar")(showHeaderBar.asInstanceOf[js.Any])
    if (!js.isUndefined(showLocationField)) __obj.updateDynamic("showLocationField")(showLocationField.asInstanceOf[js.Any])
    if (!js.isUndefined(showNextPrevMonth)) __obj.updateDynamic("showNextPrevMonth")(showNextPrevMonth.asInstanceOf[js.Any])
    if (!js.isUndefined(showOverflowButton)) __obj.updateDynamic("showOverflowButton")(showOverflowButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showQuickWindow)) __obj.updateDynamic("showQuickWindow")(showQuickWindow.asInstanceOf[js.Any])
    if (!js.isUndefined(showTimeZoneFields)) __obj.updateDynamic("showTimeZoneFields")(showTimeZoneFields.asInstanceOf[js.Any])
    if (!js.isUndefined(showWeekend)) __obj.updateDynamic("showWeekend")(showWeekend.asInstanceOf[js.Any])
    if (startHour != null) __obj.updateDynamic("startHour")(startHour.asInstanceOf[js.Any])
    if (timeMode != null) __obj.updateDynamic("timeMode")(timeMode.asInstanceOf[js.Any])
    if (timeScale != null) __obj.updateDynamic("timeScale")(timeScale.asInstanceOf[js.Any])
    if (timeZone != null) __obj.updateDynamic("timeZone")(timeZone.asInstanceOf[js.Any])
    if (timeZoneCollection != null) __obj.updateDynamic("timeZoneCollection")(timeZoneCollection.asInstanceOf[js.Any])
    if (tooltipSettings != null) __obj.updateDynamic("tooltipSettings")(tooltipSettings.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (workCellsTemplateId != null) __obj.updateDynamic("workCellsTemplateId")(workCellsTemplateId.asInstanceOf[js.Any])
    if (workHours != null) __obj.updateDynamic("workHours")(workHours.asInstanceOf[js.Any])
    if (workWeek != null) __obj.updateDynamic("workWeek")(workWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

