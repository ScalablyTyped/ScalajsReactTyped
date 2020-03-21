package typingsJapgolly.webBluetooth

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharacteristicEventHandlers extends js.Object {
  def oncharacteristicvaluechanged(ev: Event_): js.Any
}

object CharacteristicEventHandlers {
  @scala.inline
  def apply(oncharacteristicvaluechanged: Event_ => CallbackTo[js.Any]): CharacteristicEventHandlers = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("oncharacteristicvaluechanged")(js.Any.fromFunction1((t0: typingsJapgolly.std.Event_) => oncharacteristicvaluechanged(t0).runNow()))
    __obj.asInstanceOf[CharacteristicEventHandlers]
  }
}

