package typingsJapgolly.codemirrorCommands

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Close extends StObject {
    
    var close: String
    
    var open: String
  }
  object Close {
    
    inline def apply(close: String, open: String): Close = {
      val __obj = js.Dynamic.literal(close = close.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
      __obj.asInstanceOf[Close]
    }
    
    extension [Self <: Close](x: Self) {
      
      inline def setClose(value: String): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
      
      inline def setOpen(value: String): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    }
  }
}
