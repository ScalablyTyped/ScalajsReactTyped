package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GeoJSONLayerEditsEventUpdatedFeatures extends Object {
  var objectId: Double
}

object GeoJSONLayerEditsEventUpdatedFeatures {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    objectId: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): GeoJSONLayerEditsEventUpdatedFeatures = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], objectId = objectId.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[GeoJSONLayerEditsEventUpdatedFeatures]
  }
}

