package typingsJapgolly.documentdbServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Will contain error information if an error occurs, undefined otherwise. */
trait IRequestCallbackError extends js.Object {
  /** A string containing the error information. */
  var body: String
  /** The HTTP response code corresponding to the error. */
  var number: Double
}

object IRequestCallbackError {
  @scala.inline
  def apply(body: String, number: Double): IRequestCallbackError = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRequestCallbackError]
  }
}

