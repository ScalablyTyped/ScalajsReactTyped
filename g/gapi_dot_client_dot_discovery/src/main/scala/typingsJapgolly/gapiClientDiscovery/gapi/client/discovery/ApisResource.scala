package typingsJapgolly.gapiClientDiscovery.gapi.client.discovery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientDiscovery.AnonAlt
import typingsJapgolly.gapiClientDiscovery.AnonFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApisResource extends js.Object {
  /** Retrieve the description of a particular version of an api. */
  def getRest(request: AnonAlt): Request_[RestDescription]
  /** Retrieve the list of APIs supported at this endpoint. */
  def list(request: AnonFields): Request_[DirectoryList]
}

object ApisResource {
  @scala.inline
  def apply(
    getRest: AnonAlt => CallbackTo[Request_[RestDescription]],
    list: AnonFields => CallbackTo[Request_[DirectoryList]]
  ): ApisResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getRest")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDiscovery.AnonAlt) => getRest(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientDiscovery.AnonFields) => list(t0).runNow()))
    __obj.asInstanceOf[ApisResource]
  }
}

