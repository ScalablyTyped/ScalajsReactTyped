package typingsJapgolly.webscreensWindowPlacement

import typingsJapgolly.webscreensWindowPlacement.webscreensWindowPlacementStrings.`window-placement`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: `window-placement`
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "window-placement")
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: `window-placement`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
