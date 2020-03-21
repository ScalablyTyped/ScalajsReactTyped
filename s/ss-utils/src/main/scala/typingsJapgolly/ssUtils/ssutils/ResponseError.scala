package typingsJapgolly.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseError extends js.Object {
  var errorCode: String
  var fieldName: String
  var message: String
}

object ResponseError {
  @scala.inline
  def apply(errorCode: String, fieldName: String, message: String): ResponseError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], fieldName = fieldName.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponseError]
  }
}

