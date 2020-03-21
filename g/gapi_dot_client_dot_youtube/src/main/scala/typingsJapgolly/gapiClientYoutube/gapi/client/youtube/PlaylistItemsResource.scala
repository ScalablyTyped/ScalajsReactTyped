package typingsJapgolly.gapiClientYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Request_
import typingsJapgolly.gapiClientYoutube.AnonPart
import typingsJapgolly.gapiClientYoutube.AnonPlaylistId
import typingsJapgolly.gapiClientYoutube.AnonPrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlaylistItemsResource extends js.Object {
  /** Deletes a playlist item. */
  def delete(request: AnonPrettyPrint): Request_[Unit]
  /** Adds a resource to a playlist. */
  def insert(request: AnonPart): Request_[PlaylistItem]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or
    * retrieve one or more playlist items by their unique IDs.
    */
  def list(request: AnonPlaylistId): Request_[PlaylistItemListResponse]
  /** Modifies a playlist item. For example, you could update the item's position in the playlist. */
  def update(request: AnonPart): Request_[PlaylistItem]
}

object PlaylistItemsResource {
  @scala.inline
  def apply(
    delete: AnonPrettyPrint => CallbackTo[Request_[Unit]],
    insert: AnonPart => CallbackTo[Request_[PlaylistItem]],
    list: AnonPlaylistId => CallbackTo[Request_[PlaylistItemListResponse]],
    update: AnonPart => CallbackTo[Request_[PlaylistItem]]
  ): PlaylistItemsResource = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPrettyPrint) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPlaylistId) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiClientYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[PlaylistItemsResource]
  }
}

