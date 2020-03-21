package typingsJapgolly.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBatteryInfoSuccessCallbackResult extends js.Object {
  /** 是否正在充电中 */
  var isCharging: Boolean
  /** 设备电量，范围 1 - 100 */
  var level: String
}

object GetBatteryInfoSuccessCallbackResult {
  @scala.inline
  def apply(isCharging: Boolean, level: String): GetBatteryInfoSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(isCharging = isCharging.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBatteryInfoSuccessCallbackResult]
  }
}

