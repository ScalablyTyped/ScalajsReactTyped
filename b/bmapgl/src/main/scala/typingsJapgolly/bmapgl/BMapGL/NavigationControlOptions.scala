package typingsJapgolly.bmapgl.BMapGL

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationControlOptions extends StObject {
  
  var anchor: js.UndefOr[ControlAnchor] = js.undefined
  
  var enableGeolocation: js.UndefOr[Boolean] = js.undefined
  
  var offset: js.UndefOr[Size] = js.undefined
  
  var showZoomInfo: js.UndefOr[Boolean] = js.undefined
  
  var `type`: js.UndefOr[NavigationControlType] = js.undefined
}
object NavigationControlOptions {
  
  inline def apply(): NavigationControlOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationControlOptions]
  }
  
  extension [Self <: NavigationControlOptions](x: Self) {
    
    inline def setAnchor(value: ControlAnchor): Self = StObject.set(x, "anchor", value.asInstanceOf[js.Any])
    
    inline def setAnchorUndefined: Self = StObject.set(x, "anchor", js.undefined)
    
    inline def setEnableGeolocation(value: Boolean): Self = StObject.set(x, "enableGeolocation", value.asInstanceOf[js.Any])
    
    inline def setEnableGeolocationUndefined: Self = StObject.set(x, "enableGeolocation", js.undefined)
    
    inline def setOffset(value: Size): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setShowZoomInfo(value: Boolean): Self = StObject.set(x, "showZoomInfo", value.asInstanceOf[js.Any])
    
    inline def setShowZoomInfoUndefined: Self = StObject.set(x, "showZoomInfo", js.undefined)
    
    inline def setType(value: NavigationControlType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
