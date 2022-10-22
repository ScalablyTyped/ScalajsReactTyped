package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`center-start`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.curved
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.parallel
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.static
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelClass
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * Specifies whether or not a polyline label can overrun the feature being labeled.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#allowOverrun)
    */
  var allowOverrun: Boolean = js.native
  
  /**
    * Defines how labels should be placed relative to one another.
    *
    * @default static
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    */
  var deconflictionStrategy: none_ | static = js.native
  
  /**
    * Defines the labels for a [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    */
  var labelExpression: String = js.native
  
  /**
    * Defines the labels for a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html).
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    */
  var labelExpressionInfo: LabelClassLabelExpressionInfo = js.native
  
  /**
    * The position of the label.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    */
  var labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = js.native
  
  /**
    * Specifies the orientation of the label position of a polyline label.
    *
    * @default "curved"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPosition)
    */
  var labelPosition: curved | parallel = js.native
  
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    */
  var maxScale: Double = js.native
  
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    */
  var minScale: Double = js.native
  
  /**
    * Indicates whether or not to repeat the label along the polyline feature.
    *
    * @default true
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#repeatLabel)
    */
  var repeatLabel: Boolean = js.native
  
  /**
    * The size in points of the distance between labels on a polyline.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#repeatLabelDistance)
    */
  var repeatLabelDistance: Double = js.native
  
  /**
    * Defines the symbol used for rendering the label.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: TextSymbol | LabelSymbol3D = js.native
  
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: Boolean = js.native
  
  /**
    * A SQL where clause used to determine the features to which the label class should be applied.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    */
  var where: String = js.native
}
