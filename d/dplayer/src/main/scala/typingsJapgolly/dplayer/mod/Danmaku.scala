package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Danmaku extends js.Object {
  def clear(): Unit
  def draw(danmaku: DPlayerDanmakuItem): Unit
  def hide(): Unit
  def opacity(percentage: Double): Unit
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
  def show(): Unit
}

object Danmaku {
  @scala.inline
  def apply(
    clear: Callback,
    draw: DPlayerDanmakuItem => Callback,
    hide: Callback,
    opacity: Double => Callback,
    send: (DPlayerDanmakuItem, js.Function0[Unit]) => Callback,
    show: Callback
  ): Danmaku = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("draw")(js.Any.fromFunction1((t0: typingsJapgolly.dplayer.mod.DPlayerDanmakuItem) => draw(t0).runNow()))
    __obj.updateDynamic("hide")(hide.toJsFn)
    __obj.updateDynamic("opacity")(js.Any.fromFunction1((t0: scala.Double) => opacity(t0).runNow()))
    __obj.updateDynamic("send")(js.Any.fromFunction2((t0: typingsJapgolly.dplayer.mod.DPlayerDanmakuItem, t1: js.Function0[scala.Unit]) => send(t0, t1).runNow()))
    __obj.updateDynamic("show")(show.toJsFn)
    __obj.asInstanceOf[Danmaku]
  }
}

