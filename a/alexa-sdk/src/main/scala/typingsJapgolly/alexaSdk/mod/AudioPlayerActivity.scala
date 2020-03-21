package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.IDLE
  - typingsJapgolly.alexaSdk.alexaSdkStrings.PAUSED
  - typingsJapgolly.alexaSdk.alexaSdkStrings.PLAYING
  - typingsJapgolly.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN
  - typingsJapgolly.alexaSdk.alexaSdkStrings.FINISHED
  - typingsJapgolly.alexaSdk.alexaSdkStrings.STOPPED
*/
trait AudioPlayerActivity extends js.Object

object AudioPlayerActivity {
  @scala.inline
  def BUFFER_UNDERRUN: typingsJapgolly.alexaSdk.alexaSdkStrings.BUFFER_UNDERRUN = this.cast("BUFFER_UNDERRUN")
  @scala.inline
  def FINISHED: typingsJapgolly.alexaSdk.alexaSdkStrings.FINISHED = this.cast("FINISHED")
  @scala.inline
  def IDLE: typingsJapgolly.alexaSdk.alexaSdkStrings.IDLE = this.cast("IDLE")
  @scala.inline
  def PAUSED: typingsJapgolly.alexaSdk.alexaSdkStrings.PAUSED = this.cast("PAUSED")
  @scala.inline
  def PLAYING: typingsJapgolly.alexaSdk.alexaSdkStrings.PLAYING = this.cast("PLAYING")
  @scala.inline
  def STOPPED: typingsJapgolly.alexaSdk.alexaSdkStrings.STOPPED = this.cast("STOPPED")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

