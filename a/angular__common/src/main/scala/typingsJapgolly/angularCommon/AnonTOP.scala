package typingsJapgolly.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTOP extends js.Object {
  var JPY: js.Array[String]
  var TOP: js.Array[String]
  var USD: js.Array[String]
}

object AnonTOP {
  @scala.inline
  def apply(JPY: js.Array[String], TOP: js.Array[String], USD: js.Array[String]): AnonTOP = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], TOP = TOP.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTOP]
  }
}

