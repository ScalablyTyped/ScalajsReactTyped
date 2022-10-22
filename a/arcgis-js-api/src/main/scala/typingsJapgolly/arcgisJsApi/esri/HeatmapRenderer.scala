package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeatmapRenderer
  extends StObject
     with Renderer
     with typingsJapgolly.arcgisJsApi.esri.renderers.Renderer
     with renderersRenderer {
  
  /**
    * An array of objects describing the renderer's color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#colorStops)
    */
  var colorStops: js.Array[HeatmapColorStop] = js.native
  
  /**
    * The name of the attribute field used to weight the density of each heatmap point.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#field)
    */
  var field: String = js.native
  
  /**
    * An object providing options for describing the renderer in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#legendOptions)
    */
  var legendOptions: HeatmapRendererLegendOptions = js.native
  
  /**
    * The max density value to be assigned a color in the heatmap surface.
    *
    * @default 0.04
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#maxDensity)
    */
  var maxDensity: Double = js.native
  
  /**
    * The minimum density value to be assigned a color in the heatmap surface.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#minDensity)
    */
  var minDensity: Double = js.native
  
  /**
    * The search radius (in points) used to create a smooth kernel surface fitted around each point.
    *
    * @default 18
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#radius)
    */
  var radius: Double = js.native
  
  /**
    * When set, the heatmap's visualization at the given scale will remain static and not change as the user zooms in and out of the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#referenceScale)
    */
  var referenceScale: Double = js.native
  
  /**
    * The type of renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-HeatmapRenderer.html#type)
    */
  @JSName("type")
  val type_HeatmapRenderer: typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.heatmap = js.native
}
