package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// region Val hooks
// #region Val hooks
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait ValHook[TElement]
  extends /* key */ StringDictionary[scala.Nothing] {
  var get: js.UndefOr[js.Function1[/* elem */ TElement, _]] = js.undefined
  var set: js.UndefOr[js.Function2[/* elem */ TElement, /* value */ js.Any, _]] = js.undefined
}

object ValHook {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* key */ StringDictionary[scala.Nothing] = null,
    get: /* elem */ TElement => CallbackTo[_] = null,
    set: (/* elem */ TElement, /* value */ js.Any) => CallbackTo[_] = null
  ): ValHook[TElement] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* elem */ TElement) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2((t0: /* elem */ TElement, t1: /* value */ js.Any) => set(t0, t1).runNow()))
    __obj.asInstanceOf[ValHook[TElement]]
  }
}

