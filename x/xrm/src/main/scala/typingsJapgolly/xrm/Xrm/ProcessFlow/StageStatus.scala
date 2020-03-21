package typingsJapgolly.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status for {@link ProcessFlow.Stage.getStatus Stage.getStatus()}.
  * @see {@link XrmEnum.StageStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.active
  - typingsJapgolly.xrm.xrmStrings.inactive
*/
trait StageStatus extends js.Object

object StageStatus {
  @scala.inline
  def active: typingsJapgolly.xrm.xrmStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def inactive: typingsJapgolly.xrm.xrmStrings.inactive = this.cast("inactive")
}

