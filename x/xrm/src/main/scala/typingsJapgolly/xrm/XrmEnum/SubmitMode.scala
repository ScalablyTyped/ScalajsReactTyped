package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.always
import typingsJapgolly.xrm.xrmStrings.dirty
import typingsJapgolly.xrm.xrmStrings.never
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Submit Modes for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
  * @see {@link Xrm.SubmitMode}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.always
  - typingsJapgolly.xrm.xrmStrings.dirty
  - typingsJapgolly.xrm.xrmStrings.never
*/
trait SubmitMode extends js.Object

object SubmitMode {
  @scala.inline
  def Always: always = this.cast("always")
  @scala.inline
  def Dirty: dirty = this.cast("dirty")
  @scala.inline
  def Never: never = this.cast("never")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

