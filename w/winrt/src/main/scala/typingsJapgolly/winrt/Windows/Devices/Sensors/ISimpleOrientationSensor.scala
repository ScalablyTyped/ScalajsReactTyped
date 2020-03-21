package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISimpleOrientationSensor extends js.Object {
  var onorientationchanged: js.Any
  def getCurrentOrientation(): SimpleOrientation
}

object ISimpleOrientationSensor {
  @scala.inline
  def apply(getCurrentOrientation: CallbackTo[SimpleOrientation], onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.updateDynamic("getCurrentOrientation")(getCurrentOrientation.toJsFn)
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
}

