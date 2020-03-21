package typingsJapgolly.popperJs.mod.Popper

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.popperJs.popperJsStrings.flip
  - typingsJapgolly.popperJs.popperJsStrings.clockwise
  - typingsJapgolly.popperJs.popperJsStrings.counterclockwise
*/
trait Behavior extends js.Object

object Behavior {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def clockwise: typingsJapgolly.popperJs.popperJsStrings.clockwise = this.cast("clockwise")
  @scala.inline
  def counterclockwise: typingsJapgolly.popperJs.popperJsStrings.counterclockwise = this.cast("counterclockwise")
  @scala.inline
  def flip: typingsJapgolly.popperJs.popperJsStrings.flip = this.cast("flip")
}

