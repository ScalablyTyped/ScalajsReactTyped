package typingsJapgolly.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunScriptReturnType extends js.Object {
  /**
    * Exception details.
    */
  var exceptionDetails: js.UndefOr[ExceptionDetails] = js.undefined
  /**
    * Run result.
    */
  var result: RemoteObject
}

object RunScriptReturnType {
  @scala.inline
  def apply(result: RemoteObject, exceptionDetails: ExceptionDetails = null): RunScriptReturnType = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    if (exceptionDetails != null) __obj.updateDynamic("exceptionDetails")(exceptionDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunScriptReturnType]
  }
}

