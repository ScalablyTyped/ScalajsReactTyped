package typingsJapgolly.winrt.Windows.Devices.Input

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPointerDeviceStatics extends js.Object {
  def getPointerDevice(pointerId: Double): PointerDevice
  def getPointerDevices(): IVectorView[PointerDevice]
}

object IPointerDeviceStatics {
  @scala.inline
  def apply(
    getPointerDevice: Double => CallbackTo[PointerDevice],
    getPointerDevices: CallbackTo[IVectorView[PointerDevice]]
  ): IPointerDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getPointerDevice")(js.Any.fromFunction1((t0: scala.Double) => getPointerDevice(t0).runNow()))
    __obj.updateDynamic("getPointerDevices")(getPointerDevices.toJsFn)
    __obj.asInstanceOf[IPointerDeviceStatics]
  }
}

