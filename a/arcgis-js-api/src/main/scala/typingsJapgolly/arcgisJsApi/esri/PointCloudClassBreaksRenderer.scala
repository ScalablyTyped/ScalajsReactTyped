package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-cloud-class-breaks`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudClassBreaksRenderer
  extends StObject
     with PointCloudRenderer
     with typingsJapgolly.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos] = js.native
  
  /**
    * The name of the field that is used to drive the color visualization for the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    */
  var fieldTransformType: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudClassBreaksRendererLegendOptions = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudClassBreaksRenderer: `point-cloud-class-breaks` = js.native
}
