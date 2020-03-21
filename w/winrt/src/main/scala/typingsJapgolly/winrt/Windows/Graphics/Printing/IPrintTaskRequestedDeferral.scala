package typingsJapgolly.winrt.Windows.Graphics.Printing

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintTaskRequestedDeferral extends js.Object {
  def complete(): Unit
}

object IPrintTaskRequestedDeferral {
  @scala.inline
  def apply(complete: Callback): IPrintTaskRequestedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IPrintTaskRequestedDeferral]
  }
}

