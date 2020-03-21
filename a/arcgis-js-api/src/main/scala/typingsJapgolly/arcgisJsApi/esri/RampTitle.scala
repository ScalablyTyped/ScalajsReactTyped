package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RampTitle extends Object {
  /**
    * The field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var field: String
  /**
    * If provided, the normalization field name used in a visual variable of a renderer. This is used in the generated title of the corresponding ramp in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var normField: String
  /**
    * If `true`, the legend formats to display the field and normalization field as a ratio.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratio: Boolean
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercent: Boolean
  /**
    * If `true`, the legend formats to display the field and normalization field as a percentage of total.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RampTitle)
    */
  var ratioPercentTotal: Boolean
}

object RampTitle {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    normField: String,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    ratio: Boolean,
    ratioPercent: Boolean,
    ratioPercentTotal: Boolean
  ): RampTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], ratioPercent = ratioPercent.asInstanceOf[js.Any], ratioPercentTotal = ratioPercentTotal.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    __obj.asInstanceOf[RampTitle]
  }
}

