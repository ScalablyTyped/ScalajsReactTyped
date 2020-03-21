package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoContext extends js.Object {
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit
  /**
    * 暂停
    */
  def pause(): Unit
  /**
    * 播放
    */
  def play(): Unit
  /**
    * 设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(): Unit
  /**
    * 进入全屏，可传入{direction}参数（1.7.0起支持），详见video组件文档
    */
  def requestFullScreen(): Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(): Unit
}

object VideoContext {
  @scala.inline
  def apply(
    exitFullScreen: Callback,
    pause: Callback,
    play: Callback,
    playbackRate: Callback,
    requestFullScreen: Callback,
    seek: Callback,
    sendDanmu: Callback
  ): VideoContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exitFullScreen")(exitFullScreen.toJsFn)
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("playbackRate")(playbackRate.toJsFn)
    __obj.updateDynamic("requestFullScreen")(requestFullScreen.toJsFn)
    __obj.updateDynamic("seek")(seek.toJsFn)
    __obj.updateDynamic("sendDanmu")(sendDanmu.toJsFn)
    __obj.asInstanceOf[VideoContext]
  }
}

