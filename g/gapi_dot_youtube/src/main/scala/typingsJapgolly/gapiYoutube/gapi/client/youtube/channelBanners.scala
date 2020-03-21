package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonOnBehalfOfContentOwner
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeChannelBannerResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channelBanners extends js.Object {
  /**
    * Uploads a channel banner to YouTube.
    */
  def insert(`object`: AnonOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeChannelBannerResource]
}

object channelBanners {
  @scala.inline
  def apply(
    insert: AnonOnBehalfOfContentOwner => CallbackTo[HttpRequest[GoogleApiYouTubeChannelBannerResource]]
  ): channelBanners = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonOnBehalfOfContentOwner) => insert(t0).runNow()))
    __obj.asInstanceOf[channelBanners]
  }
}

