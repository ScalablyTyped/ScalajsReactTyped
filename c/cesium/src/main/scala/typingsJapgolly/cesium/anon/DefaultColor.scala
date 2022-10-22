package typingsJapgolly.cesium.anon

import typingsJapgolly.cesium.mod.Cesium3DTileStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultColor extends StObject {
  
  var defaultColor: js.UndefOr[typingsJapgolly.cesium.mod.Color] = js.undefined
  
  var enableShowOutline: js.UndefOr[Boolean] = js.undefined
  
  var showOutline: js.UndefOr[Boolean] = js.undefined
  
  var style: js.UndefOr[Cesium3DTileStyle] = js.undefined
}
object DefaultColor {
  
  inline def apply(): DefaultColor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DefaultColor]
  }
  
  extension [Self <: DefaultColor](x: Self) {
    
    inline def setDefaultColor(value: typingsJapgolly.cesium.mod.Color): Self = StObject.set(x, "defaultColor", value.asInstanceOf[js.Any])
    
    inline def setDefaultColorUndefined: Self = StObject.set(x, "defaultColor", js.undefined)
    
    inline def setEnableShowOutline(value: Boolean): Self = StObject.set(x, "enableShowOutline", value.asInstanceOf[js.Any])
    
    inline def setEnableShowOutlineUndefined: Self = StObject.set(x, "enableShowOutline", js.undefined)
    
    inline def setShowOutline(value: Boolean): Self = StObject.set(x, "showOutline", value.asInstanceOf[js.Any])
    
    inline def setShowOutlineUndefined: Self = StObject.set(x, "showOutline", js.undefined)
    
    inline def setStyle(value: Cesium3DTileStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
