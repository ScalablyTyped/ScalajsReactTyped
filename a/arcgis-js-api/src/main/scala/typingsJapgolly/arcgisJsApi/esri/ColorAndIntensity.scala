package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorAndIntensity extends Object {
  /**
    * RGB color with values between 0 and 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var color: ArrayLike[Double]
  /**
    * Scalar intensity value by which the color should be scaled for compositing.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-externalRenderers.html#ColorAndIntensity)
    */
  var intensity: Double
}

object ColorAndIntensity {
  @scala.inline
  def apply(
    color: ArrayLike[Double],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    intensity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): ColorAndIntensity = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], intensity = intensity.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ColorAndIntensity]
  }
}

