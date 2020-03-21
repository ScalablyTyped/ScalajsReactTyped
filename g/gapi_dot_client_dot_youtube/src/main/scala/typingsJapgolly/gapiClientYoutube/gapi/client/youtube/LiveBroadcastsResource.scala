package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAltBroadcastStatus
import typingsJapgolly.gapiClientYoutube.AnonAltFields
import typingsJapgolly.gapiClientYoutube.AnonBroadcastStatus
import typingsJapgolly.gapiClientYoutube.AnonDisplaySlate
import typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typingsJapgolly.gapiClientYoutube.AnonStreamId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastsResource extends js.Object {
  /**
    * Binds a YouTube broadcast to a stream or removes an existing binding between a broadcast and a stream. A broadcast can only be bound to one video
    * stream, though a video stream may be bound to more than one broadcast.
    */
  def bind(request: AnonStreamId): Request_[LiveBroadcast]
  /** Controls the settings for a slate that can be displayed in the broadcast stream. */
  def control(request: AnonDisplaySlate): Request_[LiveBroadcast]
  /** Deletes a broadcast. */
  def delete(request: AnonAltFields): Request_[Unit]
  /** Creates a broadcast. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast]
  /** Returns a list of YouTube broadcasts that match the API request parameters. */
  def list(request: AnonBroadcastStatus): Request_[LiveBroadcastListResponse]
  /**
    * Changes the status of a YouTube live broadcast and initiates any processes associated with the new status. For example, when you transition a
    * broadcast's status to testing, YouTube starts to transmit video to that broadcast's monitor stream. Before calling this method, you should confirm that
    * the value of the status.streamStatus property for the stream bound to your broadcast is active.
    */
  def transition(request: AnonAltBroadcastStatus): Request_[LiveBroadcast]
  /** Updates a broadcast. For example, you could modify the broadcast settings defined in the liveBroadcast resource's contentDetails object. */
  def update(request: AnonOnBehalfOfContentOwnerChannel): Request_[LiveBroadcast]
}

object LiveBroadcastsResource {
  @scala.inline
  def apply(
    bind: AnonStreamId => CallbackTo[Request_[LiveBroadcast]],
    control: AnonDisplaySlate => CallbackTo[Request_[LiveBroadcast]],
    delete: AnonAltFields => CallbackTo[Request_[Unit]],
    insert: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[LiveBroadcast]],
    list: AnonBroadcastStatus => CallbackTo[Request_[LiveBroadcastListResponse]],
    transition: AnonAltBroadcastStatus => CallbackTo[Request_[LiveBroadcast]],
    update: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[LiveBroadcast]]
  ): LiveBroadcastsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonStreamId) => bind(t0).runNow()))
    __obj.updateDynamic("control")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonDisplaySlate) => control(t0).runNow()))
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAltFields) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonBroadcastStatus) => list(t0).runNow()))
    __obj.updateDynamic("transition")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAltBroadcastStatus) => transition(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => update(t0).runNow()))
    __obj.asInstanceOf[LiveBroadcastsResource]
  }
}

