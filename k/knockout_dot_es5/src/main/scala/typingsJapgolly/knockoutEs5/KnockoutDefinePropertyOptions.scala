package typingsJapgolly.knockoutEs5

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KnockoutDefinePropertyOptions extends js.Object {
  var set: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
  def get(): js.Any
}

object KnockoutDefinePropertyOptions {
  @scala.inline
  def apply(get: CallbackTo[js.Any], set: /* value */ js.Any => Callback = null): KnockoutDefinePropertyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(get.toJsFn)
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* value */ js.Any) => set(t0).runNow()))
    __obj.asInstanceOf[KnockoutDefinePropertyOptions]
  }
}

