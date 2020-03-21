package typingsJapgolly.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.normal
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.hover
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.hoverActive
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.touchActive
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.keyActive
*/
trait IState extends js.Object

object IState {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hover: typingsJapgolly.reactInteractive.reactInteractiveStrings.hover = this.cast("hover")
  @scala.inline
  def hoverActive: typingsJapgolly.reactInteractive.reactInteractiveStrings.hoverActive = this.cast("hoverActive")
  @scala.inline
  def keyActive: typingsJapgolly.reactInteractive.reactInteractiveStrings.keyActive = this.cast("keyActive")
  @scala.inline
  def normal: typingsJapgolly.reactInteractive.reactInteractiveStrings.normal = this.cast("normal")
  @scala.inline
  def touchActive: typingsJapgolly.reactInteractive.reactInteractiveStrings.touchActive = this.cast("touchActive")
}

