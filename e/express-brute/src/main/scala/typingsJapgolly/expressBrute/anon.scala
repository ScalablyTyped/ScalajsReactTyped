package typingsJapgolly.expressBrute

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Reset extends StObject {
    
    var reset: js.UndefOr[js.Function1[/* callback */ js.UndefOr[js.Function0[Unit]], Unit]] = js.undefined
  }
  object Reset {
    
    inline def apply(): Reset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setReset(value: /* callback */ js.UndefOr[js.Function0[Unit]] => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: /* callback */ js.UndefOr[js.Function0[Unit]]) => value(t0).runNow()))
      
      inline def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
    }
  }
}
