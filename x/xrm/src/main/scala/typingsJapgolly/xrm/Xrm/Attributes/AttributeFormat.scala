package typingsJapgolly.xrm.Xrm.Attributes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Attribute formats for {@link Attributes.Attribute.getFormat Attributes.Attribute.getFormat()}.
  * @see {@link XrmEnum.DateAttributeFormat}
  * @see {@link XrmEnum.IntegerAttributeFormat}
  * @see {@link XrmEnum.OptionSetAttributeFormat}
  * @see {@link XrmEnum.StringAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.date
  - typingsJapgolly.xrm.xrmStrings.datetime
  - typingsJapgolly.xrm.xrmStrings.duration
  - typingsJapgolly.xrm.xrmStrings.none
  - typingsJapgolly.xrm.xrmStrings.language
  - typingsJapgolly.xrm.xrmStrings.timezone
  - typingsJapgolly.xrm.xrmStrings.email
  - typingsJapgolly.xrm.xrmStrings.phone
  - typingsJapgolly.xrm.xrmStrings.text
  - typingsJapgolly.xrm.xrmStrings.textarea
  - typingsJapgolly.xrm.xrmStrings.tickersymbol
  - typingsJapgolly.xrm.xrmStrings.url
*/
trait AttributeFormat extends js.Object

object AttributeFormat {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typingsJapgolly.xrm.xrmStrings.date = this.cast("date")
  @scala.inline
  def datetime: typingsJapgolly.xrm.xrmStrings.datetime = this.cast("datetime")
  @scala.inline
  def duration: typingsJapgolly.xrm.xrmStrings.duration = this.cast("duration")
  @scala.inline
  def email: typingsJapgolly.xrm.xrmStrings.email = this.cast("email")
  @scala.inline
  def language: typingsJapgolly.xrm.xrmStrings.language = this.cast("language")
  @scala.inline
  def none: typingsJapgolly.xrm.xrmStrings.none = this.cast("none")
  @scala.inline
  def phone: typingsJapgolly.xrm.xrmStrings.phone = this.cast("phone")
  @scala.inline
  def text: typingsJapgolly.xrm.xrmStrings.text = this.cast("text")
  @scala.inline
  def textarea: typingsJapgolly.xrm.xrmStrings.textarea = this.cast("textarea")
  @scala.inline
  def tickersymbol: typingsJapgolly.xrm.xrmStrings.tickersymbol = this.cast("tickersymbol")
  @scala.inline
  def timezone: typingsJapgolly.xrm.xrmStrings.timezone = this.cast("timezone")
  @scala.inline
  def url: typingsJapgolly.xrm.xrmStrings.url = this.cast("url")
}

