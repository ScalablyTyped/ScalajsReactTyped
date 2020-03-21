package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebUINavigatedOperation extends js.Object {
  def getDeferral(): WebUINavigatedDeferral
}

object IWebUINavigatedOperation {
  @scala.inline
  def apply(getDeferral: CallbackTo[WebUINavigatedDeferral]): IWebUINavigatedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IWebUINavigatedOperation]
  }
}

