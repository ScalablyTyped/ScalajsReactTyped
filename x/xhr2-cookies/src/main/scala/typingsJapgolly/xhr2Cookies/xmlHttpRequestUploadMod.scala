package typingsJapgolly.xhr2Cookies

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.ClientRequest
import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.ArrayBufferView
import typingsJapgolly.xhr2Cookies.xmlHttpRequestEventTargetMod.XMLHttpRequestEventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xhr2-cookies/dist/xml-http-request-upload", JSImport.Namespace)
@js.native
object xmlHttpRequestUploadMod extends js.Object {
  @js.native
  class XMLHttpRequestUpload () extends XMLHttpRequestEventTarget {
    var _body: js.Any = js.native
    var _contentType: js.Any = js.native
    def _finalizeHeaders(headers: js.Object, loweredHeaders: js.Object): Unit = js.native
    def _reset(): Unit = js.native
    def _setData(): Unit = js.native
    def _setData(data: String): Unit = js.native
    def _setData(data: Buffer): Unit = js.native
    def _setData(data: ArrayBuffer): Unit = js.native
    def _setData(data: ArrayBufferView): Unit = js.native
    def _startUpload(request: ClientRequest): Unit = js.native
  }
  
}

