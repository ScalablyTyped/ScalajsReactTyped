package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait wfsUtilsGetWFSLayerInfoOptions
  extends StObject
     with Object {
  
  /**
    * A list of key-value pairs of parameters to append to the url.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getWFSLayerInfo)
    */
  var customParameters: js.UndefOr[Any] = js.undefined
  
  /**
    * An [AbortSignal](https://developer.mozilla.org/en-US/docs/Web/API/AbortSignal) to abort the executions of the remote method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getWFSLayerInfo)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * The desired spatial reference for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ogc-wfsUtils.html#getWFSLayerInfo)
    */
  var spatialReference: js.UndefOr[Any] = js.undefined
}
object wfsUtilsGetWFSLayerInfoOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): wfsUtilsGetWFSLayerInfoOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[wfsUtilsGetWFSLayerInfoOptions]
  }
  
  extension [Self <: wfsUtilsGetWFSLayerInfoOptions](x: Self) {
    
    inline def setCustomParameters(value: Any): Self = StObject.set(x, "customParameters", value.asInstanceOf[js.Any])
    
    inline def setCustomParametersUndefined: Self = StObject.set(x, "customParameters", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setSpatialReference(value: Any): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
  }
}
