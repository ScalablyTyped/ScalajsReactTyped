package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationSamplerDemResolution extends Object {
  /**
    * The maximum resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#demResolution)
    */
  var max: Double
  /**
    * The minimum resolution.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ElevationSampler.html#demResolution)
    */
  var min: Double
}

object ElevationSamplerDemResolution {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    max: Double,
    min: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): ElevationSamplerDemResolution = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ElevationSamplerDemResolution]
  }
}

