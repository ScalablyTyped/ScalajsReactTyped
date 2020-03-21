package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.saveandclose
import typingsJapgolly.xrm.xrmStrings.saveandnew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: {@link Entity.save Entity} Save Modes
  * @see {@link Xrm.EntitySaveMode}
  * @see {@link Entity}
  * @see {@link Entity.save}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.saveandclose
  - typingsJapgolly.xrm.xrmStrings.saveandnew
*/
trait EntitySaveMode extends js.Object

object EntitySaveMode {
  @scala.inline
  def SaveAndClose: saveandclose = this.cast("saveandclose")
  @scala.inline
  def SaveAndNew: saveandnew = this.cast("saveandnew")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

