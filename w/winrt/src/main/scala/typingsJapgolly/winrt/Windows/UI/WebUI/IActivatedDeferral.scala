package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedDeferral extends js.Object {
  def complete(): Unit
}

object IActivatedDeferral {
  @scala.inline
  def apply(complete: Callback): IActivatedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IActivatedDeferral]
  }
}

