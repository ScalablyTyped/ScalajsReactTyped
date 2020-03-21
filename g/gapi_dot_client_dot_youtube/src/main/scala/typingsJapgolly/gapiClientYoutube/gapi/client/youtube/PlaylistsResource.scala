package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonAltChannelId
import typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel
import typingsJapgolly.gapiClientYoutube.AnonPart
import typingsJapgolly.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistsResource extends js.Object {
  /** Deletes a playlist. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Creates a playlist. */
  def insert(request: AnonOnBehalfOfContentOwnerChannel): Request_[Playlist]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns,
    * or you can retrieve one or more playlists by their unique IDs.
    */
  def list(request: AnonAltChannelId): Request_[PlaylistListResponse]
  /** Modifies a playlist. For example, you could change a playlist's title, description, or privacy status. */
  def update(request: AnonPart): Request_[Playlist]
}

object PlaylistsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    insert: AnonOnBehalfOfContentOwnerChannel => CallbackTo[Request_[Playlist]],
    list: AnonAltChannelId => CallbackTo[Request_[PlaylistListResponse]],
    update: AnonPart => CallbackTo[Request_[Playlist]]
  ): PlaylistsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonOnBehalfOfContentOwnerChannel) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonAltChannelId) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[PlaylistsResource]
  }
}

