package typingsJapgolly.baiduApp.swan

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baiduApp.AnonPadding
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * mapContext 通过 mapId 跟一个 <map/> 组件绑定，通过它可以操作对应的 <map/> 组件。
	 */
trait MapContext extends js.Object {
  /**
  		 * 获取当前地图中心的经纬度，返回的是 gcj02 坐标系，可以用于 swan.openLocation
  		 */
  def getCenterLocation(options: GetCenterLocationOptions): OpenLocationOptions
  def getRegion(options: GetRegionOptions): Unit
  def includePoints(options: AnonPadding): Unit
  /**
  		 * 将地图中心移动到当前定位点，需要配合map组件的show-location使用
  		 */
  def moveToLocation(): Unit
  def translateMarker(options: TranslateMarkerOptions): Unit
}

object MapContext {
  @scala.inline
  def apply(
    getCenterLocation: GetCenterLocationOptions => CallbackTo[OpenLocationOptions],
    getRegion: GetRegionOptions => Callback,
    includePoints: AnonPadding => Callback,
    moveToLocation: Callback,
    translateMarker: TranslateMarkerOptions => Callback
  ): MapContext = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCenterLocation")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.GetCenterLocationOptions) => getCenterLocation(t0).runNow()))
    __obj.updateDynamic("getRegion")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.GetRegionOptions) => getRegion(t0).runNow()))
    __obj.updateDynamic("includePoints")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.AnonPadding) => includePoints(t0).runNow()))
    __obj.updateDynamic("moveToLocation")(moveToLocation.toJsFn)
    __obj.updateDynamic("translateMarker")(js.Any.fromFunction1((t0: typingsJapgolly.baiduApp.swan.TranslateMarkerOptions) => translateMarker(t0).runNow()))
    __obj.asInstanceOf[MapContext]
  }
}

