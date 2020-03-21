package typingsJapgolly.pluralsCldr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.zero
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.one
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.two
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.few
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.many
  - typingsJapgolly.pluralsCldr.pluralsCldrStrings.other
*/
trait Form extends js.Object

object Form {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def few: typingsJapgolly.pluralsCldr.pluralsCldrStrings.few = this.cast("few")
  @scala.inline
  def many: typingsJapgolly.pluralsCldr.pluralsCldrStrings.many = this.cast("many")
  @scala.inline
  def one: typingsJapgolly.pluralsCldr.pluralsCldrStrings.one = this.cast("one")
  @scala.inline
  def other: typingsJapgolly.pluralsCldr.pluralsCldrStrings.other = this.cast("other")
  @scala.inline
  def two: typingsJapgolly.pluralsCldr.pluralsCldrStrings.two = this.cast("two")
  @scala.inline
  def zero: typingsJapgolly.pluralsCldr.pluralsCldrStrings.zero = this.cast("zero")
}

