package typingsJapgolly.wordpressHooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Current extends StObject {
    
    var __current: js.Array[typingsJapgolly.wordpressHooks.mod.Current]
  }
  object Current {
    
    inline def apply(__current: js.Array[typingsJapgolly.wordpressHooks.mod.Current]): Current = {
      val __obj = js.Dynamic.literal(__current = __current.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def set__current(value: js.Array[typingsJapgolly.wordpressHooks.mod.Current]): Self = StObject.set(x, "__current", value.asInstanceOf[js.Any])
      
      inline def set__currentVarargs(value: typingsJapgolly.wordpressHooks.mod.Current*): Self = StObject.set(x, "__current", js.Array(value*))
    }
  }
}
