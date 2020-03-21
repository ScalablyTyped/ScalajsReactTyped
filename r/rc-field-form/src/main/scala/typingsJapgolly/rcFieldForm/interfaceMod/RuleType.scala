package typingsJapgolly.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.string
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.number
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.boolean
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.method
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.regexp
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.integer
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.float
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.`object`
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.enum
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.date
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.url
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.hex
  - typingsJapgolly.rcFieldForm.rcFieldFormStrings.email
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  def boolean: typingsJapgolly.rcFieldForm.rcFieldFormStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.rcFieldForm.rcFieldFormStrings.date = this.cast("date")
  @scala.inline
  def email: typingsJapgolly.rcFieldForm.rcFieldFormStrings.email = this.cast("email")
  @scala.inline
  def enum: typingsJapgolly.rcFieldForm.rcFieldFormStrings.enum = this.cast("enum")
  @scala.inline
  def float: typingsJapgolly.rcFieldForm.rcFieldFormStrings.float = this.cast("float")
  @scala.inline
  def hex: typingsJapgolly.rcFieldForm.rcFieldFormStrings.hex = this.cast("hex")
  @scala.inline
  def integer: typingsJapgolly.rcFieldForm.rcFieldFormStrings.integer = this.cast("integer")
  @scala.inline
  def method: typingsJapgolly.rcFieldForm.rcFieldFormStrings.method = this.cast("method")
  @scala.inline
  def number: typingsJapgolly.rcFieldForm.rcFieldFormStrings.number = this.cast("number")
  @scala.inline
  def `object`: typingsJapgolly.rcFieldForm.rcFieldFormStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typingsJapgolly.rcFieldForm.rcFieldFormStrings.regexp = this.cast("regexp")
  @scala.inline
  def string: typingsJapgolly.rcFieldForm.rcFieldFormStrings.string = this.cast("string")
  @scala.inline
  def url: typingsJapgolly.rcFieldForm.rcFieldFormStrings.url = this.cast("url")
}

