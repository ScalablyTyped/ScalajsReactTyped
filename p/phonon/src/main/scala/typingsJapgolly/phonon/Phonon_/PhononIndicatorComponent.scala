package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononIndicatorComponent extends PhononDialogComponent {
  def close(): Unit
  def open(): Unit
}

object PhononIndicatorComponent {
  @scala.inline
  def apply(
    close: Callback,
    on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => CallbackTo[PhononDialogComponent],
    open: Callback
  ): PhononIndicatorComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("open")(open.toJsFn)
    __obj.asInstanceOf[PhononIndicatorComponent]
  }
}

