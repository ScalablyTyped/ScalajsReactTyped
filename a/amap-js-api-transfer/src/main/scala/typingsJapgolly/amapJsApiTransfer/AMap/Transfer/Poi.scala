package typingsJapgolly.amapJsApiTransfer.AMap.Transfer

import typingsJapgolly.amapJsApi.AMap.LngLat
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.end
import typingsJapgolly.amapJsApiTransfer.amapJsApiTransferStrings.start
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Poi extends js.Object {
  var location: LngLat
  var name: String
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

