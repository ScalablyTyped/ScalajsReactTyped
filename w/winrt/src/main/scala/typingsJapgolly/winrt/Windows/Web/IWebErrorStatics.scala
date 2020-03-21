package typingsJapgolly.winrt.Windows.Web

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebErrorStatics extends js.Object {
  def getStatus(hresult: Double): WebErrorStatus
}

object IWebErrorStatics {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[WebErrorStatus]): IWebErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[IWebErrorStatics]
  }
}

