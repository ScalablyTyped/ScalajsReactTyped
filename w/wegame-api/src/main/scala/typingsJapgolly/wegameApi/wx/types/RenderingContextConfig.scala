package typingsJapgolly.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RenderingContextConfig extends js.Object {
  /**
    * 表示是否抗锯齿
    */
  var antialias: js.UndefOr[Boolean] = js.undefined
  /**
    * 抗锯齿样本数。最小值为 2，最大不超过系统限制数量，仅 iOS 支持
    */
  var antialiasSamples: js.UndefOr[Double] = js.undefined
  /**
    * 表示是否绘图完成后是否保留绘图缓冲区
    */
  var preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
}

object RenderingContextConfig {
  @scala.inline
  def apply(
    antialias: js.UndefOr[Boolean] = js.undefined,
    antialiasSamples: Int | Double = null,
    preserveDrawingBuffer: js.UndefOr[Boolean] = js.undefined
  ): RenderingContextConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(antialias)) __obj.updateDynamic("antialias")(antialias.asInstanceOf[js.Any])
    if (antialiasSamples != null) __obj.updateDynamic("antialiasSamples")(antialiasSamples.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveDrawingBuffer)) __obj.updateDynamic("preserveDrawingBuffer")(preserveDrawingBuffer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingContextConfig]
  }
}

