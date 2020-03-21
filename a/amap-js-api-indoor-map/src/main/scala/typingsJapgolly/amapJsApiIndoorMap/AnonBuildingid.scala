package typingsJapgolly.amapJsApiIndoorMap

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiIndoorMap.AMap.IndoorMap.Shop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBuildingid extends js.Object {
  /**
    * 店铺所属楼宇信息
    */
  var building_id: String
  /**
    * 楼层
    */
  var floor: Double
  /**
    * 经纬度
    */
  var lnglat: LngLat
  /**
    * 商店
    */
  var shop: Shop
}

object AnonBuildingid {
  @scala.inline
  def apply(building_id: String, floor: Double, lnglat: LngLat, shop: Shop): AnonBuildingid = {
    val __obj = js.Dynamic.literal(building_id = building_id.asInstanceOf[js.Any], floor = floor.asInstanceOf[js.Any], lnglat = lnglat.asInstanceOf[js.Any], shop = shop.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonBuildingid]
  }
}

