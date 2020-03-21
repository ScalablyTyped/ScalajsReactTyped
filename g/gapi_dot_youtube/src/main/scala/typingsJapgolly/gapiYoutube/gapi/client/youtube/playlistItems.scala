package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonId
import typingsJapgolly.gapiYoutube.AnonMaxResults
import typingsJapgolly.gapiYoutube.AnonPart
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePlaylistItemResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlistItems extends js.Object {
  /**
    * Deletes a playlist item.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Adds a resource to a playlist.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistItemResource]
  /**
    * Returns a collection of playlist items that match the API request parameters. You can retrieve all of the playlist items in a specified playlist or retrieve one or more playlist items by their unique IDs.
    */
  def list(`object`: AnonMaxResults): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
  /**
    * Modifies a playlist item. For example, you could update the item's position in the playlist.
    */
  def update(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistItemResource]
}

object playlistItems {
  @scala.inline
  def apply(
    delete: AnonId => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistItemResource]],
    insert: AnonPart => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistItemResource]],
    list: AnonMaxResults => CallbackTo[
      HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistItemResource]]
    ],
    update: AnonPart => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistItemResource]]
  ): playlistItems = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPart) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonMaxResults) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[playlistItems]
  }
}

