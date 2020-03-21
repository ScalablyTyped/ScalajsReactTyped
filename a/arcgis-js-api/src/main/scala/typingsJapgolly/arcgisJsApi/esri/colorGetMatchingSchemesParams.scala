package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorGetMatchingSchemesParams extends Object {
  /**
    * An array of colors used to match with schemes for the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var colors: js.Array[Color_]
  /**
    * The geometry type of the layer for which the color scheme will be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var geometryType: String
  /**
    * The name of the theme from which to get color schemes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var theme: String
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) instance used to calculate the suggested sizes of the symbols.  This is required for 3D visualizations.
    *
    * [Read more...](global.html)
    */
  var view: js.UndefOr[SceneView] = js.undefined
  /**
    * Indicates whether 3D volumetric symbols will be used in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#getMatchingSchemes)
    */
  var worldScale: js.UndefOr[Boolean] = js.undefined
}

object colorGetMatchingSchemesParams {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    theme: String,
    view: SceneView = null,
    worldScale: js.UndefOr[Boolean] = js.undefined
  ): colorGetMatchingSchemesParams = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (view != null) __obj.updateDynamic("view")(view.asInstanceOf[js.Any])
    if (!js.isUndefined(worldScale)) __obj.updateDynamic("worldScale")(worldScale.asInstanceOf[js.Any])
    __obj.asInstanceOf[colorGetMatchingSchemesParams]
  }
}

