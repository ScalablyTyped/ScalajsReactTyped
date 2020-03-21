package typingsJapgolly.pino

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pino.mod.WriteFn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDictlogLevel extends /* logLevel */ StringDictionary[WriteFn] {
  var debug: js.UndefOr[WriteFn] = js.undefined
  var error: js.UndefOr[WriteFn] = js.undefined
  var fatal: js.UndefOr[WriteFn] = js.undefined
  var info: js.UndefOr[WriteFn] = js.undefined
  var trace: js.UndefOr[WriteFn] = js.undefined
  var warn: js.UndefOr[WriteFn] = js.undefined
}

object AnonDictlogLevel {
  @scala.inline
  def apply(
    StringDictionary: /* logLevel */ StringDictionary[WriteFn] = null,
    debug: /* o */ js.Object => Callback = null,
    error: /* o */ js.Object => Callback = null,
    fatal: /* o */ js.Object => Callback = null,
    info: /* o */ js.Object => Callback = null,
    trace: /* o */ js.Object => Callback = null,
    warn: /* o */ js.Object => Callback = null
  ): AnonDictlogLevel = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1((t0: /* o */ js.Object) => debug(t0).runNow()))
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1((t0: /* o */ js.Object) => error(t0).runNow()))
    if (fatal != null) __obj.updateDynamic("fatal")(js.Any.fromFunction1((t0: /* o */ js.Object) => fatal(t0).runNow()))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1((t0: /* o */ js.Object) => info(t0).runNow()))
    if (trace != null) __obj.updateDynamic("trace")(js.Any.fromFunction1((t0: /* o */ js.Object) => trace(t0).runNow()))
    if (warn != null) __obj.updateDynamic("warn")(js.Any.fromFunction1((t0: /* o */ js.Object) => warn(t0).runNow()))
    __obj.asInstanceOf[AnonDictlogLevel]
  }
}

