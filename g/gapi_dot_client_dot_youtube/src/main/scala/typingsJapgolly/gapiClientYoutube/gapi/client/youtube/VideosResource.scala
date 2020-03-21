package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAutoLevels
import typingsJapgolly.gapiClientYoutube.AnonChart
import typingsJapgolly.gapiClientYoutube.AnonKeyOauthtoken
import typingsJapgolly.gapiClientYoutube.AnonPart
import typingsJapgolly.gapiClientYoutube.AnonPrettyPrint
import typingsJapgolly.gapiClientYoutube.AnonRating
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideosResource extends js.Object {
  /** Deletes a YouTube video. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Retrieves the ratings that the authorized user gave to a list of specified videos. */
  def getRating(request: AnonPrettyPrint): Request_[VideoGetRatingResponse]
  /** Uploads a video to YouTube and optionally sets the video's metadata. */
  def insert(request: AnonAutoLevels): Request_[Video]
  /** Returns a list of videos that match the API request parameters. */
  def list(request: AnonChart): Request_[VideoListResponse]
  /** Add a like or dislike rating to a video or remove a rating from a video. */
  def rate(request: AnonRating): Request_[Unit]
  /** Report abuse for a video. */
  def reportAbuse(request: AnonKeyOauthtoken): Request_[Unit]
  /** Updates a video's metadata. */
  def update(request: AnonPart): Request_[Video]
}

object VideosResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    getRating: AnonPrettyPrint => CallbackTo[Request_[VideoGetRatingResponse]],
    insert: AnonAutoLevels => CallbackTo[Request_[Video]],
    list: AnonChart => CallbackTo[Request_[VideoListResponse]],
    rate: AnonRating => CallbackTo[Request_[Unit]],
    reportAbuse: AnonKeyOauthtoken => CallbackTo[Request_[Unit]],
    update: AnonPart => CallbackTo[Request_[Video]]
  ): VideosResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("getRating")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPrettyPrint) => getRating(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAutoLevels) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonChart) => list(t0).runNow()))
    __obj.updateDynamic("rate")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonRating) => rate(t0).runNow()))
    __obj.updateDynamic("reportAbuse")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonKeyOauthtoken) => reportAbuse(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[VideosResource]
  }
}

