package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`point-cloud-unique-value`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudUniqueValueRenderer
  extends StObject
     with PointCloudRenderer
     with typingsJapgolly.arcgisJsApi.esri.pointCloudRenderers.PointCloudRenderer
     with pointCloudRenderersPointCloudRenderer {
  
  /**
    * Each element in the array is an object that matches a unique value with a specific color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos] = js.native
  
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * @default null
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    */
  var fieldTransformType: none_ | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = js.native
  
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: PointCloudUniqueValueRendererLegendOptions = js.native
  
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#type)
    */
  @JSName("type")
  val type_PointCloudUniqueValueRenderer: `point-cloud-unique-value` = js.native
}
