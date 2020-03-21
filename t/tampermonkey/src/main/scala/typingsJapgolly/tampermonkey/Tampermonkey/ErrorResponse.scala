package typingsJapgolly.tampermonkey.Tampermonkey

import typingsJapgolly.std.Document_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorResponse extends ResponseBase {
  val error: String
}

object ErrorResponse {
  @scala.inline
  def apply(
    error: String,
    readyState: ReadyState,
    response: js.Any,
    responseHeaders: String,
    responseText: String,
    status: Double,
    statusText: String,
    responseXML: Document_ = null
  ): ErrorResponse = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], readyState = readyState.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any], responseHeaders = responseHeaders.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    if (responseXML != null) __obj.updateDynamic("responseXML")(responseXML.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorResponse]
  }
}

