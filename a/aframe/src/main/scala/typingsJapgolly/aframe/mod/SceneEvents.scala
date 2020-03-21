package typingsJapgolly.aframe.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.aframe.aframeStrings.`enter-vr`
  - typingsJapgolly.aframe.aframeStrings.`exit-vr`
  - typingsJapgolly.aframe.aframeStrings.loaded
  - typingsJapgolly.aframe.aframeStrings.renderstart
*/
trait SceneEvents extends js.Object

object SceneEvents {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `enter-vr`: typingsJapgolly.aframe.aframeStrings.`enter-vr` = this.cast("enter-vr")
  @scala.inline
  def `exit-vr`: typingsJapgolly.aframe.aframeStrings.`exit-vr` = this.cast("exit-vr")
  @scala.inline
  def loaded: typingsJapgolly.aframe.aframeStrings.loaded = this.cast("loaded")
  @scala.inline
  def renderstart: typingsJapgolly.aframe.aframeStrings.renderstart = this.cast("renderstart")
}

