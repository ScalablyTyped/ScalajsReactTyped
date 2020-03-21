package typingsJapgolly.socketIoFile.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketIOFile extends js.Object {
  def on(event: String, cb: js.Function1[/* fileInfo */ FileInfo, Unit]): Unit
}

object SocketIOFile {
  @scala.inline
  def apply(on: (String, js.Function1[/* fileInfo */ FileInfo, Unit]) => Callback): SocketIOFile = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: java.lang.String, t1: js.Function1[/* fileInfo */ typingsJapgolly.socketIoFile.mod.FileInfo, scala.Unit]) => on(t0, t1).runNow()))
    __obj.asInstanceOf[SocketIOFile]
  }
}

