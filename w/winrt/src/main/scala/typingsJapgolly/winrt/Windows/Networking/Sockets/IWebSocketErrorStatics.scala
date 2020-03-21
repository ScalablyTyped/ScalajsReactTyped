package typingsJapgolly.winrt.Windows.Networking.Sockets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketErrorStatics extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus
}

object IWebSocketErrorStatics {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[WebErrorStatus]): IWebSocketErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[IWebSocketErrorStatics]
  }
}

