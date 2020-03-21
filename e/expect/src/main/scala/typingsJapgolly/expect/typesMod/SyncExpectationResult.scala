package typingsJapgolly.expect.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncExpectationResult extends js.Object {
  var pass: Boolean
  def message(): String
}

object SyncExpectationResult {
  @scala.inline
  def apply(message: CallbackTo[String], pass: Boolean): SyncExpectationResult = {
    val __obj = js.Dynamic.literal(pass = pass.asInstanceOf[js.Any])
    __obj.updateDynamic("message")(message.toJsFn)
    __obj.asInstanceOf[SyncExpectationResult]
  }
}

