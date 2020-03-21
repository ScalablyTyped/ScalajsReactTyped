package typingsJapgolly.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Submit Mode for {@link Attributes.Attribute.setSubmitMode} Attributes.Attribute.setSubmitMode().
  * @see {@link XrmEnum.SubmitMode}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.always
  - typingsJapgolly.xrm.xrmStrings.dirty
  - typingsJapgolly.xrm.xrmStrings.never
*/
trait SubmitMode extends js.Object

object SubmitMode {
  @scala.inline
  def always: typingsJapgolly.xrm.xrmStrings.always = this.cast("always")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dirty: typingsJapgolly.xrm.xrmStrings.dirty = this.cast("dirty")
  @scala.inline
  def never: typingsJapgolly.xrm.xrmStrings.never = this.cast("never")
}

