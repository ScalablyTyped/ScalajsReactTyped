package typingsJapgolly.gapi.gapi.client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpRequestFulfilled[T] extends js.Object {
  var body: String
  var headers: js.UndefOr[js.Array[_]] = js.undefined
  var result: T
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
}

object HttpRequestFulfilled {
  @scala.inline
  def apply[T](
    body: String,
    result: T,
    headers: js.Array[_] = null,
    status: Int | Double = null,
    statusText: String = null
  ): HttpRequestFulfilled[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestFulfilled[T]]
  }
}

