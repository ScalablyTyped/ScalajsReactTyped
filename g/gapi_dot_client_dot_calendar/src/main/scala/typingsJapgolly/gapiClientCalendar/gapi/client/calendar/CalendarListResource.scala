package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonCalendarId
import typingsJapgolly.gapiClientCalendar.AnonColorRgbFormat
import typingsJapgolly.gapiClientCalendar.AnonKey
import typingsJapgolly.gapiClientCalendar.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalendarListResource extends js.Object {
  /** Deletes an entry on the user's calendar list. */
  def delete(request: AnonCalendarId): Request_[Unit]
  /** Returns an entry on the user's calendar list. */
  def get(request: AnonCalendarId): Request_[CalendarListEntry]
  /** Adds an entry to the user's calendar list. */
  def insert(request: AnonColorRgbFormat): Request_[CalendarListEntry]
  /** Returns entries on the user's calendar list. */
  def list(request: AnonKey): Request_[CalendarList]
  /** Updates an entry on the user's calendar list. This method supports patch semantics. */
  def patch(request: AnonOauthtoken): Request_[CalendarListEntry]
  /** Updates an entry on the user's calendar list. */
  def update(request: AnonOauthtoken): Request_[CalendarListEntry]
  /** Watch for changes to CalendarList resources. */
  def watch(request: AnonKey): Request_[Channel]
}

object CalendarListResource {
  @scala.inline
  def apply(
    delete: AnonCalendarId => CallbackTo[Request_[Unit]],
    get: AnonCalendarId => CallbackTo[Request_[CalendarListEntry]],
    insert: AnonColorRgbFormat => CallbackTo[Request_[CalendarListEntry]],
    list: AnonKey => CallbackTo[Request_[CalendarList]],
    patch: AnonOauthtoken => CallbackTo[Request_[CalendarListEntry]],
    update: AnonOauthtoken => CallbackTo[Request_[CalendarListEntry]],
    watch: AnonKey => CallbackTo[Request_[Channel]]
  ): CalendarListResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonColorRgbFormat) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonKey) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonOauthtoken) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonOauthtoken) => update(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonKey) => watch(t0).runNow()))
    __obj.asInstanceOf[CalendarListResource]
  }
}

