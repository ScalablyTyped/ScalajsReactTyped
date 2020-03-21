package typingsJapgolly.gapiClientCompute.gapi.client.compute

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientCompute.AnonAlt
import typingsJapgolly.gapiClientCompute.AnonQuotaUserUserIp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZonesResource extends js.Object {
  /** Returns the specified Zone resource. Get a list of available zones by making a list() request. */
  def get(request: AnonQuotaUserUserIp): Request_[Zone]
  /** Retrieves the list of Zone resources available to the specified project. */
  def list(request: AnonAlt): Request_[ZoneList]
}

object ZonesResource {
  @scala.inline
  def apply(
    get: AnonQuotaUserUserIp => CallbackTo[Request_[Zone]],
    list: AnonAlt => CallbackTo[Request_[ZoneList]]
  ): ZonesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonQuotaUserUserIp) => get(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientCompute.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ZonesResource]
  }
}

