package typingsJapgolly.zipkin.mod

import typingsJapgolly.zipkin.AnonRemoteServiceName
import typingsJapgolly.zipkin.AnonServerTags
import typingsJapgolly.zipkin.mod.option.IOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("zipkin", "Instrumentation")
@js.native
object Instrumentation extends js.Object {
  @js.native
  class HttpClient protected () extends js.Object {
    def this(args: AnonRemoteServiceName) = this()
    def recordError(traceId: TraceId, error: js.Error): Unit = js.native
    def recordRequest[T](request: T, url: String, method: String): T = js.native
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
  }
  
  @js.native
  class HttpServer protected () extends js.Object {
    def this(args: AnonServerTags) = this()
    def recordRequest(method: String, requestUrl: String, readHeader: js.Function1[/* header */ String, IOption[_]]): TraceId = js.native
    def recordResponse(traceId: TraceId, statusCode: String): Unit = js.native
    def recordResponse(traceId: TraceId, statusCode: String, error: js.Error): Unit = js.native
  }
  
}

