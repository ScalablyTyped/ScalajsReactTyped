package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Theme extends Object {
  /**
    * The Esri basemaps that pair well with the given theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var basemaps: js.Array[String]
  /**
    * Text describing the theme in the UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var description: String
  /**
    * The label identifying the theme in UI elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var label: String
  /**
    * The name of the theme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-symbology-color.html#Theme)
    */
  var name: String
}

object Theme {
  @scala.inline
  def apply(
    basemaps: js.Array[String],
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    label: String,
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): Theme = {
    val __obj = js.Dynamic.literal(basemaps = basemaps.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[Theme]
  }
}

