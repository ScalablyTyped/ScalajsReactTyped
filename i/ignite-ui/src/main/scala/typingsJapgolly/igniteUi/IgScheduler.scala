package typingsJapgolly.igniteUi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IgScheduler
  extends /**
	 * Option for igScheduler
	 */
/* optionName */ StringDictionary[js.Any] {
  /**
  	 * Fired after agenda view range is changed when using previous and next buttons (fired only in Agenda View)
  	 */
  var agendaRangeChanged: js.UndefOr[AgendaRangeChangedEvent] = js.undefined
  /**
  	 * Fired before agenda view range is changed when using previous and next buttons (fired only in Agenda View)
  	 */
  var agendaRangeChanging: js.UndefOr[AgendaRangeChangingEvent] = js.undefined
  /**
  	 * Gets/Sets AgendaView settings.
  	 *
  	 */
  var agendaViewSettings: js.UndefOr[IgSchedulerAgendaViewSettings] = js.undefined
  /**
  	 * Fired after an appointment is created.
  	 */
  var appointmentCreated: js.UndefOr[AppointmentCreatedEvent] = js.undefined
  /**
  	 * Fired before an appointment is created.
  	 */
  var appointmentCreating: js.UndefOr[AppointmentCreatingEvent] = js.undefined
  /**
  	 * Fired after an appointment is deleted.
  	 */
  var appointmentDeleted: js.UndefOr[AppointmentDeletedEvent] = js.undefined
  /**
  	 * Fired before an appointment is deleted.
  	 */
  var appointmentDeleting: js.UndefOr[AppointmentDeletingEvent] = js.undefined
  /**
  	 * Fired after closing the dialog window for adding/editing appointment.
  	 */
  var appointmentDialogClosed: js.UndefOr[AppointmentDialogClosedEvent] = js.undefined
  /**
  	 * Fired before closing the dialog for adding/editing appointment.
  	 */
  var appointmentDialogClosing: js.UndefOr[AppointmentDialogClosingEvent] = js.undefined
  /**
  	 * Fired after opening the dialog for creating/editing appointment.
  	 */
  var appointmentDialogOpened: js.UndefOr[AppointmentDialogOpenedEvent] = js.undefined
  /**
  	 * Fired before opening the dialog for creating/editing appointment.
  	 */
  var appointmentDialogOpening: js.UndefOr[AppointmentDialogOpeningEvent] = js.undefined
  /**
  	 * Gets/Sets whether the appointment dialog and the related day and appointment popups should be shown.
  	 *
  	 */
  var appointmentDialogSuppress: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Fired after an appointment is edited.
  	 */
  var appointmentEdited: js.UndefOr[AppointmentEditedEvent] = js.undefined
  /**
  	 * Fired before an appointment is edited.
  	 */
  var appointmentEditing: js.UndefOr[AppointmentEditingEvent] = js.undefined
  /**
  	 * Gets/Sets dataSource of type $.ig.scheduler.ScheduleListDataSource.
  	 *
  	 */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after day is changed when using previous and next buttons (fired only in Day View)
  	 */
  var dayChanged: js.UndefOr[DayChangedEvent] = js.undefined
  /**
  	 * Fired before changing the day begins, when using previous and next buttons (fired only in Day View)
  	 */
  var dayChanging: js.UndefOr[DayChangingEvent] = js.undefined
  /**
  	 * Fired when a day is selected from the datepicker calendar.
  	 */
  var daySelected: js.UndefOr[DaySelectedEvent] = js.undefined
  /**
  	 * Gets/Sets DayView settings.
  	 *
  	 */
  var dayViewSettings: js.UndefOr[IgSchedulerDayViewSettings] = js.undefined
  /**
  	 * Enables/Disables today button.
  	 *
  	 */
  var enableTodayButton: js.UndefOr[Boolean] = js.undefined
  /**
  	 * Gets/Sets the height of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will fit the editor inside its parent container, if no other heights are defined.
  	 */
  var height: js.UndefOr[String | Double] = js.undefined
  /**
  	 * Set/Get the locale language setting for the widget.
  	 *
  	 */
  var language: js.UndefOr[String] = js.undefined
  /**
  	 * Set/Get the locale setting for the widget.
  	 *
  	 */
  var locale: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Fired after month is changed when using previous and next buttons (fired only in Month View)
  	 */
  var monthChanged: js.UndefOr[MonthChangedEvent] = js.undefined
  /**
  	 * Fired before changing the month begins, when using previous and next buttons (fired only in Month View)
  	 */
  var monthChanging: js.UndefOr[MonthChangingEvent] = js.undefined
  /**
  	 * Gets/Sets MonthView settings.
  	 *
  	 */
  var monthViewSettings: js.UndefOr[IgSchedulerMonthViewSettings] = js.undefined
  /**
  	 * Set/Get the regional setting for the widget.
  	 *
  	 */
  var regional: js.UndefOr[String | js.Object] = js.undefined
  /**
  	 * Fired after rendering of the scheduler has finished.
  	 */
  var rendered: js.UndefOr[RenderedEvent] = js.undefined
  /**
  	 * Fired before rendering of the scheduler begins.
  	 */
  var rendering: js.UndefOr[RenderingEvent] = js.undefined
  /**
  	 * Gets the resources collection that holds the activities` owners
  	 *
  	 * //Initialize
  	 * var resources = [
  	 * { id: 1, displayName: "Trina Friesen" },
  	 * { id: 2, displayName: "Mack Koch" }];
  	 * $(".selector").%%WidgetName%%({
  	 * resources: resources
  	 * });
  	 *
  	 * // Get
  	 * var resources = $(".selector").%%WidgetName%%("option", "resources");
  	 */
  var resources: js.UndefOr[js.Any] = js.undefined
  /**
  	 * Gets/Sets selected date in the Scheduler.
  	 *
  	 */
  var selectedDate: js.UndefOr[js.Date] = js.undefined
  /**
  	 * Fired after the view is changed, when using the menu buttons.
  	 */
  var viewChanged: js.UndefOr[ViewChangedEvent] = js.undefined
  /**
  	 * Fired before the view is changed, when using the menu buttons.
  	 */
  var viewChanging: js.UndefOr[ViewChangingEvent] = js.undefined
  /**
  	 * Gets/Sets current view mode in the Scheduler. If this options is not defined, then the first defined view in the views property is taken.
  	 *
  	 *
  	 * Valid values:
  	 * "monthView" Enables MonthView in the Scheduler.
  	 * "agendaView" Enables AgendaView in the Scheduler.
  	 */
  var viewMode: js.UndefOr[String] = js.undefined
  /**
  	 * Lists of all the views, rendered in the Scheduler.
  	 *
  	 */
  var views: js.UndefOr[js.Array[_]] = js.undefined
  /**
  	 * Fired after week is changed when using previous and next buttons (fired only in Week View)
  	 */
  var weekChanged: js.UndefOr[WeekChangedEvent] = js.undefined
  /**
  	 * Fired before changing the week begins, when using previous and next buttons (fired only in Week View)
  	 */
  var weekChanging: js.UndefOr[WeekChangingEvent] = js.undefined
  /**
  	 * Gets/Sets WeekView settings.
  	 *
  	 */
  var weekViewSettings: js.UndefOr[IgSchedulerWeekViewSettings] = js.undefined
  /**
  	 * Gets/Sets the width of the control.
  	 *
  	 *
  	 * Valid values:
  	 * "null" will stretch to fit data, if no other widths are defined.
  	 */
  var width: js.UndefOr[String | Double] = js.undefined
}

