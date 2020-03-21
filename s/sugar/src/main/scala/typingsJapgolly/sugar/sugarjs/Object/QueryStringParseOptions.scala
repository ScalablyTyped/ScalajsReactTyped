package typingsJapgolly.sugar.sugarjs.Object

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringParseOptions[T, U] extends js.Object {
  var auto: js.UndefOr[Boolean] = js.undefined
  var deep: js.UndefOr[Boolean] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
}

object QueryStringParseOptions {
  @scala.inline
  def apply[T, U](
    auto: js.UndefOr[Boolean] = js.undefined,
    deep: js.UndefOr[Boolean] = js.undefined,
    separator: String = null,
    transform: (/* key */ String, /* val */ T, /* obj */ js.Object) => CallbackTo[U] = null
  ): QueryStringParseOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(auto)) __obj.updateDynamic("auto")(auto.asInstanceOf[js.Any])
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3((t0: /* key */ java.lang.String, t1: /* val */ T, t2: /* obj */ js.Object) => transform(t0, t1, t2).runNow()))
    __obj.asInstanceOf[QueryStringParseOptions[T, U]]
  }
}

