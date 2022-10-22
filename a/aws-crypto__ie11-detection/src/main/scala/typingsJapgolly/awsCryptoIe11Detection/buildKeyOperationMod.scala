package typingsJapgolly.awsCryptoIe11Detection

import japgolly.scalajs.react.Callback
import org.scalajs.dom.Event
import typingsJapgolly.awsCryptoIe11Detection.buildKeyMod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildKeyOperationMod {
  
  trait KeyOperation extends StObject {
    
    def oncomplete(event: Event): Unit
    
    def onerror(event: Event): Unit
    
    val result: js.UndefOr[Key] = js.undefined
  }
  object KeyOperation {
    
    inline def apply(oncomplete: Event => Callback, onerror: Event => Callback): KeyOperation = {
      val __obj = js.Dynamic.literal(oncomplete = js.Any.fromFunction1((t0: Event) => oncomplete(t0).runNow()), onerror = js.Any.fromFunction1((t0: Event) => onerror(t0).runNow()))
      __obj.asInstanceOf[KeyOperation]
    }
    
    extension [Self <: KeyOperation](x: Self) {
      
      inline def setOncomplete(value: Event => Callback): Self = StObject.set(x, "oncomplete", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setOnerror(value: Event => Callback): Self = StObject.set(x, "onerror", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
      
      inline def setResult(value: Key): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultUndefined: Self = StObject.set(x, "result", js.undefined)
    }
  }
}
