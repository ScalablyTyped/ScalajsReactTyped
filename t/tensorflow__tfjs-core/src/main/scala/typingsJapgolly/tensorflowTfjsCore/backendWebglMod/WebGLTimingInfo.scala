package typingsJapgolly.tensorflowTfjsCore.backendWebglMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tensorflowTfjsCore.engineMod.TimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLTimingInfo extends TimingInfo {
  var downloadWaitMs: Double
  var uploadWaitMs: Double
}

object WebGLTimingInfo {
  @scala.inline
  def apply(
    downloadWaitMs: Double,
    kernelMs: Double,
    uploadWaitMs: Double,
    wallMs: Double,
    getExtraProfileInfo: js.UndefOr[CallbackTo[String]] = js.undefined
  ): WebGLTimingInfo = {
    val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    getExtraProfileInfo.foreach(p => __obj.updateDynamic("getExtraProfileInfo")(p.toJsFn))
    __obj.asInstanceOf[WebGLTimingInfo]
  }
}

