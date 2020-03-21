package typingsJapgolly.elasticApmNode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterizedMessageObject extends js.Object {
  var message: String
  var params: js.Array[_]
}

object ParameterizedMessageObject {
  @scala.inline
  def apply(message: String, params: js.Array[_]): ParameterizedMessageObject = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParameterizedMessageObject]
  }
}

