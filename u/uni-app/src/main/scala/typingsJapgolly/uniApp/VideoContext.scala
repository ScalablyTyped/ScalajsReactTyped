package typingsJapgolly.uniApp

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoContext extends StObject {
  
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    * 设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(): Unit
  
  /**
    * 进入全屏，可传入{direction}参数（1.7.0起支持），详见video组件文档
    */
  def requestFullScreen(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(): Unit
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(): Unit
}
object VideoContext {
  
  inline def apply(
    exitFullScreen: Callback,
    pause: Callback,
    play: Callback,
    playbackRate: Callback,
    requestFullScreen: Callback,
    seek: Callback,
    sendDanmu: Callback
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = exitFullScreen.toJsFn, pause = pause.toJsFn, play = play.toJsFn, playbackRate = playbackRate.toJsFn, requestFullScreen = requestFullScreen.toJsFn, seek = seek.toJsFn, sendDanmu = sendDanmu.toJsFn)
    __obj.asInstanceOf[VideoContext]
  }
  
  extension [Self <: VideoContext](x: Self) {
    
    inline def setExitFullScreen(value: Callback): Self = StObject.set(x, "exitFullScreen", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPlaybackRate(value: Callback): Self = StObject.set(x, "playbackRate", value.toJsFn)
    
    inline def setRequestFullScreen(value: Callback): Self = StObject.set(x, "requestFullScreen", value.toJsFn)
    
    inline def setSeek(value: Callback): Self = StObject.set(x, "seek", value.toJsFn)
    
    inline def setSendDanmu(value: Callback): Self = StObject.set(x, "sendDanmu", value.toJsFn)
  }
}
