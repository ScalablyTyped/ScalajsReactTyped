package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICallControlStatics extends js.Object {
  def fromId(deviceInterfaceId: String): CallControl
  def getDefault(): CallControl
}

object ICallControlStatics {
  @scala.inline
  def apply(fromId: String => CallbackTo[CallControl], getDefault: CallbackTo[CallControl]): ICallControlStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromId")(js.Any.fromFunction1((t0: java.lang.String) => fromId(t0).runNow()))
    __obj.updateDynamic("getDefault")(getDefault.toJsFn)
    __obj.asInstanceOf[ICallControlStatics]
  }
}

