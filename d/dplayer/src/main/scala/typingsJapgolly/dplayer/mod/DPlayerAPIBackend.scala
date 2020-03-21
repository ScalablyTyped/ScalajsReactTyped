package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayerAPIBackend extends js.Object {
  def read(endpoint: js.Any, callback: js.Function0[Unit]): Unit
  def send(endpoint: js.Any, danmakuData: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
}

object DPlayerAPIBackend {
  @scala.inline
  def apply(
    read: (js.Any, js.Function0[Unit]) => Callback,
    send: (js.Any, DPlayerDanmakuItem, js.Function0[Unit]) => Callback
  ): DPlayerAPIBackend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("read")(js.Any.fromFunction2((t0: js.Any, t1: js.Function0[scala.Unit]) => read(t0, t1).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction3((t0: js.Any, t1: typingsJapgolly.dplayer.mod.DPlayerDanmakuItem, t2: js.Function0[scala.Unit]) => send(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DPlayerAPIBackend]
  }
}

