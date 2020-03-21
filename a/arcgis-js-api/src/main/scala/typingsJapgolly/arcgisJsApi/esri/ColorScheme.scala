package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisJsApi.esri.ColorSchemeForPoint
  - typingsJapgolly.arcgisJsApi.esri.ColorSchemeForPolyline
  - typingsJapgolly.arcgisJsApi.esri.ColorSchemeForPolygon
  - typingsJapgolly.arcgisJsApi.esri.ColorSchemeForMesh
*/
trait ColorScheme extends js.Object

object ColorScheme {
  @scala.inline
  def ColorSchemeForPoint(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPointColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: ColorSchemeForPointOutline,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    size: Double,
    tags: js.Array[String],
    theme: String
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ColorScheme]
  }
  @scala.inline
  def ColorSchemeForPolyline(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolylineColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    tags: js.Array[String],
    theme: String,
    width: Double
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ColorScheme]
  }
  @scala.inline
  def ColorSchemeForPolygon(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForPolygonColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    outline: ColorSchemeForPolygonOutline,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    tags: js.Array[String],
    theme: String
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ColorScheme]
  }
  @scala.inline
  def ColorSchemeForMesh(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorSchemeForMeshColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    name: String,
    noDataColor: Color_,
    opacity: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    tags: js.Array[String],
    theme: String
  ): ColorScheme = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], noDataColor = noDataColor.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[ColorScheme]
  }
}

