package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInclinometerStatics extends js.Object {
  def getDefault(): Inclinometer
}

object IInclinometerStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[Inclinometer]): IInclinometerStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[IInclinometerStatics]
  }
}

