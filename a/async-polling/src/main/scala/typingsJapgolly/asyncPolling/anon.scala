package typingsJapgolly.asyncPolling

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asyncPolling.mod.EventName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait On extends StObject {
    
    def on(eventName: EventName, listener: js.Function): Any
    
    def run(): Any
    
    def stop(): Any
  }
  object On {
    
    inline def apply(on: (EventName, js.Function) => Any, run: CallbackTo[Any], stop: CallbackTo[Any]): On = {
      val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on), run = run.toJsFn, stop = stop.toJsFn)
      __obj.asInstanceOf[On]
    }
    
    extension [Self <: On](x: Self) {
      
      inline def setOn(value: (EventName, js.Function) => Any): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setRun(value: CallbackTo[Any]): Self = StObject.set(x, "run", value.toJsFn)
      
      inline def setStop(value: CallbackTo[Any]): Self = StObject.set(x, "stop", value.toJsFn)
    }
  }
}
