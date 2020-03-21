package typingsJapgolly.reactBigCalendar.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Formats extends js.Object {
  var agendaDateFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * Toolbar header format for the Agenda view, e.g. "4/1/2015 — 5/1/2015"
    */
  var agendaHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  var agendaTimeFormat: js.UndefOr[DateFormat] = js.undefined
  var agendaTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * Format for the day of the month heading in the Month view.
    * e.g. "01", "02", "03", etc
    */
  var dateFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * A day of the week format for Week and Day headings,
    * e.g. "Wed 01/04"
    *
    */
  var dayFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * Toolbar header format for the Day view, e.g. "Wednesday Apr 01"
    */
  var dayHeaderFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * Toolbar header format for the Week views, e.g. "Mar 29 - Apr 04"
    */
  var dayRangeHeaderFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * An optional event time range for events that continue from another day
    */
  var eventTimeRangeEndFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * Time range displayed on events.
    */
  var eventTimeRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * An optional event time range for events that continue onto another day
    */
  var eventTimeRangeStartFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * Toolbar header format for the Month view, e.g "2015 April"
    *
    */
  var monthHeaderFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * A time range format for selecting time slots, e.g "8:00am — 2:00pm"
    */
  var selectRangeFormat: js.UndefOr[DateRangeFormatFunction] = js.undefined
  /**
    * The timestamp cell formats in Week and Time views, e.g. "4:00 AM"
    */
  var timeGutterFormat: js.UndefOr[DateFormat] = js.undefined
  /**
    * Week day name format for the Month week day headings,
    * e.g: "Sun", "Mon", "Tue", etc
    *
    */
  var weekdayFormat: js.UndefOr[DateFormat] = js.undefined
}

object Formats {
  @scala.inline
  def apply(
    agendaDateFormat: DateFormat = null,
    agendaHeaderFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    agendaTimeFormat: DateFormat = null,
    agendaTimeRangeFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    dateFormat: DateFormat = null,
    dayFormat: DateFormat = null,
    dayHeaderFormat: DateFormat = null,
    dayRangeHeaderFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    eventTimeRangeEndFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    eventTimeRangeFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    eventTimeRangeStartFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    monthHeaderFormat: DateFormat = null,
    selectRangeFormat: (/* range */ DateRange, /* culture */ js.UndefOr[Culture], /* localizer */ js.UndefOr[DateLocalizer]) => CallbackTo[String] = null,
    timeGutterFormat: DateFormat = null,
    weekdayFormat: DateFormat = null
  ): Formats = {
    val __obj = js.Dynamic.literal()
    if (agendaDateFormat != null) __obj.updateDynamic("agendaDateFormat")(agendaDateFormat.asInstanceOf[js.Any])
    if (agendaHeaderFormat != null) __obj.updateDynamic("agendaHeaderFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => agendaHeaderFormat(t0, t1, t2).runNow()))
    if (agendaTimeFormat != null) __obj.updateDynamic("agendaTimeFormat")(agendaTimeFormat.asInstanceOf[js.Any])
    if (agendaTimeRangeFormat != null) __obj.updateDynamic("agendaTimeRangeFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => agendaTimeRangeFormat(t0, t1, t2).runNow()))
    if (dateFormat != null) __obj.updateDynamic("dateFormat")(dateFormat.asInstanceOf[js.Any])
    if (dayFormat != null) __obj.updateDynamic("dayFormat")(dayFormat.asInstanceOf[js.Any])
    if (dayHeaderFormat != null) __obj.updateDynamic("dayHeaderFormat")(dayHeaderFormat.asInstanceOf[js.Any])
    if (dayRangeHeaderFormat != null) __obj.updateDynamic("dayRangeHeaderFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => dayRangeHeaderFormat(t0, t1, t2).runNow()))
    if (eventTimeRangeEndFormat != null) __obj.updateDynamic("eventTimeRangeEndFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => eventTimeRangeEndFormat(t0, t1, t2).runNow()))
    if (eventTimeRangeFormat != null) __obj.updateDynamic("eventTimeRangeFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => eventTimeRangeFormat(t0, t1, t2).runNow()))
    if (eventTimeRangeStartFormat != null) __obj.updateDynamic("eventTimeRangeStartFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => eventTimeRangeStartFormat(t0, t1, t2).runNow()))
    if (monthHeaderFormat != null) __obj.updateDynamic("monthHeaderFormat")(monthHeaderFormat.asInstanceOf[js.Any])
    if (selectRangeFormat != null) __obj.updateDynamic("selectRangeFormat")(js.Any.fromFunction3((t0: /* range */ typingsJapgolly.reactBigCalendar.mod.DateRange, t1: /* culture */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.Culture], t2: /* localizer */ js.UndefOr[typingsJapgolly.reactBigCalendar.mod.DateLocalizer]) => selectRangeFormat(t0, t1, t2).runNow()))
    if (timeGutterFormat != null) __obj.updateDynamic("timeGutterFormat")(timeGutterFormat.asInstanceOf[js.Any])
    if (weekdayFormat != null) __obj.updateDynamic("weekdayFormat")(weekdayFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
}

