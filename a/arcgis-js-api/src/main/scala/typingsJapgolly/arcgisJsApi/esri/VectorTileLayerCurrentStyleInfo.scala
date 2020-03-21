package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VectorTileLayerCurrentStyleInfo extends Object {
  /**
    * Absolute template URL for font sets included in a style. The URL includes `{fontstack}` and `{range}` tokens.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var glyphsUrl: String
  /**
    * Vector tile service information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var layerDefinition: js.Any
  /**
    * Absolute URL for a vector tile service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var serviceUrl: String
  /**
    * Absolute URL for sprites included in a style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var spriteUrl: String
  /**
    * Style JSON object for vector tiles. Style object includes `version` of the style specification, `sprite` and `glyphs` properties. It adheres to [version 8 of the Mapbox GL style specification](https://www.mapbox.com/mapbox-gl-js/style-spec/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var style: js.Any
  /**
    * Absolute URL for vector tile service style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html#currentStyleInfo)
    */
  var styleUrl: String
}

object VectorTileLayerCurrentStyleInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    glyphsUrl: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layerDefinition: js.Any,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    serviceUrl: String,
    spriteUrl: String,
    style: js.Any,
    styleUrl: String
  ): VectorTileLayerCurrentStyleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], glyphsUrl = glyphsUrl.asInstanceOf[js.Any], layerDefinition = layerDefinition.asInstanceOf[js.Any], serviceUrl = serviceUrl.asInstanceOf[js.Any], spriteUrl = spriteUrl.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], styleUrl = styleUrl.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[VectorTileLayerCurrentStyleInfo]
  }
}

