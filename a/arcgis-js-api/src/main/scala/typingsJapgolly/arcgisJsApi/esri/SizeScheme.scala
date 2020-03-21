package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.SizeSchemeForPoint
  - typingsJapgolly.arcgisJsApi.esri.SizeSchemeForPolyline
  - typingsJapgolly.arcgisJsApi.esri.SizeSchemeForPolygon
*/
trait SizeScheme extends js.Object

object SizeScheme {
  @scala.inline
  def SizeSchemeForPoint(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    maxSize: Double,
    minSize: Double,
    noDataColor: Color_,
    noDataSize: Double,
    opacity: Double,
    outline: SizeSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    size: Double
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], maxSize = maxSize.asInstanceOf[js.Any], minSize = minSize.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataSize = noDataSize.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SizeScheme]
  }
  @scala.inline
  def SizeSchemeForPolyline(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    maxWidth: Double,
    minWidth: Double,
    noDataColor: Color_,
    noDataWidth: Double,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    width: Double
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], maxWidth = maxWidth.asInstanceOf[js.Any], minWidth = minWidth.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], noDataWidth = noDataWidth.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SizeScheme]
  }
  @scala.inline
  def SizeSchemeForPolygon(
    background: SizeSchemeForPolygonBackground,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    marker: SizeSchemeForPoint,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): SizeScheme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], marker = marker.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SizeScheme]
  }
}

