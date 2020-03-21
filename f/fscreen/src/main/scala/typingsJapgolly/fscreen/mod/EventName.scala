package typingsJapgolly.fscreen.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.fscreen.fscreenStrings.fullscreenEnabled
  - typingsJapgolly.fscreen.fscreenStrings.fullscreenElement
  - typingsJapgolly.fscreen.fscreenStrings.requestFullscreen
  - typingsJapgolly.fscreen.fscreenStrings.exitFullscreen
  - typingsJapgolly.fscreen.fscreenStrings.fullscreenchange
  - typingsJapgolly.fscreen.fscreenStrings.fullscreenerror
*/
trait EventName extends js.Object

object EventName {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def exitFullscreen: typingsJapgolly.fscreen.fscreenStrings.exitFullscreen = this.cast("exitFullscreen")
  @scala.inline
  def fullscreenElement: typingsJapgolly.fscreen.fscreenStrings.fullscreenElement = this.cast("fullscreenElement")
  @scala.inline
  def fullscreenEnabled: typingsJapgolly.fscreen.fscreenStrings.fullscreenEnabled = this.cast("fullscreenEnabled")
  @scala.inline
  def fullscreenchange: typingsJapgolly.fscreen.fscreenStrings.fullscreenchange = this.cast("fullscreenchange")
  @scala.inline
  def fullscreenerror: typingsJapgolly.fscreen.fscreenStrings.fullscreenerror = this.cast("fullscreenerror")
  @scala.inline
  def requestFullscreen: typingsJapgolly.fscreen.fscreenStrings.requestFullscreen = this.cast("requestFullscreen")
}

