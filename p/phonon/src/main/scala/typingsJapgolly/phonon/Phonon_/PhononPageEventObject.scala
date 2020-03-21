package typingsJapgolly.phonon.Phonon_

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononPageEventObject extends js.Object {
  def addEvent(event: String, callback: js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]): Unit
}

object PhononPageEventObject {
  @scala.inline
  def apply(addEvent: (String, js.Function1[/* parameter */ js.UndefOr[js.Any], Unit]) => Callback): PhononPageEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addEvent")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* parameter */ js.UndefOr[js.Any], scala.Unit]) => addEvent(t0, t1).runNow()))
    __obj.asInstanceOf[PhononPageEventObject]
  }
}

