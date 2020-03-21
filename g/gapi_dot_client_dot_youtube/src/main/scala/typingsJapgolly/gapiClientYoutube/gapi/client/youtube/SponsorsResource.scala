package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SponsorsResource extends js.Object {
  /** Lists sponsors for a channel. */
  def list(request: AnonFilter): Request_[SponsorListResponse]
}

object SponsorsResource {
  @scala.inline
  def apply(list: AnonFilter => CallbackTo[Request_[SponsorListResponse]]): SponsorsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonFilter) => list(t0).runNow()))
    __obj.asInstanceOf[SponsorsResource]
  }
}

