package typingsJapgolly.opentracing

import typingsJapgolly.opentracing.opentracingStrings.client
import typingsJapgolly.opentracing.opentracingStrings.component
import typingsJapgolly.opentracing.opentracingStrings.consumer
import typingsJapgolly.opentracing.opentracingStrings.dbDotinstance
import typingsJapgolly.opentracing.opentracingStrings.dbDotstatement
import typingsJapgolly.opentracing.opentracingStrings.dbDottype
import typingsJapgolly.opentracing.opentracingStrings.dbDotuser
import typingsJapgolly.opentracing.opentracingStrings.error
import typingsJapgolly.opentracing.opentracingStrings.httpDotmethod
import typingsJapgolly.opentracing.opentracingStrings.httpDotstatus_code
import typingsJapgolly.opentracing.opentracingStrings.httpDoturl
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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("opentracing/lib/ext/tags", JSImport.Namespace)
@js.native
object tagsMod extends js.Object {
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

