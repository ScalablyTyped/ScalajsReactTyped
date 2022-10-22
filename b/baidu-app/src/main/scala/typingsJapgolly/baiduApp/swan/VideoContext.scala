package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import typingsJapgolly.baiduApp.anon.Color
import typingsJapgolly.baiduApp.baiduAppDoubles.`0.5`
import typingsJapgolly.baiduApp.baiduAppDoubles.`0.8`
import typingsJapgolly.baiduApp.baiduAppDoubles.`1.0`
import typingsJapgolly.baiduApp.baiduAppDoubles.`1.25`
import typingsJapgolly.baiduApp.baiduAppDoubles.`1.5`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// 媒体-----视频组件控制
trait VideoContext extends StObject {
  
  // 进入全屏;
  /**
    * 退出全屏
    */
  def exitFullScreen(): Unit
  
  // 显示状态栏，仅在iOS全屏下有效;
  /**
    * 隐藏状态栏，仅在iOS全屏下有效
    */
  def hideStatusBar(): Unit
  
  /**
    * 暂停
    */
  def pause(): Unit
  
  /**
    * 播放
    */
  def play(): Unit
  
  /**
    *  设置倍速播放，支持的倍率有 0.5/0.8/1.0/1.25/1.5
    */
  def playbackRate(rate: `0.5` | `0.8` | `1.0` | `1.25` | `1.5`): Unit
  
  /**
    *  进入全屏
    */
  def requestFullScreen(): Unit
  
  /**
    * 跳转到指定位置，单位 s
    */
  def seek(position: Double): Unit
  
  /**
    * 发送弹幕，danmu 包含两个属性 text, color。
    */
  def sendDanmu(danmu: Color): Unit
  
  // 退出全屏;
  /**
    * 显示状态栏，仅在iOS全屏下有效
    */
  def showStatusBar(): Unit
}
object VideoContext {
  
  inline def apply(
    exitFullScreen: Callback,
    hideStatusBar: Callback,
    pause: Callback,
    play: Callback,
    playbackRate: `0.5` | `0.8` | `1.0` | `1.25` | `1.5` => Callback,
    requestFullScreen: Callback,
    seek: Double => Callback,
    sendDanmu: Color => Callback,
    showStatusBar: Callback
  ): VideoContext = {
    val __obj = js.Dynamic.literal(exitFullScreen = exitFullScreen.toJsFn, hideStatusBar = hideStatusBar.toJsFn, pause = pause.toJsFn, play = play.toJsFn, playbackRate = js.Any.fromFunction1((t0: `0.5` | `0.8` | `1.0` | `1.25` | `1.5`) => playbackRate(t0).runNow()), requestFullScreen = requestFullScreen.toJsFn, seek = js.Any.fromFunction1((t0: Double) => seek(t0).runNow()), sendDanmu = js.Any.fromFunction1((t0: Color) => sendDanmu(t0).runNow()), showStatusBar = showStatusBar.toJsFn)
    __obj.asInstanceOf[VideoContext]
  }
  
  extension [Self <: VideoContext](x: Self) {
    
    inline def setExitFullScreen(value: Callback): Self = StObject.set(x, "exitFullScreen", value.toJsFn)
    
    inline def setHideStatusBar(value: Callback): Self = StObject.set(x, "hideStatusBar", value.toJsFn)
    
    inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
    
    inline def setPlay(value: Callback): Self = StObject.set(x, "play", value.toJsFn)
    
    inline def setPlaybackRate(value: `0.5` | `0.8` | `1.0` | `1.25` | `1.5` => Callback): Self = StObject.set(x, "playbackRate", js.Any.fromFunction1((t0: `0.5` | `0.8` | `1.0` | `1.25` | `1.5`) => value(t0).runNow()))
    
    inline def setRequestFullScreen(value: Callback): Self = StObject.set(x, "requestFullScreen", value.toJsFn)
    
    inline def setSeek(value: Double => Callback): Self = StObject.set(x, "seek", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSendDanmu(value: Color => Callback): Self = StObject.set(x, "sendDanmu", js.Any.fromFunction1((t0: Color) => value(t0).runNow()))
    
    inline def setShowStatusBar(value: Callback): Self = StObject.set(x, "showStatusBar", value.toJsFn)
  }
}
