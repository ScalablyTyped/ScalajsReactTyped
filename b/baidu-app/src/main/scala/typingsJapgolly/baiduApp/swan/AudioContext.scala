package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----音频组件控制
/**
  * audioContext 通过 audioId 跟一个 <audio/> 组件绑定，通过它可以操作对应的 <audio/> 组件。
  */
trait AudioContext extends StObject {
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit
  
  /**
    * 音频的地址
    */
  def setSrc(src: String): Unit
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
