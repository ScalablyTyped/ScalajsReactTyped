package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonAutoLevels
import typingsJapgolly.gapiYoutube.AnonChart
import typingsJapgolly.gapiYoutube.AnonIdOnBehalfOfContentOwner
import typingsJapgolly.gapiYoutube.AnonRating
import typingsJapgolly.gapiYoutube.AnonRequestBody
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeVideoGetRatingResponse
import typingsJapgolly.gapiYoutube.GoogleApiYouTubeVideoResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait videos extends js.Object {
  /**
    * Deletes a YouTube video.
    */
  def delete(`object`: AnonIdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Get user ratings for videos.
    */
  def getRating(`object`: AnonIdOnBehalfOfContentOwner): HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]
  /**
    * Uploads a video to YouTube and optionally sets the video's metadata.
    */
  def insert(`object`: AnonAutoLevels): HttpRequest[GoogleApiYouTubeVideoResource]
  /**
    * Returns a list of videos that match the API request parameters.
    */
  def list(`object`: AnonChart): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]
  /**
    * Like, dislike, or remove rating from a video.
    */
  def rate(`object`: AnonRating): HttpRequest[_]
  /**
    * Updates a video's metadata.
    */
  def update(`object`: AnonRequestBody): HttpRequest[GoogleApiYouTubeVideoResource]
}

object videos {
  @scala.inline
  def apply(
    delete: AnonIdOnBehalfOfContentOwner => CallbackTo[HttpRequest[GoogleApiYouTubeVideoResource]],
    getRating: AnonIdOnBehalfOfContentOwner => CallbackTo[HttpRequest[GoogleApiYouTubeVideoGetRatingResponse]],
    insert: AnonAutoLevels => CallbackTo[HttpRequest[GoogleApiYouTubeVideoResource]],
    list: AnonChart => CallbackTo[HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubeVideoResource]]],
    rate: AnonRating => CallbackTo[HttpRequest[js.Any]],
    update: AnonRequestBody => CallbackTo[HttpRequest[GoogleApiYouTubeVideoResource]]
  ): videos = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonIdOnBehalfOfContentOwner) => delete(t0).runNow()))
    __obj.updateDynamic("getRating")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonIdOnBehalfOfContentOwner) => getRating(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonAutoLevels) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonChart) => list(t0).runNow()))
    __obj.updateDynamic("rate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonRating) => rate(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonRequestBody) => update(t0).runNow()))
    __obj.asInstanceOf[videos]
  }
}

