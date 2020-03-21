package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.active
import typingsJapgolly.xrm.xrmStrings.inactive
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link ProcessFlow.StageStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.active
  - typingsJapgolly.xrm.xrmStrings.inactive
*/
trait StageStatus extends js.Object

object StageStatus {
  @scala.inline
  def Active: active = this.cast("active")
  @scala.inline
  def Inactive: inactive = this.cast("inactive")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

