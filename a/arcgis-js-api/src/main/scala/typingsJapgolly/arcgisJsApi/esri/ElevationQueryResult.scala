package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationQueryResult extends Object {
  /**
    * The geometry with sampled z-values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var geometry: Point | Multipoint | Polyline
  /**
    * The value used when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var noDataValue: Double
  /**
    * Contains additional information about how the geometry was sampled. This property is present depending on whether the user set `options.returnSampleInfo = true`, for each coordinate in the geometry.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#ElevationQueryResult)
    */
  var sampleInfo: js.UndefOr[js.Array[ElevationQueryResultSampleInfo]] = js.undefined
}

object ElevationQueryResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometry: Point | Multipoint | Polyline,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    sampleInfo: js.Array[ElevationQueryResultSampleInfo] = null
  ): ElevationQueryResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometry = geometry.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (sampleInfo != null) __obj.updateDynamic("sampleInfo")(sampleInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElevationQueryResult]
  }
}

