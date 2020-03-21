package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.email
import typingsJapgolly.xrm.xrmStrings.phone
import typingsJapgolly.xrm.xrmStrings.text
import typingsJapgolly.xrm.xrmStrings.textarea
import typingsJapgolly.xrm.xrmStrings.tickersymbol
import typingsJapgolly.xrm.xrmStrings.url
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: String attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.StringAttribute StringAttribute}.
  * @see {@link Xrm.Attributes.StringAttributeFormat}
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
  def Email: email = this.cast("email")
  @scala.inline
  def Phone: phone = this.cast("phone")
  @scala.inline
  def Text: text = this.cast("text")
  @scala.inline
  def TextArea: textarea = this.cast("textarea")
  @scala.inline
  def TickerSymbol: tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def URL: url = this.cast("url")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

