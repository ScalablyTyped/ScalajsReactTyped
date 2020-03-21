package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LayerInfo extends Object {
  /**
    * Indicates whether to enable `Add feature` functionality. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var addEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to enable the ability to delete features. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var deleteEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to enable editing on the layer. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The configuration options for displaying an array of fields within the widget. Take note that all fields except for `editor`, `globalID`, `objectID`, and system maintained area and length fields will be included. Otherwise, it is up to the developer to set the right field(s) to override and display.
    * > If this is set, in addition to overrides in the [supportingWidgetDefaults](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults), the overrides specified in the [supportingWidgetDefaults](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#supportingWidgetDefaults) property take precedence.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfig]] = js.undefined
  /**
    * The associated feature layer containing the editable fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var layer: FeatureLayer
  /**
    * Indicates whether to enable `Update feature` functionality. Defaults to `true` if service supports it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#LayerInfo)
    */
  var updateEnabled: js.UndefOr[Boolean] = js.undefined
}

object LayerInfo {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    layer: FeatureLayer,
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    addEnabled: js.UndefOr[Boolean] = js.undefined,
    deleteEnabled: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    fieldConfig: js.Array[FieldConfig] = null,
    updateEnabled: js.UndefOr[Boolean] = js.undefined
  ): LayerInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(addEnabled)) __obj.updateDynamic("addEnabled")(addEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(deleteEnabled)) __obj.updateDynamic("deleteEnabled")(deleteEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (fieldConfig != null) __obj.updateDynamic("fieldConfig")(fieldConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(updateEnabled)) __obj.updateDynamic("updateEnabled")(updateEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerInfo]
  }
}

