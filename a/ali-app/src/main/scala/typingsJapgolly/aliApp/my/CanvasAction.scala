package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasAction extends StObject {
  
  /**
    * 创建一个颜色的渐变点。
    * 小于最小 stop 的部分会按最小 stop 的 color 来渲染，大于最大 stop 的部分会按最大 stop 的 color 来渲染。
    *
    * @param stop 渐变点位置，值必须在 [0,1] 范围内
    * @param color 颜色值
    */
  def addColorStop(stop: Double, color: Color): Unit
}
object CanvasAction {
  
  inline def apply(addColorStop: (Double, Color) => Callback): CanvasAction = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: Color) => (addColorStop(t0, t1)).runNow()))
    __obj.asInstanceOf[CanvasAction]
  }
  
  extension [Self <: CanvasAction](x: Self) {
    
    inline def setAddColorStop(value: (Double, Color) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: Color) => (value(t0, t1)).runNow()))
  }
}
