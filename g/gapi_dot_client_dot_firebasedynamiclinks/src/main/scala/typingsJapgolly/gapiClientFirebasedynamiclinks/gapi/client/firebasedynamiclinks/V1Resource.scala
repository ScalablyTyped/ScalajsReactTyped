package typingsJapgolly.gapiClientFirebasedynamiclinks.gapi.client.firebasedynamiclinks

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAccesstoken
import typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAlt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait V1Resource extends js.Object {
  /**
    * Fetches analytics stats of a short Dynamic Link for a given
    * duration. Metrics include number of clicks, redirects, installs,
    * app first opens, and app reopens.
    */
  def getLinkStats(request: AnonAlt): Request_[DynamicLinkStats]
  /** Get iOS strong/weak-match info for post-install attribution. */
  def installAttribution(request: AnonAccesstoken): Request_[GetIosPostInstallAttributionResponse]
}

object V1Resource {
  @scala.inline
  def apply(
    getLinkStats: AnonAlt => CallbackTo[Request_[DynamicLinkStats]],
    installAttribution: AnonAccesstoken => CallbackTo[Request_[GetIosPostInstallAttributionResponse]]
  ): V1Resource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getLinkStats")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAlt) => getLinkStats(t0).runNow()))
    __obj.updateDynamic("installAttribution")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientFirebasedynamiclinks.AnonAccesstoken) => installAttribution(t0).runNow()))
    __obj.asInstanceOf[V1Resource]
  }
}

