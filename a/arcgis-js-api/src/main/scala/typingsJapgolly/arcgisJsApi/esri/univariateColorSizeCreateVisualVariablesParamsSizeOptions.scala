package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait univariateColorSizeCreateVisualVariablesParamsSizeOptions extends Object {
  /**
    * When set to `all`, a single size variable that scales uniformly in all dimensions is generated. When set to `height`, the result contains two size visual variables: the first one sizes the height according to the field statistics, while the second defines a constant size for width and depth.  **Possible Values:** all | height
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    *
    * @default all
    */
  var axis: js.UndefOr[Boolean] = js.undefined
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createVisualVariables)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
}

object univariateColorSizeCreateVisualVariablesParamsSizeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    axis: js.UndefOr[Boolean] = js.undefined,
    legendOptions: univariateColorSizeCreateVisualVariablesParamsSizeOptionsLegendOptions = null,
    sizeScheme: SizeScheme = null
  ): univariateColorSizeCreateVisualVariablesParamsSizeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (!js.isUndefined(axis)) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsSizeOptions]
  }
}

