package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsFeatureTemplates extends Object {
  /**
    * Indicates whether the [templates filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#filterEnabled) displays.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var filterEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Aids in managing various template items and how they display within the widget. Please refer to [groupBy API reference](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureTemplates.html#groupBy) for additional information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var groupBy: js.UndefOr[String | GroupByFunction] = js.undefined
}

object SupportingWidgetDefaultsFeatureTemplates {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    filterEnabled: js.UndefOr[Boolean] = js.undefined,
    groupBy: String | GroupByFunction = null
  ): SupportingWidgetDefaultsFeatureTemplates = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(filterEnabled)) __obj.updateDynamic("filterEnabled")(filterEnabled.asInstanceOf[js.Any])
    if (groupBy != null) __obj.updateDynamic("groupBy")(groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportingWidgetDefaultsFeatureTemplates]
  }
}

