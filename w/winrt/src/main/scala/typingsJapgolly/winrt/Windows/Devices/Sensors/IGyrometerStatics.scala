package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGyrometerStatics extends js.Object {
  def getDefault(): Gyrometer
}

object IGyrometerStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[Gyrometer]): IGyrometerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[IGyrometerStatics]
  }
}

