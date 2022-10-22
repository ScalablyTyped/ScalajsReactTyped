package typingsJapgolly.signalrNoJquery

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.signalrNoJquery.mod.SupportsKeepAliveHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Name extends StObject {
    
    var name: String
    
    def supportsKeepAlive(): Boolean
    @JSName("supportsKeepAlive")
    var supportsKeepAlive_Original: SupportsKeepAliveHandler
  }
  object Name {
    
    inline def apply(name: String, supportsKeepAlive: CallbackTo[Boolean]): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportsKeepAlive = supportsKeepAlive.toJsFn)
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSupportsKeepAlive(value: CallbackTo[Boolean]): Self = StObject.set(x, "supportsKeepAlive", value.toJsFn)
    }
  }
}
