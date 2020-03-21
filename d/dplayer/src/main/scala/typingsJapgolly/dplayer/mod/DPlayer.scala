package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DPlayer extends js.Object {
  var danmaku: Danmaku
  var events: js.Any
  var fullScreen: FullScreen
  var video: HTMLVideoElement
  def destroy(): Unit
  def notice(text: String, time: Double, opacity: Double): Unit
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit
  def pause(): Unit
  def play(): Unit
  def seek(time: Double): Unit
  def speed(rate: Double): Unit
  def switchQuality(index: Double): Unit
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit
  def toggle(): Unit
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit
}

object DPlayer {
  @scala.inline
  def apply(
    danmaku: Danmaku,
    destroy: Callback,
    events: js.Any,
    fullScreen: FullScreen,
    notice: (String, Double, Double) => Callback,
    on: (DPlayerEvents, js.Function0[Unit]) => Callback,
    pause: Callback,
    play: Callback,
    seek: Double => Callback,
    speed: Double => Callback,
    switchQuality: Double => Callback,
    switchVideo: (DPlayerVideo, DPlayerDanmaku) => Callback,
    toggle: Callback,
    video: HTMLVideoElement,
    volume: (Double, Boolean, Boolean) => Callback
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku.asInstanceOf[js.Any], events = events.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], video = video.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("notice")(js.Any.fromFunction3((t0: java.lang.String, t1: scala.Double, t2: scala.Double) => notice(t0, t1, t2).runNow()))
    __obj.updateDynamic("on")(js.Any.fromFunction2((t0: typingsJapgolly.dplayer.mod.DPlayerEvents, t1: js.Function0[scala.Unit]) => on(t0, t1).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("speed")(js.Any.fromFunction1((t0: scala.Double) => speed(t0).runNow()))
    __obj.updateDynamic("switchQuality")(js.Any.fromFunction1((t0: scala.Double) => switchQuality(t0).runNow()))
    __obj.updateDynamic("switchVideo")(js.Any.fromFunction2((t0: typingsJapgolly.dplayer.mod.DPlayerVideo, t1: typingsJapgolly.dplayer.mod.DPlayerDanmaku) => switchVideo(t0, t1).runNow()))
    __obj.updateDynamic("toggle")(toggle.toJsFn)
    __obj.updateDynamic("volume")(js.Any.fromFunction3((t0: scala.Double, t1: scala.Boolean, t2: scala.Boolean) => volume(t0, t1, t2).runNow()))
    __obj.asInstanceOf[DPlayer]
  }
}

