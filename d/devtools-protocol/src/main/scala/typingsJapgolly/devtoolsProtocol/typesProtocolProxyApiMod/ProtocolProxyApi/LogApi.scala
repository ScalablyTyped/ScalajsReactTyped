package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.entryAdded
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Log.EntryAddedEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Log.StartViolationsReportRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogApi extends StObject {
  
  /**
    * Clears the log.
    */
  def clear(): js.Promise[Unit]
  
  /**
    * Disables log domain, prevents further log entries from being reported to the client.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enables log domain, sends the entries collected so far to the client by means of the
    * `entryAdded` notification.
    */
  def enable(): js.Promise[Unit]
  
  /**
    * Issued when new message was logged.
    */
  @JSName("on")
  def on_entryAdded(event: entryAdded, listener: js.Function1[/* params */ EntryAddedEvent, Unit]): Unit
  
  /**
    * start violation reporting.
    */
  def startViolationsReport(params: StartViolationsReportRequest): js.Promise[Unit]
  
  /**
    * Stop violation reporting.
    */
  def stopViolationsReport(): js.Promise[Unit]
}
object LogApi {
  
  inline def apply(
    clear: CallbackTo[js.Promise[Unit]],
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    on: (entryAdded, js.Function1[/* params */ EntryAddedEvent, Unit]) => Callback,
    startViolationsReport: StartViolationsReportRequest => js.Promise[Unit],
    stopViolationsReport: CallbackTo[js.Promise[Unit]]
  ): LogApi = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, disable = disable.toJsFn, enable = enable.toJsFn, on = js.Any.fromFunction2((t0: entryAdded, t1: js.Function1[/* params */ EntryAddedEvent, Unit]) => (on(t0, t1)).runNow()), startViolationsReport = js.Any.fromFunction1(startViolationsReport), stopViolationsReport = stopViolationsReport.toJsFn)
    __obj.asInstanceOf[LogApi]
  }
  
  extension [Self <: LogApi](x: Self) {
    
    inline def setClear(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setOn(value: (entryAdded, js.Function1[/* params */ EntryAddedEvent, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: entryAdded, t1: js.Function1[/* params */ EntryAddedEvent, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setStartViolationsReport(value: StartViolationsReportRequest => js.Promise[Unit]): Self = StObject.set(x, "startViolationsReport", js.Any.fromFunction1(value))
    
    inline def setStopViolationsReport(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stopViolationsReport", value.toJsFn)
  }
}
