package typingsJapgolly.flightplan

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exec extends StObject {
    
    var exec: Any
  }
  object Exec {
    
    inline def apply(exec: Any): Exec = {
      val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any])
      __obj.asInstanceOf[Exec]
    }
    
    extension [Self <: Exec](x: Self) {
      
      inline def setExec(value: Any): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
    }
  }
}
