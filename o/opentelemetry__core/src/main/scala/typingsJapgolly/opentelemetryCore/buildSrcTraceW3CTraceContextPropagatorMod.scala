package typingsJapgolly.opentelemetryCore

import typingsJapgolly.opentelemetryApi.buildSrcContextTypesMod.Context
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapGetter
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapPropagator
import typingsJapgolly.opentelemetryApi.buildSrcPropagationTextMapPropagatorMod.TextMapSetter
import typingsJapgolly.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceW3CTraceContextPropagatorMod {
  
  @JSImport("@opentelemetry/core/build/src/trace/W3CTraceContextPropagator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@opentelemetry/core/build/src/trace/W3CTraceContextPropagator", "TRACE_PARENT_HEADER")
  @js.native
  val TRACE_PARENT_HEADER: /* "traceparent" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/trace/W3CTraceContextPropagator", "TRACE_STATE_HEADER")
  @js.native
  val TRACE_STATE_HEADER: /* "tracestate" */ String = js.native
  
  @JSImport("@opentelemetry/core/build/src/trace/W3CTraceContextPropagator", "W3CTraceContextPropagator")
  @js.native
  open class W3CTraceContextPropagator ()
    extends StObject
       with TextMapPropagator[Any] {
    
    /**
      * Given a `Context` and a carrier, extract context values from a
      * carrier and return a new context, created from the old context, with the
      * extracted values.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param getter an optional {@link TextMapGetter}. If undefined, keys will be all
      *     own properties, and keys will be accessed by direct object access.
      */
    /* CompleteClass */
    override def extract(context: Context, carrier: Any, getter: TextMapGetter[Any]): Context = js.native
    
    /**
      * Return a list of all fields which may be used by the propagator.
      */
    /* CompleteClass */
    override def fields(): js.Array[String] = js.native
    
    /**
      * Injects values from a given `Context` into a carrier.
      *
      * OpenTelemetry defines a common set of format values (TextMapPropagator),
      * and each has an expected `carrier` type.
      *
      * @param context the Context from which to extract values to transmit over
      *     the wire.
      * @param carrier the carrier of propagation fields, such as http request
      *     headers.
      * @param setter an optional {@link TextMapSetter}. If undefined, values will be
      *     set by direct object assignment.
      */
    /* CompleteClass */
    override def inject(context: Context, carrier: Any, setter: TextMapSetter[Any]): Unit = js.native
  }
  
  inline def parseTraceParent(traceParent: String): SpanContext | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTraceParent")(traceParent.asInstanceOf[js.Any]).asInstanceOf[SpanContext | Null]
}
