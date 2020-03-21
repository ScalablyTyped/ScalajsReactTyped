package typingsJapgolly.gapiClientSafebrowsing.gapi.client.safebrowsing

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientSafebrowsing.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThreatMatchesResource extends js.Object {
  /** Finds the threat entries that match the Safe Browsing lists. */
  def find(request: AnonAlt): Request_[FindThreatMatchesResponse]
}

object ThreatMatchesResource {
  @scala.inline
  def apply(find: AnonAlt => CallbackTo[Request_[FindThreatMatchesResponse]]): ThreatMatchesResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("find")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientSafebrowsing.AnonAlt) => find(t0).runNow()))
    __obj.asInstanceOf[ThreatMatchesResource]
  }
}

