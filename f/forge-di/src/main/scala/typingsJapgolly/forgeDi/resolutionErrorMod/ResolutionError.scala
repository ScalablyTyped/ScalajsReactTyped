package typingsJapgolly.forgeDi.resolutionErrorMod

import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolutionError extends Error

object ResolutionError {
  @scala.inline
  def apply(message: String, name: String, stack: String = null): ResolutionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolutionError]
  }
}

