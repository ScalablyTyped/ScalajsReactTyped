package typingsJapgolly.freedom.freedom.UdpSocket

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Implementation extends js.Object {
  def bind(address: String, port: Double, continuation: js.Function0[Unit]): Unit
  def destroy(continuation: js.Function0[Unit]): Unit
  def getInfo(continuation: js.Function1[/* socketInfo */ SocketInfo, Unit]): Unit
  def sendTo(
    data: scala.scalajs.js.typedarray.ArrayBuffer,
    address: String,
    port: Double,
    continuation: js.Function1[/* bytesWritten */ Double, Unit]
  ): Unit
}

object Implementation {
  @scala.inline
  def apply(
    bind: (String, Double, js.Function0[Unit]) => Callback,
    destroy: js.Function0[Unit] => Callback,
    getInfo: js.Function1[/* socketInfo */ SocketInfo, Unit] => Callback,
    sendTo: (scala.scalajs.js.typedarray.ArrayBuffer, String, Double, js.Function1[/* bytesWritten */ Double, Unit]) => Callback
  ): Implementation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bind")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: js.Function0[scala.Unit]) => bind(t0, t1, t2).runNow()))
    __obj.updateDynamic("destroy")(js.Any.fromFunction1((t0: js.Function0[scala.Unit]) => destroy(t0).runNow()))
    __obj.updateDynamic("getInfo")(js.Any.fromFunction1((t0: js.Function1[/* socketInfo */ typingsJapgolly.freedom.freedom.UdpSocket.SocketInfo, scala.Unit]) => getInfo(t0).runNow()))
    __obj.updateDynamic("sendTo")(js.Any.fromFunction4((t0: scala.scalajs.js.typedarray.ArrayBuffer, t1: java.lang.String, t2: scala.Double, t3: js.Function1[/* bytesWritten */ scala.Double, scala.Unit]) => sendTo(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[Implementation]
  }
}

