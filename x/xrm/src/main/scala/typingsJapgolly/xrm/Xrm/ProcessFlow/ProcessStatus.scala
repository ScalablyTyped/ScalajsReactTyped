package typingsJapgolly.xrm.Xrm.ProcessFlow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Status for {@link ProcessFlow.Process.getStatus Process.getStatus()}.
  * @see {@link XrmEnum.ProcessStatus}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.active
  - typingsJapgolly.xrm.xrmStrings.aborted
  - typingsJapgolly.xrm.xrmStrings.finished
*/
trait ProcessStatus extends js.Object

object ProcessStatus {
  @scala.inline
  def aborted: typingsJapgolly.xrm.xrmStrings.aborted = this.cast("aborted")
  @scala.inline
  def active: typingsJapgolly.xrm.xrmStrings.active = this.cast("active")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def finished: typingsJapgolly.xrm.xrmStrings.finished = this.cast("finished")
}

