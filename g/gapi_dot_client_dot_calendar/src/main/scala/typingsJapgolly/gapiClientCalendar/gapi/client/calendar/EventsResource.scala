package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonAlwaysIncludeEmail
import typingsJapgolly.gapiClientCalendar.AnonDestination
import typingsJapgolly.gapiClientCalendar.AnonEventId
import typingsJapgolly.gapiClientCalendar.AnonICalUID
import typingsJapgolly.gapiClientCalendar.AnonMaxAttendees
import typingsJapgolly.gapiClientCalendar.AnonMaxResults
import typingsJapgolly.gapiClientCalendar.AnonQuotaUser
import typingsJapgolly.gapiClientCalendar.AnonSendNotifications
import typingsJapgolly.gapiClientCalendar.AnonText
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventsResource extends js.Object {
  /** Deletes an event. */
  def delete(request: AnonEventId): Request_[Unit]
  /** Returns an event. */
  def get(request: AnonAlwaysIncludeEmail): Request_[Event]
  /** Imports an event. This operation is used to add a private copy of an existing event to a calendar. */
  def `import`(request: AnonQuotaUser): Request_[Event]
  /** Creates an event. */
  def insert(request: AnonMaxAttendees): Request_[Event]
  /** Returns instances of the specified recurring event. */
  def instances(request: AnonMaxResults): Request_[Events]
  /** Returns events on the specified calendar. */
  def list(request: AnonICalUID): Request_[Events]
  /** Moves an event to another calendar, i.e. changes an event's organizer. */
  def move(request: AnonDestination): Request_[Event]
  /** Updates an event. This method supports patch semantics. */
  def patch(request: AnonSendNotifications): Request_[Event]
  /** Creates an event based on a simple text string. */
  def quickAdd(request: AnonText): Request_[Event]
  /** Updates an event. */
  def update(request: AnonSendNotifications): Request_[Event]
  /** Watch for changes to Events resources. */
  def watch(request: AnonICalUID): Request_[Channel]
}

object EventsResource {
  @scala.inline
  def apply(
    delete: AnonEventId => CallbackTo[Request_[Unit]],
    get: AnonAlwaysIncludeEmail => CallbackTo[Request_[Event]],
    `import`: AnonQuotaUser => CallbackTo[Request_[Event]],
    insert: AnonMaxAttendees => CallbackTo[Request_[Event]],
    instances: AnonMaxResults => CallbackTo[Request_[Events]],
    list: AnonICalUID => CallbackTo[Request_[Events]],
    move: AnonDestination => CallbackTo[Request_[Event]],
    patch: AnonSendNotifications => CallbackTo[Request_[Event]],
    quickAdd: AnonText => CallbackTo[Request_[Event]],
    update: AnonSendNotifications => CallbackTo[Request_[Event]],
    watch: AnonICalUID => CallbackTo[Request_[Channel]]
  ): EventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonEventId) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonAlwaysIncludeEmail) => get(t0).runNow()))
    __obj.updateDynamic("import")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonQuotaUser) => `import`(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonMaxAttendees) => insert(t0).runNow()))
    __obj.updateDynamic("instances")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonMaxResults) => instances(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonICalUID) => list(t0).runNow()))
    __obj.updateDynamic("move")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonDestination) => move(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonSendNotifications) => patch(t0).runNow()))
    __obj.updateDynamic("quickAdd")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonText) => quickAdd(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonSendNotifications) => update(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonICalUID) => watch(t0).runNow()))
    __obj.asInstanceOf[EventsResource]
  }
}

