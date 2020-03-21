package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerSymbolProperties extends SymbolProperties {
  /**
    * The angle of the marker relative to the screen in degrees.
    * > **Known Limitations**  This property is currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#angle)
    *
    * @default 0
    */
  var angle: js.UndefOr[Double] = js.undefined
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-marker` | `picture-marker`] = js.undefined
  /**
    * The offset on the x-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#xoffset)
    *
    * @default 0
    */
  var xoffset: js.UndefOr[Double | String] = js.undefined
  /**
    * The offset on the y-axis in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html#yoffset)
    *
    * @default 0
    */
  var yoffset: js.UndefOr[Double | String] = js.undefined
}

object MarkerSymbolProperties {
  @scala.inline
  def apply(
    angle: Int | Double = null,
    color: Color_ | js.Array[Double] | String = null,
    `type`: `simple-marker` | `picture-marker` = null,
    xoffset: Double | String = null,
    yoffset: Double | String = null
  ): MarkerSymbolProperties = {
    val __obj = js.Dynamic.literal()
    if (angle != null) __obj.updateDynamic("angle")(angle.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xoffset != null) __obj.updateDynamic("xoffset")(xoffset.asInstanceOf[js.Any])
    if (yoffset != null) __obj.updateDynamic("yoffset")(yoffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerSymbolProperties]
  }
}

