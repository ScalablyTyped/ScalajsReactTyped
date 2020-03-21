package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ageUtilsGetAgeExpressionsParams extends Object {
  /**
    * The end time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `startTime` parameter must be a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var endTime: js.Date | String | Double
  /**
    * The layer from which to generate age statistics for the given `startTime` and `endTime`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer
  /**
    * The start time for the age calculation. This can be a field name or a date value, such as `Date.now()`. If a `Date` is provided, then the `endTime` parameter must be a field name.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var startTime: js.Date | String | Double
  /**
    * The desired units of the age result.  **Possible Values:** years | months | days | hours | minutes | seconds
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-support-ageUtils.html#getAgeExpressions)
    */
  var unit: js.UndefOr[String] = js.undefined
}

object ageUtilsGetAgeExpressionsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    endTime: js.Date | String | Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: FeatureLayer | SceneLayer | CSVLayer | GeoJSONLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    startTime: js.Date | String | Double,
    unit: String = null
  ): ageUtilsGetAgeExpressionsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], endTime = endTime.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    __obj.asInstanceOf[ageUtilsGetAgeExpressionsParams]
  }
}

