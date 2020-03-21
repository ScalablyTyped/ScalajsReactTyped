package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClassLabelExpressionInfo extends Object {
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that evaluates to a string used to label features in the layer. The most simple expressions return field values. For example, to label a layer of cities with their names, simply reference the field value with the global variable: `$feature.CITY_NAME`. Expressions can be more sophisticated and use logical functions. This may be useful if you want to use classed labels. For example, the following expression appends `city` to the end of the label if the feature's population field contains a number greater than 10,000. Otherwise, `town` is appended to the end of the label. Additionally, you can use `TextFormatting.NewLine` to add a new line to the label.  `IIF($feature.POPULATION > 10000, $feature.NAME + ' city', $feature.NAME + ' town')`
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var expression: String
  /**
    * The SQL expression defining the content of the label text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var value: js.UndefOr[String] = js.undefined
}

object LabelClassLabelExpressionInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    expression: String,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    value: String = null
  ): LabelClassLabelExpressionInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], expression = expression.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelClassLabelExpressionInfo]
  }
}

