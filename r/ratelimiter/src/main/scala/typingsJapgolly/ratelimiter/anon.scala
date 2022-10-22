package typingsJapgolly.ratelimiter

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Exec extends StObject {
    
    def exec(cb: js.Function2[/* err */ Any, /* res */ Any, Any]): Unit
  }
  object Exec {
    
    inline def apply(exec: js.Function2[/* err */ Any, /* res */ Any, Any] => Callback): Exec = {
      val __obj = js.Dynamic.literal(exec = js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* res */ Any, Any]) => exec(t0).runNow()))
      __obj.asInstanceOf[Exec]
    }
    
    extension [Self <: Exec](x: Self) {
      
      inline def setExec(value: js.Function2[/* err */ Any, /* res */ Any, Any] => Callback): Self = StObject.set(x, "exec", js.Any.fromFunction1((t0: js.Function2[/* err */ Any, /* res */ Any, Any]) => value(t0).runNow()))
    }
  }
}
