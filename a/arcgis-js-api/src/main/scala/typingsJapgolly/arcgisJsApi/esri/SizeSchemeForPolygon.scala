package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeSchemeForPolygon
  extends Object
     with SizeScheme {
  /**
    * The schema defining the backgound symbol of the feature. This is a fill symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var background: SizeSchemeForPolygonBackground
  /**
    * The scheme defining the symbology of the marker symbol used to represent polygon features by size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var marker: SizeSchemeForPoint
  /**
    * The opacity of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-size.html#SizeSchemeForPolygon)
    */
  var opacity: Double
}

object SizeSchemeForPolygon {
  @scala.inline
  def apply(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    marker: SizeSchemeForPoint,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): SizeSchemeForPolygon = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SizeSchemeForPolygon]
  }
}

