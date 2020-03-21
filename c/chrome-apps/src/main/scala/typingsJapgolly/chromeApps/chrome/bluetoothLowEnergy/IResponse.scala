package typingsJapgolly.chromeApps.chrome.bluetoothLowEnergy

import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IResponse extends js.Object {
  /** If this is an error response, this should be true. */
  var isError: Boolean
  /** Id of the request this is a response to. */
  var requestId: integer
  /** Response value. Write requests and error responses will ignore this parameter. */
  var value: js.UndefOr[scala.scalajs.js.typedarray.ArrayBuffer] = js.undefined
}

object IResponse {
  @scala.inline
  def apply(isError: Boolean, requestId: integer, value: scala.scalajs.js.typedarray.ArrayBuffer = null): IResponse = {
    val __obj = js.Dynamic.literal(isError = isError.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResponse]
  }
}

