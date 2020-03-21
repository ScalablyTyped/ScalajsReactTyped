package typingsJapgolly.ddTrace

import typingsJapgolly.ddTrace.ddTraceNumbers.`-1`
import typingsJapgolly.ddTrace.ddTraceNumbers.`0`
import typingsJapgolly.ddTrace.ddTraceNumbers.`1`
import typingsJapgolly.ddTrace.ddTraceNumbers.`2`
import typingsJapgolly.ddTrace.ddTraceStrings._dd1DotsrDoteausr
import typingsJapgolly.ddTrace.ddTraceStrings.`agent-exporter`
import typingsJapgolly.ddTrace.ddTraceStrings.`log-exporter`
import typingsJapgolly.ddTrace.ddTraceStrings.binary
import typingsJapgolly.ddTrace.ddTraceStrings.client
import typingsJapgolly.ddTrace.ddTraceStrings.consumer
import typingsJapgolly.ddTrace.ddTraceStrings.error
import typingsJapgolly.ddTrace.ddTraceStrings.http
import typingsJapgolly.ddTrace.ddTraceStrings.httpDotmethod
import typingsJapgolly.ddTrace.ddTraceStrings.httpDotrequestDotheaders
import typingsJapgolly.ddTrace.ddTraceStrings.httpDotresponseDotheaders
import typingsJapgolly.ddTrace.ddTraceStrings.httpDotroute
import typingsJapgolly.ddTrace.ddTraceStrings.httpDotstatus_code
import typingsJapgolly.ddTrace.ddTraceStrings.httpDoturl
import typingsJapgolly.ddTrace.ddTraceStrings.http_headers
import typingsJapgolly.ddTrace.ddTraceStrings.log
import typingsJapgolly.ddTrace.ddTraceStrings.manualDotdrop
import typingsJapgolly.ddTrace.ddTraceStrings.manualDotkeep
import typingsJapgolly.ddTrace.ddTraceStrings.producer
import typingsJapgolly.ddTrace.ddTraceStrings.resourceDotname
import typingsJapgolly.ddTrace.ddTraceStrings.samplingDotpriority
import typingsJapgolly.ddTrace.ddTraceStrings.server
import typingsJapgolly.ddTrace.ddTraceStrings.serviceDotname
import typingsJapgolly.ddTrace.ddTraceStrings.spanDotkind
import typingsJapgolly.ddTrace.ddTraceStrings.spanDottype
import typingsJapgolly.ddTrace.ddTraceStrings.text_map
import typingsJapgolly.ddTrace.ddTraceStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dd-trace/ext", JSImport.Namespace)
@js.native
object extMod extends js.Object {
  @js.native
  object exporters extends js.Object {
    var AGENT: `agent-exporter` = js.native
    var LOG: `log-exporter` = js.native
  }
  
  @js.native
  object formats extends js.Object {
    var BINARY: binary = js.native
    var HTTP_HEADERS: http_headers = js.native
    var LOG: log = js.native
    var TEXT_MAP: text_map = js.native
  }
  
  @js.native
  object kinds extends js.Object {
    var CLIENT: client = js.native
    var CONSUMER: consumer = js.native
    var PRODUCER: producer = js.native
    var SERVER: server = js.native
  }
  
  @js.native
  object priority extends js.Object {
    var AUTO_KEEP: `1` = js.native
    var AUTO_REJECT: `0` = js.native
    var USER_KEEP: `2` = js.native
    var USER_REJECT: `-1` = js.native
  }
  
  @js.native
  object tags extends js.Object {
    var ANALYTICS: _dd1DotsrDoteausr = js.native
    var ERROR: error = js.native
    var HTTP_METHOD: httpDotmethod = js.native
    var HTTP_REQUEST_HEADERS: httpDotrequestDotheaders = js.native
    var HTTP_RESPONSE_HEADERS: httpDotresponseDotheaders = js.native
    var HTTP_ROUTE: httpDotroute = js.native
    var HTTP_STATUS_CODE: httpDotstatus_code = js.native
    var HTTP_URL: httpDoturl = js.native
    var MANUAL_DROP: manualDotdrop = js.native
    var MANUAL_KEEP: manualDotkeep = js.native
    var RESOURCE_NAME: resourceDotname = js.native
    var SAMPLING_PRIORITY: samplingDotpriority = js.native
    var SERVICE_NAME: serviceDotname = js.native
    var SPAN_KIND: spanDotkind = js.native
    var SPAN_TYPE: spanDottype = js.native
  }
  
  @js.native
  object types extends js.Object {
    var HTTP: http = js.native
    var WEB: web = js.native
  }
  
}

