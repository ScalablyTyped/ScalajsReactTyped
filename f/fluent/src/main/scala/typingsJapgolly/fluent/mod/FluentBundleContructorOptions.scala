package typingsJapgolly.fluent.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluentBundleContructorOptions extends js.Object {
  var functions: js.UndefOr[js.Object] = js.undefined
  var transform: js.UndefOr[js.Function1[/* repeated */ js.Any, _]] = js.undefined
  var useIsolating: js.UndefOr[Boolean] = js.undefined
}

object FluentBundleContructorOptions {
  @scala.inline
  def apply(
    functions: js.Object = null,
    transform: /* repeated */ js.Any => CallbackTo[js.Any] = null,
    useIsolating: js.UndefOr[Boolean] = js.undefined
  ): FluentBundleContructorOptions = {
    val __obj = js.Dynamic.literal()
    if (functions != null) __obj.updateDynamic("functions")(functions.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => transform(t0).runNow()))
    if (!js.isUndefined(useIsolating)) __obj.updateDynamic("useIsolating")(useIsolating.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluentBundleContructorOptions]
  }
}

