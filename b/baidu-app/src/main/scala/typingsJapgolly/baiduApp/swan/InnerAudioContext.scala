package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.AnonPosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: Double
  /** 是否循环播放，默认 false */
  var loop: js.UndefOr[Boolean] = js.undefined
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: Boolean
  /** 音频的数据链接，用于直接播放。 */
  var src: js.UndefOr[String] = js.undefined
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: js.UndefOr[Double] = js.undefined
  /** 音量，范围 0~1。 */
  var volume: js.UndefOr[Double] = js.undefined
  /** 销毁当前实例 */
  def destroy(): Unit
  /** 取消监听 onCanplay 事件 */
  def offCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onEnded 事件 */
  def offEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onError 事件 */
  def offError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 offPause 事件 */
  def offPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onPlay 事件 */
  def offPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onSeeked  事件 */
  def offSeeked(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onSeeking  事件 */
  def offSeeking(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onStop 事件 */
  def offStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onTimeUpdate 事件 */
  def offTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 取消监听 onWaiting 事件 */
  def offWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频完成 seek 操作事件 */
  def onSeeked(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频进行 seek 操作事件 */
  def onSeeking(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  /** 暂停 */
  def pause(): Unit
  /** 播放 */
  def play(): Unit
  /** 跳转到指定位置，单位 s */
  def seek(options: AnonPosition): Unit
  /** 停止 */
  def stop(): Unit
}

object InnerAudioContext {
  @scala.inline
  def apply(
    currentTime: Double,
    destroy: Callback,
    duration: Double,
    offCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offError: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offSeeked: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offSeeking: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    offWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onSeeked: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onSeeking: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    seek: AnonPosition => Callback,
    stop: Callback,
    autoplay: js.UndefOr[Boolean] = js.undefined,
    loop: js.UndefOr[Boolean] = js.undefined,
    obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined,
    src: String = null,
    startTime: Int | Double = null,
    volume: Int | Double = null
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("offCanplay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offCanplay(t0).runNow()))
    __obj.updateDynamic("offEnded")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offEnded(t0).runNow()))
    __obj.updateDynamic("offError")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offError(t0).runNow()))
    __obj.updateDynamic("offPause")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offPause(t0).runNow()))
    __obj.updateDynamic("offPlay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offPlay(t0).runNow()))
    __obj.updateDynamic("offSeeked")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offSeeked(t0).runNow()))
    __obj.updateDynamic("offSeeking")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offSeeking(t0).runNow()))
    __obj.updateDynamic("offStop")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offStop(t0).runNow()))
    __obj.updateDynamic("offTimeUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offTimeUpdate(t0).runNow()))
    __obj.updateDynamic("offWaiting")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => offWaiting(t0).runNow()))
    __obj.updateDynamic("onCanplay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onCanplay(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onEnded(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onError(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onPause(t0).runNow()))
    __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onPlay(t0).runNow()))
    __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onSeeked(t0).runNow()))
    __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onSeeking(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onStop(t0).runNow()))
    __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onTimeUpdate(t0).runNow()))
    __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.baiduApp.swan.ErrCodeResponse, scala.Unit]) => onWaiting(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.AnonPosition) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    if (!js.isUndefined(autoplay)) __obj.updateDynamic("autoplay")(autoplay.asInstanceOf[js.Any])
    if (!js.isUndefined(loop)) __obj.updateDynamic("loop")(loop.asInstanceOf[js.Any])
    if (!js.isUndefined(obeyMuteSwitch)) __obj.updateDynamic("obeyMuteSwitch")(obeyMuteSwitch.asInstanceOf[js.Any])
    if (src != null) __obj.updateDynamic("src")(src.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
}

