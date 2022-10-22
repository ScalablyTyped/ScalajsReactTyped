package typingsJapgolly.postMessageStream

import org.scalajs.dom.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    var target: String
    
    var targetWindow: js.UndefOr[Window] = js.undefined
  }
  object Name {
    
    inline def apply(name: String, target: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetWindow(value: Window): Self = StObject.set(x, "targetWindow", value.asInstanceOf[js.Any])
      
      inline def setTargetWindowUndefined: Self = StObject.set(x, "targetWindow", js.undefined)
    }
  }
}
