package typingsJapgolly.winrt.Windows.Networking.Proximity

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IProximityDeviceStatics extends js.Object {
  def fromId(deviceInterfaceId: String): ProximityDevice
  def getDefault(): ProximityDevice
  def getDeviceSelector(): String
}

object IProximityDeviceStatics {
  @scala.inline
  def apply(
    fromId: String => CallbackTo[ProximityDevice],
    getDefault: CallbackTo[ProximityDevice],
    getDeviceSelector: CallbackTo[String]
  ): IProximityDeviceStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(js.Any.fromFunction1((t0: java.lang.String) => fromId(t0).runNow()))
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.updateDynamic("getDeviceSelector")(getDeviceSelector.toJsFn)
    __obj.asInstanceOf[IProximityDeviceStatics]
  }
}

