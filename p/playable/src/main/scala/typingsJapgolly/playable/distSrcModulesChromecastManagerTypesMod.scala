package typingsJapgolly.playable

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcModulesChromecastManagerTypesMod {
  
  trait IChromecastManager extends StObject {
    
    def destroy(): Unit
    
    var isCasting: Boolean
    
    var isEnabled: Boolean
  }
  object IChromecastManager {
    
    inline def apply(destroy: Callback, isCasting: Boolean, isEnabled: Boolean): IChromecastManager = {
      val __obj = js.Dynamic.literal(destroy = destroy.toJsFn, isCasting = isCasting.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[IChromecastManager]
    }
    
    extension [Self <: IChromecastManager](x: Self) {
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setIsCasting(value: Boolean): Self = StObject.set(x, "isCasting", value.asInstanceOf[js.Any])
      
      inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    }
  }
}
