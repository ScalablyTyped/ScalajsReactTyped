package typingsJapgolly.spotifyApi.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spotifyApi.spotifyApiStrings.off
  - typingsJapgolly.spotifyApi.spotifyApiStrings.track
  - typingsJapgolly.spotifyApi.spotifyApiStrings.context
*/
trait PlaybackRepeatState extends js.Object

object PlaybackRepeatState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def context: typingsJapgolly.spotifyApi.spotifyApiStrings.context = this.cast("context")
  @scala.inline
  def off: typingsJapgolly.spotifyApi.spotifyApiStrings.off = this.cast("off")
  @scala.inline
  def track: typingsJapgolly.spotifyApi.spotifyApiStrings.track = this.cast("track")
}

