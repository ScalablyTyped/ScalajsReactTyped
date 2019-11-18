package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CallFunctionOnReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Call result.
    */
  var result: RemoteObject
}

object CallFunctionOnReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): CallFunctionOnReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallFunctionOnReturnType]
  }
}

