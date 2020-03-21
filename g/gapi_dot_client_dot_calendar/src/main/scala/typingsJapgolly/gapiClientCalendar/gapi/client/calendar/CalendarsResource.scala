package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonCalendarId
import typingsJapgolly.gapiClientCalendar.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarsResource extends js.Object {
  /** Clears a primary calendar. This operation deletes all events associated with the primary calendar of an account. */
  def clear(request: AnonCalendarId): Request_[Unit]
  /** Deletes a secondary calendar. Use calendars.clear for clearing all events on primary calendars. */
  def delete(request: AnonCalendarId): Request_[Unit]
  /** Returns metadata for a calendar. */
  def get(request: AnonCalendarId): Request_[Calendar]
  /** Creates a secondary calendar. */
  def insert(request: AnonPrettyPrint): Request_[Calendar]
  /** Updates metadata for a calendar. This method supports patch semantics. */
  def patch(request: AnonCalendarId): Request_[Calendar]
  /** Updates metadata for a calendar. */
  def update(request: AnonCalendarId): Request_[Calendar]
}

object CalendarsResource {
  @scala.inline
  def apply(
    clear: AnonCalendarId => CallbackTo[Request_[Unit]],
    delete: AnonCalendarId => CallbackTo[Request_[Unit]],
    get: AnonCalendarId => CallbackTo[Request_[Calendar]],
    insert: AnonPrettyPrint => CallbackTo[Request_[Calendar]],
    patch: AnonCalendarId => CallbackTo[Request_[Calendar]],
    update: AnonCalendarId => CallbackTo[Request_[Calendar]]
  ): CalendarsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => clear(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonPrettyPrint) => insert(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => update(t0).runNow()))
    __obj.asInstanceOf[CalendarsResource]
  }
}

