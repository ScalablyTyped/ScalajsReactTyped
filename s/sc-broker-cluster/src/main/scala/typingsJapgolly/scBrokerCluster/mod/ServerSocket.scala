package typingsJapgolly.scBrokerCluster.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSocket extends js.Object {
  var id: String
  def emit(eventName: String, args: js.Any*): Unit
}

object ServerSocket {
  @scala.inline
  def apply(emit: (String, /* repeated */ js.Any) => Callback, id: String): ServerSocket = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("emit")(js.Any.fromFunction2((t0: java.lang.String, t1: /* repeated */ js.Any) => emit(t0, t1).runNow()))
    __obj.asInstanceOf[ServerSocket]
  }
}

