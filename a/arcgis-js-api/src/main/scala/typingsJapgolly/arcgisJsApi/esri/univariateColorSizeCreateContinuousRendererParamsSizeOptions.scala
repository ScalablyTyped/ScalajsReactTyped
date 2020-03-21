package typingsJapgolly.arcgisJsApi.esri

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait univariateColorSizeCreateContinuousRendererParamsSizeOptions extends Object {
  /**
    * Provides options for setting a title to a field when an expression is provided instead of a field name. This title will represent the field in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var legendOptions: js.UndefOr[univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions] = js.undefined
  /**
    * In authoring apps, the user may select a pre-defined size scheme. Pass the scheme object to this property to avoid getting one based on the `basemap`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html#createContinuousRenderer)
    */
  var sizeScheme: js.UndefOr[SizeScheme] = js.undefined
}

object univariateColorSizeCreateContinuousRendererParamsSizeOptions {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => CallbackTo[Boolean],
    propertyIsEnumerable: PropertyKey => CallbackTo[Boolean],
    legendOptions: univariateColorSizeCreateContinuousRendererParamsSizeOptionsLegendOptions = null,
    sizeScheme: SizeScheme = null
  ): univariateColorSizeCreateContinuousRendererParamsSizeOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("hasOwnProperty")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => hasOwnProperty(t0).runNow()))
    __obj.updateDynamic("propertyIsEnumerable")(js.Any.fromFunction1((t0: typingsJapgolly.std.PropertyKey) => propertyIsEnumerable(t0).runNow()))
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (sizeScheme != null) __obj.updateDynamic("sizeScheme")(sizeScheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeCreateContinuousRendererParamsSizeOptions]
  }
}

