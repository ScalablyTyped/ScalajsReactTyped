package typingsJapgolly.sugar.sugarjs.Object

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryStringOptions[T, U] extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var transform: js.UndefOr[js.Function3[/* key */ String, /* val */ T, /* obj */ js.Object, U]] = js.undefined
}

object QueryStringOptions {
  @scala.inline
  def apply[T, U](
    deep: js.UndefOr[Boolean] = js.undefined,
    prefix: String = null,
    separator: String = null,
    transform: (/* key */ String, /* val */ T, /* obj */ js.Object) => CallbackTo[U] = null
  ): QueryStringOptions[T, U] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (separator != null) __obj.updateDynamic("separator")(separator.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction3((t0: /* key */ java.lang.String, t1: /* val */ T, t2: /* obj */ js.Object) => transform(t0, t1, t2).runNow()))
    __obj.asInstanceOf[QueryStringOptions[T, U]]
  }
}

