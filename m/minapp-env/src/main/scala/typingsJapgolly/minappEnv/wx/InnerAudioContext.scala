package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
trait InnerAudioContext extends StObject {
  
  /** 是否自动开始播放，默认为 `false` */
  var autoplay: Boolean
  
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲（只读） */
  var buffered: Double
  
  /** 当前音频的播放位置（单位 s）。只有在当前有合法的 src 时返回，时间保留小数点后 6 位（只读） */
  var currentTime: Double
  
  /** [InnerAudioContext.destroy()](InnerAudioContext.destroy.md)
    *
    * 销毁当前实例 */
  def destroy(): Unit
  
  /** 当前音频的长度（单位 s）。只有在当前有合法的 src 时返回（只读） */
  var duration: Double
  
  /** 是否循环播放，默认为 `false` */
  var loop: Boolean
  
  /** 是否遵循系统静音开关，默认为 `true`。当此参数为 `false` 时，即使用户打开了静音开关，也能继续发出声音 */
  var obeyMuteSwitch: Boolean
  
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
  
  /** 当前是是否暂停或停止状态（只读） */
  var paused: Boolean
  
  /** [InnerAudioContext.play()](InnerAudioContext.play.md)
    *
    * 播放 */
  def play(): Unit
  
  /** [InnerAudioContext.seek(number position)](InnerAudioContext.seek.md)
    *
    * 跳转到指定位置 */
  def seek(/** 跳转的时间，单位 s。精确到小数点后 3 位，即支持 ms 级别精确度 */
  position: Double): Unit
  
  /** 音频资源的地址，用于直接播放。{% version('2.2.3') %} 开始支持云文件ID */
  var src: String
  
  /** 开始播放的位置（单位：s），默认为 0 */
  var startTime: Double
  
  /** [InnerAudioContext.stop()](InnerAudioContext.stop.md)
    *
    * 停止。停止后的音频再播放会从头开始播放。 */
  def stop(): Unit
  
