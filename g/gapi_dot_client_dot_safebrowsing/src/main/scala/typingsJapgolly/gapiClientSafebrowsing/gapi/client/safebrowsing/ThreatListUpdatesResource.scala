package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatListUpdatesResource extends js.Object {
  /**
    * Fetches the most recent threat list updates. A client can request updates
    * for multiple lists at once.
    */
  def fetch(request: AnonAlt): Request_[FetchThreatListUpdatesResponse]
}

object ThreatListUpdatesResource {
  @scala.inline
  def apply(fetch: AnonAlt => CallbackTo[Request_[FetchThreatListUpdatesResponse]]): ThreatListUpdatesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fetch")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSafebrowsing.AnonAlt) => fetch(t0).runNow()))
    __obj.asInstanceOf[ThreatListUpdatesResource]
  }
}

