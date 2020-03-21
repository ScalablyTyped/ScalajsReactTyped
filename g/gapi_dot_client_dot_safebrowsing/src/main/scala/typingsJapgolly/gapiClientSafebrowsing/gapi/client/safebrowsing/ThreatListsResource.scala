package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListsResource extends js.Object {
  /** Lists the Safe Browsing threat lists available for download. */
  def list(request: AnonAlt): Request_[ListThreatListsResponse]
}

object ThreatListsResource {
  @scala.inline
  def apply(list: AnonAlt => CallbackTo[Request_[ListThreatListsResponse]]): ThreatListsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSafebrowsing.AnonAlt) => list(t0).runNow()))
    __obj.asInstanceOf[ThreatListsResource]
  }
}

