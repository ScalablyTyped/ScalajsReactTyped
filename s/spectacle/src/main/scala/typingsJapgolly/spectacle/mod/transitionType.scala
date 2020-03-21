package typingsJapgolly.spectacle.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.spectacle.spectacleStrings.slide
  - typingsJapgolly.spectacle.spectacleStrings.zoom
  - typingsJapgolly.spectacle.spectacleStrings.fade
  - typingsJapgolly.spectacle.spectacleStrings.spin
*/
trait transitionType extends js.Object

object transitionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typingsJapgolly.spectacle.spectacleStrings.fade = this.cast("fade")
  @scala.inline
  def slide: typingsJapgolly.spectacle.spectacleStrings.slide = this.cast("slide")
  @scala.inline
  def spin: typingsJapgolly.spectacle.spectacleStrings.spin = this.cast("spin")
  @scala.inline
  def zoom: typingsJapgolly.spectacle.spectacleStrings.zoom = this.cast("zoom")
}

