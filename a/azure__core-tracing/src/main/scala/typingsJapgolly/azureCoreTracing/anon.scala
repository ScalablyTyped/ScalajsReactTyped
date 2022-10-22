package typingsJapgolly.azureCoreTracing

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.azureCoreTracing.mod.OperationTracingOptions
import typingsJapgolly.azureCoreTracing.mod.OptionsWithTracingContext
import typingsJapgolly.azureCoreTracing.mod.SpanStatus
import typingsJapgolly.azureCoreTracing.mod.TracingSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Omit<@azure/core-tracing.@azure/core-tracing.TracingSpan, 'end'> */
  trait OmitTracingSpanend extends StObject {
    
    def isRecording(): Boolean
    @JSName("isRecording")
    var isRecording_Original: js.Function0[Boolean]
    
    def recordException(exception: String): Unit
    def recordException(exception: js.Error): Unit
    @JSName("recordException")
    var recordException_Original: js.Function1[/* exception */ js.Error | String, Unit]
    
    def setAttribute(name: String, value: Any): Unit
    @JSName("setAttribute")
    var setAttribute_Original: js.Function2[/* name */ String, /* value */ Any, Unit]
    
    def setStatus(status: SpanStatus): Unit
    @JSName("setStatus")
    var setStatus_Original: js.Function1[/* status */ SpanStatus, Unit]
  }
  object OmitTracingSpanend {
    
    inline def apply(
      isRecording: CallbackTo[Boolean],
      recordException: /* exception */ js.Error | String => Callback,
      setAttribute: (/* name */ String, /* value */ Any) => Callback,
      setStatus: /* status */ SpanStatus => Callback
    ): OmitTracingSpanend = {
      val __obj = js.Dynamic.literal(isRecording = isRecording.toJsFn, recordException = js.Any.fromFunction1((t0: /* exception */ js.Error | String) => recordException(t0).runNow()), setAttribute = js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (setAttribute(t0, t1)).runNow()), setStatus = js.Any.fromFunction1((t0: /* status */ SpanStatus) => setStatus(t0).runNow()))
      __obj.asInstanceOf[OmitTracingSpanend]
    }
    
    extension [Self <: OmitTracingSpanend](x: Self) {
      
      inline def setIsRecording(value: CallbackTo[Boolean]): Self = StObject.set(x, "isRecording", value.toJsFn)
      
      inline def setRecordException(value: /* exception */ js.Error | String => Callback): Self = StObject.set(x, "recordException", js.Any.fromFunction1((t0: /* exception */ js.Error | String) => value(t0).runNow()))
      
      inline def setSetAttribute(value: (/* name */ String, /* value */ Any) => Callback): Self = StObject.set(x, "setAttribute", js.Any.fromFunction2((t0: /* name */ String, t1: /* value */ Any) => (value(t0, t1)).runNow()))
      
      inline def setSetStatus(value: /* status */ SpanStatus => Callback): Self = StObject.set(x, "setStatus", js.Any.fromFunction1((t0: /* status */ SpanStatus) => value(t0).runNow()))
    }
  }
  
  trait Span extends StObject {
    
    var span: TracingSpan
    
    var tracingContext: typingsJapgolly.azureCoreTracing.mod.TracingContext
  }
  object Span {
    
    inline def apply(span: TracingSpan, tracingContext: typingsJapgolly.azureCoreTracing.mod.TracingContext): Span = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], tracingContext = tracingContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[Span]
    }
    
    extension [Self <: Span](x: Self) {
      
      inline def setSpan(value: TracingSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setTracingContext(value: typingsJapgolly.azureCoreTracing.mod.TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait TracingContext extends StObject {
    
    var tracingContext: typingsJapgolly.azureCoreTracing.mod.TracingContext
  }
  object TracingContext {
    
    inline def apply(tracingContext: typingsJapgolly.azureCoreTracing.mod.TracingContext): TracingContext = {
      val __obj = js.Dynamic.literal(tracingContext = tracingContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingContext]
    }
    
    extension [Self <: TracingContext](x: Self) {
      
      inline def setTracingContext(value: typingsJapgolly.azureCoreTracing.mod.TracingContext): Self = StObject.set(x, "tracingContext", value.asInstanceOf[js.Any])
    }
  }
  
  trait TracingOptions extends StObject {
    
    var tracingOptions: js.UndefOr[OperationTracingOptions] = js.undefined
  }
  object TracingOptions {
    
    inline def apply(): TracingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TracingOptions]
    }
    
    extension [Self <: TracingOptions](x: Self) {
      
      inline def setTracingOptions(value: OperationTracingOptions): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
      
      inline def setTracingOptionsUndefined: Self = StObject.set(x, "tracingOptions", js.undefined)
    }
  }
  
  trait TracingOptionsTracingContext extends StObject {
    
    var tracingOptions: TracingContext
  }
  object TracingOptionsTracingContext {
    
    inline def apply(tracingOptions: TracingContext): TracingOptionsTracingContext = {
      val __obj = js.Dynamic.literal(tracingOptions = tracingOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[TracingOptionsTracingContext]
    }
    
    extension [Self <: TracingOptionsTracingContext](x: Self) {
      
      inline def setTracingOptions(value: TracingContext): Self = StObject.set(x, "tracingOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpdatedOptions[Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */] extends StObject {
    
    var span: TracingSpan
    
    var updatedOptions: OptionsWithTracingContext[Options]
  }
  object UpdatedOptions {
    
    inline def apply[Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */](span: TracingSpan, updatedOptions: OptionsWithTracingContext[Options]): UpdatedOptions[Options] = {
      val __obj = js.Dynamic.literal(span = span.asInstanceOf[js.Any], updatedOptions = updatedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpdatedOptions[Options]]
    }
    
    extension [Self <: UpdatedOptions[?], Options /* <: /* import warning: importer.ImportType#apply Failed type conversion: {  tracingOptions :@azure/core-tracing.@azure/core-tracing.OperationTracingOptions | undefined} */ js.Any */](x: Self & UpdatedOptions[Options]) {
      
      inline def setSpan(value: TracingSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setUpdatedOptions(value: OptionsWithTracingContext[Options]): Self = StObject.set(x, "updatedOptions", value.asInstanceOf[js.Any])
    }
  }
}
