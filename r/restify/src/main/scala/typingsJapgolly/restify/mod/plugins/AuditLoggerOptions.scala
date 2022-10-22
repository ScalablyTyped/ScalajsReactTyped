package typingsJapgolly.restify.mod.plugins

import typingsJapgolly.restify.mod.Request
import typingsJapgolly.restify.mod.Response
import typingsJapgolly.restify.mod.Server
import typingsJapgolly.restify.restifyStrings.after
import typingsJapgolly.restify.restifyStrings.routed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditLoggerOptions extends StObject {
  
  var body: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The optional context function of signature
    * f(req, res, route, err).  Invoked each time an audit log is generated. This
    * function can return an object that customizes the format of anything off the
    * req, res, route, and err objects. The output of this function will be
    * available on the `context` key in the audit object.
    */
  var context: js.UndefOr[AuditLoggerContext] = js.undefined
  
  /**
    * The event from the server which initiates the
    * log, one of 'pre', 'routed', or 'after'
    */
  var event: typingsJapgolly.restify.restifyStrings.pre | routed | after
  
  /**
    * Bunyan logger
    */
  var log: typingsJapgolly.bunyan.mod.^
  
  /**
    * Ringbuffer which is written to if passed in
    */
  var logBuffer: js.UndefOr[Any] = js.undefined
  
  /**
    * When true, prints audit logs. default true.
    */
  var printLog: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Restify server. If passed in, causes server to emit 'auditlog' event after audit logs are flushed
    */
  var server: js.UndefOr[Server] = js.undefined
}
object AuditLoggerOptions {
  
  inline def apply(
    event: typingsJapgolly.restify.restifyStrings.pre | routed | after,
    log: typingsJapgolly.bunyan.mod.^
  ): AuditLoggerOptions = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditLoggerOptions]
  }
  
  extension [Self <: AuditLoggerOptions](x: Self) {
    
    inline def setBody(value: Boolean): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContext(value: (/* req */ Request, /* res */ Response, /* route */ Any, /* error */ Any) => Any): Self = StObject.set(x, "context", js.Any.fromFunction4(value))
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setEvent(value: typingsJapgolly.restify.restifyStrings.pre | routed | after): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setLog(value: typingsJapgolly.bunyan.mod.^): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogBuffer(value: Any): Self = StObject.set(x, "logBuffer", value.asInstanceOf[js.Any])
    
    inline def setLogBufferUndefined: Self = StObject.set(x, "logBuffer", js.undefined)
    
    inline def setPrintLog(value: Boolean): Self = StObject.set(x, "printLog", value.asInstanceOf[js.Any])
    
    inline def setPrintLogUndefined: Self = StObject.set(x, "printLog", js.undefined)
    
    inline def setServer(value: Server): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
    
    inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
  }
}
