package typingsJapgolly.pCancelable.mod

import typingsJapgolly.pCancelable.pCancelableBooleans.`true`
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelErrorClass extends Error {
  val isCanceled: `true`
  @JSName("name")
  val name_CancelErrorClass: typingsJapgolly.pCancelable.pCancelableStrings.CancelError
}

object CancelErrorClass {
  @scala.inline
  def apply(
    isCanceled: `true`,
    message: String,
    name: typingsJapgolly.pCancelable.pCancelableStrings.CancelError,
    stack: String = null
  ): CancelErrorClass = {
    val __obj = js.Dynamic.literal(isCanceled = isCanceled.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelErrorClass]
  }
}

