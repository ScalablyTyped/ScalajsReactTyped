package typingsJapgolly.gapiClient

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.gapiClient.gapi.client.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback[T] extends js.Object {
  /**
    * Identifies the response for this request in the map of batch responses. If one is not provided, the system generates a random ID.
    */
  var id: String
  def callback(
    /**
    * is the response for this request only. Its format is defined by the API method being called.
    */
  individualResponse: Response[T],
    /**
    * is the raw batch ID-response map as a string. It contains all responses to all requests in the batch.
    */
  rawBatchResponse: String
  ): js.Any
}

object AnonCallback {
  @scala.inline
  def apply[T](callback: (Response[T], String) => CallbackTo[js.Any], id: String): AnonCallback[T] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: typingsJapgolly.gapiClient.gapi.client.Response[T], t1: java.lang.String) => callback(t0, t1).runNow()))
    __obj.asInstanceOf[AnonCallback[T]]
  }
}

