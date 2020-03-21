package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedDeferral extends js.Object {
  def complete(): Unit
}

object IWebUINavigatedDeferral {
  @scala.inline
  def apply(complete: Callback): IWebUINavigatedDeferral = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("complete")(complete.toJsFn)
    __obj.asInstanceOf[IWebUINavigatedDeferral]
  }
}

