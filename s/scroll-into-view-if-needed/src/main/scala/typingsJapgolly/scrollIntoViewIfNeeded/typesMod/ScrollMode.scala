package typingsJapgolly.scrollIntoViewIfNeeded.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.always
  - typingsJapgolly.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.`if-needed`
*/
trait ScrollMode extends js.Object

object ScrollMode {
  @scala.inline
  def always: typingsJapgolly.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `if-needed`: typingsJapgolly.scrollIntoViewIfNeeded.scrollIntoViewIfNeededStrings.`if-needed` = this.cast("if-needed")
}

