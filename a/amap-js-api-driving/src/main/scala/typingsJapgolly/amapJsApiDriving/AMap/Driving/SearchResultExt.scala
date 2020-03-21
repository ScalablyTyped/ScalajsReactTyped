package typingsJapgolly.amapJsApiDriving.AMap.Driving

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiDriving.AnonIsWaypoint
import typingsJapgolly.amapJsApiPlaceSearch.AMap.PlaceSearch.PoiExt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResultExt
  extends SearchResultCommon
     with SearchResult {
  /**
    * 驾车规划终点名称
    */
  var destinationName: String
  /**
    * 驾车规划终点
    */
  var end: PoiExt
  /**
    * 驾车规划起点名称
    */
  var originName: String
  /**
    * 驾车规划起点
    */
  var start: PoiExt
  /**
    * 驾车规划途经点
    */
  var waypoints: js.Array[PoiExt with AnonIsWaypoint]
}

object SearchResultExt {
  @scala.inline
  def apply(
    destination: LngLat,
    destinationName: String,
    end: PoiExt,
    info: String,
    origin: LngLat,
    originName: String,
    routes: js.Array[DriveRoute],
    start: PoiExt,
    waypoints: js.Array[PoiExt with AnonIsWaypoint],
    taxi_cost: Int | Double = null
  ): SearchResultExt = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], destinationName = destinationName.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], originName = originName.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], waypoints = waypoints.asInstanceOf[js.Any])
    if (taxi_cost != null) __obj.updateDynamic("taxi_cost")(taxi_cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchResultExt]
  }
}

