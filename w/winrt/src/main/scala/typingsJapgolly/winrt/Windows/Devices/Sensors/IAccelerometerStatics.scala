package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccelerometerStatics extends js.Object {
  def getDefault(): Accelerometer
}

object IAccelerometerStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[Accelerometer]): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[IAccelerometerStatics]
  }
}

