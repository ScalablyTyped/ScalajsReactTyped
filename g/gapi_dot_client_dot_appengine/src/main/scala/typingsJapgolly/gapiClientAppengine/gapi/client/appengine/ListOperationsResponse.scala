package typingsJapgolly.gapiClientAppengine.gapi.client.appengine

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListOperationsResponse extends js.Object {
  /** The standard List next-page token. */
  var nextPageToken: js.UndefOr[String] = js.undefined
  /** A list of operations that matches the specified filter in the request. */
  var operations: js.UndefOr[js.Array[Operation]] = js.undefined
}

object ListOperationsResponse {
  @scala.inline
  def apply(nextPageToken: String = null, operations: js.Array[Operation] = null): ListOperationsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOperationsResponse]
  }
}

