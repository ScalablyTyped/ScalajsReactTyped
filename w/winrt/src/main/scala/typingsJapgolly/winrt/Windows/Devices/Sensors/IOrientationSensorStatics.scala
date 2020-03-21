package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrientationSensorStatics extends js.Object {
  def getDefault(): OrientationSensor
}

object IOrientationSensorStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[OrientationSensor]): IOrientationSensorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[IOrientationSensorStatics]
  }
}

