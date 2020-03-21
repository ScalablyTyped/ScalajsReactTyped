package typingsJapgolly.winrt.Windows.Data.Json

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IJsonErrorStatics extends js.Object {
  def getStatus(hresult: Double): JsonErrorStatus
}

object IJsonErrorStatics {
  @scala.inline
  def apply(getStatus: Double => CallbackTo[JsonErrorStatus]): IJsonErrorStatics = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getStatus")(js.Any.fromFunction1((t0: scala.Double) => getStatus(t0).runNow()))
    __obj.asInstanceOf[IJsonErrorStatics]
  }
}

