package typingsJapgolly.twitterStreamChannels

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait RemoveAllListeners extends StObject {
    
    var removeAllListeners: Boolean
  }
  object RemoveAllListeners {
    
    inline def apply(removeAllListeners: Boolean): RemoveAllListeners = {
      val __obj = js.Dynamic.literal(removeAllListeners = removeAllListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemoveAllListeners]
    }
    
    extension [Self <: RemoveAllListeners](x: Self) {
      
      inline def setRemoveAllListeners(value: Boolean): Self = StObject.set(x, "removeAllListeners", value.asInstanceOf[js.Any])
    }
  }
}
