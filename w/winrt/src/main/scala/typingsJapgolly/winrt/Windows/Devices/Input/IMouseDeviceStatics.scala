package typingsJapgolly.winrt.Windows.Devices.Input

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMouseDeviceStatics extends js.Object {
  def getForCurrentView(): MouseDevice
}

object IMouseDeviceStatics {
  @scala.inline
  def apply(getForCurrentView: CallbackTo[MouseDevice]): IMouseDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getForCurrentView")(getForCurrentView.toJsFn)
    __obj.asInstanceOf[IMouseDeviceStatics]
  }
}