object IgScheduler {
  @scala.inline
  def apply(
    StringDictionary: /**
  	 * Option for igScheduler
  	 */
  /* optionName */ StringDictionary[js.Any] = null,
    agendaRangeChanged: (/* event */ Event_, /* ui */ AgendaRangeChangedEventUIParam) => Callback = null,
    agendaRangeChanging: (/* event */ Event_, /* ui */ AgendaRangeChangingEventUIParam) => Callback = null,
    agendaViewSettings: IgSchedulerAgendaViewSettings = null,
    appointmentCreated: (/* event */ Event_, /* ui */ AppointmentCreatedEventUIParam) => Callback = null,
    appointmentCreating: (/* event */ Event_, /* ui */ AppointmentCreatingEventUIParam) => Callback = null,
    appointmentDeleted: (/* event */ Event_, /* ui */ AppointmentDeletedEventUIParam) => Callback = null,
    appointmentDeleting: (/* event */ Event_, /* ui */ AppointmentDeletingEventUIParam) => Callback = null,
    appointmentDialogClosed: (/* event */ Event_, /* ui */ AppointmentDialogClosedEventUIParam) => Callback = null,
    appointmentDialogClosing: (/* event */ Event_, /* ui */ AppointmentDialogClosingEventUIParam) => Callback = null,
    appointmentDialogOpened: (/* event */ Event_, /* ui */ AppointmentDialogOpenedEventUIParam) => Callback = null,
    appointmentDialogOpening: (/* event */ Event_, /* ui */ AppointmentDialogOpeningEventUIParam) => Callback = null,
    appointmentDialogSuppress: js.UndefOr[Boolean] = js.undefined,
    appointmentEdited: (/* event */ Event_, /* ui */ AppointmentEditedEventUIParam) => Callback = null,
    appointmentEditing: (/* event */ Event_, /* ui */ AppointmentEditingEventUIParam) => Callback = null,
    dataSource: js.Any = null,
    dayChanged: (/* event */ Event_, /* ui */ DayChangedEventUIParam) => Callback = null,
    dayChanging: (/* event */ Event_, /* ui */ DayChangingEventUIParam) => Callback = null,
    daySelected: (/* event */ Event_, /* ui */ DaySelectedEventUIParam) => Callback = null,
    dayViewSettings: IgSchedulerDayViewSettings = null,
    enableTodayButton: js.UndefOr[Boolean] = js.undefined,
    height: String | Double = null,
    language: String = null,
    locale: js.Any = null,
    monthChanged: (/* event */ Event_, /* ui */ MonthChangedEventUIParam) => Callback = null,
    monthChanging: (/* event */ Event_, /* ui */ MonthChangingEventUIParam) => Callback = null,
    monthViewSettings: IgSchedulerMonthViewSettings = null,
    regional: String | js.Object = null,
    rendered: (/* event */ Event_, /* ui */ RenderedEventUIParam) => Callback = null,
    rendering: (/* event */ Event_, /* ui */ RenderingEventUIParam) => Callback = null,
    resources: js.Any = null,
    selectedDate: js.Date = null,
    viewChanged: (/* event */ Event_, /* ui */ ViewChangedEventUIParam) => Callback = null,
    viewChanging: (/* event */ Event_, /* ui */ ViewChangingEventUIParam) => Callback = null,
    viewMode: String = null,
    views: js.Array[_] = null,
    weekChanged: (/* event */ Event_, /* ui */ WeekChangedEventUIParam) => Callback = null,
    weekChanging: (/* event */ Event_, /* ui */ WeekChangingEventUIParam) => Callback = null,
    weekViewSettings: IgSchedulerWeekViewSettings = null,
    width: String | Double = null
  ): IgScheduler = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (agendaRangeChanged != null) __obj.updateDynamic("agendaRangeChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AgendaRangeChangedEventUIParam) => agendaRangeChanged(t0, t1).runNow()))
    if (agendaRangeChanging != null) __obj.updateDynamic("agendaRangeChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AgendaRangeChangingEventUIParam) => agendaRangeChanging(t0, t1).runNow()))
    if (agendaViewSettings != null) __obj.updateDynamic("agendaViewSettings")(agendaViewSettings.asInstanceOf[js.Any])
    if (appointmentCreated != null) __obj.updateDynamic("appointmentCreated")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentCreatedEventUIParam) => appointmentCreated(t0, t1).runNow()))
    if (appointmentCreating != null) __obj.updateDynamic("appointmentCreating")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentCreatingEventUIParam) => appointmentCreating(t0, t1).runNow()))
    if (appointmentDeleted != null) __obj.updateDynamic("appointmentDeleted")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDeletedEventUIParam) => appointmentDeleted(t0, t1).runNow()))
    if (appointmentDeleting != null) __obj.updateDynamic("appointmentDeleting")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDeletingEventUIParam) => appointmentDeleting(t0, t1).runNow()))
    if (appointmentDialogClosed != null) __obj.updateDynamic("appointmentDialogClosed")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDialogClosedEventUIParam) => appointmentDialogClosed(t0, t1).runNow()))
    if (appointmentDialogClosing != null) __obj.updateDynamic("appointmentDialogClosing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDialogClosingEventUIParam) => appointmentDialogClosing(t0, t1).runNow()))
    if (appointmentDialogOpened != null) __obj.updateDynamic("appointmentDialogOpened")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDialogOpenedEventUIParam) => appointmentDialogOpened(t0, t1).runNow()))
    if (appointmentDialogOpening != null) __obj.updateDynamic("appointmentDialogOpening")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentDialogOpeningEventUIParam) => appointmentDialogOpening(t0, t1).runNow()))
    if (!js.isUndefined(appointmentDialogSuppress)) __obj.updateDynamic("appointmentDialogSuppress")(appointmentDialogSuppress.asInstanceOf[js.Any])
    if (appointmentEdited != null) __obj.updateDynamic("appointmentEdited")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentEditedEventUIParam) => appointmentEdited(t0, t1).runNow()))
    if (appointmentEditing != null) __obj.updateDynamic("appointmentEditing")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.AppointmentEditingEventUIParam) => appointmentEditing(t0, t1).runNow()))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dayChanged != null) __obj.updateDynamic("dayChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DayChangedEventUIParam) => dayChanged(t0, t1).runNow()))
    if (dayChanging != null) __obj.updateDynamic("dayChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DayChangingEventUIParam) => dayChanging(t0, t1).runNow()))
    if (daySelected != null) __obj.updateDynamic("daySelected")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.DaySelectedEventUIParam) => daySelected(t0, t1).runNow()))
    if (dayViewSettings != null) __obj.updateDynamic("dayViewSettings")(dayViewSettings.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTodayButton)) __obj.updateDynamic("enableTodayButton")(enableTodayButton.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (monthChanged != null) __obj.updateDynamic("monthChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MonthChangedEventUIParam) => monthChanged(t0, t1).runNow()))
    if (monthChanging != null) __obj.updateDynamic("monthChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.MonthChangingEventUIParam) => monthChanging(t0, t1).runNow()))
    if (monthViewSettings != null) __obj.updateDynamic("monthViewSettings")(monthViewSettings.asInstanceOf[js.Any])
    if (regional != null) __obj.updateDynamic("regional")(regional.asInstanceOf[js.Any])
    if (rendered != null) __obj.updateDynamic("rendered")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderedEventUIParam) => rendered(t0, t1).runNow()))
    if (rendering != null) __obj.updateDynamic("rendering")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.RenderingEventUIParam) => rendering(t0, t1).runNow()))
    if (resources != null) __obj.updateDynamic("resources")(resources.asInstanceOf[js.Any])
    if (selectedDate != null) __obj.updateDynamic("selectedDate")(selectedDate.asInstanceOf[js.Any])
    if (viewChanged != null) __obj.updateDynamic("viewChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ViewChangedEventUIParam) => viewChanged(t0, t1).runNow()))
    if (viewChanging != null) __obj.updateDynamic("viewChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.ViewChangingEventUIParam) => viewChanging(t0, t1).runNow()))
    if (viewMode != null) __obj.updateDynamic("viewMode")(viewMode.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    if (weekChanged != null) __obj.updateDynamic("weekChanged")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.WeekChangedEventUIParam) => weekChanged(t0, t1).runNow()))
    if (weekChanging != null) __obj.updateDynamic("weekChanging")(js.Any.fromFunction2((t0: /* event */ typingsJapgolly.std.Event_, t1: /* ui */ typingsJapgolly.igniteUi.WeekChangingEventUIParam) => weekChanging(t0, t1).runNow()))
    if (weekViewSettings != null) __obj.updateDynamic("weekViewSettings")(weekViewSettings.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgScheduler]
  }
}

