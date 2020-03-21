package typingsJapgolly.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OperationError extends js.Object {
  // Operation error code.
  var code: js.UndefOr[String] = js.undefined
  // Operation error message.
  var message: js.UndefOr[String] = js.undefined
}

object OperationError {
  @scala.inline
  def apply(code: String = null, message: String = null): OperationError = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationError]
  }
}

