package typingsJapgolly.chromeApps.chrome.fileSystemProvider

import typingsJapgolly.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typingsJapgolly.chromeApps.chrome.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbortRequestedEventOptions extends RequestedEventOptions {
  /** An ID of the request to which this operation is related. */
  var operationRequestId: integer
}

object AbortRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, operationRequestId: integer, requestId: integer): AbortRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AbortRequestedEventOptions]
  }
}

