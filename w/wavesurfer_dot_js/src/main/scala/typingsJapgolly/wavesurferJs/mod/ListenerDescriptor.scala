package typingsJapgolly.wavesurferJs.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenerDescriptor extends js.Object {
  var name: String
  def callback(args: js.Any*): Unit
  def un(): Unit
}

object ListenerDescriptor {
  @scala.inline
  def apply(callback: /* repeated */ js.Any => Callback, name: String, un: Callback): ListenerDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(js.Any.fromFunction1((t0: /* repeated */ js.Any) => callback(t0).runNow()))
    __obj.updateDynamic("un")(un.toJsFn)
    __obj.asInstanceOf[ListenerDescriptor]
  }
}

