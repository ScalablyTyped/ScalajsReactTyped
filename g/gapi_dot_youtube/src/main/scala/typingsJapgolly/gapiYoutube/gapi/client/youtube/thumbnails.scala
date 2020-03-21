package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonVideoId
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePageInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeThumbnailResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait thumbnails extends js.Object {
  /**
    * Uploads a custom video thumbnail to YouTube and sets it for a video.
    */
  def set(`object`: AnonVideoId): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]
}

object thumbnails {
  @scala.inline
  def apply(
    set: AnonVideoId => CallbackTo[HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeThumbnailResource]]]
  ): thumbnails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonVideoId) => set(t0).runNow()))
    __obj.asInstanceOf[thumbnails]
  }
}

