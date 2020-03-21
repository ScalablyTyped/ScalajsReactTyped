package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.6
trait WebCLMemoryObject extends js.Object {
  def getInfo(name: MemInfo): js.Any
  def release(): Unit
}

object WebCLMemoryObject {
  @scala.inline
  def apply(getInfo: MemInfo => CallbackTo[js.Any], release: Callback): WebCLMemoryObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.MemInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.asInstanceOf[WebCLMemoryObject]
  }
}

