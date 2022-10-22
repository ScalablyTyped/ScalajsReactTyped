package typingsJapgolly.reduxBootstrap

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accept extends StObject {
    
    def accept(path: String, cb: js.Function0[Unit]): Unit
  }
  object Accept {
    
    inline def apply(accept: (String, js.Function0[Unit]) => Callback): Accept = {
      val __obj = js.Dynamic.literal(accept = js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (accept(t0, t1)).runNow()))
      __obj.asInstanceOf[Accept]
    }
    
    extension [Self <: Accept](x: Self) {
      
      inline def setAccept(value: (String, js.Function0[Unit]) => Callback): Self = StObject.set(x, "accept", js.Any.fromFunction2((t0: String, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
}
