package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait utilsGetDefaultBandCombinationParams
  extends StObject
     with Object {
  
  /**
    * Layer for which the default band ids are returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getDefaultBandCombination)
    */
  var layer: ImageryLayer | ImageryTileLayer | WCSLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getDefaultBandCombination)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-support-utils.html#getDefaultBandCombination)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object utilsGetDefaultBandCombinationParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: ImageryLayer | ImageryTileLayer | WCSLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): utilsGetDefaultBandCombinationParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[utilsGetDefaultBandCombinationParams]
  }
  
  extension [Self <: utilsGetDefaultBandCombinationParams](x: Self) {
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer | WCSLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
