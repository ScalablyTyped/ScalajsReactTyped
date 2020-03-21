package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.3
trait WebCLDevice extends js.Object {
  def enableExtension(extensionName: String): Boolean
  def getInfo(name: DeviceInfo): js.Any
  def getSupportedExtensions(): js.Array[String]
}

object WebCLDevice {
  @scala.inline
  def apply(
    enableExtension: String => CallbackTo[Boolean],
    getInfo: DeviceInfo => CallbackTo[js.Any],
    getSupportedExtensions: CallbackTo[js.Array[String]]
  ): WebCLDevice = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enableExtension")(js.Any.fromFunction1((t0: java.lang.String) => enableExtension(t0).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.DeviceInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("getSupportedExtensions")(getSupportedExtensions.toJsFn)
    __obj.asInstanceOf[WebCLDevice]
  }
}

