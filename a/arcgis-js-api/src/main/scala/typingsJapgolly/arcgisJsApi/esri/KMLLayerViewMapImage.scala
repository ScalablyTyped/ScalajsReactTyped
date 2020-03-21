package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KMLLayerViewMapImage extends Object {
  /**
    * The [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var Extent: typingsJapgolly.arcgisJsApi.esri.Extent
  /**
    * URL to the map image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var href: String
  /**
    * Map image id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var id: Double
  /**
    * Rotation of the map image about its center, in degrees. Values can be ±180. The default is 0 (north). Rotations are specified in a counterclockwise direction.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-KMLLayerView.html#MapImage)
    */
  var rotation: Double
}

object KMLLayerViewMapImage {
  @scala.inline
  def apply(
    Extent: Extent,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    href: String,
    id: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    rotation: Double
  ): KMLLayerViewMapImage = {
    val __obj = js.Dynamic.literal(Extent = Extent.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[KMLLayerViewMapImage]
  }
}

