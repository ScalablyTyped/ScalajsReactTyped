package typingsJapgolly.styletronReact.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackInfo extends js.Object {
  var message: String
  var stack: js.UndefOr[String] = js.undefined
  var stacktrace: js.Any
}

object StackInfo {
  @scala.inline
  def apply(message: String, stacktrace: js.Any, stack: String = null): StackInfo = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], stacktrace = stacktrace.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackInfo]
  }
}

