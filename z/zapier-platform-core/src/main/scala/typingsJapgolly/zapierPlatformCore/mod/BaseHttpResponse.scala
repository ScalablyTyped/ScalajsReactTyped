package typingsJapgolly.zapierPlatformCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseHttpResponse extends js.Object {
  var headers: StringDictionary[String]
  var request: HttpRequestOptions
  var status: Double
  def getHeader(key: String): js.UndefOr[String]
  def throwForStatus(): Unit
}

object BaseHttpResponse {
  @scala.inline
  def apply(
    getHeader: String => CallbackTo[js.UndefOr[String]],
    headers: StringDictionary[String],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: Callback
  ): BaseHttpResponse = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("throwForStatus")(throwForStatus.toJsFn)
    __obj.asInstanceOf[BaseHttpResponse]
  }
}

