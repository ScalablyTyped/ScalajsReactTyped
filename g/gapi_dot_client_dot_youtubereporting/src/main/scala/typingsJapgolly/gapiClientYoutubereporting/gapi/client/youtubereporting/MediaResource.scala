package typingsJapgolly.gapiClientYoutubereporting.gapi.client.youtubereporting

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutubereporting.AnonKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaResource extends js.Object {
  /**
    * Method for media download. Download is supported
    * on the URI `/v1/media/{+name}?alt=media`.
    */
  def download(request: AnonKey): Request_[Media]
}

object MediaResource {
  @scala.inline
  def apply(download: AnonKey => CallbackTo[Request_[Media]]): MediaResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("download")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutubereporting.AnonKey) => download(t0).runNow()))
    __obj.asInstanceOf[MediaResource]
  }
}

