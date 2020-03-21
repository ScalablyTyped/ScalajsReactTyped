package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononNotifComponent extends js.Object {
  def hide(): PhononNotifComponent
  def setColor(color: PhononColor): PhononNotifComponent
  def show(): PhononNotifComponent
}

object PhononNotifComponent {
  @scala.inline
  def apply(
    hide: CallbackTo[PhononNotifComponent],
    setColor: PhononColor => CallbackTo[PhononNotifComponent],
    show: CallbackTo[PhononNotifComponent]
  ): PhononNotifComponent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("setColor")(js.Any.fromFunction1((t0: typingsJapgolly.phonon.Phonon_.PhononColor) => setColor(t0).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[PhononNotifComponent]
  }
}

