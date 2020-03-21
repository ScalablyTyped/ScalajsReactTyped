package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.language
import typingsJapgolly.xrm.xrmStrings.timezone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: OptionSet attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.OptionSetAttribute OptionSetAttribute}.
  * @see {@link Xrm.Attributes.OptionSetAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.language
  - typingsJapgolly.xrm.xrmStrings.timezone
*/
trait OptionSetAttributeFormat extends js.Object

object OptionSetAttributeFormat {
  @scala.inline
  def Language: language = this.cast("language")
  @scala.inline
  def TimeZone: timezone = this.cast("timezone")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

