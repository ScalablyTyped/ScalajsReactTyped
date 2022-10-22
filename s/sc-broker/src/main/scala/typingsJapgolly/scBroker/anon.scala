package typingsJapgolly.scBroker

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Run extends StObject {
    
    var run: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Run {
    
    inline def apply(): Run = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Run]
    }
    
    extension [Self <: Run](x: Self) {
      
      inline def setRun(value: Callback): Self = StObject.set(x, "run", value.toJsFn)
      
      inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
    }
  }
}
