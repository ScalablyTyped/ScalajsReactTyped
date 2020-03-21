package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PredominanceSchemeForPolyline
  extends Object
     with PredominanceScheme {
  /**
    * The colors of the line symbols used for each category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var colors: js.Array[Color_]
  /**
    * The unique name of the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var name: String
  /**
    * The color of the line symbol used to indicate features with no data and features that are out of range.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var noDataColor: Color_
  /**
    * The opacity of the line symbol (0 - 1).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var opacity: Double
  /**
    * The scheme defining the size visual variable if included in a predominance visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var sizeScheme: SizeSchemeForPolyline
  /**
    * Tags associated with the scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var tags: js.Array[String]
  /**
    * The default width of the line symbol in pixels or points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-predominance.html#PredominanceSchemeForPolyline)
    */
  var width: Double
}

object PredominanceSchemeForPolyline {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    sizeScheme: SizeSchemeForPolyline,
    tags: js.Array[String],
    width: Double
  ): PredominanceSchemeForPolyline = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], sizeScheme = sizeScheme.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PredominanceSchemeForPolyline]
  }
}

