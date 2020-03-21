package typingsJapgolly.httperr.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An instance of the HttpError class. */
trait HttpError extends Error {
  var code: String
  /** The HTTP response status code for the HTTP error. */
  var statusCode: Double
  /** A human-readable title for the HTTP error. */
  var title: String
  def toObject(skip: (String | js.RegExp)*): js.Any
}

object HttpError {
  @scala.inline
  def apply(
    code: String,
    message: String,
    name: String,
    statusCode: Double,
    title: String,
    toObject: /* repeated */ String | js.RegExp => CallbackTo[js.Any],
    stack: String = null
  ): HttpError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("toObject")(js.Any.fromFunction1((t0: /* repeated */ java.lang.String | js.RegExp) => toObject(t0).runNow()))
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpError]
  }
}

