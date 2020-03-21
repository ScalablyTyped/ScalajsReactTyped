package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percent-of-total`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.field
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.log
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClassBreaksRendererProperties
  extends RendererProperties
     with VisualVariablesMixinProperties {
  /**
    * When symbolizing polygon features with graduated symbols, set a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) on this property to visualize the boundaries of each feature. Use a [FillSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html) of varying sizes in the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) to indicate the quantity.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#backgroundFillSymbol)
    */
  var backgroundFillSymbol: js.UndefOr[FillSymbolProperties | PolygonSymbol3DProperties] = js.undefined
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos)
    */
  var classBreakInfos: js.UndefOr[js.Array[ClassBreakInfoProperties]] = js.undefined
  /**
    * Label used in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) to describe features assigned the [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol). The [default symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol) is used to draw all features with unspecified, unmatched values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultLabel)
    */
  var defaultLabel: js.UndefOr[String] = js.undefined
  /**
    * The default symbol assigned to features with a value not matched to a given break. If `null`, unmatched features will not be assigned a symbol.
    * > **Known Limitations**  SceneLayers with a `mesh` [geometryType](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#geometryType) will display unmatching features with a generic symbol even if the `defaultSymbol` is `null`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#defaultSymbol)
    */
  var defaultSymbol: js.UndefOr[SymbolProperties] = js.undefined
  /**
    * The name of a numeric attribute field whose data determines the symbol of each feature based on the class breaks defined in [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[ClassBreaksRendererLegendOptions] = js.undefined
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `field`, this property contains the attribute field name used for normalization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField)
    */
  var normalizationField: js.UndefOr[String] = js.undefined
  /**
    * When [normalizationType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType) is `percent-of-total`, this property contains the total of all data values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal)
    */
  var normalizationTotal: js.UndefOr[Double] = js.undefined
  /**
    * Indicates how the data is normalized. If this property is defined, then the class breaks contain a normalized min/max value instead of the value in the given [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field). The data value obtained from the field is normalized in one of the following ways before it is compared with the class breaks. See the table below for a list of possible values.
    *
    * Possible Value | Description
    * ---------------|------------
    * field | Divides the data value using the attribute value of the field specified in the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) property. This value is set by default if the [normalizationField](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationField) is provided.
    * log | Computes the base 10 logarithm of the data value. This can be a useful approach for some data distributions because it reduces the influence of very large data values.
    * percent-of-total | Divides the data value by the sum of all data values then multiplies by 100. Use [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) to define the total value by which to normalize. This value is set by default if the [normalizationTotal](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationTotal) is provided.
    *
    * With the exception of `log` normalization, data normalization creates a ratio by dividing two values. When comparing attribute values between features, normalization minimizes the effect of varying map areas and the number of observations.  For example, dividing the 18 to 30 year old population by the area of a polygon feature yields a density value that can be compared evenly with other features, regardless of their size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#normalizationType)
    */
  var normalizationType: js.UndefOr[field | log | `percent-of-total`] = js.undefined
  /**
    * An [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression evaluating to a number. This expression can reference field values using the `$feature` global variable and perform mathematical calculations and logical evaluations at runtime.  This property is typically used as an alternative to [field](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#field) for data-driven visualizations.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression)
    */
  var valueExpression: js.UndefOr[String] = js.undefined
  /**
    * The title identifying and describing the associated [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression as defined in the [valueExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpression) property. This is displayed as the title of the corresponding renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) in the absence of a provided `title` in the [legendOptions](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#legendOptions) property.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#valueExpressionTitle)
    */
  var valueExpressionTitle: js.UndefOr[String] = js.undefined
}

object ClassBreaksRendererProperties {
  @scala.inline
  def apply(
    authoringInfo: AuthoringInfoProperties = null,
    backgroundFillSymbol: FillSymbolProperties | PolygonSymbol3DProperties = null,
    classBreakInfos: js.Array[ClassBreakInfoProperties] = null,
    defaultLabel: String = null,
    defaultSymbol: SymbolProperties = null,
    field: String = null,
    legendOptions: ClassBreaksRendererLegendOptions = null,
    normalizationField: String = null,
    normalizationTotal: Int | Double = null,
    normalizationType: field | log | `percent-of-total` = null,
    valueExpression: String = null,
    valueExpressionTitle: String = null,
    visualVariables: js.Array[VisualVariableProperties] = null
  ): ClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (authoringInfo != null) __obj.updateDynamic("authoringInfo")(authoringInfo.asInstanceOf[js.Any])
    if (backgroundFillSymbol != null) __obj.updateDynamic("backgroundFillSymbol")(backgroundFillSymbol.asInstanceOf[js.Any])
    if (classBreakInfos != null) __obj.updateDynamic("classBreakInfos")(classBreakInfos.asInstanceOf[js.Any])
    if (defaultLabel != null) __obj.updateDynamic("defaultLabel")(defaultLabel.asInstanceOf[js.Any])
    if (defaultSymbol != null) __obj.updateDynamic("defaultSymbol")(defaultSymbol.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (normalizationField != null) __obj.updateDynamic("normalizationField")(normalizationField.asInstanceOf[js.Any])
    if (normalizationTotal != null) __obj.updateDynamic("normalizationTotal")(normalizationTotal.asInstanceOf[js.Any])
    if (normalizationType != null) __obj.updateDynamic("normalizationType")(normalizationType.asInstanceOf[js.Any])
    if (valueExpression != null) __obj.updateDynamic("valueExpression")(valueExpression.asInstanceOf[js.Any])
    if (valueExpressionTitle != null) __obj.updateDynamic("valueExpressionTitle")(valueExpressionTitle.asInstanceOf[js.Any])
    if (visualVariables != null) __obj.updateDynamic("visualVariables")(visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassBreaksRendererProperties]
  }
}

