package typingsJapgolly.actionsOnGoogle.apiV1Mod

import typingsJapgolly.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1QueryRequestDevices extends js.Object {
  var customData: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var id: String
}

object SmartHomeV1QueryRequestDevices {
  @scala.inline
  def apply(id: String, customData: ApiClientObjectMap[_] = null): SmartHomeV1QueryRequestDevices = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    if (customData != null) __obj.updateDynamic("customData")(customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1QueryRequestDevices]
  }
}

