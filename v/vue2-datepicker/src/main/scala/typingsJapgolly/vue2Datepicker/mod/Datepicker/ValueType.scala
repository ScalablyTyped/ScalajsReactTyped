package typingsJapgolly.vue2Datepicker.mod.Datepicker

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueType extends js.Object {
  var date: js.Date
  var format: String
  var timestamp: Double
  var token: String
}

object ValueType {
  @scala.inline
  def apply(date: js.Date, format: String, timestamp: Double, token: String): ValueType = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ValueType]
  }
}

