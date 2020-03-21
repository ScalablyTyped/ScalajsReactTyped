package typingsJapgolly.depd.mod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeprecationError extends Error {
  @JSName("name")
  val name_DeprecationError: typingsJapgolly.depd.depdStrings.DeprecationError
  var namespace: String
  @JSName("stack")
  var stack_DeprecationError: String
}

object DeprecationError {
  @scala.inline
  def apply(
    message: String,
    name: typingsJapgolly.depd.depdStrings.DeprecationError,
    namespace: String,
    stack: String
  ): DeprecationError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeprecationError]
  }
}

