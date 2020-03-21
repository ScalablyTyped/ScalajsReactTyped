package typingsJapgolly.amapJsApiDriving.AMap.Driving

import typingsJapgolly.amapJsApi.AMap.LngLat
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TMC extends js.Object {
  /**
    * 此lcode对应的路段长度，单位: 米
    */
  var distance: Double
  /**
    * 路况信息对应的编码
    * 如果direction是正向 lcode返回值大于0；否则lcode，返回值小于0；
    * 如果返回0则说明此路段无lcode
    */
  var lcode: String | js.Array[scala.Nothing]
  var path: js.Array[LngLat]
  var polyline: String
  /**
    * 路况状态，可能的值有：未知，畅通，缓行，拥堵
    */
  var status: String
}

object TMC {
  @scala.inline
  def apply(
    distance: Double,
    lcode: String | js.Array[scala.Nothing],
    path: js.Array[LngLat],
    polyline: String,
    status: String
  ): TMC = {
    val __obj = js.Dynamic.literal(distance = distance.asInstanceOf[js.Any], lcode = lcode.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], polyline = polyline.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TMC]
  }
}

