package typingsJapgolly.ytPlayer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.ytPlayer.ytPlayerStrings.unstarted
  - typingsJapgolly.ytPlayer.ytPlayerStrings.ended
  - typingsJapgolly.ytPlayer.ytPlayerStrings.playing
  - typingsJapgolly.ytPlayer.ytPlayerStrings.paused
  - typingsJapgolly.ytPlayer.ytPlayerStrings.buffering
  - typingsJapgolly.ytPlayer.ytPlayerStrings.cued
*/
trait YouTubePlayerState extends js.Object

object YouTubePlayerState {
  @scala.inline
  def buffering: typingsJapgolly.ytPlayer.ytPlayerStrings.buffering = this.cast("buffering")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cued: typingsJapgolly.ytPlayer.ytPlayerStrings.cued = this.cast("cued")
  @scala.inline
  def ended: typingsJapgolly.ytPlayer.ytPlayerStrings.ended = this.cast("ended")
  @scala.inline
  def paused: typingsJapgolly.ytPlayer.ytPlayerStrings.paused = this.cast("paused")
  @scala.inline
  def playing: typingsJapgolly.ytPlayer.ytPlayerStrings.playing = this.cast("playing")
  @scala.inline
  def unstarted: typingsJapgolly.ytPlayer.ytPlayerStrings.unstarted = this.cast("unstarted")
}

