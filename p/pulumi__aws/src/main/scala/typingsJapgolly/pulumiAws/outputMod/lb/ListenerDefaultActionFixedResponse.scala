package typingsJapgolly.pulumiAws.outputMod.lb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListenerDefaultActionFixedResponse extends js.Object {
  /**
    * The content type. Valid values are `text/plain`, `text/css`, `text/html`, `application/javascript` and `application/json`.
    */
  var contentType: String = js.native
  /**
    * The message body.
    */
  var messageBody: js.UndefOr[String] = js.native
  /**
    * The HTTP response code. Valid values are `2XX`, `4XX`, or `5XX`.
    */
  var statusCode: String = js.native
}

object ListenerDefaultActionFixedResponse {
  @scala.inline
  def apply(contentType: String, statusCode: String, messageBody: String = null): ListenerDefaultActionFixedResponse = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any])
    if (messageBody != null) __obj.updateDynamic("messageBody")(messageBody.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerDefaultActionFixedResponse]
  }
}

