package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerPurgeOptions extends Object {
  /**
    * The maximum time in minutes that a feature should be kept. After this time, the feature is removed from the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var age: Double
  /**
    * The maximum number of features to display. Excess features are purged from the beginning of the graphics array.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var displayCount: Double
}

object StreamLayerPurgeOptions {
  @scala.inline
  def apply(
    age: Double,
    constructor: js.Function,
    displayCount: Double,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): StreamLayerPurgeOptions = {
    val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], displayCount = displayCount.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[StreamLayerPurgeOptions]
  }
}

