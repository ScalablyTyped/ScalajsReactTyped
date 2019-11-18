package typingsJapgolly.node.inspectorMod.Debugger

import typingsJapgolly.node.inspectorMod.Runtime.ExceptionDetails
import typingsJapgolly.node.inspectorMod.Runtime.RemoteObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluateOnCallFrameReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Object wrapper for the evaluation result.
    */
  var result: RemoteObject
}

object EvaluateOnCallFrameReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): EvaluateOnCallFrameReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateOnCallFrameReturnType]
  }
}

