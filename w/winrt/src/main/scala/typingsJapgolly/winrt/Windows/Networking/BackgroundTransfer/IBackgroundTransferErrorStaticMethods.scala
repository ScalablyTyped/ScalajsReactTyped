package typingsJapgolly.winrt.Windows.Networking.BackgroundTransfer

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.winrt.Windows.Web.WebErrorStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBackgroundTransferErrorStaticMethods extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus
}

object IBackgroundTransferErrorStaticMethods {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[WebErrorStatus]): IBackgroundTransferErrorStaticMethods = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[IBackgroundTransferErrorStaticMethods]
  }
}

