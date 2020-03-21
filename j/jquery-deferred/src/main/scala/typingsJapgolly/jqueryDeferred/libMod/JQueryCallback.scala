package typingsJapgolly.jqueryDeferred.libMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JQueryCallback extends js.Object {
  def add(callbacks: js.Any*): js.Any
  def disable(): js.Any
  def disabled(): Boolean
  def empty(): js.Any
  def fire(arguments: js.Any*): js.Any
  def fireWith(context: js.Any, args: js.Any*): js.Any
  def fired(): Boolean
  def has(callback: js.Any): Boolean
  def lock(): js.Any
  def locked(): Boolean
  def remove(callbacks: js.Any*): js.Any
}

object JQueryCallback {
  @scala.inline
  def apply(
    add: /* repeated */ js.Any => CallbackTo[js.Any],
    disable: CallbackTo[js.Any],
    disabled: CallbackTo[Boolean],
    empty: CallbackTo[js.Any],
    fire: /* repeated */ js.Any => CallbackTo[js.Any],
    fireWith: (js.Any, /* repeated */ js.Any) => CallbackTo[js.Any],
    fired: CallbackTo[Boolean],
    has: js.Any => CallbackTo[Boolean],
    lock: CallbackTo[js.Any],
    locked: CallbackTo[Boolean],
    remove: /* repeated */ js.Any => CallbackTo[js.Any]
  ): JQueryCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => add(t0).runNow()))
    __obj.updateDynamic("disable")(disable.toJsFn)
    __obj.updateDynamic("disabled")(disabled.toJsFn)
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("fire")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => fire(t0).runNow()))
    __obj.updateDynamic("fireWith")(js.Any.fromFunction2((t0: js.Any, t1: /* repeated */ js.Any) => fireWith(t0, t1).runNow()))
    __obj.updateDynamic("fired")(fired.toJsFn)
    __obj.updateDynamic("has")(js.Any.fromFunction1((t0: js.Any) => has(t0).runNow()))
    __obj.updateDynamic("lock")(lock.toJsFn)
    __obj.updateDynamic("locked")(locked.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => remove(t0).runNow()))
    __obj.asInstanceOf[JQueryCallback]
  }
}

