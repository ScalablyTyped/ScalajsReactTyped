package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonPageToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FanFundingEventsResource extends js.Object {
  /** Lists fan funding events for a channel. */
  def list(request: AnonPageToken): Request_[FanFundingEventListResponse]
}

object FanFundingEventsResource {
  @scala.inline
  def apply(list: AnonPageToken => CallbackTo[Request_[FanFundingEventListResponse]]): FanFundingEventsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPageToken) => list(t0).runNow()))
    __obj.asInstanceOf[FanFundingEventsResource]
  }
}

