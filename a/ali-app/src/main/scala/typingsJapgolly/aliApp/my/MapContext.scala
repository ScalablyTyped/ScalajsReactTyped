package typingsJapgolly.aliApp.my

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapContext
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 获取当前地图中心的经纬度，返回 gcj02 坐标系的值，可以用于 my.openLocation
  		 *
  		 * @param options
  		 */
  def getCenterLocation(options: GetCenterLocationOptions): Unit
  /**
  		 * 将地图中心移动到当前定位点，需要配合 map 组件的 show-location 使用
  		 */
  def moveToLocation(): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationOptions => Callback,
    moveToLocation: Callback,
    complete: /* res */ js.Any => Callback = null,
    fail: js.Any => Callback = null,
    success: js.Any => Callback = null
  ): MapContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCenterLocation")(js.Any.fromFunction1((t0: typingsJapgolly.aliApp.my.GetCenterLocationOptions) => getCenterLocation(t0).runNow()))
    __obj.updateDynamic("moveToLocation")(moveToLocation.toJsFn)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1((t0: /* res */ js.Any) => complete(t0).runNow()))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1((t0: js.Any) => fail(t0).runNow()))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1((t0: js.Any) => success(t0).runNow()))
    __obj.asInstanceOf[MapContext]
  }
}

