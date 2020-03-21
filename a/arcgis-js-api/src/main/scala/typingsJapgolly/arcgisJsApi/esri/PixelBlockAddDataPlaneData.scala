package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PixelBlockAddDataPlaneData extends Object {
  /**
    * A two dimensional array representing the pixels to add.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var pixels: js.Array[js.Array[Double]]
  /**
    * An array of objects containing numeric statistical properties. See [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#statistics) for details on the specifications of each object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#addData)
    */
  var statistics: js.Array[_]
}

object PixelBlockAddDataPlaneData {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    pixels: js.Array[js.Array[Double]],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    statistics: js.Array[_]
  ): PixelBlockAddDataPlaneData = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], pixels = pixels.asInstanceOf[js.Any], statistics = statistics.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[PixelBlockAddDataPlaneData]
  }
}

