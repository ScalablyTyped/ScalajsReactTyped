package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSelectResultEventResult extends Object {
  var extent: Extent
  var feature: Graphic
  var name: String
}

object SearchSelectResultEventResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    extent: Extent,
    feature: Graphic,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    name: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): SearchSelectResultEventResult = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], extent = extent.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[SearchSelectResultEventResult]
  }
}

