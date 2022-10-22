package typingsJapgolly.arcgisJsApi.esri

import org.scalajs.dom.AbortSignal
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`histogram-equalization`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`min-max`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`percent-clip`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.none_
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.sigmoid
import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait rgbCreateRendererParams
  extends StObject
     with Object {
  
  /**
    * When `true`, calculates the renderer's statistics based on the current display extent and recalculates them as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var dynamicRangeAdjustment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Useful in scenarios where an image service does not have statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var estimateStatistics: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The gamma values to be used if `useGamma` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var gamma: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The input layer for which the renderer is generated.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var layer: ImageryLayer | ImageryTileLayer | WCSLayer
  
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var renderingRule: js.UndefOr[RasterFunction] = js.undefined
  
  /**
    * The RGB band indexes following the order of red, green, and blue channels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var rgbBandIds: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * Allows for cancelable requests.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
  
  /**
    * A preferred stretch type can be provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var stretchType: js.UndefOr[
    none_ | `min-max` | `standard-deviation` | `histogram-equalization` | `percent-clip` | sigmoid
  ] = js.undefined
  
  /**
    * Indicates whether the `gamma` values should be used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-raster-renderers-rgb.html#createRenderer)
    */
  var useGamma: js.UndefOr[Boolean] = js.undefined
}
object rgbCreateRendererParams {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    layer: ImageryLayer | ImageryTileLayer | WCSLayer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): rgbCreateRendererParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[rgbCreateRendererParams]
  }
  
  extension [Self <: rgbCreateRendererParams](x: Self) {
    
    inline def setDynamicRangeAdjustment(value: Boolean): Self = StObject.set(x, "dynamicRangeAdjustment", value.asInstanceOf[js.Any])
    
    inline def setDynamicRangeAdjustmentUndefined: Self = StObject.set(x, "dynamicRangeAdjustment", js.undefined)
    
    inline def setEstimateStatistics(value: Boolean): Self = StObject.set(x, "estimateStatistics", value.asInstanceOf[js.Any])
    
    inline def setEstimateStatisticsUndefined: Self = StObject.set(x, "estimateStatistics", js.undefined)
    
    inline def setGamma(value: js.Array[Double]): Self = StObject.set(x, "gamma", value.asInstanceOf[js.Any])
    
    inline def setGammaUndefined: Self = StObject.set(x, "gamma", js.undefined)
    
    inline def setGammaVarargs(value: Double*): Self = StObject.set(x, "gamma", js.Array(value*))
    
    inline def setLayer(value: ImageryLayer | ImageryTileLayer | WCSLayer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setRenderingRule(value: RasterFunction): Self = StObject.set(x, "renderingRule", value.asInstanceOf[js.Any])
    
    inline def setRenderingRuleUndefined: Self = StObject.set(x, "renderingRule", js.undefined)
    
    inline def setRgbBandIds(value: js.Array[Double]): Self = StObject.set(x, "rgbBandIds", value.asInstanceOf[js.Any])
    
    inline def setRgbBandIdsUndefined: Self = StObject.set(x, "rgbBandIds", js.undefined)
    
    inline def setRgbBandIdsVarargs(value: Double*): Self = StObject.set(x, "rgbBandIds", js.Array(value*))
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setStretchType(
      value: none_ | `min-max` | `standard-deviation` | `histogram-equalization` | `percent-clip` | sigmoid
    ): Self = StObject.set(x, "stretchType", value.asInstanceOf[js.Any])
    
    inline def setStretchTypeUndefined: Self = StObject.set(x, "stretchType", js.undefined)
    
    inline def setUseGamma(value: Boolean): Self = StObject.set(x, "useGamma", value.asInstanceOf[js.Any])
    
    inline def setUseGammaUndefined: Self = StObject.set(x, "useGamma", js.undefined)
  }
}
