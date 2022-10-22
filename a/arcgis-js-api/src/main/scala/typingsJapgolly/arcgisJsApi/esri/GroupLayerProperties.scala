package typingsJapgolly.arcgisJsApi.esri

import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.exclusive
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.independent
import typingsJapgolly.arcgisJsApi.arcgisJsApiStrings.inherited
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupLayerProperties
  extends StObject
     with LayerProperties
     with LayersMixinProperties
     with TablesMixinProperties
     with PortalLayerProperties
     with BlendLayerProperties {
  
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#maxScale)
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view.
    *
    * @default 0
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#minScale)
    */
  var minScale: js.UndefOr[Double] = js.undefined
  
  /**
    * Indicates how to manage the visibility of the children layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GroupLayer.html#visibilityMode)
    */
  var visibilityMode: js.UndefOr[independent | inherited | exclusive] = js.undefined
}
object GroupLayerProperties {
  
  inline def apply(): GroupLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupLayerProperties]
  }
  
  extension [Self <: GroupLayerProperties](x: Self) {
    
    inline def setMaxScale(value: Double): Self = StObject.set(x, "maxScale", value.asInstanceOf[js.Any])
    
    inline def setMaxScaleUndefined: Self = StObject.set(x, "maxScale", js.undefined)
    
    inline def setMinScale(value: Double): Self = StObject.set(x, "minScale", value.asInstanceOf[js.Any])
    
    inline def setMinScaleUndefined: Self = StObject.set(x, "minScale", js.undefined)
    
    inline def setVisibilityMode(value: independent | inherited | exclusive): Self = StObject.set(x, "visibilityMode", value.asInstanceOf[js.Any])
    
    inline def setVisibilityModeUndefined: Self = StObject.set(x, "visibilityMode", js.undefined)
  }
}
