package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDataLayerFields extends Object {
  /**
    * The alias of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var alias: String
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var name: String
}

object DynamicDataLayerFields {
  @scala.inline
  def apply(
    alias: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): DynamicDataLayerFields = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[DynamicDataLayerFields]
  }
}

