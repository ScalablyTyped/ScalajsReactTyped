package typingsJapgolly.youtubePlayer.eventNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.error
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange
  - typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange
*/
trait EventType extends js.Object

object EventType {
  @scala.inline
  def apiChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.apiChange = this.cast("apiChange")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def error: typingsJapgolly.youtubePlayer.youtubePlayerStrings.error = this.cast("error")
  @scala.inline
  def playbackQualityChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackQualityChange = this.cast("playbackQualityChange")
  @scala.inline
  def playbackRateChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.playbackRateChange = this.cast("playbackRateChange")
  @scala.inline
  def ready: typingsJapgolly.youtubePlayer.youtubePlayerStrings.ready = this.cast("ready")
  @scala.inline
  def stateChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.stateChange = this.cast("stateChange")
  @scala.inline
  def volumeChange: typingsJapgolly.youtubePlayer.youtubePlayerStrings.volumeChange = this.cast("volumeChange")
}

