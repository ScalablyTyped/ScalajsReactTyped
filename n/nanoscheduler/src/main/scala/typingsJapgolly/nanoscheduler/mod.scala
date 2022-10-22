package typingsJapgolly.nanoscheduler

import japgolly.scalajs.react.Callback
import typingsJapgolly.nanoscheduler.mod.scheduler.NanoScheduler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(): NanoScheduler = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[NanoScheduler]
  
  @JSImport("nanoscheduler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object scheduler {
    
    /**
      * Schedule work to be completed when the user agent is idle. Weighs 270 bytes compressed.
      */
    trait NanoScheduler extends StObject {
      
      /**
        * Push a callback into the scheduler, to be executed when the user agent is idle.
        */
      def push(cb: js.Function0[Unit]): Unit
      
      def schedule(): Unit
      
      def setTimeout(cb: js.Function0[Unit]): Unit
    }
    object NanoScheduler {
      
      inline def apply(
        push: js.Function0[Unit] => Callback,
        schedule: Callback,
        setTimeout: js.Function0[Unit] => Callback
      ): NanoScheduler = {
        val __obj = js.Dynamic.literal(push = js.Any.fromFunction1((t0: js.Function0[Unit]) => push(t0).runNow()), schedule = schedule.toJsFn, setTimeout = js.Any.fromFunction1((t0: js.Function0[Unit]) => setTimeout(t0).runNow()))
        __obj.asInstanceOf[NanoScheduler]
      }
      
      extension [Self <: NanoScheduler](x: Self) {
        
        inline def setPush(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "push", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
        
        inline def setSchedule(value: Callback): Self = StObject.set(x, "schedule", value.toJsFn)
        
        inline def setSetTimeout(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "setTimeout", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
      }
    }
  }
}
