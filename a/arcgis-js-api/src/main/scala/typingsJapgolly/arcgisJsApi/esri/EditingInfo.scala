package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditingInfo extends Object {
  /**
    * Indicates the last time the layer was edited. This value gets updated every time the layer's data is edited or when any of its properties change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#EditingInfo)
    */
  var lastEditDate: js.Date
}

object EditingInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    lastEditDate: js.Date,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): EditingInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], lastEditDate = lastEditDate.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[EditingInfo]
  }
}

