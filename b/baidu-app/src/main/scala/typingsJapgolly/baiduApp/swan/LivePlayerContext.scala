package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LivePlayerContext extends js.Object {
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[_, _]): Unit
  /** 静音 */
  def mute(options: BaseOptions[_, _]): Unit
  /** 暂停 */
  def pause(options: BaseOptions[_, _]): Unit
  /** 播放 */
  def play(options: BaseOptions[_, _]): Unit
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit
  /** 回复 */
  def resume(options: BaseOptions[_, _]): Unit
  /** 停止 */
  def stop(options: BaseOptions[_, _]): Unit
}

object LivePlayerContext {
  @scala.inline
  def apply(
    exitFullScreen: BaseOptions[js.Any, js.Any] => Callback,
    mute: BaseOptions[js.Any, js.Any] => Callback,
    pause: BaseOptions[js.Any, js.Any] => Callback,
    play: BaseOptions[js.Any, js.Any] => Callback,
    requestFullScreen: RequestFullScreenOptions => Callback,
    resume: BaseOptions[js.Any, js.Any] => Callback,
    stop: BaseOptions[js.Any, js.Any] => Callback
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("exitFullScreen")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => exitFullScreen(t0).runNow()))
    __obj.updateDynamic("mute")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => mute(t0).runNow()))
    __obj.updateDynamic("pause")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => pause(t0).runNow()))
    __obj.updateDynamic("play")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => play(t0).runNow()))
    __obj.updateDynamic("requestFullScreen")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.RequestFullScreenOptions) => requestFullScreen(t0).runNow()))
    __obj.updateDynamic("resume")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => resume(t0).runNow()))
    __obj.updateDynamic("stop")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.BaseOptions[js.Any, js.Any]) => stop(t0).runNow()))
    __obj.asInstanceOf[LivePlayerContext]
  }
}

