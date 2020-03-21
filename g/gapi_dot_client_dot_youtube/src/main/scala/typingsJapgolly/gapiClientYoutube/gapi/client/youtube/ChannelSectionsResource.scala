package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonHl
import typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typingsJapgolly.gapiClientYoutube.AnonPart
import typingsJapgolly.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSectionsResource extends js.Object {
  /** Deletes a channelSection. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Adds a channelSection for the authenticated user's channel. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[ChannelSection]
  /** Returns channelSection resources that match the API request criteria. */
  def list(request: AnonHl): Request_[ChannelSectionListResponse]
  /** Update a channelSection. */
  def update(request: AnonPart): Request_[ChannelSection]
}

object ChannelSectionsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    insert: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[ChannelSection]],
    list: AnonHl => CallbackTo[Request_[ChannelSectionListResponse]],
    update: AnonPart => CallbackTo[Request_[ChannelSection]]
  ): ChannelSectionsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonHl) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[ChannelSectionsResource]
  }
}

