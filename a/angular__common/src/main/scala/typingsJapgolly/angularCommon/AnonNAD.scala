package typingsJapgolly.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNAD extends js.Object {
  var JPY: js.Array[String]
  var NAD: js.Array[String]
  var USD: js.Array[String]
}

object AnonNAD {
  @scala.inline
  def apply(JPY: js.Array[String], NAD: js.Array[String], USD: js.Array[String]): AnonNAD = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], NAD = NAD.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNAD]
  }
}

