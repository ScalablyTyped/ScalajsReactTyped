package typingsJapgolly.yogLog.mod

import typingsJapgolly.yogLog.yogLogStrings.ACCESS
import typingsJapgolly.yogLog.yogLogStrings.ACCESS_ERROR
import typingsJapgolly.yogLog.yogLogStrings.DEBUG
import typingsJapgolly.yogLog.yogLogStrings.FATAL
import typingsJapgolly.yogLog.yogLogStrings.NOTICE
import typingsJapgolly.yogLog.yogLogStrings.TRACE
import typingsJapgolly.yogLog.yogLogStrings.WARNING
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LEVELS extends js.Object {
  // 访问日志
  var `0`: ACCESS
  // 应用日志等级 ODP格式
  var `1`: FATAL
  var `16`: DEBUG
  var `2`: WARNING
  var `3`: ACCESS_ERROR
  var `4`: NOTICE
  var `8`: TRACE
}

object LEVELS {
  @scala.inline
  def apply(`0`: ACCESS, `1`: FATAL, `16`: DEBUG, `2`: WARNING, `3`: ACCESS_ERROR, `4`: NOTICE, `8`: TRACE): LEVELS = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("0")(`0`.asInstanceOf[js.Any])
    __obj.updateDynamic("1")(`1`.asInstanceOf[js.Any])
    __obj.updateDynamic("16")(`16`.asInstanceOf[js.Any])
    __obj.updateDynamic("2")(`2`.asInstanceOf[js.Any])
    __obj.updateDynamic("3")(`3`.asInstanceOf[js.Any])
    __obj.updateDynamic("4")(`4`.asInstanceOf[js.Any])
    __obj.updateDynamic("8")(`8`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LEVELS]
  }
}

