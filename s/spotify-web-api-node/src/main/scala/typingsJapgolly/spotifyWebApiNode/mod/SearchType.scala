package typingsJapgolly.spotifyWebApiNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.album
  - typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.artist
  - typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist
  - typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.track
*/
trait SearchType extends js.Object

object SearchType {
  @scala.inline
  def album: typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.album = this.cast("album")
  @scala.inline
  def artist: typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.artist = this.cast("artist")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def playlist: typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.playlist = this.cast("playlist")
  @scala.inline
  def track: typingsJapgolly.spotifyWebApiNode.spotifyWebApiNodeStrings.track = this.cast("track")
}

