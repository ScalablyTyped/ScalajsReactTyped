package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonVideoId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThumbnailsResource extends js.Object {
  /** Uploads a custom video thumbnail to YouTube and sets it for a video. */
  def set(request: AnonVideoId): Request_[ThumbnailSetResponse]
}

object ThumbnailsResource {
  @scala.inline
  def apply(set: AnonVideoId => CallbackTo[Request_[ThumbnailSetResponse]]): ThumbnailsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonVideoId) => set(t0).runNow()))
    __obj.asInstanceOf[ThumbnailsResource]
  }
}

