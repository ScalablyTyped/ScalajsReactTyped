package typingsJapgolly.amapJsApiGeocoder.AMap.Geocoder

import typingsJapgolly.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Road extends js.Object {
  /**
    * 与查询点的相对方位
    */
  var direction: String
  /**
    * 道路离查询点最近距离
    */
  var distance: Double
  /**
    * 唯一标识
    */
  var id: String
  /**
    * 道路上离查询点最近的点坐标
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
}

object Road {
  @scala.inline
  def apply(direction: String, distance: Double, id: String, location: LngLat, name: String): Road = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], distance = distance.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Road]
  }
}

