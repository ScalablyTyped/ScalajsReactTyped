package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InnerAudioContext 实例，可通过 wx.createInnerAudioContext 接口获取实例。
  */
trait InnerAudioContext extends StObject {
  
  /**
    * 是否自动播放
    */
  var autoplay: Boolean
  
  /**
    * 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲
    */
  val buffered: Double
  
  /**
    * 当前音频的播放位置，单位 s。只有在当前有合法的 src 时返回，时间不取整，保留小数点后 6 位
    */
  val currentTime: Double
  
  /**
    * 销毁当前实例
    */
  def destroy(): Unit
  
  /**
    * 当前音频的长度，单位 s。只有在当前有合法的 src 时返回
    */
  val duration: Double
  
  /**
    * 是否循环播放
    */
  var loop: Boolean
  
  /**
    * 是否遵循系统静音开关，当此参数为 false 时，即使用户打开了静音开关，也能继续发出声音
    */
  var obeyMuteSwitch: Boolean
  
  /**
    * 取消监听音频进入可以播放状态的事件
    */
  def offCanplay(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频自然播放至结束的事件
    */
  def offEnded(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频播放错误事件
    */
  def offError(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频暂停事件
    */
  def offPause(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频播放事件
    */
  def offPlay(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频完成跳转操作的事件
    */
  def offSeeked(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频进行跳转操作的事件
    */
  def offSeeking(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频停止事件
    */
  def offStop(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频播放进度更新事件
    */
  def offTimeUpdate(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def offWaiting(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频进入可以播放状态的事件
    */
  def onCanplay(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频自然播放至结束的事件
    */
  def onEnded(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频播放错误事件
    */
  def onError(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频播放事件
    */
  def onPlay(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频完成跳转操作的事件
    */
  def onSeeked(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频进行跳转操作的事件
    */
  def onSeeking(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频停止事件
    */
  def onStop(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频播放进度更新事件
    */
  def onTimeUpdate(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听音频加载中事件，当音频因为数据不足，需要停下来加载时会触发
    */
  def onWaiting(callback: js.Function0[Unit]): Unit
  
  /**
    * 暂停。暂停后的音频再播放会从暂停处开始播放
    */
  def pause(): Unit
  
  /**
    * 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放
    */
  var paused: Boolean
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    * @param position 跳转的时间
    */
  def seek(position: Double): Unit
  
  /**
    * 音频资源的地址
    */
  var src: String
  
  /**
    * 停止。停止后的音频再播放会从头开始播放。
    */
  def stop(): Unit
  
  /**
    * 音量。范围 0~1。
    */
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
    offCanplay: js.Function0[Unit] => Callback,
    offEnded: js.Function0[Unit] => Callback,
    offError: js.Function0[Unit] => Callback,
    offPause: js.Function0[Unit] => Callback,
    offPlay: js.Function0[Unit] => Callback,
    offSeeked: js.Function0[Unit] => Callback,
    offSeeking: js.Function0[Unit] => Callback,
    offStop: js.Function0[Unit] => Callback,
    offTimeUpdate: js.Function0[Unit] => Callback,
    offWaiting: js.Function0[Unit] => Callback,
    onCanplay: js.Function0[Unit] => Callback,
    onEnded: js.Function0[Unit] => Callback,
    onError: js.Function0[Unit] => Callback,
    onPause: js.Function0[Unit] => Callback,
    onPlay: js.Function0[Unit] => Callback,
    onSeeked: js.Function0[Unit] => Callback,
    onSeeking: js.Function0[Unit] => Callback,
    onStop: js.Function0[Unit] => Callback,
    onTimeUpdate: js.Function0[Unit] => Callback,
    onWaiting: js.Function0[Unit] => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    seek: Double => Callback,
    src: String,
    stop: Callback,
    volume: Double
  ): InnerAudioContext = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], buffered = buffered.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], destroy = destroy.toJsFn, duration = duration.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], obeyMuteSwitch = obeyMuteSwitch.asInstanceOf[js.Any], offCanplay = js.Any.fromFunction1((t0: js.Function0[Unit]) => offCanplay(t0).runNow()), offEnded = js.Any.fromFunction1((t0: js.Function0[Unit]) => offEnded(t0).runNow()), offError = js.Any.fromFunction1((t0: js.Function0[Unit]) => offError(t0).runNow()), offPause = js.Any.fromFunction1((t0: js.Function0[Unit]) => offPause(t0).runNow()), offPlay = js.Any.fromFunction1((t0: js.Function0[Unit]) => offPlay(t0).runNow()), offSeeked = js.Any.fromFunction1((t0: js.Function0[Unit]) => offSeeked(t0).runNow()), offSeeking = js.Any.fromFunction1((t0: js.Function0[Unit]) => offSeeking(t0).runNow()), offStop = js.Any.fromFunction1((t0: js.Function0[Unit]) => offStop(t0).runNow()), offTimeUpdate = js.Any.fromFunction1((t0: js.Function0[Unit]) => offTimeUpdate(t0).runNow()), offWaiting = js.Any.fromFunction1((t0: js.Function0[Unit]) => offWaiting(t0).runNow()), onCanplay = js.Any.fromFunction1((t0: js.Function0[Unit]) => onCanplay(t0).runNow()), onEnded = js.Any.fromFunction1((t0: js.Function0[Unit]) => onEnded(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function0[Unit]) => onError(t0).runNow()), onPause = js.Any.fromFunction1((t0: js.Function0[Unit]) => onPause(t0).runNow()), onPlay = js.Any.fromFunction1((t0: js.Function0[Unit]) => onPlay(t0).runNow()), onSeeked = js.Any.fromFunction1((t0: js.Function0[Unit]) => onSeeked(t0).runNow()), onSeeking = js.Any.fromFunction1((t0: js.Function0[Unit]) => onSeeking(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function0[Unit]) => onStop(t0).runNow()), onTimeUpdate = js.Any.fromFunction1((t0: js.Function0[Unit]) => onTimeUpdate(t0).runNow()), onWaiting = js.Any.fromFunction1((t0: js.Function0[Unit]) => onWaiting(t0).runNow()), pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), src = src.asInstanceOf[js.Any], stop = stop.toJsFn, volume = volume.asInstanceOf[js.Any])
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
    
    inline def setOffCanplay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offCanplay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffEnded(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offEnded", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffError(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offError", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffPause(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offPause", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffPlay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offPlay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffSeeked(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offSeeked", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffSeeking(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offSeeking", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffStop(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offStop", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffTimeUpdate(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offTimeUpdate", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffWaiting(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offWaiting", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnCanplay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onCanplay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnEnded(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnPause(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnPlay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnSeeked(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnSeeking(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnTimeUpdate(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnWaiting(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setVolume(value: Double): Self = StObject.set(x, "volume", value.asInstanceOf[js.Any])
  }
}
