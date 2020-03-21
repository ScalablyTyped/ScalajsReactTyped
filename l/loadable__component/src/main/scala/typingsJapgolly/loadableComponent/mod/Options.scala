package typingsJapgolly.loadableComponent.mod

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options[T] extends js.Object {
  var cacheKey: js.UndefOr[js.Function1[/* props */ T, _]] = js.undefined
  var fallback: js.UndefOr[Element] = js.undefined
  var ssr: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply[T](
    cacheKey: /* props */ T => CallbackTo[js.Any] = null,
    fallback: VdomElement = null,
    ssr: js.UndefOr[Boolean] = js.undefined
  ): Options[T] = {
    val __obj = js.Dynamic.literal()
    if (cacheKey != null) __obj.updateDynamic("cacheKey")(js.Any.fromFunction1((t0: /* props */ T) => cacheKey(t0).runNow()))
    if (fallback != null) __obj.updateDynamic("fallback")(fallback.rawElement.asInstanceOf[js.Any])
    if (!js.isUndefined(ssr)) __obj.updateDynamic("ssr")(ssr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options[T]]
  }
}

