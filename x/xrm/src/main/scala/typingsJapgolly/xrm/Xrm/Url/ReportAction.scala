package typingsJapgolly.xrm.Xrm.Url

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Report Open Action options for Xrm.Url.ReportOpenParameters.actions.
  * @see {@link XrmEnum.ReportAction}
  */
/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.xrm.xrmStrings.filter
  - typingsJapgolly.xrm.xrmStrings.run
*/
trait ReportAction extends js.Object

object ReportAction {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def filter: typingsJapgolly.xrm.xrmStrings.filter = this.cast("filter")
  @scala.inline
  def run: typingsJapgolly.xrm.xrmStrings.run = this.cast("run")
}

