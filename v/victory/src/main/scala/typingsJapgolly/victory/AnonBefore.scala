package typingsJapgolly.victory

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.victory.mod.AnimationStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBefore extends js.Object {
  var before: js.UndefOr[js.Function1[/* datum */ js.Any, AnimationStyle]] = js.undefined
  var duration: js.UndefOr[Double] = js.undefined
}

object AnonBefore {
  @scala.inline
  def apply(before: /* datum */ js.Any => CallbackTo[AnimationStyle] = null, duration: Int | Double = null): AnonBefore = {
    val __obj = js.Dynamic.literal()
    if (before != null) __obj.updateDynamic("before")(js.Any.fromFunction1((t0: /* datum */ js.Any) => before(t0).runNow()))
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBefore]
  }
}

