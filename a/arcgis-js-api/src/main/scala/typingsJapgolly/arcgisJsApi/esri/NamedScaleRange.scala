package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedScaleRange extends Object {
  /**
    * The named scale range, such as "room" or "metropolitan area"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var id: String
  /**
    * The maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var maxScale: Double
  /**
    * The minimum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ScaleRangeSlider-ScaleRanges.html#NamedScaleRange)
    */
  var minScale: Double
}

object NamedScaleRange {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    id: String,
    maxScale: Double,
    minScale: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean]
  ): NamedScaleRange = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], maxScale = maxScale.asInstanceOf[js.Any], minScale = minScale.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[NamedScaleRange]
  }
}

