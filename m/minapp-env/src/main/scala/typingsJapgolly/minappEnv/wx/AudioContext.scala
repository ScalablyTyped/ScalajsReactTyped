package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioContext extends StObject {
  
  /** [AudioContext.pause()](AudioContext.pause.md)
    *
    * 暂停音频。 */
  def pause(): Unit
  
  /** [AudioContext.play()](AudioContext.play.md)
    *
    * 播放音频。 */
  def play(): Unit
  
  /** [AudioContext.seek(number position)](AudioContext.seek.md)
    *
    * 跳转到指定位置。 */
  def seek(/** 跳转位置，单位 s */
  position: Double): Unit
  
  /** [AudioContext.setSrc(string src)](AudioContext.setSrc.md)
    *
    * 设置音频地址 */
  def setSrc(/** 音频地址 */
  src: String): Unit
}
object AudioContext {
  
  inline def apply(pause: Callback, play: Callback, seek: Double => Callback, setSrc: String => Callback): AudioContext = {
    val __obj = js.Dynamic.literal(pause = pause.toJsFn, play = play.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), setSrc = js.Any.fromFunction1((t0: String) => setSrc(t0).runNow()))
    __obj.asInstanceOf[AudioContext]
  }
  
  extension [Self <: AudioContext](x: Self) {
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSetSrc(value: String => Callback): Self = StObject.set(x, "setSrc", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
  }
}
