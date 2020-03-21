package typingsJapgolly.victory

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfter extends js.Object {
  var after: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonAfter {
  @scala.inline
  def apply(
    after: /* datum */ js.Any => CallbackTo[AnimationStyle] = null,
    before: /* datum */ js.Any => CallbackTo[AnimationStyle] = null,
    duration: Int | Double = null
  ): AnonAfter = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(js.Any.fromFunction1((t0: /* datum */ js.Any) => after(t0).runNow()))
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* datum */ js.Any) => before(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAfter]
  }
}

