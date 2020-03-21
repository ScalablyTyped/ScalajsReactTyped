package typingsJapgolly.direction.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.direction.directionStrings.ltr
  - typingsJapgolly.direction.directionStrings.rtl
  - typingsJapgolly.direction.directionStrings.neutral
*/
trait Direction extends js.Object

object Direction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ltr: typingsJapgolly.direction.directionStrings.ltr = this.cast("ltr")
  @scala.inline
  def neutral: typingsJapgolly.direction.directionStrings.neutral = this.cast("neutral")
  @scala.inline
  def rtl: typingsJapgolly.direction.directionStrings.rtl = this.cast("rtl")
}

