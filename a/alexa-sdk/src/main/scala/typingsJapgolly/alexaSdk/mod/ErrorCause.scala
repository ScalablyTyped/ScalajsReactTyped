package typingsJapgolly.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCause extends js.Object {
  var requestId: String
}

object ErrorCause {
  @scala.inline
  def apply(requestId: String): ErrorCause = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ErrorCause]
  }
}

