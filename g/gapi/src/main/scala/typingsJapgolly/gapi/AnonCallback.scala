package typingsJapgolly.gapi

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  /**
    * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
    */
  var id: String
  def callback(
    /**
    * is the response for this request only. Its format is defined by the API method being called.
    */
  individualResponse: js.Any,
    /**
    * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
    */
  rawBatchResponse: js.Any
  ): js.Any
}

object AnonCallback {
  @scala.inline
  def apply(callback: (js.Any, js.Any) => CallbackTo[js.Any], id: String): AnonCallback = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCallback]
  }
}

