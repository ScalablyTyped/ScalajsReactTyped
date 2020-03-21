package typingsJapgolly.echarts

import org.scalajs.dom.raw.HTMLCanvasElement
import org.scalajs.dom.raw.HTMLImageElement
import typingsJapgolly.echarts.echarts.EChartOption._Color
import typingsJapgolly.echarts.echartsStrings.`no-repeat`
import typingsJapgolly.echarts.echartsStrings.`repeat-x`
import typingsJapgolly.echarts.echartsStrings.`repeat-y`
import typingsJapgolly.echarts.echartsStrings.repeat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonImage extends _Color {
  /**
    * HTMLImageElement, and HTMLCanvasElement are supported, while string path is not supported
    */
  var image: HTMLImageElement | HTMLCanvasElement
  var repeat: js.UndefOr[
    typingsJapgolly.echarts.echartsStrings.repeat | `repeat-x` | `repeat-y` | `no-repeat`
  ] = js.undefined
}

object AnonImage {
  @scala.inline
  def apply(
    image: HTMLImageElement | HTMLCanvasElement,
    repeat: repeat | `repeat-x` | `repeat-y` | `no-repeat` = null
  ): AnonImage = {
    val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonImage]
  }
}

