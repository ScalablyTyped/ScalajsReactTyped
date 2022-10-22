package typingsJapgolly.wegameApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.wegameApi.anon.Duration
import typingsJapgolly.wegameApi.anon.ErrMsg
import typingsJapgolly.wegameApi.wegameApiStrings.contain
import typingsJapgolly.wegameApi.wegameApiStrings.cover
import typingsJapgolly.wegameApi.wegameApiStrings.fill
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Video extends StObject {
  
  /**
    * 视频是否自动播放，默认false
    */
  var autoplay: Boolean
  
  /**
    * 视频是否显示控件，默认true
    */
  var controls: Boolean
  
  /**
    * 销毁视频
    */
  def destroy(): Unit
  
  /**
    * 视频退出全屏
    */
  def exitFullScreen(): js.Promise[Unit]
  
  /**
    * 默认值150
    */
  var height: Double
  
  /**
    * 视频的初始播放位置，单位为 s 秒，默认值0
    */
  var initialTime: Double
  
  /**
    * 视频是否为直播，默认值0
    */
  var live: js.UndefOr[Double] = js.undefined
  
  /**
    * 视频是否是否循环播放，默认值false
    */
  var loop: Boolean
  
  /**
    * 视频是否禁音播放，默认值false
    */
  var muted: Boolean
  
  /**
    * 视频的缩放模式
    * fill - 填充，视频拉伸填满整个容器，不保证保持原有长宽比例
    * contain - 包含，保持原有长宽比例。保证视频尺寸一定可以在容器里面放得下。因此，可能会有部分空白
    * cover - 覆盖，保持原有长宽比例。保证视频尺寸一定大于容器尺寸，宽度和高度至少有一个和容器一致。因此，视频有部分会看不见
    */
  var objectFit: contain | cover | fill
  
  /**
    * 取消监听视频播放到末尾事件
    */
  def offEnded(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听视频错误事件
    */
  def offError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 取消监听视频暂停事件
    */
  def offPause(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听视频播放事件
    */
  def offPlay(callback: js.Function0[Unit]): Unit
  
  /**
    * 取消监听视频播放进度更新事件
    */
  def offTimeUpdate(callback: js.Function1[/* res */ Duration, Unit]): Unit
  
  /**
    * 取消监听视频缓冲事件
    */
  def offWaiting(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听视频播放到末尾事件
    */
  def onEnded(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听视频错误事件
    * @param callback.res.errMsg 错误信息，有如下值
    *                            MEDIA_ERR_NETWORK - 当下载时发生错误
    *                            MEDIA_ERR_DECODE  - 当解码时发生错误
    *                            MEDIA_ERR_SRC_NOT_SUPPORTED - video 的 src 属性是不支持的资源类型
    */
  def onError(callback: js.Function1[/* res */ ErrMsg, Unit]): Unit
  
  /**
    * 监听视频暂停事件
    */
  def onPause(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听视频播放事件
    */
  def onPlay(callback: js.Function0[Unit]): Unit
  
  /**
    * 监听视频播放进度更新事件
    * @param callback.res.position 当前的播放位置，单位为秒
    * @param callback.res.duration 视频的总时长，单位为秒
    */
  def onTimeUpdate(callback: js.Function1[/* res */ Duration, Unit]): Unit
  
  /**
    * 监听视频缓冲事件
    */
  def onWaiting(callback: js.Function0[Unit]): Unit
  
  /**
    * 视频播放到末尾时触发的回调函数
    */
  def onended(): Unit
  
  /**
    * 视频发生错误时触发的回调函数
    */
  def onerror(): Unit
  
  /**
    * 视频暂停时触发的回调函数
    */
  def onpause(): Unit
  
  /**
    * 视频开始播放时触发的回调函数
    */
  def onplay(): Unit
  
  /**
    * 每当视频播放进度更新时触发的回调函数
    */
  def ontimeupdate(): Unit
  
  /**
    * 视频开始缓冲时触发的回调函数
    */
  def onwaiting(): Unit
  
  /**
    * 暂停视频
    */
  def pause(): js.Promise[Unit]
  
  /**
    * 播放视频
    */
  def play(): js.Promise[Unit]
  
  /**
    * 视频的播放速率，有效值有 0.5、0.8、1.0、1.25、1.5默认值1.0
    */
  var playbackRate: Double
  
  /**
    * 视频的封面
    */
  var poster: String
  
  /**
    * 视频全屏
    */
  def requestFullScreen(): js.Promise[Unit]
  
  /**
    * 视频跳转
    * @param time 视频跳转到指定位置，单位为 s 秒
    */
  def seek(time: Double): js.Promise[Unit]
  
  /**
    * 视频的资源地址
    */
  var src: String
  
  /**
    * 停止视频
    */
  def stop(): js.Promise[Unit]
  
  /**
    * 视频的宽度，默认值300
    */
  var width: Double
  
  /**
    * 视频的左上角横坐标
    */
  var x: Double
  
  /**
    * 视频的左上角纵坐标
    */
  var y: Double
}
object Video {
  
  inline def apply(
    autoplay: Boolean,
    controls: Boolean,
    destroy: Callback,
    exitFullScreen: CallbackTo[js.Promise[Unit]],
    height: Double,
    initialTime: Double,
    loop: Boolean,
    muted: Boolean,
    objectFit: contain | cover | fill,
    offEnded: js.Function0[Unit] => Callback,
    offError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    offPause: js.Function0[Unit] => Callback,
    offPlay: js.Function0[Unit] => Callback,
    offTimeUpdate: js.Function1[/* res */ Duration, Unit] => Callback,
    offWaiting: js.Function0[Unit] => Callback,
    onEnded: js.Function0[Unit] => Callback,
    onError: js.Function1[/* res */ ErrMsg, Unit] => Callback,
    onPause: js.Function0[Unit] => Callback,
    onPlay: js.Function0[Unit] => Callback,
    onTimeUpdate: js.Function1[/* res */ Duration, Unit] => Callback,
    onWaiting: js.Function0[Unit] => Callback,
    onended: Callback,
    onerror: Callback,
    onpause: Callback,
    onplay: Callback,
    ontimeupdate: Callback,
    onwaiting: Callback,
    pause: CallbackTo[js.Promise[Unit]],
    play: CallbackTo[js.Promise[Unit]],
    playbackRate: Double,
    poster: String,
    requestFullScreen: CallbackTo[js.Promise[Unit]],
    seek: Double => js.Promise[Unit],
    src: String,
    stop: CallbackTo[js.Promise[Unit]],
    width: Double,
    x: Double,
    y: Double
  ): Video = {
    val __obj = js.Dynamic.literal(autoplay = autoplay.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], destroy = destroy.toJsFn, exitFullScreen = exitFullScreen.toJsFn, height = height.asInstanceOf[js.Any], initialTime = initialTime.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], muted = muted.asInstanceOf[js.Any], objectFit = objectFit.asInstanceOf[js.Any], offEnded = js.Any.fromFunction1((t0: js.Function0[Unit]) => offEnded(t0).runNow()), offError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => offError(t0).runNow()), offPause = js.Any.fromFunction1((t0: js.Function0[Unit]) => offPause(t0).runNow()), offPlay = js.Any.fromFunction1((t0: js.Function0[Unit]) => offPlay(t0).runNow()), offTimeUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ Duration, Unit]) => offTimeUpdate(t0).runNow()), offWaiting = js.Any.fromFunction1((t0: js.Function0[Unit]) => offWaiting(t0).runNow()), onEnded = js.Any.fromFunction1((t0: js.Function0[Unit]) => onEnded(t0).runNow()), onError = js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => onError(t0).runNow()), onPause = js.Any.fromFunction1((t0: js.Function0[Unit]) => onPause(t0).runNow()), onPlay = js.Any.fromFunction1((t0: js.Function0[Unit]) => onPlay(t0).runNow()), onTimeUpdate = js.Any.fromFunction1((t0: js.Function1[/* res */ Duration, Unit]) => onTimeUpdate(t0).runNow()), onWaiting = js.Any.fromFunction1((t0: js.Function0[Unit]) => onWaiting(t0).runNow()), onended = onended.toJsFn, onerror = onerror.toJsFn, onpause = onpause.toJsFn, onplay = onplay.toJsFn, ontimeupdate = ontimeupdate.toJsFn, onwaiting = onwaiting.toJsFn, pause = pause.toJsFn, play = play.toJsFn, playbackRate = playbackRate.asInstanceOf[js.Any], poster = poster.asInstanceOf[js.Any], requestFullScreen = requestFullScreen.toJsFn, seek = js.Any.fromFunction1(seek), src = src.asInstanceOf[js.Any], stop = stop.toJsFn, width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Video]
  }
  
  extension [Self <: Video](x: Self) {
    
    inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
    
    inline def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setExitFullScreen(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "exitFullScreen", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setInitialTime(value: Double): Self = StObject.set(x, "initialTime", value.asInstanceOf[js.Any])
    
    inline def setLive(value: Double): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    
    inline def setLiveUndefined: Self = StObject.set(x, "live", js.undefined)
    
    inline def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    inline def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
    
    inline def setObjectFit(value: contain | cover | fill): Self = StObject.set(x, "objectFit", value.asInstanceOf[js.Any])
    
    inline def setOffEnded(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offEnded", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffError(value: js.Function1[/* res */ ErrMsg, Unit] => Callback): Self = StObject.set(x, "offError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => value(t0).runNow()))
    
    inline def setOffPause(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offPause", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffPlay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offPlay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOffTimeUpdate(value: js.Function1[/* res */ Duration, Unit] => Callback): Self = StObject.set(x, "offTimeUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ Duration, Unit]) => value(t0).runNow()))
    
    inline def setOffWaiting(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "offWaiting", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnEnded(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onEnded", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnError(value: js.Function1[/* res */ ErrMsg, Unit] => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: js.Function1[/* res */ ErrMsg, Unit]) => value(t0).runNow()))
    
    inline def setOnPause(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onPause", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnPlay(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onPlay", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setOnTimeUpdate(value: js.Function1[/* res */ Duration, Unit] => Callback): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1((t0: js.Function1[/* res */ Duration, Unit]) => value(t0).runNow()))
    
    inline def setOnWaiting(value: js.Function0[Unit] => Callback): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1((t0: js.Function0[Unit]) => value(t0).runNow()))
    
    inline def setPause(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
    
    inline def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
    
    inline def setRequestFullScreen(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "requestFullScreen", value.toJsFn)
    
    inline def setSeek(value: Double => js.Promise[Unit]): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    
    inline def setStop(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "stop", value.toJsFn)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
