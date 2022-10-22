package typingsJapgolly.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventDefault extends StObject {
  
  var preventDefault: js.UndefOr[Boolean] = js.undefined
  
  var stopPropagation: js.UndefOr[Boolean] = js.undefined
}
object PreventDefault {
  
  inline def apply(): PreventDefault = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreventDefault]
  }
  
  extension [Self <: PreventDefault](x: Self) {
    
    inline def setPreventDefault(value: Boolean): Self = StObject.set(x, "preventDefault", value.asInstanceOf[js.Any])
    
    inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
    
    inline def setStopPropagation(value: Boolean): Self = StObject.set(x, "stopPropagation", value.asInstanceOf[js.Any])
    
    inline def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
  }
}
