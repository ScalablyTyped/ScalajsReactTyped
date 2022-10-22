package typingsJapgolly.meteorTypings

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Tracker {
  
  trait Computation extends StObject {
    
    var firstRun: Boolean
    
    def invalidate(): Unit
    
    var invalidated: Boolean
    
    def onInvalidate(callback: js.Function): Unit
    
    def onStop(callback: js.Function): Unit
    
    def stop(): Unit
    
    var stopped: Boolean
  }
  object Computation {
    
    inline def apply(
      firstRun: Boolean,
      invalidate: Callback,
      invalidated: Boolean,
      onInvalidate: js.Function => Callback,
      onStop: js.Function => Callback,
      stop: Callback,
      stopped: Boolean
    ): Computation = {
      val __obj = js.Dynamic.literal(firstRun = firstRun.asInstanceOf[js.Any], invalidate = invalidate.toJsFn, invalidated = invalidated.asInstanceOf[js.Any], onInvalidate = js.Any.fromFunction1((t0: js.Function) => onInvalidate(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function) => onStop(t0).runNow()), stop = stop.toJsFn, stopped = stopped.asInstanceOf[js.Any])
      __obj.asInstanceOf[Computation]
    }
    
    extension [Self <: Computation](x: Self) {
      
      inline def setFirstRun(value: Boolean): Self = StObject.set(x, "firstRun", value.asInstanceOf[js.Any])
      
      inline def setInvalidate(value: Callback): Self = StObject.set(x, "invalidate", value.toJsFn)
      
      inline def setInvalidated(value: Boolean): Self = StObject.set(x, "invalidated", value.asInstanceOf[js.Any])
      
      inline def setOnInvalidate(value: js.Function => Callback): Self = StObject.set(x, "onInvalidate", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setOnStop(value: js.Function => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function) => value(t0).runNow()))
      
      inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
      
      inline def setStopped(value: Boolean): Self = StObject.set(x, "stopped", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dependency extends StObject {
    
    def changed(): Unit = js.native
    
    def depend(): Boolean = js.native
    def depend(fromComputation: Computation): Boolean = js.native
    
    def hasDependents(): Boolean = js.native
  }
  
  @js.native
  trait DependencyStatic
    extends StObject
       with Instantiable0[Dependency]
}
