package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.std.Object
import typingsJapgolly.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewHighlightOptionsProperties
  extends StObject
     with Object {
  
  /**
    * The color of the highlight.
    *
    * @default #00ffff
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
    * The opacity of the fill (area within the halo).
    *
    * @default 0.25
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var fillOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * An optional color for the halo of the highlight.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var haloColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * The opacity of the highlight halo.
    *
    * @default 1
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var haloOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The color of the highlighted feature's shadow.
    *
    * @default #000000
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var shadowColor: js.UndefOr[Color_] = js.undefined
  
  /**
    * Defines the intensity of the shadow area obtained by overlapping the shadow of the highlighted feature and the shadow of other objects in the scene.
    *
    * @default 0.375
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var shadowDifference: js.UndefOr[Double] = js.undefined
  
  /**
    * The opacity of the highlighted feature's shadow.
    *
    * @default 0.4
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html#highlightOptions)
    */
  var shadowOpacity: js.UndefOr[Double] = js.undefined
}
object SceneViewHighlightOptionsProperties {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): SceneViewHighlightOptionsProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[SceneViewHighlightOptionsProperties]
  }
  
  extension [Self <: SceneViewHighlightOptionsProperties](x: Self) {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
    
    inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
    
    inline def setHaloColor(value: Color_): Self = StObject.set(x, "haloColor", value.asInstanceOf[js.Any])
    
    inline def setHaloColorUndefined: Self = StObject.set(x, "haloColor", js.undefined)
    
    inline def setHaloOpacity(value: Double): Self = StObject.set(x, "haloOpacity", value.asInstanceOf[js.Any])
    
    inline def setHaloOpacityUndefined: Self = StObject.set(x, "haloOpacity", js.undefined)
    
    inline def setShadowColor(value: Color_): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
    
    inline def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
    
    inline def setShadowDifference(value: Double): Self = StObject.set(x, "shadowDifference", value.asInstanceOf[js.Any])
    
    inline def setShadowDifferenceUndefined: Self = StObject.set(x, "shadowDifference", js.undefined)
    
    inline def setShadowOpacity(value: Double): Self = StObject.set(x, "shadowOpacity", value.asInstanceOf[js.Any])
    
    inline def setShadowOpacityUndefined: Self = StObject.set(x, "shadowOpacity", js.undefined)
  }
}
