package typingsJapgolly.winrt.Windows.Devices.Portable

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServiceDeviceStatics extends js.Object {
  def getDeviceSelector(serviceType: ServiceDeviceType): String
  def getDeviceSelectorFromServiceId(serviceId: String): String
}

object IServiceDeviceStatics {
  @scala.inline
  def apply(
    getDeviceSelector: ServiceDeviceType => CallbackTo[String],
    getDeviceSelectorFromServiceId: String => CallbackTo[String]
  ): IServiceDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeviceSelector")(js.Any.fromFunction1((t0: typingsJapgolly.winrt.Windows.Devices.Portable.ServiceDeviceType) => getDeviceSelector(t0).runNow()))
    __obj.updateDynamic("getDeviceSelectorFromServiceId")(js.Any.fromFunction1((t0: java.lang.String) => getDeviceSelectorFromServiceId(t0).runNow()))
    __obj.asInstanceOf[IServiceDeviceStatics]
  }
}

