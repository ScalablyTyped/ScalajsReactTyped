package typingsJapgolly.betterSqlite3.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var fileMustExist: js.UndefOr[Boolean] = js.undefined
  var memory: js.UndefOr[Boolean] = js.undefined
  var readonly: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var verbose: js.UndefOr[js.Function2[/* message */ js.UndefOr[js.Any], /* repeated */ js.Any, Unit]] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    fileMustExist: js.UndefOr[Boolean] = js.undefined,
    memory: js.UndefOr[Boolean] = js.undefined,
    readonly: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    verbose: (/* message */ js.UndefOr[js.Any], /* repeated */ js.Any) => Callback = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fileMustExist)) __obj.updateDynamic("fileMustExist")(fileMustExist.asInstanceOf[js.Any])
    if (!js.isUndefined(memory)) __obj.updateDynamic("memory")(memory.asInstanceOf[js.Any])
    if (!js.isUndefined(readonly)) __obj.updateDynamic("readonly")(readonly.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (verbose != null) __obj.updateDynamic("verbose")(js.Any.fromFunction2((t0: /* message */ js.UndefOr[js.Any], t1: /* repeated */ js.Any) => verbose(t0, t1).runNow()))
    __obj.asInstanceOf[Options]
  }
}

