package typingsJapgolly.signals.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalWrapper[T] extends js.Object {
  var Signal: typingsJapgolly.signals.mod.Signal[T]
}

object SignalWrapper {
  @scala.inline
  def apply[T](Signal: Signal[T]): SignalWrapper[T] = {
    val __obj = js.Dynamic.literal(Signal = Signal.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SignalWrapper[T]]
  }
}

