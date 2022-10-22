package typingsJapgolly.redactSecrets

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(redacted: String): Redactor = ^.asInstanceOf[js.Dynamic].apply(redacted.asInstanceOf[js.Any]).asInstanceOf[Redactor]
  
  @JSImport("redact-secrets", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Redactor extends StObject {
    
    def forEach(obj: Any): Unit
    
    def map(obj: Any): Any
  }
  object Redactor {
    
    inline def apply(forEach: Any => Callback, map: Any => Any): Redactor = {
      val __obj = js.Dynamic.literal(forEach = js.Any.fromFunction1((t0: Any) => forEach(t0).runNow()), map = js.Any.fromFunction1(map))
      __obj.asInstanceOf[Redactor]
    }
    
    extension [Self <: Redactor](x: Self) {
      
      inline def setForEach(value: Any => Callback): Self = StObject.set(x, "forEach", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setMap(value: Any => Any): Self = StObject.set(x, "map", js.Any.fromFunction1(value))
    }
  }
}
