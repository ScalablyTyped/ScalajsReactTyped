package typingsJapgolly.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This class contains performance information like memory usage and number of features for a specific layer.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html)
  */
trait LayerPerformanceInfo extends StObject {
  
  /**
    * The number of features displayed in the SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#displayedNumberOfFeatures)
    */
  var displayedNumberOfFeatures: Double
  
  /**
    * The layer corresponding to the memory usage information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#layer)
    */
  var layer: Layer
  
  /**
    * The maximum number of features that can be displayed in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double
  
  /**
    * An estimate of the memory currently in use by the layer, in bytes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#memory)
    */
  var memory: Double
  
  /**
    * The total number of features contained in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-3d-support-LayerPerformanceInfo.html#totalNumberOfFeatures)
    */
  var totalNumberOfFeatures: Double
}
object LayerPerformanceInfo {
  
  inline def apply(
    displayedNumberOfFeatures: Double,
    layer: Layer,
    maximumNumberOfFeatures: Double,
    memory: Double,
    totalNumberOfFeatures: Double
  ): LayerPerformanceInfo = {
    val __obj = js.Dynamic.literal(displayedNumberOfFeatures = displayedNumberOfFeatures.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], maximumNumberOfFeatures = maximumNumberOfFeatures.asInstanceOf[js.Any], memory = memory.asInstanceOf[js.Any], totalNumberOfFeatures = totalNumberOfFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayerPerformanceInfo]
  }
  
  extension [Self <: LayerPerformanceInfo](x: Self) {
    
    inline def setDisplayedNumberOfFeatures(value: Double): Self = StObject.set(x, "displayedNumberOfFeatures", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setMaximumNumberOfFeatures(value: Double): Self = StObject.set(x, "maximumNumberOfFeatures", value.asInstanceOf[js.Any])
    
    inline def setMemory(value: Double): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setTotalNumberOfFeatures(value: Double): Self = StObject.set(x, "totalNumberOfFeatures", value.asInstanceOf[js.Any])
  }
}
