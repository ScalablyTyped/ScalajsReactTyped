package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait predominanceRendererResult extends Object {
  /**
    * The ID of the basemap used to determine the optimal fill color of the features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var basemapId: String
  /**
    * Indicates whether the average color of the input view's basemap is `light` or `dark`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var basemapTheme: String
  /**
    * An array of objects describing the values or categories excluded from consideration in visualizing data from the given fields. The specification of each object matches that of the objects specified in the `predominantCategoryInfos` property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var excludedCategoryInfos: js.Array[_]
  /**
    * An opacity visual variable representing the percentage of the total count comprised by the predominant value of all fields. This variable indicates the strength of a particular value's predominance compared to the other values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var opacity: js.UndefOr[opacityVisualVariableResult] = js.undefined
  /**
    * The predominance scheme used by the renderer based on the given basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var predominanceScheme: PredominanceScheme
  /**
    * An array of objects describing the value, symbol, and count of each unique type or category represented in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var predominantCategoryInfos: js.Array[typeUniqueValueInfo]
  /**
    * The unique value renderer object representing the predominance visualization. Set this on a layer's `renderer` property to update its visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var renderer: UniqueValueRenderer
  /**
    * A size visual variable representing the total count of all fields included in the predominance visualization. This is included if the `includeSizeVariable` parameter is true.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-predominance.html#RendererResult)
    */
  var size: js.UndefOr[sizeVisualVariableResult] = js.undefined
}

object predominanceRendererResult {
  @scala.inline
  def apply(
    basemapId: String,
    basemapTheme: String,
    constructor: js.Function,
    excludedCategoryInfos: js.Array[_],
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    predominanceScheme: PredominanceScheme,
    predominantCategoryInfos: js.Array[typeUniqueValueInfo],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    renderer: UniqueValueRenderer,
    opacity: opacityVisualVariableResult = null,
    size: sizeVisualVariableResult = null
  ): predominanceRendererResult = {
    val __obj = js.Dynamic.literal(basemapId = basemapId.asInstanceOf[js.Any], basemapTheme = basemapTheme.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], excludedCategoryInfos = excludedCategoryInfos.asInstanceOf[js.Any], predominanceScheme = predominanceScheme.asInstanceOf[js.Any], predominantCategoryInfos = predominantCategoryInfos.asInstanceOf[js.Any], renderer = renderer.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceRendererResult]
  }
}

