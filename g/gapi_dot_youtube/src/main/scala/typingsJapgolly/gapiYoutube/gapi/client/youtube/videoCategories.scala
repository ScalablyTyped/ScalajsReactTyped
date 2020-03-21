package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonHl
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePageInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeVideoCategoryResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videoCategories extends js.Object {
  /**
    * Returns a list of categories that can be associated with YouTube videos.
    */
  def list(`object`: AnonHl): HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]
}

object videoCategories {
  @scala.inline
  def apply(
    list: AnonHl => CallbackTo[HttpRequest[GoogleApiYouTubePageInfo[GoogleApiYouTubeVideoCategoryResource]]]
  ): videoCategories = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonHl) => list(t0).runNow()))
    __obj.asInstanceOf[videoCategories]
  }
}

