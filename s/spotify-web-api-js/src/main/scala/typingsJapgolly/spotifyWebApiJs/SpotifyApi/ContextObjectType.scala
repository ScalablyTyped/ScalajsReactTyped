package typingsJapgolly.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.artist
  - typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.playlist
  - typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.album
*/
trait ContextObjectType extends js.Object

object ContextObjectType {
  @scala.inline
  def album: typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsJapgolly.spotifyWebApiJs.spotifyWebApiJsStrings.playlist = this.cast("playlist")
}

