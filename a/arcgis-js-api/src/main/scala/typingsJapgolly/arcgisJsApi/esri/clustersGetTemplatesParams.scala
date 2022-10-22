package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait clustersGetTemplatesParams
  extends StObject
     with Object {
  
  /**
    * The point layer that is or will be clustered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html#getTemplates)
    */
  var layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer
  
  /**
    * Specify the renderer to be used on the layer when `featureReduction` is enabled if it will be different than the renderer already set on the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html#getTemplates)
    */
  var renderer: js.UndefOr[Renderer] = js.undefined
}
object clustersGetTemplatesParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): clustersGetTemplatesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[clustersGetTemplatesParams]
  }
  
  extension [Self <: clustersGetTemplatesParams](x: Self) {
    
    inline def setLayer(value: FeatureLayer | CSVLayer | GeoJSONLayer | WFSLayer | OGCFeatureLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderer(value: Renderer): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
