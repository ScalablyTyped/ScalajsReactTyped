package typingsJapgolly.ensureError.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NonError extends Error {
  @JSName("name")
  var name_NonError: typingsJapgolly.ensureError.ensureErrorStrings.NonError
}

object NonError {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.ensureError.ensureErrorStrings.NonError,
    stack: String = null
  ): NonError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonError]
  }
}

