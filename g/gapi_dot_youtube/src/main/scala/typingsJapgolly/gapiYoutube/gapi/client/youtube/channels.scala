package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonCategoryId
import typingsJapgolly.gapiYoutube.AnonRequestBody
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeChannelResource
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait channels extends js.Object {
  /**
    * Returns a collection of zero or more channel resources that match the request criteria.
    */
  def list(`object`: AnonCategoryId): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]
  /**
    * Updates a channel's metadata.
    */
  def update(`object`: AnonRequestBody): HttpRequest[GoogleApiYouTubeChannelResource]
}

object channels {
  @scala.inline
  def apply(
    list: AnonCategoryId => CallbackTo[HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeChannelResource]]],
    update: AnonRequestBody => CallbackTo[HttpRequest[GoogleApiYouTubeChannelResource]]
  ): channels = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonCategoryId) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonRequestBody) => update(t0).runNow()))
    __obj.asInstanceOf[channels]
  }
}

