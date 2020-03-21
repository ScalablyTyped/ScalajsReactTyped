package typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Framework[THandler] extends js.Object {
  /** @public */
  def check(args: js.Any*): Boolean
  /** @public */
  def handle(base: StandardHandler): THandler
}

object Framework {
  @scala.inline
  def apply[THandler](
    check: /* repeated */ js.Any => CallbackTo[Boolean],
    handle: StandardHandler => CallbackTo[THandler]
  ): Framework[THandler] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("check")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => check(t0).runNow()))
    __obj.updateDynamic("handle")(js.Any.fromFunction1((t0: typingsJapgolly.actionsOnGoogle.frameworkFrameworkMod.StandardHandler) => handle(t0).runNow()))
    __obj.asInstanceOf[Framework[THandler]]
  }
}

