package typingsJapgolly.amapJsApiRiding.AMap.Riding

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.end
import typingsJapgolly.amapJsApiRiding.amapJsApiRidingStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  /**
    * 坐标
    */
  var location: LngLat
  /**
    * 名称
    */
  var name: String
  /**
    * 类型
    */
  var `type`: start | end
}

object Poi {
  @scala.inline
  def apply(location: LngLat, name: String, `type`: start | end): Poi = {
    val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Poi]
  }
}

