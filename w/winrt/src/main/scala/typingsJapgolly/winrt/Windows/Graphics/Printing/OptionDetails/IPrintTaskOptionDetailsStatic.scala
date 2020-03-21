package typingsJapgolly.winrt.Windows.Graphics.Printing.OptionDetails

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionDetailsStatic extends js.Object {
  def getFromPrintTaskOptions(printTaskOptions: PrintTaskOptions): PrintTaskOptionDetails
}

object IPrintTaskOptionDetailsStatic {
  @scala.inline
  def apply(getFromPrintTaskOptions: PrintTaskOptions => CallbackTo[PrintTaskOptionDetails]): IPrintTaskOptionDetailsStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFromPrintTaskOptions")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Graphics.Printing.PrintTaskOptions) => getFromPrintTaskOptions(t0).runNow()))
    __obj.asInstanceOf[IPrintTaskOptionDetailsStatic]
  }
}

