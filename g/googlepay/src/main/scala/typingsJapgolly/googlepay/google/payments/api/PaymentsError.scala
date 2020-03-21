package typingsJapgolly.googlepay.google.payments.api

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentsError extends js.Object {
  var statusCode: ErrorStatusCode
  var statusMessage: String
}

object PaymentsError {
  @scala.inline
  def apply(statusCode: ErrorStatusCode, statusMessage: String): PaymentsError = {
    val __obj = js.Dynamic.literal(statusCode = statusCode.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PaymentsError]
  }
}

