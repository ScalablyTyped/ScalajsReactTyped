package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.date
import typingsJapgolly.xrm.xrmStrings.datetime
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link Xrm.Attributes.DateAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.date
  - typingsJapgolly.xrm.xrmStrings.datetime
*/
trait DateAttributeFormat extends js.Object

object DateAttributeFormat {
  @scala.inline
  def Date: date = this.cast("date")
  @scala.inline
  def DateTime: datetime = this.cast("datetime")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

