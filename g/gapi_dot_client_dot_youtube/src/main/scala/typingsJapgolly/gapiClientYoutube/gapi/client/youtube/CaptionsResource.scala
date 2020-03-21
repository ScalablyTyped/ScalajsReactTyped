package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonFields
import typingsJapgolly.gapiClientYoutube.AnonId
import typingsJapgolly.gapiClientYoutube.AnonKey
import typingsJapgolly.gapiClientYoutube.AnonOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionsResource extends js.Object {
  /** Deletes a specified caption track. */
  def delete(request: AnonFields): Request_[Unit]
  /**
    * Downloads a caption track. The caption track is returned in its original format unless the request specifies a value for the tfmt parameter and in its
    * original language unless the request specifies a value for the tlang parameter.
    */
  def download(request: AnonId): Request_[Unit]
  /** Uploads a caption track. */
  def insert(request: AnonKey): Request_[Caption]
  /**
    * Returns a list of caption tracks that are associated with a specified video. Note that the API response does not contain the actual captions and that
    * the captions.download method provides the ability to retrieve a caption track.
    */
  def list(request: AnonOauthtoken): Request_[CaptionListResponse]
  /** Updates a caption track. When updating a caption track, you can change the track's draft status, upload a new caption file for the track, or both. */
  def update(request: AnonKey): Request_[Caption]
}

object CaptionsResource {
  @scala.inline
  def apply(
    delete: AnonFields => CallbackTo[Request_[Unit]],
    download: AnonId => CallbackTo[Request_[Unit]],
    insert: AnonKey => CallbackTo[Request_[Caption]],
    list: AnonOauthtoken => CallbackTo[Request_[CaptionListResponse]],
    update: AnonKey => CallbackTo[Request_[Caption]]
  ): CaptionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonFields) => delete(t0).runNow()))
    __obj.updateDynamic("download")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonId) => download(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonKey) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOauthtoken) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonKey) => update(t0).runNow()))
    __obj.asInstanceOf[CaptionsResource]
  }
}

