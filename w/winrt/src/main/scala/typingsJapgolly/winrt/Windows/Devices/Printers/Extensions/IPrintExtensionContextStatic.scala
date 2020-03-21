package typingsJapgolly.winrt.Windows.Devices.Printers.Extensions

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPrintExtensionContextStatic extends js.Object {
  def fromDeviceId(deviceId: String): js.Any
}

object IPrintExtensionContextStatic {
  @scala.inline
  def apply(fromDeviceId: String => CallbackTo[js.Any]): IPrintExtensionContextStatic = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fromDeviceId")(js.Any.fromFunction1((t0: java.lang.String) => fromDeviceId(t0).runNow()))
    __obj.asInstanceOf[IPrintExtensionContextStatic]
  }
}

