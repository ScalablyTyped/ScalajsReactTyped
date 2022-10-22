package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAudioContext extends StObject {
  
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
  def seek(): Unit
  
  /**
    * 音频的地址
    */
  def setSrc(): Unit
}
object CreateAudioContext {
  
  inline def apply(pause: Callback, play: Callback, seek: Callback, setSrc: Callback): CreateAudioContext = {
    val __obj = js.Dynamic.literal(pause = pause.toJsFn, play = play.toJsFn, seek = seek.toJsFn, setSrc = setSrc.toJsFn)
    __obj.asInstanceOf[CreateAudioContext]
  }
  
  extension [Self <: CreateAudioContext](x: Self) {
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setSeek(value: Callback): Self = StObject.set(x, "seek", value.toJsFn)
    
    inline def setSetSrc(value: Callback): Self = StObject.set(x, "setSrc", value.toJsFn)
  }
}
