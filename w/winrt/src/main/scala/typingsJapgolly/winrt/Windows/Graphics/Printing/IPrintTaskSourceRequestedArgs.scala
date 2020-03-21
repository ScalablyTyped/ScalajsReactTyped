package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSourceRequestedArgs extends js.Object {
  var deadline: js.Date
  def getDeferral(): PrintTaskSourceRequestedDeferral
  def setSource(source: IPrintDocumentSource): Unit
}

object IPrintTaskSourceRequestedArgs {
  @scala.inline
  def apply(
    deadline: js.Date,
    getDeferral: CallbackTo[PrintTaskSourceRequestedDeferral],
    setSource: IPrintDocumentSource => Callback
  ): IPrintTaskSourceRequestedArgs = {
    val __obj = js.Dynamic.literal(deadline = deadline.asInstanceOf[js.Any])
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.updateDynamic("setSource")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Graphics.Printing.IPrintDocumentSource) => setSource(t0).runNow()))
    __obj.asInstanceOf[IPrintTaskSourceRequestedArgs]
  }
}

