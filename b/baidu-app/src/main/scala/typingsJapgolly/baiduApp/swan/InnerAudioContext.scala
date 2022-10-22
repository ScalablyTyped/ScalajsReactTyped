package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InnerAudioContext extends StObject {
  
  /** 是否自动开始播放，默认 false */
  var autoplay: js.UndefOr[Boolean] = js.undefined
  
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6  */
  val currentTime: Double
  
  /** 销毁当前实例 */
  def destroy(): Unit
  
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返 */
  val duration: Double
  
  /** 是否循环播放，默认 false */
  var loop: js.UndefOr[Boolean] = js.undefined
  
  /** 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音，默认值 true */
  var obeyMuteSwitch: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播 */
  val paused: Boolean
  
  /** 播放 */
  def play(): Unit
  
  /** 跳转到指定位置，单位 s */
  def seek(options: Position): Unit
  
  /** 音频的数据链接，用于直接播放。 */
  var src: js.UndefOr[String] = js.undefined
  
  /** 开始播放的位置（单位：s），默认 0 */
  var startTime: js.UndefOr[Double] = js.undefined
  
  /** 停止 */
  def stop(): Unit
  
  /** 音量，范围 0~1。 */
  var volume: js.UndefOr[Double] = js.undefined
}
object InnerAudioContext {
  
  inline def apply(
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
    seek: Position => Callback,
    stop: Callback
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], destroy = destroy.toJsFn, duration = duration.asInstanceOf[js.Any], offCanplay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offCanplay(t0).runNow()), offEnded = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offEnded(t0).runNow()), offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offError(t0).runNow()), offPause = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offPause(t0).runNow()), offPlay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offPlay(t0).runNow()), offSeeked = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offSeeked(t0).runNow()), offSeeking = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offSeeking(t0).runNow()), offStop = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offStop(t0).runNow()), offTimeUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offTimeUpdate(t0).runNow()), offWaiting = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => offWaiting(t0).runNow()), onCanplay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onCanplay(t0).runNow()), onEnded = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onEnded(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onError(t0).runNow()), onPause = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onPause(t0).runNow()), onPlay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onPlay(t0).runNow()), onSeeked = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onSeeked(t0).runNow()), onSeeking = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onSeeking(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onStop(t0).runNow()), onTimeUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onTimeUpdate(t0).runNow()), onWaiting = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onWaiting(t0).runNow()), pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], play = play.toJsFn, seek = js.Any.fromFunction1((t0: Position) => seek(t0).runNow()), stop = stop.toJsFn)
    __obj.asInstanceOf[InnerAudioContext]
  }
  
  extension [Self <: InnerAudioContext](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    inline def setObeyMuteSwitch(value: Boolean): Self = StObject.set(x, "obeyMuteSwitch", value.asInstanceOf[js.Any])
    
    inline def setObeyMuteSwitchUndefined: Self = StObject.set(x, "obeyMuteSwitch", js.undefined)
    
    inline def setOffCanplay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offCanplay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffEnded(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offEnded", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffError(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffPause(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offPause", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffPlay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offPlay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffSeeked(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offSeeked", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffSeeking(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offSeeking", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffStop(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offStop", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffTimeUpdate(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offTimeUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOffWaiting(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "offWaiting", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnCanplay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onCanplay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnEnded(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnPause(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnPlay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnSeeked(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnSeeking(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnTimeUpdate(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnWaiting(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Position => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
    
    inline def setVolumeUndefined: Self = StObject.set(x, "volume", js.undefined)
  }
}
