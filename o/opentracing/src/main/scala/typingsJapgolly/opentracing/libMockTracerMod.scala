package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.libMockTracerMockContextMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockTracerMod {
  
  @JSImport("opentracing/lib/mock_tracer", "MockContext")
  @js.native
  open class MockContext protected () extends default {
    def this(span: typingsJapgolly.opentracing.libMockTracerMockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockSpan")
  @js.native
  open class MockSpan protected ()
    extends typingsJapgolly.opentracing.libMockTracerMockSpanMod.default {
    def this(tracer: typingsJapgolly.opentracing.libMockTracerMockTracerMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer", "MockTracer")
  @js.native
  open class MockTracer ()
    extends typingsJapgolly.opentracing.libMockTracerMockTracerMod.default
}
