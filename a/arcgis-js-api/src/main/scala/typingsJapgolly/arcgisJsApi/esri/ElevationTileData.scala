package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElevationTileData extends Object {
  /**
    * The height of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var height: Double
  /**
    * The maximum allowed error of the Z-value for each value in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var maxZError: Double
  /**
    * Indicating the pixel values where no elevation data is present.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var noDataValue: Double
  /**
    * The elevation values of each pixel in the tile.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var values: js.Array[Double]
  /**
    * The width of the tile in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseElevationLayer.html#ElevationTileData)
    */
  var width: Double
}

object ElevationTileData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    height: Double,
    maxZError: Double,
    noDataValue: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    values: js.Array[Double],
    width: Double
  ): ElevationTileData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxZError = maxZError.asInstanceOf[js.Any], noDataValue = noDataValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ElevationTileData]
  }
}

