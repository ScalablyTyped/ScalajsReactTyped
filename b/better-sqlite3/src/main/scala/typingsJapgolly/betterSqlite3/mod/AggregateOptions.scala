package typingsJapgolly.betterSqlite3.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AggregateOptions extends RegistrationOptions {
  var inverse: js.UndefOr[js.Function2[/* total */ js.Any, /* dropped */ js.Any, _]] = js.undefined
  var result: js.UndefOr[js.Function1[/* total */ js.Any, _]] = js.undefined
  var start: js.UndefOr[js.Any] = js.undefined
  def step(total: js.Any, next: js.Any): js.Any
}

object AggregateOptions {
  @scala.inline
  def apply(
    step: (js.Any, js.Any) => CallbackTo[js.Any],
    deterministic: js.UndefOr[Boolean] = js.undefined,
    inverse: (/* total */ js.Any, /* dropped */ js.Any) => CallbackTo[js.Any] = null,
    result: /* total */ js.Any => CallbackTo[js.Any] = null,
    safeIntegers: js.UndefOr[Boolean] = js.undefined,
    start: js.Any = null,
    varargs: js.UndefOr[Boolean] = js.undefined
  ): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("step")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => step(t0, t1).runNow()))
    if (!js.isUndefined(deterministic)) __obj.updateDynamic("deterministic")(deterministic.asInstanceOf[js.Any])
    if (inverse != null) __obj.updateDynamic("inverse")(js.Any.fromFunction2((t0: /* total */ js.Any, t1: /* dropped */ js.Any) => inverse(t0, t1).runNow()))
    if (result != null) __obj.updateDynamic("result")(js.Any.fromFunction1((t0: /* total */ js.Any) => result(t0).runNow()))
    if (!js.isUndefined(safeIntegers)) __obj.updateDynamic("safeIntegers")(safeIntegers.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (!js.isUndefined(varargs)) __obj.updateDynamic("varargs")(varargs.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateOptions]
  }
}

