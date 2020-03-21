package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CanvasAction extends js.Object {
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
  @scala.inline
  def apply(addColorStop: (Double, Color) => Callback): CanvasAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addColorStop")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.aliApp.my.Color) => addColorStop(t0, t1).runNow()))
    __obj.asInstanceOf[CanvasAction]
  }
}

