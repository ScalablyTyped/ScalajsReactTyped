package typingsJapgolly.ionic

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProgress extends js.Object {
  var progress: js.UndefOr[js.Function2[/* loaded */ Double, /* total */ Double, Unit]] = js.undefined
}

object AnonProgress {
  @scala.inline
  def apply(progress: (/* loaded */ Double, /* total */ Double) => Callback = null): AnonProgress = {
    val __obj = js.Dynamic.literal()
    if (progress != null) __obj.updateDynamic("progress")(js.Any.fromFunction2((t0: /* loaded */ scala.Double, t1: /* total */ scala.Double) => progress(t0, t1).runNow()))
    __obj.asInstanceOf[AnonProgress]
  }
}

