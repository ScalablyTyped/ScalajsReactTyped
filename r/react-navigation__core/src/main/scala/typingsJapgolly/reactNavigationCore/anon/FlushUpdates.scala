package typingsJapgolly.reactNavigationCore.anon

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushUpdates extends StObject {
  
  def flushUpdates(): Unit
  
  def scheduleUpdate(callback: js.Function0[Unit]): Unit
}
object FlushUpdates {
  
  inline def apply(flushUpdates: Callback, scheduleUpdate: js.Function0[Unit] => Callback): FlushUpdates = {
    val __obj = js.Dynamic.literal(flushUpdates = flushUpdates.toJsFn, scheduleUpdate = js.Any.fromFunction1((t0: js.Function0[Unit]) => scheduleUpdate(t0).runNow()))
    __obj.asInstanceOf[FlushUpdates]
  }
  
  extension [Self <: FlushUpdates](x: Self) {
    
    inline def setFlushUpdates(value: Callback): Self = StObject.set(x, "flushUpdates", value.toJsFn)
    
    inline def setScheduleUpdate(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "scheduleUpdate", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
  }
}
