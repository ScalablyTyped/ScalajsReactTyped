package typingsJapgolly.asyncValidator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.string
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.number
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.boolean
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.method
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.regexp
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.integer
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.float
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.array
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.`object`
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.enum
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.date
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.url
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.hex
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.email
  - typingsJapgolly.asyncValidator.asyncValidatorStrings.any
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  def any: typingsJapgolly.asyncValidator.asyncValidatorStrings.any = this.cast("any")
  @scala.inline
  def array: typingsJapgolly.asyncValidator.asyncValidatorStrings.array = this.cast("array")
  @scala.inline
  def boolean: typingsJapgolly.asyncValidator.asyncValidatorStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.asyncValidator.asyncValidatorStrings.date = this.cast("date")
  @scala.inline
  def email: typingsJapgolly.asyncValidator.asyncValidatorStrings.email = this.cast("email")
  @scala.inline
  def enum: typingsJapgolly.asyncValidator.asyncValidatorStrings.enum = this.cast("enum")
  @scala.inline
  def float: typingsJapgolly.asyncValidator.asyncValidatorStrings.float = this.cast("float")
  @scala.inline
  def hex: typingsJapgolly.asyncValidator.asyncValidatorStrings.hex = this.cast("hex")
  @scala.inline
  def integer: typingsJapgolly.asyncValidator.asyncValidatorStrings.integer = this.cast("integer")
  @scala.inline
  def method: typingsJapgolly.asyncValidator.asyncValidatorStrings.method = this.cast("method")
  @scala.inline
  def number: typingsJapgolly.asyncValidator.asyncValidatorStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.asyncValidator.asyncValidatorStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typingsJapgolly.asyncValidator.asyncValidatorStrings.regexp = this.cast("regexp")
  @scala.inline
  def string: typingsJapgolly.asyncValidator.asyncValidatorStrings.string = this.cast("string")
  @scala.inline
  def url: typingsJapgolly.asyncValidator.asyncValidatorStrings.url = this.cast("url")
}

