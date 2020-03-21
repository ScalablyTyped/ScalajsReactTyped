package typingsJapgolly.knockoutDeferredUpdates

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Deferred extender
trait KnockoutExtenders extends js.Object {
  def deferred(target: js.Any, value: Boolean): js.Any
}

object KnockoutExtenders {
  @scala.inline
  def apply(deferred: (js.Any, Boolean) => CallbackTo[js.Any]): KnockoutExtenders = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deferred")(js.Any.fromFunction2((t0: js.Any, t1: scala.Boolean) => deferred(t0, t1).runNow()))
    __obj.asInstanceOf[KnockoutExtenders]
  }
}

