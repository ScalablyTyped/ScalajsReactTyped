package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequest extends js.Object {
  var deadline: js.Date
  def createPrintTask(title: String, handler: PrintTaskSourceRequestedHandler): PrintTask
  def getDeferral(): PrintTaskRequestedDeferral
}

object IPrintTaskRequest {
  @scala.inline
  def apply(
    createPrintTask: (String, PrintTaskSourceRequestedHandler) => CallbackTo[PrintTask],
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskRequestedDeferral]
  ): IPrintTaskRequest = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("createPrintTask")(js.Any.fromFunction2((t0: java.lang.String, t1: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskSourceRequestedHandler) => createPrintTask(t0, t1).runNow()))
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IPrintTaskRequest]
  }
}

