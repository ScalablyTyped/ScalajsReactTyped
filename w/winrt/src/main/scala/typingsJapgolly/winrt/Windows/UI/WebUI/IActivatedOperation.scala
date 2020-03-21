package typingsJapgolly.winrt.Windows.UI.WebUI

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IActivatedOperation extends js.Object {
  def getDeferral(): ActivatedDeferral
}

object IActivatedOperation {
  @scala.inline
  def apply(getDeferral: CallbackTo[ActivatedDeferral]): IActivatedOperation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeferral")(getDeferral.toJsFn)
    __obj.asInstanceOf[IActivatedOperation]
  }
}

