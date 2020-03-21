package typingsJapgolly.reactAlert.mod

import typingsJapgolly.reactAlert.reactAlertStrings.error
import typingsJapgolly.reactAlert.reactAlertStrings.info
import typingsJapgolly.reactAlert.reactAlertStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Types_ extends js.Object {
  var ERROR: error
  var INFO: info
  var SUCCESS: success
}

object Types_ {
  @scala.inline
  def apply(ERROR: error, INFO: info, SUCCESS: success): Types_ = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Types_]
  }
}

