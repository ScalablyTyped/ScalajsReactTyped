package typingsJapgolly.canvasConfetti.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.canvasConfetti.canvasConfettiStrings.square
  - typingsJapgolly.canvasConfetti.canvasConfettiStrings.circle
*/
trait shape extends js.Object

object shape {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def circle: typingsJapgolly.canvasConfetti.canvasConfettiStrings.circle = this.cast("circle")
  @scala.inline
  def square: typingsJapgolly.canvasConfetti.canvasConfettiStrings.square = this.cast("square")
}

