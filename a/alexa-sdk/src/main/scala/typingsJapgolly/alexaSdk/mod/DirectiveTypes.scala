package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay
  - typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotStop
  - typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue
  - typingsJapgolly.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate
  - typingsJapgolly.alexaSdk.alexaSdkStrings.Hint
  - typingsJapgolly.alexaSdk.alexaSdkStrings.VideoAppDotLaunch
*/
trait DirectiveTypes extends js.Object

object DirectiveTypes {
  @scala.inline
  def AudioPlayerDotClearQueue: typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotClearQueue = this.cast("AudioPlayer.ClearQueue")
  @scala.inline
  def AudioPlayerDotPlay: typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotPlay = this.cast("AudioPlayer.Play")
  @scala.inline
  def AudioPlayerDotStop: typingsJapgolly.alexaSdk.alexaSdkStrings.AudioPlayerDotStop = this.cast("AudioPlayer.Stop")
  @scala.inline
  def DisplayDotRenderTemplate: typingsJapgolly.alexaSdk.alexaSdkStrings.DisplayDotRenderTemplate = this.cast("Display.RenderTemplate")
  @scala.inline
  def Hint: typingsJapgolly.alexaSdk.alexaSdkStrings.Hint = this.cast("Hint")
  @scala.inline
  def VideoAppDotLaunch: typingsJapgolly.alexaSdk.alexaSdkStrings.VideoAppDotLaunch = this.cast("VideoApp.Launch")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

