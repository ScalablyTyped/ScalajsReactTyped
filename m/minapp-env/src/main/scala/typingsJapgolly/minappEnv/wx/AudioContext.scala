package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioContext extends js.Object {
  /** [AudioContext.pause()](AudioContext.pause.md)
    *
    * 暂停音频。 */
  def pause(): Unit
  /** [AudioContext.play()](AudioContext.play.md)
    *
    * 播放音频。 */
  def play(): Unit
  /** [AudioContext.seek(number position)](AudioContext.seek.md)
    *
    * 跳转到指定位置。 */
  def seek(/** 跳转位置，单位 s */
  position: Double): Unit
  /** [AudioContext.setSrc(string src)](AudioContext.setSrc.md)
    *
    * 设置音频地址 */
  def setSrc(/** 音频地址 */
  src: String): Unit
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

