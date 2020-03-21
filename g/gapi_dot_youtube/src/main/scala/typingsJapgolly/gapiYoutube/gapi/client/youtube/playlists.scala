package typingsJapgolly.gapiYoutube.gapi.client.youtube

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapi.gapi.client.HttpRequest
import typingsJapgolly.gapiYoutube.AnonId
import typingsJapgolly.gapiYoutube.AnonMine
import typingsJapgolly.gapiYoutube.AnonPart
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePaginationInfo
import typingsJapgolly.gapiYoutube.GoogleApiYouTubePlaylistResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait playlists extends js.Object {
  /**
    * Deletes a playlist.
    */
  def delete(`object`: AnonId): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Creates a playlist.
    */
  def insert(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource]
  /**
    * Returns a collection of playlists that match the API request parameters. For example, you can retrieve all playlists that the authenticated user owns, or you can retrieve one or more playlists by their unique IDs.
    */
  def list(`object`: AnonMine): HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]
  /**
    * Modifies a playlist. For example, you could change a playlist's title, description, or privacy status.
    */
  def update(`object`: AnonPart): HttpRequest[GoogleApiYouTubePlaylistResource]
}

object playlists {
  @scala.inline
  def apply(
    delete: AnonId => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistResource]],
    insert: AnonPart => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistResource]],
    list: AnonMine => CallbackTo[HttpRequest[GoogleApiYouTubePaginationInfo[GoogleApiYouTubePlaylistResource]]],
    update: AnonPart => CallbackTo[HttpRequest[GoogleApiYouTubePlaylistResource]]
  ): playlists = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("delete")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonId) => delete(t0).runNow()))
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPart) => insert(t0).runNow()))
    __obj.updateDynamic("list")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonMine) => list(t0).runNow()))
    __obj.updateDynamic("update")(js.Any.fromFunction1((t0: typingsJapgolly.gapiYoutube.AnonPart) => update(t0).runNow()))
    __obj.asInstanceOf[playlists]
  }
}

