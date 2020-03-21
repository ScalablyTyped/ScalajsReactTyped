package typingsJapgolly.koPlus.KoPlus

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandOptions extends js.Object {
  // [required] sets the command action method
  var action: js.Function
  // [optional] function to determine if command can be executed
  var canExecute: js.UndefOr[js.Function0[Boolean]] = js.undefined
  // [optional] context to use in the command
  var context: js.UndefOr[js.Any] = js.undefined
}

object CommandOptions {
  @scala.inline
  def apply(
    action: js.Function,
    canExecute: js.UndefOr[CallbackTo[Boolean]] = js.undefined,
    context: js.Any = null
  ): CommandOptions = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    canExecute.foreach(p => __obj.updateDynamic("canExecute")(p.toJsFn))
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandOptions]
  }
}

