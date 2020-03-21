package typingsJapgolly.motorHat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.motorHat.motorHatStrings.fwd
  - typingsJapgolly.motorHat.motorHatStrings.back
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  def back: typingsJapgolly.motorHat.motorHatStrings.back = this.cast("back")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fwd: typingsJapgolly.motorHat.motorHatStrings.fwd = this.cast("fwd")
}

