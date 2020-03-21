package typingsJapgolly.gapiClientDns.gapi.client.dns

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDns.AnonManagedZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceRecordSetsResource extends js.Object {
  /** Enumerate ResourceRecordSets that have been created but not yet deleted. */
  def list(request: AnonManagedZone): Request_[ResourceRecordSetsListResponse]
}

object ResourceRecordSetsResource {
  @scala.inline
  def apply(list: AnonManagedZone => CallbackTo[Request_[ResourceRecordSetsListResponse]]): ResourceRecordSetsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDns.AnonManagedZone) => list(t0).runNow()))
    __obj.asInstanceOf[ResourceRecordSetsResource]
  }
}

