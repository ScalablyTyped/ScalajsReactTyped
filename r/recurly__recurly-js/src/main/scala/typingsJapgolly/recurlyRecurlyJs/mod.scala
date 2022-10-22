package typingsJapgolly.recurlyRecurlyJs

import typingsJapgolly.recurlyRecurlyJs.libRecurlyMod.Recurly
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object global {
    
    @JSGlobal("recurly")
    @js.native
    val recurly: Recurly = js.native
    
    trait Window extends StObject {
      
      var recurly: Recurly
    }
    object Window {
      
      inline def apply(recurly: Recurly): Window = {
        val __obj = js.Dynamic.literal(recurly = recurly.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      extension [Self <: Window](x: Self) {
        
        inline def setRecurly(value: Recurly): Self = StObject.set(x, "recurly", value.asInstanceOf[js.Any])
      }
    }
  }
}
