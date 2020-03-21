package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskOptionsCore extends js.Object {
  def getPageDescription(jobPageNumber: Double): PrintPageDescription
}

object IPrintTaskOptionsCore {
  @scala.inline
  def apply(getPageDescription: Double => CallbackTo[PrintPageDescription]): IPrintTaskOptionsCore = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPageDescription")(js.Any.fromFunction1((t0: scala.Double) => getPageDescription(t0).runNow()))
    __obj.asInstanceOf[IPrintTaskOptionsCore]
  }
}

