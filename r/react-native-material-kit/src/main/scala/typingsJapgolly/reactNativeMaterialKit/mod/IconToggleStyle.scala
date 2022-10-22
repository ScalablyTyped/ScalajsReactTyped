package typingsJapgolly.reactNativeMaterialKit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IconToggleStyle extends StObject {
  
  var offColor: js.UndefOr[String] = js.undefined
  
  var onColor: js.UndefOr[String] = js.undefined
  
  var rippleColor: js.UndefOr[String] = js.undefined
}
object IconToggleStyle {
  
  inline def apply(): IconToggleStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconToggleStyle]
  }
  
  extension [Self <: IconToggleStyle](x: Self) {
    
    inline def setOffColor(value: String): Self = StObject.set(x, "offColor", value.asInstanceOf[js.Any])
    
    inline def setOffColorUndefined: Self = StObject.set(x, "offColor", js.undefined)
    
    inline def setOnColor(value: String): Self = StObject.set(x, "onColor", value.asInstanceOf[js.Any])
    
    inline def setOnColorUndefined: Self = StObject.set(x, "onColor", js.undefined)
    
    inline def setRippleColor(value: String): Self = StObject.set(x, "rippleColor", value.asInstanceOf[js.Any])
    
    inline def setRippleColorUndefined: Self = StObject.set(x, "rippleColor", js.undefined)
  }
}
