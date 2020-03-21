package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait scaleRangeScaleRangeParams extends Object {
  /**
    * The layer for which to generate a suggested min/max scale range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#scaleRange)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer
  /**
    * The number of features in the `layer` to sample for spatial statistics. A higher sample size will yield more precise results. However, higher sample sizes also require more time for the function to process the result.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-heuristics-scaleRange.html#scaleRange)
    *
    * @default 500
    */
  var sampleSize: js.UndefOr[Double] = js.undefined
  /**
    * The [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) or [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) where the layer will be rendered.
    *
    * [Read more...](global.html)
    */
  var view: View
}

object scaleRangeScaleRangeParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer | PointCloudLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    view: View,
    sampleSize: Int | Double = null
  ): scaleRangeScaleRangeParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[scaleRangeScaleRangeParams]
  }
}

