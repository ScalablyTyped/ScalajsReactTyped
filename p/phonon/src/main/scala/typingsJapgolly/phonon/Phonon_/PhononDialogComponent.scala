package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononDialogComponent extends js.Object {
  def on(event: String, callback: js.Function1[/* value */ js.UndefOr[js.Any], Unit]): PhononDialogComponent
}

object PhononDialogComponent {
  @scala.inline
  def apply(
    on: (String, js.Function1[/* value */ js.UndefOr[js.Any], Unit]) => CallbackTo[PhononDialogComponent]
  ): PhononDialogComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* value */ js.UndefOr[js.Any], scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[PhononDialogComponent]
  }
}

