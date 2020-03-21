package typingsJapgolly.glFbo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FrameBufferOptions extends js.Object {
  var color: js.UndefOr[Double] = js.undefined
  var depth: js.UndefOr[Boolean] = js.undefined
  var float: js.UndefOr[Boolean] = js.undefined
  var preferFloat: js.UndefOr[Boolean] = js.undefined
  var stencil: js.UndefOr[Boolean] = js.undefined
}

object FrameBufferOptions {
  @scala.inline
  def apply(
    color: Int | Double = null,
    depth: js.UndefOr[Boolean] = js.undefined,
    float: js.UndefOr[Boolean] = js.undefined,
    preferFloat: js.UndefOr[Boolean] = js.undefined,
    stencil: js.UndefOr[Boolean] = js.undefined
  ): FrameBufferOptions = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(depth)) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (!js.isUndefined(float)) __obj.updateDynamic("float")(float.asInstanceOf[js.Any])
    if (!js.isUndefined(preferFloat)) __obj.updateDynamic("preferFloat")(preferFloat.asInstanceOf[js.Any])
    if (!js.isUndefined(stencil)) __obj.updateDynamic("stencil")(stencil.asInstanceOf[js.Any])
    __obj.asInstanceOf[FrameBufferOptions]
  }
}

