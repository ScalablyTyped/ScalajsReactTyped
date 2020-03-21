package typingsJapgolly.roll.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidInputError extends Error {
  @JSName("name")
  var name_InvalidInputError: typingsJapgolly.roll.rollStrings.InvalidInputError
}

object InvalidInputError {
  @scala.inline
  def apply(message: String, name: typingsJapgolly.roll.rollStrings.InvalidInputError, stack: String = null): InvalidInputError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidInputError]
  }
}

