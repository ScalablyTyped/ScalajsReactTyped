package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressMethods extends js.Object {
  var getProgress: js.UndefOr[js.Function0[Double]] = js.undefined
  var setProgress: js.UndefOr[js.Function1[/* progress */ Double, this.type]] = js.undefined
}

object ProgressMethods {
  @scala.inline
  def apply(
    getProgress: js.UndefOr[CallbackTo[Double]] = js.undefined,
    setProgress: /* progress */ Double => CallbackTo[ProgressMethods] = null
  ): ProgressMethods = {
    val __obj = js.Dynamic.literal()
    getProgress.foreach(p => __obj.updateDynamic("getProgress")(p.toJsFn))
    if (setProgress != null) __obj.updateDynamic("setProgress")(js.Any.fromFunction1((t0: /* progress */ scala.Double) => setProgress(t0).runNow()))
    __obj.asInstanceOf[ProgressMethods]
  }
}

