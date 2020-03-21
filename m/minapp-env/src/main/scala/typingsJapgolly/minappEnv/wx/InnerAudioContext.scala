package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** InnerAudioContext 实例，可通过 [wx.createInnerAudioContext](https://developers.weixin.qq.com/miniprogram/dev/api/media/audio/wx.createInnerAudioContext.html) 接口获取实例。
*
* **支持格式**
*
*
* | 格式 | iOS  | Android |
* | ---- | ---- | ------- |
* | flac | x    | √       |
* | m4a  | x    | √       |
* | ogg  | x    | √       |
* | ape  | x    | √       |
* | amr  | x    | √       |
* | wma  | x    | √       |
* | wav  | √    | √       |
* | mp3  | √    | √       |
* | mp4  | x    | √       |
* | aac  | √    | √       |
* | aiff | √    | x       |
* | caf  | √    | x       |
*
* **示例代码**
*
*
* ```js
const innerAudioContext = wx.createInnerAudioContext()
innerAudioContext.autoplay = true
innerAudioContext.src = 'http://ws.stream.qqmusic.qq.com/M500001VfvsJ21xFqb.mp3?guid=ffffffff82def4af4b12b3cd9337d5e7&uin=346897220&vkey=6292F51E1E384E061FF02C31F716658E5C81F5594D561F2E88B854E81CAAB7806D5E4F103E55D33C16F3FAC506D1AB172DE8600B37E43FAD&fromtag=46'
innerAudioContext.onPlay(() => {
  console.log('开始播放')
})
innerAudioContext.onError((res) => {
  console.log(res.errMsg)
  console.log(res.errCode)
})
``` */
trait InnerAudioContext extends js.Object {
  /** 是否自动开始播放，默认为 `false` */
  var autoplay: Boolean
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲（只读） */
  var buffered: Double
  /** 当前音频的播放位置（单位 s）。只有在当前有合法的 src 时返回，时间保留小数点后 6 位（只读） */
  var currentTime: Double
  /** 当前音频的长度（单位 s）。只有在当前有合法的 src 时返回（只读） */
  var duration: Double
  /** 是否循环播放，默认为 `false` */
  var loop: Boolean
  /** 是否遵循系统静音开关，默认为 `true`。当此参数为 `false` 时，即使用户打开了静音开关，也能继续发出声音 */
  var obeyMuteSwitch: Boolean
  /** 当前是是否暂停或停止状态（只读） */
  var paused: Boolean
  /** 音频资源的地址，用于直接播放。{% version('2.2.3') %} 开始支持云文件ID */
  var src: String
  /** 开始播放的位置（单位：s），默认为 0 */
  var startTime: Double
  /** 音量。范围 0~1。默认为 1
    *
    * 最低基础库： `1.9.90` */
  var volume: Double
  /** [InnerAudioContext.destroy()](InnerAudioContext.destroy.md)
    *
    * 销毁当前实例 */
  def destroy(): Unit
  /** [InnerAudioContext.offCanplay(function callback)](InnerAudioContext.offCanplay.md)
    *
    * 取消监听音频进入可以播放状态的事件
    *
    * 最低基础库： `1.9.0` */
  def offCanplay(/** 音频进入可以播放状态的事件的回调函数 */
  callback: OffCanplayCallback): Unit
  /** [InnerAudioContext.offEnded(function callback)](InnerAudioContext.offEnded.md)
    *
    * 取消监听音频自然播放至结束的事件
    *
    * 最低基础库： `1.9.0` */
  def offEnded(/** 音频自然播放至结束的事件的回调函数 */
  callback: OffEndedCallback): Unit
  /** [InnerAudioContext.offError(function callback)](InnerAudioContext.offError.md)
    *
    * 取消监听音频播放错误事件
    *
    * 最低基础库： `1.9.0` */
  def offError(/** 音频播放错误事件的回调函数 */
  callback: OffErrorCallback): Unit
  /** [InnerAudioContext.offPause(function callback)](InnerAudioContext.offPause.md)
    *
    * 取消监听音频暂停事件
    *
    * 最低基础库： `1.9.0` */
  def offPause(/** 音频暂停事件的回调函数 */
  callback: OffPauseCallback): Unit
  /** [InnerAudioContext.offPlay(function callback)](InnerAudioContext.offPlay.md)
    *
    * 取消监听音频播放事件
    *
    * 最低基础库： `1.9.0` */
  def offPlay(/** 音频播放事件的回调函数 */
  callback: OffPlayCallback): Unit
  /** [InnerAudioContext.offSeeked(function callback)](InnerAudioContext.offSeeked.md)
    *
    * 取消监听音频完成跳转操作的事件
    *
    * 最低基础库： `1.9.0` */
  def offSeeked(/** 音频完成跳转操作的事件的回调函数 */
  callback: OffSeekedCallback): Unit
  /** [InnerAudioContext.offSeeking(function callback)](InnerAudioContext.offSeeking.md)
    *
    * 取消监听音频进行跳转操作的事件
    *
    * 最低基础库： `1.9.0` */
  def offSeeking(/** 音频进行跳转操作的事件的回调函数 */
  callback: OffSeekingCallback): Unit
  /** [InnerAudioContext.offStop(function callback)](InnerAudioContext.offStop.md)
    *
    * 取消监听音频停止事件
    *
    * 最低基础库： `1.9.0` */
  def offStop(/** 音频停止事件的回调函数 */
  callback: OffStopCallback): Unit
  /** [InnerAudioContext.offTimeUpdate(function callback)](InnerAudioContext.offTimeUpdate.md)
    *
    * 取消监听音频播放进度更新事件
    *
    * 最低基础库： `1.9.0` */
  def offTimeUpdate(/** 音频播放进度更新事件的回调函数 */
  callback: OffTimeUpdateCallback): Unit
  /** [InnerAudioContext.offWaiting(function callback)](InnerAudioContext.offWaiting.md)
    *
    * 取消监听音频加载中事件
    *
    * 最低基础库： `1.9.0` */
  def offWaiting(/** 音频加载中事件的回调函数 */
  callback: OffWaitingCallback): Unit
  /** [InnerAudioContext.onCanplay(function callback)](InnerAudioContext.onCanplay.md)
    *
    * 监听音频进入可以播放状态的事件。但不保证后面可以流畅播放 */
  def onCanplay(/** 音频进入可以播放状态的事件的回调函数 */
  callback: InnerAudioContextOnCanplayCallback): Unit
  /** [InnerAudioContext.onEnded(function callback)](InnerAudioContext.onEnded.md)
    *
    * 监听音频自然播放至结束的事件 */
  def onEnded(/** 音频自然播放至结束的事件的回调函数 */
  callback: InnerAudioContextOnEndedCallback): Unit
  /** [InnerAudioContext.onError(function callback)](InnerAudioContext.onError.md)
    *
    * 监听音频播放错误事件 */
  def onError(/** 音频播放错误事件的回调函数 */
  callback: InnerAudioContextOnErrorCallback): Unit
  /** [InnerAudioContext.onPause(function callback)](InnerAudioContext.onPause.md)
    *
    * 监听音频暂停事件 */
  def onPause(/** 音频暂停事件的回调函数 */
  callback: InnerAudioContextOnPauseCallback): Unit
  /** [InnerAudioContext.onPlay(function callback)](InnerAudioContext.onPlay.md)
    *
    * 监听音频播放事件 */
  def onPlay(/** 音频播放事件的回调函数 */
  callback: InnerAudioContextOnPlayCallback): Unit
  /** [InnerAudioContext.onSeeked(function callback)](InnerAudioContext.onSeeked.md)
    *
    * 监听音频完成跳转操作的事件 */
  def onSeeked(/** 音频完成跳转操作的事件的回调函数 */
  callback: InnerAudioContextOnSeekedCallback): Unit
  /** [InnerAudioContext.onSeeking(function callback)](InnerAudioContext.onSeeking.md)
    *
    * 监听音频进行跳转操作的事件 */
  def onSeeking(/** 音频进行跳转操作的事件的回调函数 */
  callback: InnerAudioContextOnSeekingCallback): Unit
  /** [InnerAudioContext.onStop(function callback)](InnerAudioContext.onStop.md)
    *
    * 监听音频停止事件 */
  def onStop(/** 音频停止事件的回调函数 */
  callback: InnerAudioContextOnStopCallback): Unit
  /** [InnerAudioContext.onTimeUpdate(function callback)](InnerAudioContext.onTimeUpdate.md)
    *
    * 监听音频播放进度更新事件 */
  def onTimeUpdate(/** 音频播放进度更新事件的回调函数 */
  callback: InnerAudioContextOnTimeUpdateCallback): Unit
  /** [InnerAudioContext.onWaiting(function callback)](InnerAudioContext.onWaiting.md)
    *
    * 监听音频加载中事件。当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(/** 音频加载中事件的回调函数 */
  callback: InnerAudioContextOnWaitingCallback): Unit
  /** [InnerAudioContext.pause()](InnerAudioContext.pause.md)
    *
    * 暂停。暂停后的音频再播放会从暂停处开始播放 */
  def pause(): Unit
  /** [InnerAudioContext.play()](InnerAudioContext.play.md)
    *
    * 播放 */
  def play(): Unit
  /** [InnerAudioContext.seek(number position)](InnerAudioContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转的时间，单位 s。精确到小数点后 3 位，即支持 ms 级别精确度 */
  position: Double): Unit
  /** [InnerAudioContext.stop()](InnerAudioContext.stop.md)
    *
    * 停止。停止后的音频再播放会从头开始播放。 */
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
    offCanplay: OffCanplayCallback => Callback,
    offEnded: OffEndedCallback => Callback,
    offError: OffErrorCallback => Callback,
    offPause: OffPauseCallback => Callback,
    offPlay: OffPlayCallback => Callback,
    offSeeked: OffSeekedCallback => Callback,
    offSeeking: OffSeekingCallback => Callback,
    offStop: OffStopCallback => Callback,
    offTimeUpdate: OffTimeUpdateCallback => Callback,
    offWaiting: OffWaitingCallback => Callback,
    onCanplay: InnerAudioContextOnCanplayCallback => Callback,
    onEnded: InnerAudioContextOnEndedCallback => Callback,
    onError: InnerAudioContextOnErrorCallback => Callback,
    onPause: InnerAudioContextOnPauseCallback => Callback,
    onPlay: InnerAudioContextOnPlayCallback => Callback,
    onSeeked: InnerAudioContextOnSeekedCallback => Callback,
    onSeeking: InnerAudioContextOnSeekingCallback => Callback,
    onStop: InnerAudioContextOnStopCallback => Callback,
    onTimeUpdate: InnerAudioContextOnTimeUpdateCallback => Callback,
    onWaiting: InnerAudioContextOnWaitingCallback => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    seek: Double => Callback,
    src: String,
    startTime: Double,
    stop: Callback,
    volume: Double
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], paused = paused.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], volume = volume.asInstanceOf[js.Any])
    __obj.updateDynamic("destroy")(destroy.toJsFn)
    __obj.updateDynamic("offCanplay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffCanplayCallback) => offCanplay(t0).runNow()))
    __obj.updateDynamic("offEnded")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffEndedCallback) => offEnded(t0).runNow()))
    __obj.updateDynamic("offError")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffErrorCallback) => offError(t0).runNow()))
    __obj.updateDynamic("offPause")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffPauseCallback) => offPause(t0).runNow()))
    __obj.updateDynamic("offPlay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffPlayCallback) => offPlay(t0).runNow()))
    __obj.updateDynamic("offSeeked")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffSeekedCallback) => offSeeked(t0).runNow()))
    __obj.updateDynamic("offSeeking")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffSeekingCallback) => offSeeking(t0).runNow()))
    __obj.updateDynamic("offStop")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffStopCallback) => offStop(t0).runNow()))
    __obj.updateDynamic("offTimeUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffTimeUpdateCallback) => offTimeUpdate(t0).runNow()))
    __obj.updateDynamic("offWaiting")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.OffWaitingCallback) => offWaiting(t0).runNow()))
    __obj.updateDynamic("onCanplay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnCanplayCallback) => onCanplay(t0).runNow()))
    __obj.updateDynamic("onEnded")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnEndedCallback) => onEnded(t0).runNow()))
    __obj.updateDynamic("onError")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnErrorCallback) => onError(t0).runNow()))
    __obj.updateDynamic("onPause")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnPauseCallback) => onPause(t0).runNow()))
    __obj.updateDynamic("onPlay")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnPlayCallback) => onPlay(t0).runNow()))
    __obj.updateDynamic("onSeeked")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnSeekedCallback) => onSeeked(t0).runNow()))
    __obj.updateDynamic("onSeeking")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnSeekingCallback) => onSeeking(t0).runNow()))
    __obj.updateDynamic("onStop")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnStopCallback) => onStop(t0).runNow()))
    __obj.updateDynamic("onTimeUpdate")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnTimeUpdateCallback) => onTimeUpdate(t0).runNow()))
    __obj.updateDynamic("onWaiting")(js.Any.fromFunction1((t0: typingsJapgolly.minappEnv.wx.InnerAudioContextOnWaitingCallback) => onWaiting(t0).runNow()))
    __obj.updateDynamic("pause")(pause.toJsFn)
    __obj.updateDynamic("play")(play.toJsFn)
    __obj.updateDynamic("seek")(js.Any.fromFunction1((t0: scala.Double) => seek(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[InnerAudioContext]
  }
}

