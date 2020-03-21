package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.boolean
import typingsJapgolly.xrm.xrmStrings.datetime
import typingsJapgolly.xrm.xrmStrings.decimal
import typingsJapgolly.xrm.xrmStrings.double
import typingsJapgolly.xrm.xrmStrings.integer
import typingsJapgolly.xrm.xrmStrings.lookup
import typingsJapgolly.xrm.xrmStrings.memo
import typingsJapgolly.xrm.xrmStrings.money
import typingsJapgolly.xrm.xrmStrings.multioptionset
import typingsJapgolly.xrm.xrmStrings.optionset
import typingsJapgolly.xrm.xrmStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Attribute types for {@link Attributes.Attribute.setDisplayState()}.
  * @see {@link Xrm.Attributes.AttributeType}
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
  def Boolean: boolean = this.cast("boolean")
  @scala.inline
  def DateTime: datetime = this.cast("datetime")
  @scala.inline
  def Decimal: decimal = this.cast("decimal")
  @scala.inline
  def Double: double = this.cast("double")
  @scala.inline
  def Integer: integer = this.cast("integer")
  @scala.inline
  def Lookup: lookup = this.cast("lookup")
  @scala.inline
  def Memo: memo = this.cast("memo")
  @scala.inline
  def Money: money = this.cast("money")
  @scala.inline
  def MultiOptionSet: multioptionset = this.cast("multioptionset")
  @scala.inline
  def OptionSet: optionset = this.cast("optionset")
  @scala.inline
  def String: string = this.cast("string")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

