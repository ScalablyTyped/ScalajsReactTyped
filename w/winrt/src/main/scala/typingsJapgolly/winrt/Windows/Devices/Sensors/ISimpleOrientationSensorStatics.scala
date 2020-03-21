package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensorStatics extends js.Object {
  def getDefault(): SimpleOrientationSensor
}

object ISimpleOrientationSensorStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[SimpleOrientationSensor]): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
}

