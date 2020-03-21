package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeatmapRampStop extends Object {
  /**
    * The color of the pixel corresponding to the appropriate pixel `ratio`. This value is typically between `0` and `1`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var color: Color_
  /**
    * The label of the color stop displayed in the legend. Typically only the first and last stops have labels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var label: String
  /**
    * A number between `0` and `1` describing the position of the label on the ramp. For example, in a ramp with three stops, the first stop would have an offset of `0`, the second `0.5`, and the third `1`. These offset values are equally spaced for any given number of labels in the ramp. The interval of each offset value is equal to 1 divided by the number of stops minus 1.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var offset: Double
  /**
    * The ratio of a pixel's intensity value to the minPixelIntensity of the renderer. The ratio of each pixel is matched to the corresponding color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampStop)
    */
  var ratio: Double
}

object HeatmapRampStop {
  @scala.inline
  def apply(
    color: Color_,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    label: String,
    offset: Double,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    ratio: Double
  ): HeatmapRampStop = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[HeatmapRampStop]
  }
}

