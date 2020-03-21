package typingsJapgolly.winrt.Windows.Media.Devices

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAdvancedVideoCaptureDeviceController extends js.Object {
  def getDeviceProperty(propertyId: String): js.Any
  def setDeviceProperty(propertyId: String, propertyValue: js.Any): Unit
}

object IAdvancedVideoCaptureDeviceController {
  @scala.inline
  def apply(getDeviceProperty: String => CallbackTo[js.Any], setDeviceProperty: (String, js.Any) => Callback): IAdvancedVideoCaptureDeviceController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDeviceProperty")(js.Any.fromFunction1((t0: java.lang.String) => getDeviceProperty(t0).runNow()))
    __obj.updateDynamic("setDeviceProperty")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => setDeviceProperty(t0, t1).runNow()))
    __obj.asInstanceOf[IAdvancedVideoCaptureDeviceController]
  }
}

