package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.mockContextMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/mock_tracer", JSImport.Namespace)
@js.native
object mockTracerMod extends js.Object {
  @js.native
  class MockContext protected () extends default {
    def this(span: typingsJapgolly.opentracing.mockSpanMod.default) = this()
  }
  
  @js.native
  class MockSpan protected ()
    extends typingsJapgolly.opentracing.mockSpanMod.default {
    def this(tracer: typingsJapgolly.opentracing.mockTracerMockTracerMod.default) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typingsJapgolly.opentracing.mockTracerMockTracerMod.default
  
}

