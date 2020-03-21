package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISocketErrorStatics extends js.Object {
  def getStatus(hresult: Double): SocketErrorStatus
}

object ISocketErrorStatics {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[SocketErrorStatus]): ISocketErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[ISocketErrorStatics]
  }
}

