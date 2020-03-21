package typingsJapgolly.lobibox.LobiboxModule

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvents extends js.Object {
  var progressComplete: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
  var progressUpdated: js.UndefOr[js.Function1[/* lobibox */ LobiboxStatic, Unit]] = js.undefined
}

object ProgressEvents {
  @scala.inline
  def apply(
    progressComplete: /* lobibox */ LobiboxStatic => Callback = null,
    progressUpdated: /* lobibox */ LobiboxStatic => Callback = null
  ): ProgressEvents = {
    val __obj = js.Dynamic.literal()
    if (progressComplete != null) __obj.updateDynamic("progressComplete")(js.Any.fromFunction1((t0: /* lobibox */ typingsJapgolly.lobibox.LobiboxModule.LobiboxStatic) => progressComplete(t0).runNow()))
    if (progressUpdated != null) __obj.updateDynamic("progressUpdated")(js.Any.fromFunction1((t0: /* lobibox */ typingsJapgolly.lobibox.LobiboxModule.LobiboxStatic) => progressUpdated(t0).runNow()))
    __obj.asInstanceOf[ProgressEvents]
  }
}

