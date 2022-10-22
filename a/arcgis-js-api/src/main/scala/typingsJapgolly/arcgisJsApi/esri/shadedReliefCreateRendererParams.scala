package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`multi-directional`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.adjusted
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.traditional
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait shadedReliefCreateRendererParams
  extends StObject
     with Object {
  
  /**
    * The color ramp to apply to the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var colorRamp: js.UndefOr[AlgorithmicColorRamp | MultipartColorRamp] = js.undefined
  
  /**
    * The preferred hillshade type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var hillshadeType: js.UndefOr[traditional | `multi-directional`] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * Applies a constant or adjusted z-factor based on resolution changes.
    *
    * @default none
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var scalingType: js.UndefOr[none_ | adjusted] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-shadedRelief.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object shadedReliefCreateRendererParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: ImageryLayer | ImageryTileLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): shadedReliefCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[shadedReliefCreateRendererParams]
  }
  
  extension [Self <: shadedReliefCreateRendererParams](x: Self) {
    
    inline def setColorRamp(value: AlgorithmicColorRamp | MultipartColorRamp): Self = StObject.set(x, "colorRamp", value.asInstanceOf[js.Any])
    
    inline def setColorRampUndefined: Self = StObject.set(x, "colorRamp", js.undefined)
    
    inline def setHillshadeType(value: traditional | `multi-directional`): Self = StObject.set(x, "hillshadeType", value.asInstanceOf[js.Any])
    
    inline def setHillshadeTypeUndefined: Self = StObject.set(x, "hillshadeType", js.undefined)
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setScalingType(value: none_ | adjusted): Self = StObject.set(x, "scalingType", value.asInstanceOf[js.Any])
    
    inline def setScalingTypeUndefined: Self = StObject.set(x, "scalingType", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
