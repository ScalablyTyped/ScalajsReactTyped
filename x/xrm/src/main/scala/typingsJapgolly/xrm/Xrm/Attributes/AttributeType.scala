package typingsJapgolly.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link XrmEnum.AttributeType}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.boolean
  - typingsJapgolly.xrm.xrmStrings.datetime
  - typingsJapgolly.xrm.xrmStrings.decimal
  - typingsJapgolly.xrm.xrmStrings.double
  - typingsJapgolly.xrm.xrmStrings.integer
  - typingsJapgolly.xrm.xrmStrings.lookup
  - typingsJapgolly.xrm.xrmStrings.memo
  - typingsJapgolly.xrm.xrmStrings.money
  - typingsJapgolly.xrm.xrmStrings.multioptionset
  - typingsJapgolly.xrm.xrmStrings.optionset
  - typingsJapgolly.xrm.xrmStrings.string
*/
trait AttributeType extends js.Object

object AttributeType {
  @scala.inline
  def boolean: typingsJapgolly.xrm.xrmStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def datetime: typingsJapgolly.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def decimal: typingsJapgolly.xrm.xrmStrings.decimal = this.cast("decimal")
  @scala.inline
  def double: typingsJapgolly.xrm.xrmStrings.double = this.cast("double")
  @scala.inline
  def integer: typingsJapgolly.xrm.xrmStrings.integer = this.cast("integer")
  @scala.inline
  def lookup: typingsJapgolly.xrm.xrmStrings.lookup = this.cast("lookup")
  @scala.inline
  def memo: typingsJapgolly.xrm.xrmStrings.memo = this.cast("memo")
  @scala.inline
  def money: typingsJapgolly.xrm.xrmStrings.money = this.cast("money")
  @scala.inline
  def multioptionset: typingsJapgolly.xrm.xrmStrings.multioptionset = this.cast("multioptionset")
  @scala.inline
  def optionset: typingsJapgolly.xrm.xrmStrings.optionset = this.cast("optionset")
  @scala.inline
  def string: typingsJapgolly.xrm.xrmStrings.string = this.cast("string")
}

