package typingsJapgolly.xrm.Xrm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link Entity.save Entity}'s Save Mode
  * @see {@link XrmEnum.EntitySaveMode}
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
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def saveandclose: typingsJapgolly.xrm.xrmStrings.saveandclose = this.cast("saveandclose")
  @scala.inline
  def saveandnew: typingsJapgolly.xrm.xrmStrings.saveandnew = this.cast("saveandnew")
}

