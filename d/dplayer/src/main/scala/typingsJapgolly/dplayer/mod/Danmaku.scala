package typingsJapgolly.dplayer.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Danmaku extends StObject {
  
  def clear(): Unit
  
  def draw(danmaku: DPlayerDanmakuItem): Unit
  
  def hide(): Unit
  
  def opacity(percentage: Double): Unit
  
  def send(danmaku: DPlayerDanmakuItem, callback: js.Function0[Unit]): Unit
  
  def show(): Unit
}
object Danmaku {
  
  inline def apply(
    clear: Callback,
    draw: DPlayerDanmakuItem => Callback,
    hide: Callback,
    opacity: Double => Callback,
    send: (DPlayerDanmakuItem, js.Function0[Unit]) => Callback,
    show: Callback
  ): Danmaku = {
    val __obj = js.Dynamic.literal(clear = clear.toJsFn, draw = js.Any.fromFunction1((t0: DPlayerDanmakuItem) => draw(t0).runNow()), hide = hide.toJsFn, opacity = js.Any.fromFunction1((t0: Double) => opacity(t0).runNow()), send = js.Any.fromFunction2((t0: DPlayerDanmakuItem, t1: js.Function0[Unit]) => (send(t0, t1)).runNow()), show = show.toJsFn)
    __obj.asInstanceOf[Danmaku]
  }
  
  extension [Self <: Danmaku](x: Self) {
    
    inline def setClear(value: Callback): Self = StObject.set(x, "clear", value.toJsFn)
    
    inline def setDraw(value: DPlayerDanmakuItem => Callback): Self = StObject.set(x, "draw", js.Any.fromFunction1((t0: DPlayerDanmakuItem) => value(t0).runNow()))
    
    inline def setHide(value: Callback): Self = StObject.set(x, "hide", value.toJsFn)
    
    inline def setOpacity(value: Double => Callback): Self = StObject.set(x, "opacity", js.Any.fromFunction1((t0: Double) => value(t0).runNow()))
    
    inline def setSend(value: (DPlayerDanmakuItem, js.Function0[Unit]) => Callback): Self = StObject.set(x, "send", js.Any.fromFunction2((t0: DPlayerDanmakuItem, t1: js.Function0[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setShow(value: Callback): Self = StObject.set(x, "show", value.toJsFn)
  }
}
