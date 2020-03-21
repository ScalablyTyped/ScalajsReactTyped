package typingsJapgolly.reactInteractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.mouseClick
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.tapClick
  - typingsJapgolly.reactInteractive.reactInteractiveStrings.keyClick
*/
trait ClickType extends js.Object

object ClickType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def keyClick: typingsJapgolly.reactInteractive.reactInteractiveStrings.keyClick = this.cast("keyClick")
  @scala.inline
  def mouseClick: typingsJapgolly.reactInteractive.reactInteractiveStrings.mouseClick = this.cast("mouseClick")
  @scala.inline
  def tapClick: typingsJapgolly.reactInteractive.reactInteractiveStrings.tapClick = this.cast("tapClick")
}

