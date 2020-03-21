package typingsJapgolly.kolite

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KoLiteCommandOptions extends js.Object {
  var canExecute: js.UndefOr[js.Function1[/* isExecuting */ Boolean, _]] = js.undefined
  def execute(args: js.Any*): js.Any
}

object KoLiteCommandOptions {
  @scala.inline
  def apply(
    execute: /* repeated */ js.Any => CallbackTo[js.Any],
    canExecute: /* isExecuting */ Boolean => CallbackTo[js.Any] = null
  ): KoLiteCommandOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("execute")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => execute(t0).runNow()))
    if (canExecute != null) __obj.updateDynamic("canExecute")(js.Any.fromFunction1((t0: /* isExecuting */ scala.Boolean) => canExecute(t0).runNow()))
    __obj.asInstanceOf[KoLiteCommandOptions]
  }
}

