package typingsJapgolly.zipkin.mod

import typingsJapgolly.zipkin.anon.RemoteServiceName
import typingsJapgolly.zipkin.anon.ServerTags
import typingsJapgolly.zipkin.mod.option.IOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Instrumentation {
  
  @JSImport("zipkin", "Instrumentation.HttpClient")
  @js.native
  open class HttpClient protected () extends StObject {
    def this(args: RemoteServiceName) = this()
    
    def recordError(traceId: TraceId, error: js.Error): Unit = js.native
    
    def recordRequest[T](request: T, url: String, method: String): T = js.native
    
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
  }
  
  @JSImport("zipkin", "Instrumentation.HttpServer")
  @js.native
  open class HttpServer protected () extends StObject {
    def this(args: ServerTags) = this()
    
    def recordRequest(method: String, requestUrl: String, readHeader: js.Function1[/* header */ String, IOption[Any]]): TraceId = js.native
    
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
    def recordResponse(traceId: TraceId, statusCode: String, error: js.Error): Unit = js.native
  }
}
