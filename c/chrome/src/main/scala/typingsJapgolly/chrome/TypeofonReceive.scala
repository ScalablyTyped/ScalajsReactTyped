package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.serial.onReceive.OnReceiveInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofonReceive extends js.Object {
  def addListener(callback: js.Function1[/* info */ OnReceiveInfo, Unit]): Unit
}

object TypeofonReceive {
  @scala.inline
  def apply(addListener: js.Function1[/* info */ OnReceiveInfo, Unit] => Callback): TypeofonReceive = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(js.Any.fromFunction1((t0: js.Function1[
  /* info */ typingsJapgolly.chrome.chrome.serial.onReceive.OnReceiveInfo, 
  scala.Unit]) => addListener(t0).runNow()))
    __obj.asInstanceOf[TypeofonReceive]
  }
}

