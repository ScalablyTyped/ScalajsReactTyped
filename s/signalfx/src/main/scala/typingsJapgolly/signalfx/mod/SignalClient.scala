package typingsJapgolly.signalfx.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignalClient extends js.Object {
  def send(report: SignalReport): Unit
}

object SignalClient {
  @scala.inline
  def apply(send: SignalReport => Callback): SignalClient = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("send")(js.Any.fromFunction1((t0: typingsJapgolly.signalfx.mod.SignalReport) => send(t0).runNow()))
    __obj.asInstanceOf[SignalClient]
  }
}

