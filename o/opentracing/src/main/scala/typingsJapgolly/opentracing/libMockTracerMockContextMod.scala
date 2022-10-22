package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.libSpanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMockTracerMockContextMod {
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", JSImport.Default)
  @js.native
  open class default protected () extends MockContext {
    def this(span: typingsJapgolly.opentracing.libMockTracerMockSpanMod.default) = this()
  }
  
  @JSImport("opentracing/lib/mock_tracer/mock_context", "MockContext")
  @js.native
  open class MockContext protected () extends SpanContext {
    def this(span: typingsJapgolly.opentracing.libMockTracerMockSpanMod.default) = this()
    
    /* private */ var _span: Any = js.native
    
    def span(): typingsJapgolly.opentracing.libMockTracerMockSpanMod.default = js.native
  }
}
