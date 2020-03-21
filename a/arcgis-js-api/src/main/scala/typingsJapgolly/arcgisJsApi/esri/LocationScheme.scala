package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.LocationSchemeForPoint
  - typingsJapgolly.arcgisJsApi.esri.LocationSchemeForPolyline
  - typingsJapgolly.arcgisJsApi.esri.LocationSchemeForPolygon
  - typingsJapgolly.arcgisJsApi.esri.LocationSchemeForMesh
*/
trait LocationScheme extends js.Object

object LocationScheme {
  @scala.inline
  def LocationSchemeForPoint(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    opacity: Double,
    outline: LocationSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    size: Double
  ): LocationScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[LocationScheme]
  }
  @scala.inline
  def LocationSchemeForPolyline(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    width: Double
  ): LocationScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[LocationScheme]
  }
  @scala.inline
  def LocationSchemeForPolygon(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    opacity: Double,
    outline: LocationSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): LocationScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[LocationScheme]
  }
  @scala.inline
  def LocationSchemeForMesh(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): LocationScheme = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[LocationScheme]
  }
}

