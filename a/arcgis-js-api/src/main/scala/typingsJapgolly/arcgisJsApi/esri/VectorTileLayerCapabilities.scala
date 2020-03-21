package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCapabilities extends Object {
  var exportMap: VectorTileLayerCapabilitiesExportMap
  /**
    * Indicates options supported by the exportTiles operation. Will be `null` if the `supportsExportTiles` is `false`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var exportTiles: js.Any
  /**
    * Indicates operations that can be performed on the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#capabilities)
    */
  var operations: VectorTileLayerCapabilitiesOperations
}

object VectorTileLayerCapabilities {
  @scala.inline
  def apply(
    constructor: js.Function,
    exportMap: VectorTileLayerCapabilitiesExportMap,
    exportTiles: js.Any,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    operations: VectorTileLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): VectorTileLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], exportMap = exportMap.asInstanceOf[js.Any], exportTiles = exportTiles.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[VectorTileLayerCapabilities]
  }
}

