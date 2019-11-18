package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionThrownEventDataType extends js.Object {
  var exceptionDetails: ExceptionDetails
  /**
    * Timestamp of the exception.
    */
  var timestamp: Timestamp
}

object ExceptionThrownEventDataType {
  @scala.inline
  def apply(exceptionDetails: ExceptionDetails, timestamp: Timestamp): ExceptionThrownEventDataType = {
    val __obj = js.Dynamic.literal(exceptionDetails = exceptionDetails.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExceptionThrownEventDataType]
  }
}

