package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContext extends js.Object {
  /** [VideoContext.exitFullScreen()](VideoContext.exitFullScreen.md)
    *
    * 退出全屏
    *
    * 最低基础库： `1.4.0` */
  def exitFullScreen(): Unit
  /** [VideoContext.hideStatusBar()](VideoContext.hideStatusBar.md)
    *
    * 隐藏状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def hideStatusBar(): Unit
  /** [VideoContext.pause()](VideoContext.pause.md)
    *
    * 暂停视频 */
  def pause(): Unit
  /** [VideoContext.play()](VideoContext.play.md)
    *
    * 播放视频 */
  def play(): Unit
  /** [VideoContext.playbackRate(number rate)](VideoContext.playbackRate.md)
    *
    * 设置倍速播放
    *
    * 最低基础库： `1.4.0` */
  def playbackRate(/** 倍率，支持 0.5/0.8/1.0/1.25/1.5 */
  rate: Double): Unit
  /** [VideoContext.requestFullScreen(Object object)](VideoContext.requestFullScreen.md)
    *
    * 进入全屏
    *
    * 最低基础库： `1.4.0` */
  def requestFullScreen(option: VideoContextRequestFullScreenOption): Unit
  /** [VideoContext.seek(number position)](VideoContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转到的位置，单位 s */
  position: Double): Unit
  /** [VideoContext.sendDanmu(Object data)](VideoContext.sendDanmu.md)
    *
    * 发送弹幕 */
  def sendDanmu(/** 弹幕内容 */
  data: Danmu): Unit
  /** [VideoContext.showStatusBar()](VideoContext.showStatusBar.md)
    *
    * 显示状态栏，仅在iOS全屏下有效
    *
    * 最低基础库： `2.1.0` */
  def showStatusBar(): Unit
  /** [VideoContext.stop()](VideoContext.stop.md)
    *
    * 停止视频
    *
    * 最低基础库： `1.7.0` */
  def stop(): Unit
}

object VideoContext {
  @scala.inline
  def apply(
    exitFullScreen: Callback,
    hideStatusBar: Callback,
    pause: Callback,
    play: Callback,
    playbackRate: Double => Callback,
    requestFullScreen: VideoContextRequestFullScreenOption => Callback,
    seek: Double => Callback,
    sendDanmu: Danmu => Callback,
    showStatusBar: Callback,
    stop: Callback
  ): VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exitFullScreen")(exitFullScreen.toJsFn)
    __obj.updateDynamic("hideStatusBar")(hideStatusBar.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("playbackRate")(js.Any.fromFunction1((t0: scala.Double) => playbackRate(t0).runNow()))
    __obj.updateDynamic("requestFullScreen")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.VideoContextRequestFullScreenOption) => requestFullScreen(t0).runNow()))
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("sendDanmu")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.Danmu) => sendDanmu(t0).runNow()))
    __obj.updateDynamic("showStatusBar")(showStatusBar.toJsFn)
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[VideoContext]
  }
}

