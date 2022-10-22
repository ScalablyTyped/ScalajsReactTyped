package typingsJapgolly.next.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.next.distTraceReportToJsonMod.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlushAll extends StObject {
  
  def flushAll(): js.Promise[Unit]
  
  def report(event: Event): Unit
}
object FlushAll {
  
  inline def apply(flushAll: CallbackTo[js.Promise[Unit]], report: Event => Callback): FlushAll = {
    val __obj = js.Dynamic.literal(flushAll = flushAll.toJsFn, report = js.Any.fromFunction1((t0: Event) => report(t0).runNow()))
    __obj.asInstanceOf[FlushAll]
  }
  
  extension [Self <: FlushAll](x: Self) {
    
    inline def setFlushAll(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "flushAll", value.toJsFn)
    
    inline def setReport(value: Event => Callback): Self = StObject.set(x, "report", js.Any.fromFunction1((t0: Event) => value(t0).runNow()))
  }
}
