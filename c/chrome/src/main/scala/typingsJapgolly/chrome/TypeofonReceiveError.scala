package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofonReceiveError extends js.Object {
  val OnReceiveErrorEnum: AnonBreak
  def addListener(callback: js.Function1[/* info */ OnReceiveErrorInfo, Unit]): Unit
}

object TypeofonReceiveError {
  @scala.inline
  def apply(
    OnReceiveErrorEnum: AnonBreak,
    addListener: js.Function1[/* info */ OnReceiveErrorInfo, Unit] => Callback
  ): TypeofonReceiveError = {
    val __obj = js.Dynamic.literal(OnReceiveErrorEnum = OnReceiveErrorEnum.asInstanceOf[js.Any])
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function1[
  /* info */ typingsJapgolly.chrome.chrome.serial.onReceiveError.OnReceiveErrorInfo, 
  scala.Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[TypeofonReceiveError]
  }
}

