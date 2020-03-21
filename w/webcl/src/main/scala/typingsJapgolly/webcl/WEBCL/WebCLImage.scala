package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6.2
trait WebCLImage extends WebCLMemoryObject {
  def getInfo(): WebCLImageDescriptor
}

object WebCLImage {
  @scala.inline
  def apply(getInfo: CallbackTo[WebCLImageDescriptor], release: Callback): WebCLImage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(getInfo.toJsFn)
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.asInstanceOf[WebCLImage]
  }
}

