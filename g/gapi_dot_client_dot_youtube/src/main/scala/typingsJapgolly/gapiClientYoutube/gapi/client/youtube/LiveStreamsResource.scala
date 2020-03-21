package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAltFields
import typingsJapgolly.gapiClientYoutube.AnonMine
import typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveStreamsResource extends js.Object {
  /** Deletes a video stream. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Creates a video stream. The stream enables you to send your video to YouTube, which can then broadcast the video to your audience. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream]
  /** Returns a list of video streams that match the API request parameters. */
  def list(request: AnonMine): Request_[LiveStreamListResponse]
  /** Updates a video stream. If the properties that you want to change cannot be updated, then you need to create a new stream with the proper settings. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveStream]
}

object LiveStreamsResource {
  @scala.inline
  def apply(
    delete: AnonAltFields => CallbackTo[Request_[Unit]],
    insert: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[LiveStream]],
    list: AnonMine => CallbackTo[Request_[LiveStreamListResponse]],
    update: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[LiveStream]]
  ): LiveStreamsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAltFields) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonMine) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => update(t0).runNow()))
    __obj.asInstanceOf[LiveStreamsResource]
  }
}

