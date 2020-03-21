package typingsJapgolly.sauronjs.serviceMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Service extends js.Object {
  var broadcastSubject: js.Any
  def broadcast(event: String, data: js.Any): Unit
}

object Service {
  @scala.inline
  def apply(broadcast: (String, js.Any) => Callback, broadcastSubject: js.Any): Service = {
    val __obj = js.Dynamic.literal(broadcastSubject = broadcastSubject.asInstanceOf[js.Any])
    __obj.updateDynamic("broadcast")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Any) => broadcast(t0, t1).runNow()))
    __obj.asInstanceOf[Service]
  }
}

