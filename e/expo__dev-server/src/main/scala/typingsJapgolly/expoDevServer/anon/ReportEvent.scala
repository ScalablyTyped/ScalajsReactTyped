package typingsJapgolly.expoDevServer.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.ws.mod.Server
import typingsJapgolly.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportEvent extends StObject {
  
  def reportEvent(event: Any): Unit
  
  var server: Server[WebSocket]
}
object ReportEvent {
  
  inline def apply(reportEvent: Any => Callback, server: Server[WebSocket]): ReportEvent = {
    val __obj = js.Dynamic.literal(reportEvent = js.Any.fromFunction1((t0: Any) => reportEvent(t0).runNow()), server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportEvent]
  }
  
  extension [Self <: ReportEvent](x: Self) {
    
    inline def setReportEvent(value: Any => Callback): Self = StObject.set(x, "reportEvent", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
    
    inline def setServer(value: Server[WebSocket]): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
  }
}
