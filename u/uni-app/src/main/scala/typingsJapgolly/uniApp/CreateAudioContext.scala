package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateAudioContext extends js.Object {
  /**
    * 暂停
    */
  def pause(): Unit
  /**
    * 播放
    */
  def play(): Unit
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  /**
    * 音频的地址
    */
  def setSrc(): Unit
}

object CreateAudioContext {
  @scala.inline
  def apply(pause: Callback, play: Callback, seek: Callback, setSrc: Callback): CreateAudioContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(seek.toJsFn)
    __obj.updateDynamic("setSrc")(setSrc.toJsFn)
    __obj.asInstanceOf[CreateAudioContext]
  }
}

