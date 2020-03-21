package typingsJapgolly.minimistOptions.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[key: string] : minimist-options.minimist-options.Type | minimist-options.minimist-options.Option} & {[ K in 'stopEarly' | 'unknown' | '--' ]:? minimist.minimist.Opts[K]} */
trait Options extends /* key */ StringDictionary[Type | Option] {
  var `--`: js.UndefOr[Boolean] = js.undefined
  var stopEarly: js.UndefOr[Boolean] = js.undefined
  var unknown: js.UndefOr[js.Function1[/* arg */ String, Boolean]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    `--`: js.UndefOr[Boolean] = js.undefined,
    StringDictionary: /* key */ StringDictionary[Type | Option] = null,
    stopEarly: js.UndefOr[Boolean] = js.undefined,
    unknown: /* arg */ String => CallbackTo[Boolean] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(`--`)) __obj.updateDynamic("--")(`--`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (!js.isUndefined(stopEarly)) __obj.updateDynamic("stopEarly")(stopEarly.asInstanceOf[js.Any])
    if (unknown != null) __obj.updateDynamic("unknown")(js.Any.fromFunction1((t0: /* arg */ java.lang.String) => unknown(t0).runNow()))
    __obj.asInstanceOf[Options]
  }
}

