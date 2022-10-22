package typingsJapgolly.zipkinTransportHttp

import japgolly.scalajs.react.Callback
import typingsJapgolly.zipkin.mod.Logger
import typingsJapgolly.zipkin.mod.model.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("zipkin-transport-http", "HttpLogger")
  @js.native
  open class HttpLogger protected ()
    extends StObject
       with Logger {
    /**
      * @constructor
      * @param {Object} options
      * @param {string} options.endpoint HTTP endpoint which spans will be sent
      * @param {number} options.httpInterval How often to sync spans.
      * @param {JsonEncoder} options.jsonEncoder JSON encoder to use when sending spans.
      * @param {number} options.timeout Timeout for HTTP Post when sending spans.
      * @param {number} options.maxPayloadSize Max payload size for zipkin span.
      * @param {Object<string, string>} options.headers Any additional HTTP headers to be sent with span.
      * @param {Agent|Function} options.agent HTTP(S) agent to use for any networking related options.
      * @param {ErrorLogger} options.log Internal error logger used within the transport.
      */
    def this(options: typingsJapgolly.zipkinTransportHttp.anon.Agent) = this()
    
    /* CompleteClass */
    override def logSpan(span: Span): Unit = js.native
  }
  
  type Agent = typingsJapgolly.node.httpMod.Agent | typingsJapgolly.node.httpsMod.Agent
  
  trait ErrorLogger extends StObject {
    
    def error(args: Any*): Unit
  }
  object ErrorLogger {
    
    inline def apply(error: /* repeated */ Any => Callback): ErrorLogger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: /* repeated */ Any) => error(t0).runNow()))
      __obj.asInstanceOf[ErrorLogger]
    }
    
    extension [Self <: ErrorLogger](x: Self) {
      
      inline def setError(value: /* repeated */ Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
    }
  }
}
