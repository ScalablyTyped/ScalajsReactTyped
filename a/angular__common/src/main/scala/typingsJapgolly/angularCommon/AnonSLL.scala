package typingsJapgolly.angularCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSLL extends js.Object {
  var JPY: js.Array[String]
  var SLL: js.Array[String]
  var USD: js.Array[String]
}

object AnonSLL {
  @scala.inline
  def apply(JPY: js.Array[String], SLL: js.Array[String], USD: js.Array[String]): AnonSLL = {
    val __obj = js.Dynamic.literal(JPY = JPY.asInstanceOf[js.Any], SLL = SLL.asInstanceOf[js.Any], USD = USD.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonSLL]
  }
}

