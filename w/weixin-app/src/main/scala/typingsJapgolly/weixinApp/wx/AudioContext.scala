package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// 媒体-----音频组件控制
/**
	 * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
	 */
trait AudioContext extends js.Object {
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
  def seek(position: Double): Unit
  /**
  		 * 音频的地址
  		 */
  def setSrc(src: String): Unit
}

object AudioContext {
  @scala.inline
  def apply(pause: Callback, play: Callback, seek: Double => Callback, setSrc: String => Callback): AudioContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("setSrc")(js.Any.fromFunction1((t0: java.lang.String) => setSrc(t0).runNow()))
    __obj.asInstanceOf[AudioContext]
  }
}

