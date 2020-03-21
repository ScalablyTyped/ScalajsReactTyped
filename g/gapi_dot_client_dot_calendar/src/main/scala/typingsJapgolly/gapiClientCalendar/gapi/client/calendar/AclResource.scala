package typingsJapgolly.gapiClientCalendar.gapi.client.calendar

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCalendar.AnonAlt
import typingsJapgolly.gapiClientCalendar.AnonCalendarId
import typingsJapgolly.gapiClientCalendar.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclResource extends js.Object {
  /** Deletes an access control rule. */
  def delete(request: AnonAlt): Request_[Unit]
  /** Returns an access control rule. */
  def get(request: AnonAlt): Request_[AclRule]
  /** Creates an access control rule. */
  def insert(request: AnonCalendarId): Request_[AclRule]
  /** Returns the rules in the access control list for the calendar. */
  def list(request: AnonFields): Request_[Acl]
  /** Updates an access control rule. This method supports patch semantics. */
  def patch(request: AnonAlt): Request_[AclRule]
  /** Updates an access control rule. */
  def update(request: AnonAlt): Request_[AclRule]
  /** Watch for changes to ACL resources. */
  def watch(request: AnonFields): Request_[Channel]
}

object AclResource {
  @scala.inline
  def apply(
    delete: AnonAlt => CallbackTo[Request_[Unit]],
    get: AnonAlt => CallbackTo[Request_[AclRule]],
    insert: AnonCalendarId => CallbackTo[Request_[AclRule]],
    list: AnonFields => CallbackTo[Request_[Acl]],
    patch: AnonAlt => CallbackTo[Request_[AclRule]],
    update: AnonAlt => CallbackTo[Request_[AclRule]],
    watch: AnonFields => CallbackTo[Request_[Channel]]
  ): AclResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonAlt) => delete(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonAlt) => get(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonCalendarId) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonFields) => list(t0).runNow()))
    __obj.updateDynamic("patch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonAlt) => patch(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonAlt) => update(t0).runNow()))
    __obj.updateDynamic("watch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCalendar.AnonFields) => watch(t0).runNow()))
    __obj.asInstanceOf[AclResource]
  }
}

