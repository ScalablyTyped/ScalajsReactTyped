package typingsJapgolly.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spotifyApi.spotifyApiStrings.artist
  - typingsJapgolly.spotifyApi.spotifyApiStrings.playlist
  - typingsJapgolly.spotifyApi.spotifyApiStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typingsJapgolly.spotifyApi.spotifyApiStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsJapgolly.spotifyApi.spotifyApiStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsJapgolly.spotifyApi.spotifyApiStrings.playlist = this.cast("playlist")
}

