package typingsJapgolly.webcl.WEBCL

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 3.7
trait WebCLSampler extends js.Object {
  def getInfo(name: SamplerInfo): js.Any
  def release(): Unit
}

object WebCLSampler {
  @scala.inline
  def apply(getInfo: SamplerInfo => CallbackTo[js.Any], release: Callback): WebCLSampler = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: typingsJapgolly.webcl.WEBCL.SamplerInfo) => getInfo(t0).runNow()))
    __obj.updateDynamic("release")(release.toJsFn)
    __obj.asInstanceOf[WebCLSampler]
  }
}

