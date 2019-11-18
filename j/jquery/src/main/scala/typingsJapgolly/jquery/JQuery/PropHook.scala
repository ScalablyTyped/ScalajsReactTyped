package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
  * @since 1.8
  */
// Workaround for TypeScript 2.3 which does not have support for weak types handling.
trait PropHook[TElement]
  extends /* key */ StringDictionary[scala.Nothing] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  var get: js.UndefOr[js.Function1[/* tween */ Tween[TElement], _]] = js.undefined
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  var set: js.UndefOr[js.Function1[/* tween */ Tween[TElement], Unit]] = js.undefined
}

object PropHook {
  @scala.inline
  def apply[TElement](
    StringDictionary: /* key */ StringDictionary[scala.Nothing] = null,
    get: /* tween */ Tween[TElement] => CallbackTo[_] = null,
    set: /* tween */ Tween[TElement] => Callback = null
  ): PropHook[TElement] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1((t0: /* tween */ typingsJapgolly.jquery.JQuery.Tween[TElement]) => get(t0).runNow()))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction1((t0: /* tween */ typingsJapgolly.jquery.JQuery.Tween[TElement]) => set(t0).runNow()))
    __obj.asInstanceOf[PropHook[TElement]]
  }
}

