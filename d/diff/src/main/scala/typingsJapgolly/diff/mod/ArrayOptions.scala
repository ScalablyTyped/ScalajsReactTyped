package typingsJapgolly.diff.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions[TLeft, TRight] extends BaseOptions {
  /**
    * Comparator for custom equality checks.
    */
  var comparator: js.UndefOr[js.Function2[/* left */ TLeft, /* right */ TRight, Boolean]] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply[TLeft, TRight](
    comparator: (/* left */ TLeft, /* right */ TRight) => CallbackTo[Boolean] = null,
    ignoreCase: js.UndefOr[Boolean] = js.undefined
  ): ArrayOptions[TLeft, TRight] = {
    val __obj = js.Dynamic.literal()
    if (comparator != null) __obj.updateDynamic("comparator")(js.Any.fromFunction2((t0: /* left */ TLeft, t1: /* right */ TRight) => comparator(t0, t1).runNow()))
    if (!js.isUndefined(ignoreCase)) __obj.updateDynamic("ignoreCase")(ignoreCase.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions[TLeft, TRight]]
  }
}

