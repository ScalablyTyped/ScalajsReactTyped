package typingsJapgolly.scroll.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollOptions extends js.Object {
  /**
    * Animation duration
    * @default 350
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Ease function
    * @default easeInOut
    */
  var ease: js.UndefOr[js.Function1[/* time */ Double, Double]] = js.undefined
}

object ScrollOptions {
  @scala.inline
  def apply(duration: Int | Double = null, ease: /* time */ Double => CallbackTo[Double] = null): ScrollOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (ease != null) __obj.updateDynamic("ease")(js.Any.fromFunction1((t0: /* time */ scala.Double) => ease(t0).runNow()))
    __obj.asInstanceOf[ScrollOptions]
  }
}

