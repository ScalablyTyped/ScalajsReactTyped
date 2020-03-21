package typingsJapgolly.tensorflowTfjsCore.engineMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.backendMod.BackendTimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingInfo extends BackendTimingInfo {
  var wallMs: Double
}

object TimingInfo {
  @scala.inline
  def apply(
    kernelMs: Double,
    wallMs: Double,
    getExtraProfileInfo: js.UndefOr[CallbackTo[String]] = js.undefined
  ): TimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    getExtraProfileInfo.foreach(p => __obj.updateDynamic("getExtraProfileInfo")(p.toJsFn))
    __obj.asInstanceOf[TimingInfo]
  }
}

