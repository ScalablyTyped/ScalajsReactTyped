package typingsJapgolly.reactNativeWindows.anon

import typingsJapgolly.reactNativeWindows.rntypesMod.ColorValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait False extends StObject {
  
  var `false`: js.UndefOr[ColorValue | Null] = js.undefined
  
  var `true`: js.UndefOr[ColorValue | Null] = js.undefined
}
object False {
  
  inline def apply(): False = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[False]
  }
  
  extension [Self <: False](x: Self) {
    
    inline def setFalse(value: ColorValue): Self = StObject.set(x, "false", value.asInstanceOf[js.Any])
    
    inline def setFalseNull: Self = StObject.set(x, "false", null)
    
    inline def setFalseUndefined: Self = StObject.set(x, "false", js.undefined)
    
    inline def setTrue(value: ColorValue): Self = StObject.set(x, "true", value.asInstanceOf[js.Any])
    
    inline def setTrueNull: Self = StObject.set(x, "true", null)
    
    inline def setTrueUndefined: Self = StObject.set(x, "true", js.undefined)
  }
}
