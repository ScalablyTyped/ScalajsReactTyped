package typingsJapgolly.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link XrmEnum.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.email
  - typingsJapgolly.xrm.xrmStrings.phone
  - typingsJapgolly.xrm.xrmStrings.text
  - typingsJapgolly.xrm.xrmStrings.textarea
  - typingsJapgolly.xrm.xrmStrings.tickersymbol
  - typingsJapgolly.xrm.xrmStrings.url
*/
trait StringAttributeFormat extends js.Object

object StringAttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def email: typingsJapgolly.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def phone: typingsJapgolly.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typingsJapgolly.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typingsJapgolly.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typingsJapgolly.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def url: typingsJapgolly.xrm.xrmStrings.url = this.cast("url")
}

