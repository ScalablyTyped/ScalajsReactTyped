package typingsJapgolly.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[LogFn] = js.undefined
  var deprecate: js.UndefOr[js.Function2[/* method */ String, /* alternative */ String, Unit]] = js.undefined
  var error: js.UndefOr[LogFn] = js.undefined
  var warn: js.UndefOr[LogFn] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: /* message */ String => japgolly.scalajs.react.Callback = null,
    deprecate: (/* method */ String, /* alternative */ String) => japgolly.scalajs.react.Callback = null,
    error: /* message */ String => japgolly.scalajs.react.Callback = null,
    warn: /* message */ String => japgolly.scalajs.react.Callback = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => debug(t0).runNow()))
    if (deprecate != null) __obj.updateDynamic("deprecate")(js.Any.fromFunction2((t0: /* method */ java.lang.String, t1: /* alternative */ java.lang.String) => deprecate(t0, t1).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => error(t0).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* message */ java.lang.String) => warn(t0).runNow()))
    __obj.asInstanceOf[Logger]
  }
}

