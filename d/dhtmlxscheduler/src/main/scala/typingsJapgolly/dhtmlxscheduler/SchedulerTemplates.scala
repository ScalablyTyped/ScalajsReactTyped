package typingsJapgolly.dhtmlxscheduler

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SchedulerTemplates extends js.Object {
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def agenda_date(start: js.Date, end: js.Date): String
  /**
  	 * specifies the text in the second column of the Agenda view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def agenda_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the first column of the Agenda view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def agenda_time(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the format of dates that are set by means of API methods. Used to parse incoming dates
  	 * @param date the date which needs formatting
  	*/
  def api_date(date: js.Date): String
  /**
  	 * specifies the format of the date in a cell
  	 * @param date the cell's date
  	*/
  def calendar_date(date: js.Date): String
  /**
  	 * specifies the date in the header of the calendar
  	 * @param date the date which needs formatting
  	*/
  def calendar_month(date: js.Date): String
  /**
  	 * specifies the day name in the week sub-header of the view
  	 * @param date the date which needs formatting
  	*/
  def calendar_scale_date(date: js.Date): String
  /**
  	 * specifies the date format of the lightbox's start and end date inputs
  	 * @param date the date which needs formatting
  	*/
  def calendar_time(date: js.Date): String
  /**
  	 * specifies the date in the header of the Day and Units views
  	 * @param date the date which needs formatting
  	*/
  def day_date(date: js.Date): String
  /**
  	 * specifies the date in the sub-header of the Day view
  	 * @param date the date which needs formatting
  	*/
  def day_scale_date(date: js.Date): String
  /**
  	 * specifies the CSS class that will be applied to the highlighted event's duration on the time scale
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def drag_marker_class(start: js.Date, end: js.Date, ev: js.Any): Unit
  /**
  	 * specifies the content of the highlighted block  on the time scale
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def drag_marker_content(start: js.Date, end: js.Date, ev: js.Any): Unit
  /**
  	 * specifies the date of an event. Applied to one-day events only
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def event_bar_date(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the event's text. Applied to multi-day events only
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event's object
  	*/
  def event_bar_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the CSS class that will be applied to the event's container
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event's object
  	*/
  def event_class(start: js.Date, end: js.Date, ev: js.Any): String
  /**
  	 * specifies the time part of the start and end dates of the event. Mostly used by other templates for presenting time periods
  	 * @param date the date which needs formatting
  	*/
  def event_date(date: js.Date): String
  /**
  	 * specifies the event's header
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event's object
  	*/
  def event_header(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the event's text
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def event_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def grid_date(start: js.Date, end: js.Date): String
  /**
  	 * specifies the text in the columns
  	 * @param field_name the column's id
  	 * @param event the event object
  	*/
  def grid_field(field_name: String, event: js.Any): String
  /**
  	 * specifies the format of dates in columns with id='date'
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param ev the event object
  	*/
  def grid_full_date(start: js.Date, end: js.Date, ev: js.Any): String
  /**
  	 * specifies the format of dates in columns with id='start_date' or id='end_date'
  	 * @param date the date which needs formatting
  	*/
  def grid_single_date(date: js.Date): String
  /**
  	 * specifies the items of the Y-Axis
  	 * @param date the date which needs formatting
  	*/
  def hour_scale(date: js.Date): String
  /**
  	 * specifies the lightbox's header
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def lightbox_header(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the format of requests in the dynamic loading mode
  	 * @param date the date which needs formatting
  	*/
  def load_format(date: js.Date): String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def map_date(start: js.Date, end: js.Date): String
  /**
  	 * specifies the text in the second column of the view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def map_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the first column of the view
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def map_time(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date of the event in the Google Maps popup marker
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def marker_date(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the text of the event in the Google Maps popup marker
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def marker_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def month_date(date: js.Date): String
  /**
  	 * specifies the CSS class that will be applied to a day cell
  	 * @param date the date which needs formatting
  	*/
  def month_date_class(date: js.Date): String
  /**
  	 * specifies the format of the day in a cell
  	 * @param date the date which needs formatting
  	*/
  def month_day(date: js.Date): String
  /**
  	 * specifies the presentation of the 'View more' link in the cell of the Month view
  	 * @param date the date of a month cell
  	 * @param count the number of events in the cell
  	*/
  def month_events_link(date: js.Date, count: Double): String
  /**
  	 * specifies the date format of the X-Axis of the view
  	 * @param date the date which needs formatting
  	*/
  def month_scale_date(date: js.Date): String
  /**
    * specifies the date string before events parse and load methods
    * @param start the date string before assigned to event
    */
  def parse_date(date: String): String
  /**
  	 * specifies the content of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_content(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_date(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the title of the pop-up edit form
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def quick_info_title(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the drop-down time selector in the lightbox
  	*/
  def time_picker(): String
  /**
  	 * specifies the CSS class that will be applied to a cell of the view
  	 * @param evs an array of objects of events contained in a cell (defined only in the 'cell' mode)
  	 * @param date the date of a column
  	 * @param section the section object
  	*/
  def timeline_cell_class(evs: js.Array[_], date: js.Date, section: js.Any): String
  /**
  	 * specifies the number of scheduled events in a cell of the view
  	 * @param evs an array of objects of events contained in a cell
  	 * @param date the date of a cell
  	*/
  def timeline_cell_value(evs: js.Array[_], date: js.Date): String
  /**
  	 * specifies the date in the header of the view
  	 * @param date1 the date when an event is scheduled to begin
  	 * @param date2 the date when an event is scheduled to be completed
  	*/
  def timeline_date(date1: js.Date, date2: js.Date): String
  /**
  	 * specifies items of the X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_scale_date(date: js.Date): String
  /**
  	 * specifies items of the Y-Axis
  	 * @param key the section's id (key)
  	 * @param label the section's label
  	 * @param section the section object containing the 'key' and 'label' properties
  	*/
  def timeline_scale_label(key: String, label: String, section: js.Any): String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_scalex_class(date: js.Date): String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the Y-Axis
  	 * @param key the section's id
  	 * @param label the section's label
  	 * @param section the section object that contains the 'key' and 'label' properties
  	*/
  def timeline_scaley_class(key: String, label: String, section: js.Any): String
  /**
  	 * specifies items of the second X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_second_scale_date(date: js.Date): String
  /**
  	 * specifies the name of a CSS class that will be applied to items of the second X-Axis
  	 * @param date the date which needs formatting
  	*/
  def timeline_second_scalex_class(date: js.Date): String
  /**
  	 * specifies the tooltip over a day cell containing some scheduled event(s)
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def timeline_tooltip(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the format of start and end dates displayed in the tooltip
  	 * @param date the date which needs formatting
  	*/
  def tooltip_date_format(date: js.Date): String
  /**
  	 * specifies the text of tooltips
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def tooltip_text(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def units_date(date: js.Date): String
  /**
  	 * specifies items of the X-Axis
  	 * @param key the unit's id (key)
  	 * @param label the unit's label
  	 * @param unit the unit object containing the 'key' and 'label' properties
  	*/
  def units_scale_text(key: String, label: String, unit: js.Any): String
  /**
  	 * specifies the event's text
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	 * @param cellDate the date of a day cell that a one-day event or a single occurrence of <br> the recurring event displays in
  	 * @param pos the position of a single occurrence in the recurring event: 'start' - the first occurrence, 'end' - the last occurrence, 'middle' - for remaining occurrences
  	*/
  def week_agenda_event_text(start: js.Date, end: js.Date, event: js.Any, cellDate: js.Date, pos: String): String
  /**
  	 * the date of a day cell of the view
  	 * @param date the date which needs formatting
  	*/
  def week_agenda_scale_date(date: js.Date): String
  /**
  	 * specifies the date in the header of the view
  	 * @param start the start date of the view
  	 * @param end the end date of the view
  	*/
  def week_date(start: js.Date, end: js.Date): String
  /**
  	 * specifies the CSS class that will be applied to a day cell
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def week_date_class(start: js.Date, end: js.Date, event: js.Any): String
  /**
  	 * specifies the date in the sub-header of the view
  	 * @param date the date which needs formatting
  	*/
  def week_scale_date(date: js.Date): String
  /**
  	 * a string from an XML file is converted into a date object in conformity with this template
  	 * @param date the string which need to be parsed
  	*/
  def xml_date(date: js.Date): js.Date
  /**
  	 * a date object is converted into a string in conformity with this template. Used to send data back to the server
  	 * @param date the date which needs formatting
  	*/
  def xml_format(date: js.Date): String
  /**
  	 * specifies the date in the header of the view
  	 * @param date the date which needs formatting
  	*/
  def year_date(date: js.Date): String
  /**
  	 * specifies the month's name in the header of a month block of the view.
  	 * @param date the date which needs formatting
  	*/
  def year_month(date: js.Date): String
  /**
  	 * specifies the day's name in the sub-header of a month block of the view
  	 * @param date the date which needs formatting
  	*/
  def year_scale_date(date: js.Date): String
  /**
  	 * specifies the tooltip over a day cell containing some scheduled event(s)
  	 * @param start the date when an event is scheduled to begin
  	 * @param end the date when an event is scheduled to be completed
  	 * @param event the event object
  	*/
  def year_tooltip(start: js.Date, end: js.Date, event: js.Any): String
}

object SchedulerTemplates {
  @scala.inline
  def apply(
    agenda_date: (js.Date, js.Date) => CallbackTo[String],
    agenda_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    agenda_time: (js.Date, js.Date, js.Any) => CallbackTo[String],
    api_date: js.Date => CallbackTo[String],
    calendar_date: js.Date => CallbackTo[String],
    calendar_month: js.Date => CallbackTo[String],
    calendar_scale_date: js.Date => CallbackTo[String],
    calendar_time: js.Date => CallbackTo[String],
    day_date: js.Date => CallbackTo[String],
    day_scale_date: js.Date => CallbackTo[String],
    drag_marker_class: (js.Date, js.Date, js.Any) => Callback,
    drag_marker_content: (js.Date, js.Date, js.Any) => Callback,
    event_bar_date: (js.Date, js.Date, js.Any) => CallbackTo[String],
    event_bar_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    event_class: (js.Date, js.Date, js.Any) => CallbackTo[String],
    event_date: js.Date => CallbackTo[String],
    event_header: (js.Date, js.Date, js.Any) => CallbackTo[String],
    event_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    grid_date: (js.Date, js.Date) => CallbackTo[String],
    grid_field: (String, js.Any) => CallbackTo[String],
    grid_full_date: (js.Date, js.Date, js.Any) => CallbackTo[String],
    grid_single_date: js.Date => CallbackTo[String],
    hour_scale: js.Date => CallbackTo[String],
    lightbox_header: (js.Date, js.Date, js.Any) => CallbackTo[String],
    load_format: js.Date => CallbackTo[String],
    map_date: (js.Date, js.Date) => CallbackTo[String],
    map_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    map_time: (js.Date, js.Date, js.Any) => CallbackTo[String],
    marker_date: (js.Date, js.Date, js.Any) => CallbackTo[String],
    marker_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    month_date: js.Date => CallbackTo[String],
    month_date_class: js.Date => CallbackTo[String],
    month_day: js.Date => CallbackTo[String],
    month_events_link: (js.Date, Double) => CallbackTo[String],
    month_scale_date: js.Date => CallbackTo[String],
    parse_date: String => CallbackTo[String],
    quick_info_content: (js.Date, js.Date, js.Any) => CallbackTo[String],
    quick_info_date: (js.Date, js.Date, js.Any) => CallbackTo[String],
    quick_info_title: (js.Date, js.Date, js.Any) => CallbackTo[String],
    time_picker: CallbackTo[String],
    timeline_cell_class: (js.Array[js.Any], js.Date, js.Any) => CallbackTo[String],
    timeline_cell_value: (js.Array[js.Any], js.Date) => CallbackTo[String],
    timeline_date: (js.Date, js.Date) => CallbackTo[String],
    timeline_scale_date: js.Date => CallbackTo[String],
    timeline_scale_label: (String, String, js.Any) => CallbackTo[String],
    timeline_scalex_class: js.Date => CallbackTo[String],
    timeline_scaley_class: (String, String, js.Any) => CallbackTo[String],
    timeline_second_scale_date: js.Date => CallbackTo[String],
    timeline_second_scalex_class: js.Date => CallbackTo[String],
    timeline_tooltip: (js.Date, js.Date, js.Any) => CallbackTo[String],
    tooltip_date_format: js.Date => CallbackTo[String],
    tooltip_text: (js.Date, js.Date, js.Any) => CallbackTo[String],
    units_date: js.Date => CallbackTo[String],
    units_scale_text: (String, String, js.Any) => CallbackTo[String],
    week_agenda_event_text: (js.Date, js.Date, js.Any, js.Date, String) => CallbackTo[String],
    week_agenda_scale_date: js.Date => CallbackTo[String],
    week_date: (js.Date, js.Date) => CallbackTo[String],
    week_date_class: (js.Date, js.Date, js.Any) => CallbackTo[String],
    week_scale_date: js.Date => CallbackTo[String],
    xml_date: js.Date => CallbackTo[js.Date],
    xml_format: js.Date => CallbackTo[String],
    year_date: js.Date => CallbackTo[String],
    year_month: js.Date => CallbackTo[String],
    year_scale_date: js.Date => CallbackTo[String],
    year_tooltip: (js.Date, js.Date, js.Any) => CallbackTo[String]
  ): SchedulerTemplates = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agenda_date")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => agenda_date(t0, t1).runNow()))
    __obj.updateDynamic("agenda_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => agenda_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("agenda_time")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => agenda_time(t0, t1, t2).runNow()))
    __obj.updateDynamic("api_date")(js.Any.fromFunction1((t0: js.Date) => api_date(t0).runNow()))
    __obj.updateDynamic("calendar_date")(js.Any.fromFunction1((t0: js.Date) => calendar_date(t0).runNow()))
    __obj.updateDynamic("calendar_month")(js.Any.fromFunction1((t0: js.Date) => calendar_month(t0).runNow()))
    __obj.updateDynamic("calendar_scale_date")(js.Any.fromFunction1((t0: js.Date) => calendar_scale_date(t0).runNow()))
    __obj.updateDynamic("calendar_time")(js.Any.fromFunction1((t0: js.Date) => calendar_time(t0).runNow()))
    __obj.updateDynamic("day_date")(js.Any.fromFunction1((t0: js.Date) => day_date(t0).runNow()))
    __obj.updateDynamic("day_scale_date")(js.Any.fromFunction1((t0: js.Date) => day_scale_date(t0).runNow()))
    __obj.updateDynamic("drag_marker_class")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => drag_marker_class(t0, t1, t2).runNow()))
    __obj.updateDynamic("drag_marker_content")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => drag_marker_content(t0, t1, t2).runNow()))
    __obj.updateDynamic("event_bar_date")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => event_bar_date(t0, t1, t2).runNow()))
    __obj.updateDynamic("event_bar_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => event_bar_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("event_class")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => event_class(t0, t1, t2).runNow()))
    __obj.updateDynamic("event_date")(js.Any.fromFunction1((t0: js.Date) => event_date(t0).runNow()))
    __obj.updateDynamic("event_header")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => event_header(t0, t1, t2).runNow()))
    __obj.updateDynamic("event_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => event_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("grid_date")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => grid_date(t0, t1).runNow()))
    __obj.updateDynamic("grid_field")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => grid_field(t0, t1).runNow()))
    __obj.updateDynamic("grid_full_date")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => grid_full_date(t0, t1, t2).runNow()))
    __obj.updateDynamic("grid_single_date")(js.Any.fromFunction1((t0: js.Date) => grid_single_date(t0).runNow()))
    __obj.updateDynamic("hour_scale")(js.Any.fromFunction1((t0: js.Date) => hour_scale(t0).runNow()))
    __obj.updateDynamic("lightbox_header")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => lightbox_header(t0, t1, t2).runNow()))
    __obj.updateDynamic("load_format")(js.Any.fromFunction1((t0: js.Date) => load_format(t0).runNow()))
    __obj.updateDynamic("map_date")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => map_date(t0, t1).runNow()))
    __obj.updateDynamic("map_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => map_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("map_time")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => map_time(t0, t1, t2).runNow()))
    __obj.updateDynamic("marker_date")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => marker_date(t0, t1, t2).runNow()))
    __obj.updateDynamic("marker_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => marker_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("month_date")(js.Any.fromFunction1((t0: js.Date) => month_date(t0).runNow()))
    __obj.updateDynamic("month_date_class")(js.Any.fromFunction1((t0: js.Date) => month_date_class(t0).runNow()))
    __obj.updateDynamic("month_day")(js.Any.fromFunction1((t0: js.Date) => month_day(t0).runNow()))
    __obj.updateDynamic("month_events_link")(js.Any.fromFunction2((t0: js.Date, t1: scala.Double) => month_events_link(t0, t1).runNow()))
    __obj.updateDynamic("month_scale_date")(js.Any.fromFunction1((t0: js.Date) => month_scale_date(t0).runNow()))
    __obj.updateDynamic("parse_date")(js.Any.fromFunction1((t0: java.lang.String) => parse_date(t0).runNow()))
    __obj.updateDynamic("quick_info_content")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => quick_info_content(t0, t1, t2).runNow()))
    __obj.updateDynamic("quick_info_date")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => quick_info_date(t0, t1, t2).runNow()))
    __obj.updateDynamic("quick_info_title")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => quick_info_title(t0, t1, t2).runNow()))
    __obj.updateDynamic("time_picker")(time_picker.toJsFn)
    __obj.updateDynamic("timeline_cell_class")(js.Any.fromFunction3((t0: js.Array[js.Any], t1: js.Date, t2: js.Any) => timeline_cell_class(t0, t1, t2).runNow()))
    __obj.updateDynamic("timeline_cell_value")(js.Any.fromFunction2((t0: js.Array[js.Any], t1: js.Date) => timeline_cell_value(t0, t1).runNow()))
    __obj.updateDynamic("timeline_date")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => timeline_date(t0, t1).runNow()))
    __obj.updateDynamic("timeline_scale_date")(js.Any.fromFunction1((t0: js.Date) => timeline_scale_date(t0).runNow()))
    __obj.updateDynamic("timeline_scale_label")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Any) => timeline_scale_label(t0, t1, t2).runNow()))
    __obj.updateDynamic("timeline_scalex_class")(js.Any.fromFunction1((t0: js.Date) => timeline_scalex_class(t0).runNow()))
    __obj.updateDynamic("timeline_scaley_class")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Any) => timeline_scaley_class(t0, t1, t2).runNow()))
    __obj.updateDynamic("timeline_second_scale_date")(js.Any.fromFunction1((t0: js.Date) => timeline_second_scale_date(t0).runNow()))
    __obj.updateDynamic("timeline_second_scalex_class")(js.Any.fromFunction1((t0: js.Date) => timeline_second_scalex_class(t0).runNow()))
    __obj.updateDynamic("timeline_tooltip")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => timeline_tooltip(t0, t1, t2).runNow()))
    __obj.updateDynamic("tooltip_date_format")(js.Any.fromFunction1((t0: js.Date) => tooltip_date_format(t0).runNow()))
    __obj.updateDynamic("tooltip_text")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => tooltip_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("units_date")(js.Any.fromFunction1((t0: js.Date) => units_date(t0).runNow()))
    __obj.updateDynamic("units_scale_text")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Any) => units_scale_text(t0, t1, t2).runNow()))
    __obj.updateDynamic("week_agenda_event_text")(js.Any.fromFunction5((t0: js.Date, t1: js.Date, t2: js.Any, t3: js.Date, t4: java.lang.String) => week_agenda_event_text(t0, t1, t2, t3, t4).runNow()))
    __obj.updateDynamic("week_agenda_scale_date")(js.Any.fromFunction1((t0: js.Date) => week_agenda_scale_date(t0).runNow()))
    __obj.updateDynamic("week_date")(js.Any.fromFunction2((t0: js.Date, t1: js.Date) => week_date(t0, t1).runNow()))
    __obj.updateDynamic("week_date_class")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => week_date_class(t0, t1, t2).runNow()))
    __obj.updateDynamic("week_scale_date")(js.Any.fromFunction1((t0: js.Date) => week_scale_date(t0).runNow()))
    __obj.updateDynamic("xml_date")(js.Any.fromFunction1((t0: js.Date) => xml_date(t0).runNow()))
    __obj.updateDynamic("xml_format")(js.Any.fromFunction1((t0: js.Date) => xml_format(t0).runNow()))
    __obj.updateDynamic("year_date")(js.Any.fromFunction1((t0: js.Date) => year_date(t0).runNow()))
    __obj.updateDynamic("year_month")(js.Any.fromFunction1((t0: js.Date) => year_month(t0).runNow()))
    __obj.updateDynamic("year_scale_date")(js.Any.fromFunction1((t0: js.Date) => year_scale_date(t0).runNow()))
    __obj.updateDynamic("year_tooltip")(js.Any.fromFunction3((t0: js.Date, t1: js.Date, t2: js.Any) => year_tooltip(t0, t1, t2).runNow()))
    __obj.asInstanceOf[SchedulerTemplates]
  }
}

