package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonChannelId
import typingsJapgolly.gapiYoutube.AnonPart
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeActivityResource
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait activities extends js.Object {
  /**
    * Posts a bulletin for a specific channel.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubeActivityResource]
  /**
    * Returns a list of channel activity events that match the request criteria.
    */
  def list(`object`: AnonChannelId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]
}

object activities {
  @scala.inline
  def apply(
    insert: AnonPart => CallbackTo[HttpRequest[GoogleApiYouTubeActivityResource]],
    list: AnonChannelId => CallbackTo[HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeActivityResource]]]
  ): activities = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPart) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonChannelId) => list(t0).runNow()))
    __obj.asInstanceOf[activities]
  }
}

