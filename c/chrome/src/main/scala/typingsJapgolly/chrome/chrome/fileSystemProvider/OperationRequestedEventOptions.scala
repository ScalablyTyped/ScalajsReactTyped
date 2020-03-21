package typingsJapgolly.chrome.chrome.fileSystemProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationRequestedEventOptions extends RequestedEventOptions {
  /** An ID of the request to which this operation is related. */
  var operationRequestId: Double
}

object OperationRequestedEventOptions {
  @scala.inline
  def apply(fileSystemId: String, operationRequestId: Double, requestId: Double): OperationRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OperationRequestedEventOptions]
  }
}

