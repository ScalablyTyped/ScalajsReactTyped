package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LivePlayerContext extends StObject {
  
  /** 退出全屏 */
  def exitFullScreen(options: BaseOptions[Any, Any]): Unit
  
  /** 静音 */
  def mute(options: BaseOptions[Any, Any]): Unit
  
  /** 暂停 */
  def pause(options: BaseOptions[Any, Any]): Unit
  
  /** 播放 */
  def play(options: BaseOptions[Any, Any]): Unit
  
  /** 进入全屏 */
  def requestFullScreen(options: RequestFullScreenOptions): Unit
  
  /** 回复 */
  def resume(options: BaseOptions[Any, Any]): Unit
  
  /** 停止 */
  def stop(options: BaseOptions[Any, Any]): Unit
}
object LivePlayerContext {
  
  inline def apply(
    exitFullScreen: BaseOptions[Any, Any] => Callback,
    mute: BaseOptions[Any, Any] => Callback,
    pause: BaseOptions[Any, Any] => Callback,
    play: BaseOptions[Any, Any] => Callback,
    requestFullScreen: RequestFullScreenOptions => Callback,
    resume: BaseOptions[Any, Any] => Callback,
    stop: BaseOptions[Any, Any] => Callback
  ): LivePlayerContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => exitFullScreen(t0).runNow()), mute = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => mute(t0).runNow()), pause = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => pause(t0).runNow()), play = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => play(t0).runNow()), requestFullScreen = js.Any.fromFunction1((t0: RequestFullScreenOptions) => requestFullScreen(t0).runNow()), resume = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => resume(t0).runNow()), stop = js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => stop(t0).runNow()))
    __obj.asInstanceOf[LivePlayerContext]
  }
  
  extension [Self <: LivePlayerContext](x: Self) {
    
    inline def setExitFullScreen(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "exitFullScreen", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
    
    inline def setMute(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "mute", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
    
    inline def setPause(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "pause", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
    
    inline def setPlay(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "play", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
    
    inline def setRequestFullScreen(value: RequestFullScreenOptions => Callback): Self = StObject.set(x, "requestFullScreen", js.Any.fromFunction1((t0: RequestFullScreenOptions) => value(t0).runNow()))
    
    inline def setResume(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "resume", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
    
    inline def setStop(value: BaseOptions[Any, Any] => Callback): Self = StObject.set(x, "stop", js.Any.fromFunction1((t0: BaseOptions[Any, Any]) => value(t0).runNow()))
  }
}
