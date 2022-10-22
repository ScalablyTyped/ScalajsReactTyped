package typingsJapgolly.weixinApp.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BackgroundAudioManager extends StObject {
  
  /** 音频缓冲的时间点，仅保证当前播放时间点到此时间点内容已缓冲。 是 */
  var buffered: Double
  
  /** 封面图url，用于做原生音频播放器背景图。原生音频播放器中的分享功能，分享出去的卡片配图及背景也将使用该图。 */
  var coverImgUrl: String
  
  /** 当前音频的播放位置（单位：s），只有在当前有合法的 src 时返回 */
  val currentTime: Double
  
  /** 当前音频的长度（单位：s），只有在当前有合法的 src 时返回 */
  val duration: Double
  
  /** 专辑名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var epname: String
  
  /** 背景音频进入可以播放状态，但不保证后面可以流畅播放 */
  def onCanplay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频自然播放结束事件 */
  def onEnded(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频播放错误事件 */
  def onError(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 用户在系统音乐播放面板点击下一曲事件（iOS only） */
  def onNext(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频暂停事件 */
  def onPause(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频播放事件 */
  def onPlay(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 用户在系统音乐播放面板点击上一曲事件（iOS only） */
  def onPrev(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频停止事件 */
  def onStop(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 背景音频播放进度更新事件 */
  def onTimeUpdate(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 音频加载中事件，当音频因为数据不足，需要停下来加载时会触发 */
  def onWaiting(callback: js.Function1[/* res */ ErrCodeResponse, Unit]): Unit
  
  /** 暂停 */
  def pause(): Unit
  
  /** 当前是是否暂停或停止状态，true 表示暂停或停止，false 表示正在播放 */
  val paused: Boolean
  
  /** 播放 */
  def play(): Unit
  
  /** 跳转到指定位置，单位 s */
  def seek(position: Double): Unit
  
  /** 歌手名，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var singer: String
  
  /** 音频的数据源，默认为空字符串，当设置了新的 src 时，会自动开始播放 ，目前支持的格式有 m4a, aac, mp3, wav */
  var src: String
  
  /** 音频开始播放的位置（单位：s） */
  var startTime: Double
  
  /** 停止 */
  def stop(): Unit
  
  /** 音频标题，用于做原生音频播放器音频标题。原生音频播放器中的分享功能，分享出去的卡片标题，也将使用该值。 */
  var title: String
  
  /** 页面链接，原生音频播放器中的分享功能，分享出去的卡片简介，也将使用该值 */
  var webUrl: String
}
object BackgroundAudioManager {
  
  inline def apply(
    buffered: Double,
    coverImgUrl: String,
    currentTime: Double,
    duration: Double,
    epname: String,
    onCanplay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onEnded: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onError: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onNext: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPause: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPlay: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onPrev: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onStop: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onTimeUpdate: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    onWaiting: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback,
    pause: Callback,
    paused: Boolean,
    play: Callback,
    seek: Double => Callback,
    singer: String,
    src: String,
    startTime: Double,
    stop: Callback,
    title: String,
    webUrl: String
  ): BackgroundAudioManager = {
    val __obj = js.Dynamic.literal(buffered = buffered.asInstanceOf[js.Any], coverImgUrl = coverImgUrl.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], epname = epname.asInstanceOf[js.Any], onCanplay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onCanplay(t0).runNow()), onEnded = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onEnded(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onError(t0).runNow()), onNext = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onNext(t0).runNow()), onPause = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onPause(t0).runNow()), onPlay = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onPlay(t0).runNow()), onPrev = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onPrev(t0).runNow()), onStop = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onStop(t0).runNow()), onTimeUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onTimeUpdate(t0).runNow()), onWaiting = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => onWaiting(t0).runNow()), pause = pause.toJsFn, paused = paused.asInstanceOf[js.Any], play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), singer = singer.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], stop = stop.toJsFn, title = title.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundAudioManager]
  }
  
  extension [Self <: BackgroundAudioManager](x: Self) {
    
    inline def setBuffered(value: Double): Self = StObject.set(x, "buffered", value.asInstanceOf[js.Any])
    
    inline def setCoverImgUrl(value: String): Self = StObject.set(x, "coverImgUrl", value.asInstanceOf[js.Any])
    
    inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setEpname(value: String): Self = StObject.set(x, "epname", value.asInstanceOf[js.Any])
    
    inline def setOnCanplay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onCanplay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnEnded(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnNext(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnPause(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnPlay(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnPrev(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onPrev", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnStop(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onStop", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnTimeUpdate(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setOnWaiting(value: js.Function1[/* res */ ErrCodeResponse, Unit] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrCodeResponse, Unit]) => value(t0).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSinger(value: String): Self = StObject.set(x, "singer", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStop(value: Callback): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setWebUrl(value: String): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
  }
}
