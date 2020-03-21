package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConversionInfo extends Object {
  /**
    * A function that takes a point and returns a [position](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#Position).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def convert(): Unit
  /**
    * A function that takes a string and returns a Point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-CoordinateConversion-support-Format.html#ConversionInfo)
    *
    *
    */
  def reverseConvert(): Unit
}

object ConversionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    convert: Callback,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    reverseConvert: Callback
  ): ConversionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("convert")(convert.toJsFn)
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.updateDynamic("reverseConvert")(reverseConvert.toJsFn)
    __obj.asInstanceOf[ConversionInfo]
  }
}

