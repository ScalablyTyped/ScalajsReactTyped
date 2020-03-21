package typingsJapgolly.zapierPlatformCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpResponse extends BaseHttpResponse {
  var content: String
  var json: js.UndefOr[js.Object] = js.undefined
}

object HttpResponse {
  @scala.inline
  def apply(
    content: String,
    getHeader: String => CallbackTo[js.UndefOr[String]],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: Callback,
    json: js.Object = null
  ): HttpResponse = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("throwForStatus")(throwForStatus.toJsFn)
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpResponse]
  }
}

