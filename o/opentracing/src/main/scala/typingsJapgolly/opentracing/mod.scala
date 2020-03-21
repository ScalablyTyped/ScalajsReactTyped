package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.binaryCarrierMod.default
import typingsJapgolly.opentracing.opentracingStrings.binary
import typingsJapgolly.opentracing.opentracingStrings.child_of
import typingsJapgolly.opentracing.opentracingStrings.client
import typingsJapgolly.opentracing.opentracingStrings.component
import typingsJapgolly.opentracing.opentracingStrings.consumer
import typingsJapgolly.opentracing.opentracingStrings.dbDotinstance
import typingsJapgolly.opentracing.opentracingStrings.dbDotstatement
import typingsJapgolly.opentracing.opentracingStrings.dbDottype
import typingsJapgolly.opentracing.opentracingStrings.dbDotuser
import typingsJapgolly.opentracing.opentracingStrings.error
import typingsJapgolly.opentracing.opentracingStrings.follows_from
import typingsJapgolly.opentracing.opentracingStrings.httpDotmethod
import typingsJapgolly.opentracing.opentracingStrings.httpDotstatus_code
import typingsJapgolly.opentracing.opentracingStrings.httpDoturl
import typingsJapgolly.opentracing.opentracingStrings.http_headers
import typingsJapgolly.opentracing.opentracingStrings.message_busDotdestination
import typingsJapgolly.opentracing.opentracingStrings.peerDotaddress
import typingsJapgolly.opentracing.opentracingStrings.peerDothostname
import typingsJapgolly.opentracing.opentracingStrings.peerDotipv4
import typingsJapgolly.opentracing.opentracingStrings.peerDotipv6
import typingsJapgolly.opentracing.opentracingStrings.peerDotport
import typingsJapgolly.opentracing.opentracingStrings.peerDotservice
import typingsJapgolly.opentracing.opentracingStrings.producer
import typingsJapgolly.opentracing.opentracingStrings.samplingDotpriority
import typingsJapgolly.opentracing.opentracingStrings.server
import typingsJapgolly.opentracing.opentracingStrings.spanDotkind
import typingsJapgolly.opentracing.opentracingStrings.text_map
import typingsJapgolly.std.ArrayLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class BinaryCarrier protected () extends default {
    def this(buffer: ArrayLike[Double]) = this()
  }
  
  @js.native
  class MockTracer ()
    extends typingsJapgolly.opentracing.mockTracerMod.MockTracer
  
  @js.native
  class Reference protected ()
    extends typingsJapgolly.opentracing.referenceMod.default {
    /**
      * Initialize a new Reference instance.
      *
      * @param {string} type - the Reference type constant (e.g.,
      *        REFERENCE_CHILD_OF or REFERENCE_FOLLOWS_FROM).
      * @param {SpanContext} referencedContext - the SpanContext being referred
      *        to. As a convenience, a Span instance may be passed in instead
      *        (in which case its .context() is used here).
      */
    def this(`type`: String, referencedContext: typingsJapgolly.opentracing.spanContextMod.default) = this()
    def this(`type`: String, referencedContext: typingsJapgolly.opentracing.spanMod.default) = this()
  }
  
  @js.native
  class Span ()
    extends typingsJapgolly.opentracing.spanMod.Span
  
  @js.native
  class SpanContext ()
    extends typingsJapgolly.opentracing.spanContextMod.SpanContext
  
  @js.native
  class Tracer ()
    extends typingsJapgolly.opentracing.tracerMod.Tracer
  
  val FORMAT_BINARY: binary = js.native
  val FORMAT_HTTP_HEADERS: http_headers = js.native
  val FORMAT_TEXT_MAP: text_map = js.native
  val REFERENCE_CHILD_OF: child_of = js.native
  val REFERENCE_FOLLOWS_FROM: follows_from = js.native
  def childOf(spanContext: typingsJapgolly.opentracing.spanContextMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def childOf(spanContext: typingsJapgolly.opentracing.spanMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typingsJapgolly.opentracing.spanContextMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def followsFrom(spanContext: typingsJapgolly.opentracing.spanMod.default): typingsJapgolly.opentracing.referenceMod.default = js.native
  def globalTracer(): typingsJapgolly.opentracing.tracerMod.default = js.native
  def initGlobalTracer(tracer: typingsJapgolly.opentracing.tracerMod.default): Unit = js.native
  @js.native
  object Tags extends js.Object {
    val COMPONENT: component = js.native
    val DB_INSTANCE: dbDotinstance = js.native
    val DB_STATEMENT: dbDotstatement = js.native
    val DB_TYPE: dbDottype = js.native
    val DB_USER: dbDotuser = js.native
    val ERROR: error = js.native
    val HTTP_METHOD: httpDotmethod = js.native
    val HTTP_STATUS_CODE: httpDotstatus_code = js.native
    val HTTP_URL: httpDoturl = js.native
    val MESSAGE_BUS_DESTINATION: message_busDotdestination = js.native
    val PEER_ADDRESS: peerDotaddress = js.native
    val PEER_HOSTNAME: peerDothostname = js.native
    val PEER_HOST_IPV4: peerDotipv4 = js.native
    val PEER_HOST_IPV6: peerDotipv6 = js.native
    val PEER_PORT: peerDotport = js.native
    val PEER_SERVICE: peerDotservice = js.native
    val SAMPLING_PRIORITY: samplingDotpriority = js.native
    val SPAN_KIND: spanDotkind = js.native
    val SPAN_KIND_MESSAGING_CONSUMER: consumer = js.native
    val SPAN_KIND_MESSAGING_PRODUCER: producer = js.native
    val SPAN_KIND_RPC_CLIENT: client = js.native
    val SPAN_KIND_RPC_SERVER: server = js.native
  }
  
}

