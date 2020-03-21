package typingsJapgolly.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapColorStopProperties extends js.Object {
  /**
    * The color to shade a given pixel based on its calculated pixel intensity [ratio](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  /**
    * The ratio of a pixel's intensity value to the [minPixelIntensity](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minPixelIntensity) of the renderer. The ratio of each pixel is matched to the corresponding [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#color).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-HeatmapColorStop.html#ratio)
    */
  var ratio: js.UndefOr[Double] = js.undefined
}

object HeatmapColorStopProperties {
  @scala.inline
  def apply(color: Color_ | js.Array[Double] | String = null, ratio: Int | Double = null): HeatmapColorStopProperties = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (ratio != null) __obj.updateDynamic("ratio")(ratio.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapColorStopProperties]
  }
}

