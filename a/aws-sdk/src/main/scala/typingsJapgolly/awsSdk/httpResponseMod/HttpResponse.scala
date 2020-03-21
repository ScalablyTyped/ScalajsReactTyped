package typingsJapgolly.awsSdk.httpResponseMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/http_response", "HttpResponse")
@js.native
class HttpResponse () extends js.Object {
  /**
    * The response body payload.
    */
  var body: String | Buffer | scala.scalajs.js.typedarray.Uint8Array = js.native
  /**
    * A map of response header keys and their respective values.
    */
  var headers: StringDictionary[String] = js.native
  /**
    * The HTTP status code of the response (e.g., 200, 404).
    */
  var statusCode: Double = js.native
  /**
    * The HTTP status message of the response (e.g., 'Bad Request', 'Not Found')
    */
  var statusMessage: String = js.native
  /**
    * Whether this response is being streamed at a low-level.
    */
  var streaming: Boolean = js.native
  /**
    * Disables buffering on the HTTP response and returns the stream for reading.
    */
  def createUnbufferedStream(): Readable | XMLHttpRequest = js.native
}

