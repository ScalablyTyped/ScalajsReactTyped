package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcGISMapServiceCapabilitiesExportTiles extends Object {
  /**
    * Specifies the maximum number of tiles that can be exported to a cache dataset or a tile package.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISMapService.html#capabilities)
    */
  var maxExportTilesCount: Double
}

object ArcGISMapServiceCapabilitiesExportTiles {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    maxExportTilesCount: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): ArcGISMapServiceCapabilitiesExportTiles = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], maxExportTilesCount = maxExportTilesCount.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ArcGISMapServiceCapabilitiesExportTiles]
  }
}

