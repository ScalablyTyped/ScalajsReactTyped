package typingsJapgolly.minappEnv.wx

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasGradient extends StObject {
  
  /** [CanvasGradient.addColorStop(number stop, [Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html) color)](CanvasGradient.addColorStop.md)
  *
  * 添加颜色的渐变点。小于最小 stop 的部分会按最小 stop 的 color 来渲染，大于最大 stop 的部分会按最大 stop 的 color 来渲染
  *
  * **示例代码**
  *
  *
  * ```js
  const ctx = wx.createCanvasContext('myCanvas')
    
  // Create circular gradient
  const grd = ctx.createLinearGradient(30, 10, 120, 10)
  grd.addColorStop(0, 'red')
  grd.addColorStop(0.16, 'orange')
  grd.addColorStop(0.33, 'yellow')
  grd.addColorStop(0.5, 'green')
  grd.addColorStop(0.66, 'cyan')
  grd.addColorStop(0.83, 'blue')
  grd.addColorStop(1, 'purple')
    
  // Fill with gradient
  ctx.setFillStyle(grd)
  ctx.fillRect(10, 10, 150, 80)
  ctx.draw()
  ```
  * ![]((canvas/color-stop.png)) */
  def addColorStop(
    /** 表示渐变中开始与结束之间的位置，范围 0-1。 */
  stop: Double,
    /** [Color](https://developers.weixin.qq.com/miniprogram/dev/api/canvas/Color.html)
    *
    * 渐变点的颜色。 */
  color: Color
  ): Unit
}
object CanvasGradient {
  
  inline def apply(addColorStop: (Double, Color) => Callback): CanvasGradient = {
    val __obj = js.Dynamic.literal(addColorStop = js.Any.fromFunction2((t0: Double, t1: Color) => (addColorStop(t0, t1)).runNow()))
    __obj.asInstanceOf[CanvasGradient]
  }
  
  extension [Self <: CanvasGradient](x: Self) {
    
    inline def setAddColorStop(value: (Double, Color) => Callback): Self = StObject.set(x, "addColorStop", js.Any.fromFunction2((t0: Double, t1: Color) => (value(t0, t1)).runNow()))
  }
}
