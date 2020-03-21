package typingsJapgolly.fullcalendar.jqueryHooksMod._Global_

import typingsJapgolly.fullcalendar.calendarMod.default
import typingsJapgolly.fullcalendar.fullcalendarStrings.addEventSource
import typingsJapgolly.fullcalendar.fullcalendarStrings.changeView
import typingsJapgolly.fullcalendar.fullcalendarStrings.clientEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.destroy
import typingsJapgolly.fullcalendar.fullcalendarStrings.getCalendar
import typingsJapgolly.fullcalendar.fullcalendarStrings.getDate
import typingsJapgolly.fullcalendar.fullcalendarStrings.getEventSourceById
import typingsJapgolly.fullcalendar.fullcalendarStrings.getEventSources
import typingsJapgolly.fullcalendar.fullcalendarStrings.getNow
import typingsJapgolly.fullcalendar.fullcalendarStrings.getView
import typingsJapgolly.fullcalendar.fullcalendarStrings.gotoDate
import typingsJapgolly.fullcalendar.fullcalendarStrings.incrementDate
import typingsJapgolly.fullcalendar.fullcalendarStrings.isValidViewType
import typingsJapgolly.fullcalendar.fullcalendarStrings.moment
import typingsJapgolly.fullcalendar.fullcalendarStrings.next
import typingsJapgolly.fullcalendar.fullcalendarStrings.nextYear
import typingsJapgolly.fullcalendar.fullcalendarStrings.option
import typingsJapgolly.fullcalendar.fullcalendarStrings.prev
import typingsJapgolly.fullcalendar.fullcalendarStrings.prevYear
import typingsJapgolly.fullcalendar.fullcalendarStrings.refetchEventSources
import typingsJapgolly.fullcalendar.fullcalendarStrings.refetchEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.removeEventSource
import typingsJapgolly.fullcalendar.fullcalendarStrings.removeEventSources
import typingsJapgolly.fullcalendar.fullcalendarStrings.removeEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.render
import typingsJapgolly.fullcalendar.fullcalendarStrings.renderEvent
import typingsJapgolly.fullcalendar.fullcalendarStrings.renderEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.rerenderEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.select
import typingsJapgolly.fullcalendar.fullcalendarStrings.today
import typingsJapgolly.fullcalendar.fullcalendarStrings.unselect
import typingsJapgolly.fullcalendar.fullcalendarStrings.updateEvent
import typingsJapgolly.fullcalendar.fullcalendarStrings.updateEvents
import typingsJapgolly.fullcalendar.fullcalendarStrings.zoomTo
import typingsJapgolly.fullcalendar.inputTypesMod.EventObjectInput
import typingsJapgolly.fullcalendar.inputTypesMod.EventSourceInput
import typingsJapgolly.fullcalendar.inputTypesMod.MomentInput
import typingsJapgolly.fullcalendar.inputTypesMod.OptionsInput
import typingsJapgolly.fullcalendar.inputTypesMod.RangeInput
import typingsJapgolly.moment.mod.Moment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  def fullCalendar(): JQuery = js.native
  def fullCalendar(options: OptionsInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_addEventSource(method: addEventSource, sourceInput: EventSourceInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_changeView(method: changeView, viewName: String, dateOrRange: RangeInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_clientEvents(method: clientEvents, legacyQuery: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_destroy(method: destroy): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_getCalendar(method: getCalendar): default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getDate(method: getDate): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSourceById(method: getEventSourceById, id: js.Any): typingsJapgolly.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getEventSources(method: getEventSources): typingsJapgolly.fullcalendar.eventSourceMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_getNow(method: getNow): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_getView(method: getView): typingsJapgolly.fullcalendar.viewMod.default = js.native
  @JSName("fullCalendar")
  def fullCalendar_gotoDate(method: gotoDate, zonedDateInput: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_incrementDate(method: incrementDate, delta: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_isValidViewType(method: isValidViewType, viewType: String): Boolean = js.native
  @JSName("fullCalendar")
  def fullCalendar_moment(method: moment, args: js.Any*): Moment = js.native
  @JSName("fullCalendar")
  def fullCalendar_next(method: next): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_nextYear(method: nextYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: String, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_option(method: option, name: js.Object, value: js.Any): js.Any = js.native
  @JSName("fullCalendar")
  def fullCalendar_prev(method: prev): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_prevYear(method: prevYear): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEventSources(method: refetchEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_refetchEvents(method: refetchEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSource(method: removeEventSource, sourceQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEventSources(method: removeEventSources, sourceMultiQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_removeEvents(method: removeEvents, legacyQuery: js.Any): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_render(method: render): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvent(method: renderEvent, eventInput: EventObjectInput, isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_renderEvents(method: renderEvents, eventInputs: js.Array[EventObjectInput], isSticky: Boolean): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_rerenderEvents(method: rerenderEvents): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_select(method: select, zonedStartInput: MomentInput, zonedEndInput: MomentInput, resourceId: String): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_today(method: today): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_unselect(method: unselect): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvent(method: updateEvent, eventProps: EventObjectInput): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_updateEvents(method: updateEvents, eventPropsArray: js.Array[EventObjectInput]): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment): JQuery = js.native
  @JSName("fullCalendar")
  def fullCalendar_zoomTo(method: zoomTo, newDate: Moment, viewType: String): JQuery = js.native
}

