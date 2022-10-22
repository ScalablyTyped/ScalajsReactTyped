package typingsJapgolly.ionicAngular

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directivesVirtualScrollVirtualUtilsMod {
  
  trait VirtualContext extends StObject {
    
    @JSName("$implicit")
    var $implicit: Any
    
    var index: Double
  }
  object VirtualContext {
    
    inline def apply($implicit: Any, index: Double): VirtualContext = {
      val __obj = js.Dynamic.literal($implicit = $implicit.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[VirtualContext]
    }
    
    extension [Self <: VirtualContext](x: Self) {
      
      inline def set$implicit(value: Any): Self = StObject.set(x, "$implicit", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    }
  }
}
