package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.HTMLVideoElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DPlayer extends StObject {
  
  var danmaku: Danmaku
  
  def destroy(): Unit
  
  var events: Any
  
  var fullScreen: FullScreen
  
  def notice(text: String, time: Double, opacity: Double): Unit
  
  def on(event: DPlayerEvents, handler: js.Function0[Unit]): Unit
  
  def pause(): Unit
  
  def play(): Unit
  
  def seek(time: Double): Unit
  
  def speed(rate: Double): Unit
  
  def switchQuality(index: Double): Unit
  
  def switchVideo(video: DPlayerVideo, danmaku: DPlayerDanmaku): Unit
  
  def toggle(): Unit
  
  var video: HTMLVideoElement
  
  def volume(percentage: Double, nostorage: Boolean, nonotice: Boolean): Unit
}
object DPlayer {
  
  inline def apply(
    danmaku: Danmaku,
    destroy: Callback,
    events: Any,
    fullScreen: FullScreen,
    notice: (String, Double, Double) => Callback,
    on: (DPlayerEvents, js.Function0[Unit]) => Callback,
    pause: Callback,
    play: Callback,
    seek: Double => Callback,
    speed: Double => Callback,
    switchQuality: Double => Callback,
    switchVideo: (DPlayerVideo, DPlayerDanmaku) => Callback,
    toggle: Callback,
    video: HTMLVideoElement,
    volume: (Double, Boolean, Boolean) => Callback
  ): DPlayer = {
    val __obj = js.Dynamic.literal(danmaku = danmaku.asInstanceOf[js.Any], destroy = destroy.toJsFn, events = events.asInstanceOf[js.Any], fullScreen = fullScreen.asInstanceOf[js.Any], notice = js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (notice(t0, t1, t2)).runNow()), on = js.Any.fromFunction2((t0: DPlayerEvents, t1: js.Function0[Unit]) => (on(t0, t1)).runNow()), pause = pause.toJsFn, play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), speed = js.Any.fromFunction1((t0: Double) => speed(t0).runNow()), switchQuality = js.Any.fromFunction1((t0: Double) => switchQuality(t0).runNow()), switchVideo = js.Any.fromFunction2((t0: DPlayerVideo, t1: DPlayerDanmaku) => (switchVideo(t0, t1)).runNow()), toggle = toggle.toJsFn, video = video.asInstanceOf[js.Any], volume = js.Any.fromFunction3((t0: Double, t1: Boolean, t2: Boolean) => (volume(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[DPlayer]
  }
  
  extension [Self <: DPlayer](x: Self) {
    
    inline def setDanmaku(value: Danmaku): Self = StObject.set(x, "danmaku", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
    
    inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setFullScreen(value: FullScreen): Self = StObject.set(x, "fullScreen", value.asInstanceOf[js.Any])
    
    inline def setNotice(value: (String, Double, Double) => Callback): Self = StObject.set(x, "notice", js.Any.fromFunction3((t0: String, t1: Double, t2: Double) => (value(t0, t1, t2)).runNow()))
    
    inline def setOn(value: (DPlayerEvents, js.Function0[Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: DPlayerEvents, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSpeed(value: Double => Callback): Self = StObject.set(x, "speed", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSwitchQuality(value: Double => Callback): Self = StObject.set(x, "switchQuality", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSwitchVideo(value: (DPlayerVideo, DPlayerDanmaku) => Callback): Self = StObject.set(x, "switchVideo", js.Any.fromFunction2((t0: DPlayerVideo, t1: DPlayerDanmaku) => (value(t0, t1)).runNow()))
    
    inline def setToggle(value: Callback): Self = StObject.set(x, "toggle", value.toJsFn)
    
    inline def setVideo(value: HTMLVideoElement): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVolume(value: (Double, Boolean, Boolean) => Callback): Self = StObject.set(x, "volume", js.Any.fromFunction3((t0: Double, t1: Boolean, t2: Boolean) => (value(t0, t1, t2)).runNow()))
  }
}
