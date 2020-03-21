package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait colorRampsColorRamp extends Object {
  /**
    * An array of five colors intended for displaying a continuous color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colors: js.Array[Color_]
  /**
    * Contains an array of ramps ranging in size from 1 color to 10 colors. All ramps are part of the same color scheme, but provide a different number of colors depending on the requirements of the ramp needed for the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks]
  /**
    * The unique name of the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var name: String
  /**
    * Tags associated with the color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-support-colorRamps.html#ColorRamp)
    */
  var tags: js.Array[String]
}

object colorRampsColorRamp {
  @scala.inline
  def apply(
    colors: js.Array[Color_],
    colorsForClassBreaks: js.Array[ColorRampColorsForClassBreaks],
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    tags: js.Array[String]
  ): colorRampsColorRamp = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], colorsForClassBreaks = colorsForClassBreaks.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[colorRampsColorRamp]
  }
}

