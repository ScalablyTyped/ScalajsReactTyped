package typingsJapgolly.jaegerClient.mod

import typingsJapgolly.opentracing.libSpanContextMod.default
import typingsJapgolly.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object opentracing {
  
  @JSImport("jaeger-client", "opentracing")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("jaeger-client", "opentracing.BinaryCarrier")
  @js.native
  open class BinaryCarrier protected ()
    extends typingsJapgolly.opentracing.mod.BinaryCarrier {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @JSImport("jaeger-client", "opentracing.FORMAT_BINARY")
  @js.native
  val FORMAT_BINARY: /* "binary" */ String = js.native
  
  @JSImport("jaeger-client", "opentracing.FORMAT_HTTP_HEADERS")
  @js.native
  val FORMAT_HTTP_HEADERS: /* "http_headers" */ String = js.native
  
  @JSImport("jaeger-client", "opentracing.FORMAT_TEXT_MAP")
  @js.native
  val FORMAT_TEXT_MAP: /* "text_map" */ String = js.native
  
  @JSImport("jaeger-client", "opentracing.MockTracer")
  @js.native
  open class MockTracer ()
    extends typingsJapgolly.opentracing.mod.MockTracer
  
  @JSImport("jaeger-client", "opentracing.REFERENCE_CHILD_OF")
  @js.native
  val REFERENCE_CHILD_OF: /* "child_of" */ String = js.native
  
  @JSImport("jaeger-client", "opentracing.REFERENCE_FOLLOWS_FROM")
  @js.native
  val REFERENCE_FOLLOWS_FROM: /* "follows_from" */ String = js.native
  
  @JSImport("jaeger-client", "opentracing.Reference")
  @js.native
  open class Reference protected ()
    extends typingsJapgolly.opentracing.mod.Reference {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: default) = this()
    def this(`type`: String, referencedContext: typingsJapgolly.opentracing.libSpanMod.default) = this()
  }
  
  @JSImport("jaeger-client", "opentracing.Span")
  @js.native
  open class Span ()
    extends typingsJapgolly.opentracing.mod.Span
  
  @JSImport("jaeger-client", "opentracing.SpanContext")
  @js.native
  open class SpanContext ()
    extends typingsJapgolly.opentracing.mod.SpanContext
  
  object Tags {
    
    @JSImport("jaeger-client", "opentracing.Tags.COMPONENT")
    @js.native
    val COMPONENT: /* "component" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.DB_INSTANCE")
    @js.native
    val DB_INSTANCE: /* "db.instance" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.DB_STATEMENT")
    @js.native
    val DB_STATEMENT: /* "db.statement" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.DB_TYPE")
    @js.native
    val DB_TYPE: /* "db.type" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.DB_USER")
    @js.native
    val DB_USER: /* "db.user" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.ERROR")
    @js.native
    val ERROR: /* "error" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.HTTP_METHOD")
    @js.native
    val HTTP_METHOD: /* "http.method" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.HTTP_STATUS_CODE")
    @js.native
    val HTTP_STATUS_CODE: /* "http.status_code" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.HTTP_URL")
    @js.native
    val HTTP_URL: /* "http.url" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.MESSAGE_BUS_DESTINATION")
    @js.native
    val MESSAGE_BUS_DESTINATION: /* "message_bus.destination" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_ADDRESS")
    @js.native
    val PEER_ADDRESS: /* "peer.address" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_HOSTNAME")
    @js.native
    val PEER_HOSTNAME: /* "peer.hostname" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_HOST_IPV4")
    @js.native
    val PEER_HOST_IPV4: /* "peer.ipv4" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_HOST_IPV6")
    @js.native
    val PEER_HOST_IPV6: /* "peer.ipv6" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_PORT")
    @js.native
    val PEER_PORT: /* "peer.port" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.PEER_SERVICE")
    @js.native
    val PEER_SERVICE: /* "peer.service" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SAMPLING_PRIORITY")
    @js.native
    val SAMPLING_PRIORITY: /* "sampling.priority" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SPAN_KIND")
    @js.native
    val SPAN_KIND: /* "span.kind" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SPAN_KIND_MESSAGING_CONSUMER")
    @js.native
    val SPAN_KIND_MESSAGING_CONSUMER: /* "consumer" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SPAN_KIND_MESSAGING_PRODUCER")
    @js.native
    val SPAN_KIND_MESSAGING_PRODUCER: /* "producer" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SPAN_KIND_RPC_CLIENT")
    @js.native
    val SPAN_KIND_RPC_CLIENT: /* "client" */ String = js.native
    
    @JSImport("jaeger-client", "opentracing.Tags.SPAN_KIND_RPC_SERVER")
    @js.native
    val SPAN_KIND_RPC_SERVER: /* "server" */ String = js.native
  }
  
  @JSImport("jaeger-client", "opentracing.Tracer")
  @js.native
  open class Tracer ()
    extends typingsJapgolly.opentracing.mod.Tracer
  
  inline def childOf(spanContext: default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("childOf")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  inline def childOf(spanContext: typingsJapgolly.opentracing.libSpanMod.default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("childOf")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  
  inline def followsFrom(spanContext: default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("followsFrom")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  inline def followsFrom(spanContext: typingsJapgolly.opentracing.libSpanMod.default): typingsJapgolly.opentracing.libReferenceMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("followsFrom")(spanContext.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.opentracing.libReferenceMod.default]
  
  inline def globalTracer(): typingsJapgolly.opentracing.libTracerMod.default = ^.asInstanceOf[js.Dynamic].applyDynamic("globalTracer")().asInstanceOf[typingsJapgolly.opentracing.libTracerMod.default]
  
  inline def initGlobalTracer(tracer: typingsJapgolly.opentracing.libTracerMod.default): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("initGlobalTracer")(tracer.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
