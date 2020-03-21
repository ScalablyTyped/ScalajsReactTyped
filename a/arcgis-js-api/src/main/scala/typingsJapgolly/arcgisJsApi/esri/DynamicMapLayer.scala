package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`map-layer`
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicMapLayer extends Object {
  /**
    * An optional property for specifying the GDB version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var gdbVersion: String
  /**
    * The [id](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#id) of the service sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var mapLayerId: Double
  /**
    * This value is always `map-layer` and is inferred when the `mapLayerId` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicMapLayer)
    */
  var `type`: `map-layer`
}

object DynamicMapLayer {
  @scala.inline
  def apply(
    constructor: js.Function,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    mapLayerId: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    `type`: `map-layer`
  ): DynamicMapLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], gdbVersion = gdbVersion.asInstanceOf[js.Any], mapLayerId = mapLayerId.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicMapLayer]
  }
}

