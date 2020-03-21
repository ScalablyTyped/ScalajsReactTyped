package typingsJapgolly.angularCommon

import typingsJapgolly.angularCommon.httpHttpMod.HttpHeaders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody[T] extends js.Object {
  var body: js.UndefOr[T | Null] = js.undefined
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  var status: js.UndefOr[Double] = js.undefined
  var statusText: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AnonBody {
  @scala.inline
  def apply[T](
    body: T = null,
    headers: HttpHeaders = null,
    status: Int | Double = null,
    statusText: String = null,
    url: String = null
  ): AnonBody[T] = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusText != null) __obj.updateDynamic("statusText")(statusText.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody[T]]
  }
}

