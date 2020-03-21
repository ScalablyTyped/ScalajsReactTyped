package typingsJapgolly.xrm.XrmEnum

import typingsJapgolly.xrm.xrmStrings.aborted
import typingsJapgolly.xrm.xrmStrings.active
import typingsJapgolly.xrm.xrmStrings.finished
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Constant Enum: Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link ProcessFlow.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.active
  - typingsJapgolly.xrm.xrmStrings.aborted
  - typingsJapgolly.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def Aborted: aborted = this.cast("aborted")
  @scala.inline
  def Active: active = this.cast("active")
  @scala.inline
  def Finished: finished = this.cast("finished")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

