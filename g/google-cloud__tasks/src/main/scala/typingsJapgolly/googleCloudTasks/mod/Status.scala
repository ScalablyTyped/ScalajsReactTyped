package typingsJapgolly.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Status extends js.Object {
  var code: Double
  var details: js.Array[js.Object]
  var message: String
}

object Status {
  @scala.inline
  def apply(code: Double, details: js.Array[js.Object], message: String): Status = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Status]
  }
}

