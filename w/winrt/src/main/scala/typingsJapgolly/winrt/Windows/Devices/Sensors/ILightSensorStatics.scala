package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILightSensorStatics extends js.Object {
  def getDefault(): LightSensor
}

object ILightSensorStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[LightSensor]): ILightSensorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[ILightSensorStatics]
  }
}

