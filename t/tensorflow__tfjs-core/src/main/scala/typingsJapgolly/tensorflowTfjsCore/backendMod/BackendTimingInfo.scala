package typingsJapgolly.tensorflowTfjsCore.backendMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTimingInfo extends js.Object {
  var getExtraProfileInfo: js.UndefOr[js.Function0[String]] = js.undefined
  var kernelMs: Double
}

object BackendTimingInfo {
  @scala.inline
  def apply(kernelMs: Double, getExtraProfileInfo: js.UndefOr[CallbackTo[String]] = js.undefined): BackendTimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any])
    getExtraProfileInfo.foreach(p => __obj.updateDynamic("getExtraProfileInfo")(p.toJsFn))
    __obj.asInstanceOf[BackendTimingInfo]
  }
}

