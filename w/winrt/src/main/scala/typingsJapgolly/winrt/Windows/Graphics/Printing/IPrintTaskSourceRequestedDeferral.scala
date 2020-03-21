package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskSourceRequestedDeferral extends js.Object {
  def complete(): Unit
}

object IPrintTaskSourceRequestedDeferral {
  @scala.inline
  def apply(complete: Callback): IPrintTaskSourceRequestedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IPrintTaskSourceRequestedDeferral]
  }
}

