package typingsJapgolly.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGYD extends js.Object {
  var GYD: js.Array[String]
  var JPY: js.Array[String]
  var USD: js.Array[String]
}

object AnonGYD {
  @scala.inline
  def apply(GYD: js.Array[String], JPY: js.Array[String], USD: js.Array[String]): AnonGYD = {
    val __obj = js.Dynamic.literal(GYD = GYD.asInstanceOf[js.Any], JPY = JPY.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGYD]
  }
}

