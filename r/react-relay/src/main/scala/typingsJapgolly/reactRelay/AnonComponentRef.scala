package typingsJapgolly.reactRelay

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentRef extends js.Object {
  var componentRef: js.UndefOr[js.Function1[/* ref */ js.Any, Unit]] = js.undefined
}

object AnonComponentRef {
  @scala.inline
  def apply(componentRef: /* ref */ js.Any => Callback = null): AnonComponentRef = {
    val __obj = js.Dynamic.literal()
    if (componentRef != null) __obj.updateDynamic("componentRef")(js.Any.fromFunction1((t0: /* ref */ js.Any) => componentRef(t0).runNow()))
    __obj.asInstanceOf[AnonComponentRef]
  }
}

