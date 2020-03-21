package typingsJapgolly.createjsLib

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0 extends js.Object {
  def handleEvent(eventObj: js.Object): Unit
}

object Anon0 {
  @scala.inline
  def apply(handleEvent: js.Object => Callback): Anon0 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handleEvent")(js.Any.fromFunction1((t0: js.Object) => handleEvent(t0).runNow()))
    __obj.asInstanceOf[Anon0]
  }
}

