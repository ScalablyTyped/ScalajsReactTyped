package typingsJapgolly.popperDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GpuAcceleration extends js.Object {
  var gpuAcceleration: js.UndefOr[Boolean] = js.undefined
  var onLoad: js.UndefOr[js.Function] = js.undefined
}

object Anon_GpuAcceleration {
  @scala.inline
  def apply(gpuAcceleration: js.UndefOr[Boolean] = js.undefined, onLoad: js.Function = null): Anon_GpuAcceleration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gpuAcceleration)) __obj.updateDynamic("gpuAcceleration")(gpuAcceleration.asInstanceOf[js.Any])
    if (onLoad != null) __obj.updateDynamic("onLoad")(onLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_GpuAcceleration]
  }
}

