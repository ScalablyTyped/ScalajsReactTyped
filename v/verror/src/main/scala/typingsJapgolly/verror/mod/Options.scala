package typingsJapgolly.verror.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var cause: js.UndefOr[js.Error | Null] = js.undefined
  var constructorOpt: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var info: js.UndefOr[Info] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    cause: js.Error = null,
    constructorOpt: /* repeated */ js.Any => Callback = null,
    info: Info = null,
    name: String = null,
    strict: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (cause != null) __obj.updateDynamic("cause")(cause.asInstanceOf[js.Any])
    if (constructorOpt != null) __obj.updateDynamic("constructorOpt")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => constructorOpt(t0).runNow()))
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