  /** 音量。范围 0~1。默认为 1
    *
    * 最低基础库： `1.9.90` */
  var volume: Double
}
object InnerAudioContext {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], destroy = destroy.toJsFn, duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], offCanplay = js.Any.fromFunction1((t0: OffCanplayCallback) => offCanplay(t0).runNow()), offEnded = js.Any.fromFunction1((t0: OffEndedCallback) => offEnded(t0).runNow()), offError = js.Any.fromFunction1((t0: OffErrorCallback) => offError(t0).runNow()), offPause = js.Any.fromFunction1((t0: OffPauseCallback) => offPause(t0).runNow()), offPlay = js.Any.fromFunction1((t0: OffPlayCallback) => offPlay(t0).runNow()), offSeeked = js.Any.fromFunction1((t0: OffSeekedCallback) => offSeeked(t0).runNow()), offSeeking = js.Any.fromFunction1((t0: OffSeekingCallback) => offSeeking(t0).runNow()), offStop = js.Any.fromFunction1((t0: OffStopCallback) => offStop(t0).runNow()), offTimeUpdate = js.Any.fromFunction1((t0: OffTimeUpdateCallback) => offTimeUpdate(t0).runNow()), offWaiting = js.Any.fromFunction1((t0: OffWaitingCallback) => offWaiting(t0).runNow()), onCanplay = js.Any.fromFunction1((t0: InnerAudioContextOnCanplayCallback) => onCanplay(t0).runNow()), onEnded = js.Any.fromFunction1((t0: InnerAudioContextOnEndedCallback) => onEnded(t0).runNow()), onError = js.Any.fromFunction1((t0: InnerAudioContextOnErrorCallback) => onError(t0).runNow()), onPause = js.Any.fromFunction1((t0: InnerAudioContextOnPauseCallback) => onPause(t0).runNow()), onPlay = js.Any.fromFunction1((t0: InnerAudioContextOnPlayCallback) => onPlay(t0).runNow()), onSeeked = js.Any.fromFunction1((t0: InnerAudioContextOnSeekedCallback) => onSeeked(t0).runNow()), onSeeking = js.Any.fromFunction1((t0: InnerAudioContextOnSeekingCallback) => onSeeking(t0).runNow()), onStop = js.Any.fromFunction1((t0: InnerAudioContextOnStopCallback) => onStop(t0).runNow()), onTimeUpdate = js.Any.fromFunction1((t0: InnerAudioContextOnTimeUpdateCallback) => onTimeUpdate(t0).runNow()), onWaiting = js.Any.fromFunction1((t0: InnerAudioContextOnWaitingCallback) => onWaiting(t0).runNow()), pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = stop.toJsFn, volume = volume.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerAudioContext]
  }
  
  extension [Self <: InnerAudioContext](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setObeyMuteSwitch(value: Boolean): Self = StObject.set(x, "obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    inline def setOffCanplay(value: OffCanplayCallback => Callback): Self = StObject.set(x, "offCanplay", js.Any.fromFunction1((t0: OffCanplayCallback) => value(t0).runNow()))
    
    inline def setOffEnded(value: OffEndedCallback => Callback): Self = StObject.set(x, "offEnded", js.Any.fromFunction1((t0: OffEndedCallback) => value(t0).runNow()))
    
    inline def setOffError(value: OffErrorCallback => Callback): Self = StObject.set(x, "offError", js.Any.fromFunction1((t0: OffErrorCallback) => value(t0).runNow()))
    
    inline def setOffPause(value: OffPauseCallback => Callback): Self = StObject.set(x, "offPause", js.Any.fromFunction1((t0: OffPauseCallback) => value(t0).runNow()))
    
    inline def setOffPlay(value: OffPlayCallback => Callback): Self = StObject.set(x, "offPlay", js.Any.fromFunction1((t0: OffPlayCallback) => value(t0).runNow()))
    
    inline def setOffSeeked(value: OffSeekedCallback => Callback): Self = StObject.set(x, "offSeeked", js.Any.fromFunction1((t0: OffSeekedCallback) => value(t0).runNow()))
    
    inline def setOffSeeking(value: OffSeekingCallback => Callback): Self = StObject.set(x, "offSeeking", js.Any.fromFunction1((t0: OffSeekingCallback) => value(t0).runNow()))
    
    inline def setOffStop(value: OffStopCallback => Callback): Self = StObject.set(x, "offStop", js.Any.fromFunction1((t0: OffStopCallback) => value(t0).runNow()))
    
    inline def setOffTimeUpdate(value: OffTimeUpdateCallback => Callback): Self = StObject.set(x, "offTimeUpdate", js.Any.fromFunction1((t0: OffTimeUpdateCallback) => value(t0).runNow()))
    
    inline def setOffWaiting(value: OffWaitingCallback => Callback): Self = StObject.set(x, "offWaiting", js.Any.fromFunction1((t0: OffWaitingCallback) => value(t0).runNow()))
    
    inline def setOnCanplay(value: InnerAudioContextOnCanplayCallback => Callback): Self = StObject.set(x, "onCanplay", js.Any.fromFunction1((t0: InnerAudioContextOnCanplayCallback) => value(t0).runNow()))
    
    inline def setOnEnded(value: InnerAudioContextOnEndedCallback => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: InnerAudioContextOnEndedCallback) => value(t0).runNow()))
    
    inline def setOnError(value: InnerAudioContextOnErrorCallback => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: InnerAudioContextOnErrorCallback) => value(t0).runNow()))
    
    inline def setOnPause(value: InnerAudioContextOnPauseCallback => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: InnerAudioContextOnPauseCallback) => value(t0).runNow()))
    
    inline def setOnPlay(value: InnerAudioContextOnPlayCallback => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: InnerAudioContextOnPlayCallback) => value(t0).runNow()))
    
    inline def setOnSeeked(value: InnerAudioContextOnSeekedCallback => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: InnerAudioContextOnSeekedCallback) => value(t0).runNow()))
    
    inline def setOnSeeking(value: InnerAudioContextOnSeekingCallback => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: InnerAudioContextOnSeekingCallback) => value(t0).runNow()))
    
    inline def setOnStop(value: InnerAudioContextOnStopCallback => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: InnerAudioContextOnStopCallback) => value(t0).runNow()))
    
    inline def setOnTimeUpdate(value: InnerAudioContextOnTimeUpdateCallback => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: InnerAudioContextOnTimeUpdateCallback) => value(t0).runNow()))
    
    inline def setOnWaiting(value: InnerAudioContextOnWaitingCallback => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: InnerAudioContextOnWaitingCallback) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
