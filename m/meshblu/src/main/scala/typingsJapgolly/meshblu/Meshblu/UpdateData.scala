package typingsJapgolly.meshblu.Meshblu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateData extends js.Object {
  var color: String
  var uuid: String
}

object UpdateData {
  @scala.inline
  def apply(color: String, uuid: String): UpdateData = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], uuid = uuid.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateData]
  }
}

