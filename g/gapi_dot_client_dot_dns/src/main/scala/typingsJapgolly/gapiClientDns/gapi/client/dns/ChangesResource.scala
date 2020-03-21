package typingsJapgolly.gapiClientDns.gapi.client.dns

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDns.AnonAlt
import typingsJapgolly.gapiClientDns.AnonChangeId
import typingsJapgolly.gapiClientDns.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChangesResource extends js.Object {
  /** Atomically update the ResourceRecordSet collection. */
  def create(request: AnonAlt): Request_[Change]
  /** Fetch the representation of an existing Change. */
  def get(request: AnonChangeId): Request_[Change]
  /** Enumerate Changes to a ResourceRecordSet collection. */
  def list(request: AnonFields): Request_[ChangesListResponse]
}

object ChangesResource {
  @scala.inline
  def apply(
    create: AnonAlt => CallbackTo[Request_[Change]],
    get: AnonChangeId => CallbackTo[Request_[Change]],
    list: AnonFields => CallbackTo[Request_[ChangesListResponse]]
  ): ChangesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("create")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonAlt) => create(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonChangeId) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[ChangesResource]
  }
}

