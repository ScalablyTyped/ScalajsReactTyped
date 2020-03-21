package typingsJapgolly.hapiHapi.mod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.hapiShot.AnonReq
import typingsJapgolly.hapiShot.mod.Headers
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerInjectResponse
  extends typingsJapgolly.hapiShot.mod.ResponseObject {
  /**
    * the request object.
    */
  var request: Request
  /**
    * the raw handler response (e.g. when not a stream or a view) before it is serialized for transmission. If not available, the value is set to payload. Useful for inspection and reuse of the
    * internal objects returned (instead of parsing the response string).
    */
  var result: js.UndefOr[js.Object] = js.undefined
}

object ServerInjectResponse {
  @scala.inline
  def apply(
    headers: Headers,
    payload: String,
    raw: AnonReq,
    rawPayload: Buffer,
    request: Request,
    statusCode: Double,
    statusMessage: String,
    trailers: StringDictionary[js.Any],
    result: js.Object = null
  ): ServerInjectResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], rawPayload = rawPayload.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], trailers = trailers.asInstanceOf[js.Any])
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInjectResponse]
  }
}

