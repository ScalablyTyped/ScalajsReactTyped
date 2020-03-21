package typingsJapgolly.dymoLabelFramework.dymo.label.framework

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Print Job */
trait PrintJob extends js.Object {
  /**
  		 * Gets a status of the print job
  		 *
  		 * @param replyCallback a function called when the status is available
  		 */
  def getStatus(replyCallback: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, _]): Unit
}

object PrintJob {
  @scala.inline
  def apply(getStatus: js.Function1[/* printJobStatusInfo */ PrintJobStatusInfo, js.Any] => Callback): PrintJob = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: js.Function1[
  /* printJobStatusInfo */ typingsJapgolly.dymoLabelFramework.dymo.label.framework.PrintJobStatusInfo, 
  js.Any]) => getStatus(t0).runNow()))
    __obj.asInstanceOf[PrintJob]
  }
}

