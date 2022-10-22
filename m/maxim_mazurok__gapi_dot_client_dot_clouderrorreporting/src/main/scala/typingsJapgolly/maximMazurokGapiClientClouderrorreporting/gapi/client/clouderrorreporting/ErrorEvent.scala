package typingsJapgolly.maximMazurokGapiClientClouderrorreporting.gapi.client.clouderrorreporting

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorEvent extends StObject {
  
  /** Data about the context in which the error occurred. */
  var context: js.UndefOr[ErrorContext] = js.undefined
  
  /** Time when the event occurred as provided in the error report. If the report did not contain a timestamp, the time the error was received by the Error Reporting system is used. */
  var eventTime: js.UndefOr[String] = js.undefined
  
  /** The stack trace that was reported or logged by the service. */
  var message: js.UndefOr[String] = js.undefined
  
  /** The `ServiceContext` for which this error was reported. */
  var serviceContext: js.UndefOr[ServiceContext] = js.undefined
}
object ErrorEvent {
  
  inline def apply(): ErrorEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ErrorEvent]
  }
  
  extension [Self <: ErrorEvent](x: Self) {
    
    inline def setContext(value: ErrorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEventTime(value: String): Self = StObject.set(x, "eventTime", value.asInstanceOf[js.Any])
    
    inline def setEventTimeUndefined: Self = StObject.set(x, "eventTime", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setServiceContext(value: ServiceContext): Self = StObject.set(x, "serviceContext", value.asInstanceOf[js.Any])
    
    inline def setServiceContextUndefined: Self = StObject.set(x, "serviceContext", js.undefined)
  }
}
