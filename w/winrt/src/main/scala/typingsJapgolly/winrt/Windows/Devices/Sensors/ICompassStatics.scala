package typingsJapgolly.winrt.Windows.Devices.Sensors

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompassStatics extends js.Object {
  def getDefault(): Compass
}

object ICompassStatics {
  @scala.inline
  def apply(getDefault: CallbackTo[Compass]): ICompassStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[ICompassStatics]
  }
}

