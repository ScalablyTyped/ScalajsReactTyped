package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditableItem extends Object {
  /**
    * *Read-only* The feature layer associated with the editable item.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var layer: FeatureLayer
  /**
    * *Read-only* The workflow type that this item supports. Can be either, `update` or `create`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor-EditorViewModel.html#EditableItem)
    */
  var supports: String
}

object EditableItem {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    supports: String
  ): EditableItem = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], supports = supports.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[EditableItem]
  }
}

