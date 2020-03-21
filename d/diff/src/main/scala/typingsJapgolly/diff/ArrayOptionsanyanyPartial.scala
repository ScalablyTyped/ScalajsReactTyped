package typingsJapgolly.diff

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.diff.mod.Callback
import typingsJapgolly.diff.mod.Change
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined diff.diff.ArrayOptions<any, any> & std.Partial<diff.diff.CallbackOptions> */
trait ArrayOptionsanyanyPartial extends js.Object {
  var callback: js.UndefOr[Callback] = js.undefined
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, Boolean]] = js.undefined
  /**
    * `true` to ignore casing difference.
    * @default false
    */
  var ignoreCase: js.UndefOr[Boolean] = js.undefined
}

object ArrayOptionsanyanyPartial {
  @scala.inline
  def apply(
    callback: (/* err */ js.UndefOr[scala.Nothing], /* value */ js.UndefOr[js.Array[Change]]) => japgolly.scalajs.react.Callback = null,
    comparator: (/* left */ js.Any, /* right */ js.Any) => CallbackTo[Boolean] = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined
  ): ArrayOptionsanyanyPartial = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2((t0: /* err */ js.UndefOr[scala.Nothing], t1: /* value */ js.UndefOr[js.Array[typingsJapgolly.diff.mod.Change]]) => callback(t0, t1).runNow()))
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2((t0: /* left */ js.Any, t1: /* right */ js.Any) => comparator(t0, t1).runNow()))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptionsanyanyPartial]
  }
}

