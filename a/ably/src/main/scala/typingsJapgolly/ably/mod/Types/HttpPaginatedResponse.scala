package typingsJapgolly.ably.mod.Types

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpPaginatedResponse
  extends PaginatedResult[js.Any] {
  var errorCode: Double
  var errorMessage: String
  var headers: js.Any
  @JSName("items")
  var items_HttpPaginatedResponse: js.Array[String]
  var statusCode: Double
  var success: Boolean
}

object HttpPaginatedResponse {
  @scala.inline
  def apply(
    current: paginatedResultCallback[js.Any] => Callback,
    errorCode: Double,
    errorMessage: String,
    first: paginatedResultCallback[js.Any] => Callback,
    hasNext: CallbackTo[Boolean],
    headers: js.Any,
    isLast: CallbackTo[Boolean],
    items: js.Array[String],
    next: paginatedResultCallback[js.Any] => Callback,
    statusCode: Double,
    success: Boolean
  ): HttpPaginatedResponse = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
    __obj.updateDynamic("current")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[js.Any]) => current(t0).runNow()))
    __obj.updateDynamic("first")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[js.Any]) => first(t0).runNow()))
    __obj.updateDynamic("hasNext")(hasNext.toJsFn)
    __obj.updateDynamic("isLast")(isLast.toJsFn)
    __obj.updateDynamic("next")(js.Any.fromFunction1((t0: typingsJapgolly.ably.mod.Types.paginatedResultCallback[js.Any]) => next(t0).runNow()))
    __obj.asInstanceOf[HttpPaginatedResponse]
  }
}

