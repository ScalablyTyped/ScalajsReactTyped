package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认 false */
  var autoplay: Boolean
  /**  音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲 */
  val buffered: Double
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: Double
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: Double
  /** 是否循环播放，默认 false */
  var loop: Boolean
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: Boolean
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: Boolean
  /** 音频的数据链接，用于直接播放。 */
  var src: String
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: Double
  /** 销毁当前实例 */
  def destroy(): Unit
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
  def seek(position: Double): Unit
  /** 停止 */
  def stop(): Unit
}

object InnerAudioContext {
  @scala.inline
  def apply(
    autoplay: Boolean,
    buffered: Double,
    currentTime: Double,
    destroy: Callback,
    duration: Double,
    loop: Boolean,
    obeyMuteSwitch: Boolean,
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
    seek: Double => Callback,
    src: String,
    startTime: Double,
    stop: Callback
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("onCanplay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onCanplay(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onEnded(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onError(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onPause(t0).runNow()))
    __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onPlay(t0).runNow()))
    __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onSeeked(t0).runNow()))
    __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onSeeking(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onStop(t0).runNow()))
    __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onTimeUpdate(t0).runNow()))
    __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: js.Function1[/* res */ typingsJapgolly.weixinApp.wx.ErrCodeResponse, scala.Unit]) => onWaiting(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[InnerAudioContext]
  }
}

