package typingsJapgolly.zapierPlatformCore.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RawHttpResponse extends BaseHttpResponse {
  var body: ReadableStream[_]
  var content: Buffer
  var json: js.Promise[js.UndefOr[js.Object]]
}

object RawHttpResponse {
  @scala.inline
  def apply(
    body: ReadableStream[_],
    content: Buffer,
    getHeader: String => CallbackTo[js.UndefOr[String]],
    headers: StringDictionary[String],
    json: js.Promise[js.UndefOr[js.Object]],
    request: HttpRequestOptions,
    status: Double,
    throwForStatus: Callback
  ): RawHttpResponse = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("getHeader")(js.Any.fromFunction1((t0: java.lang.String) => getHeader(t0).runNow()))
    __obj.updateDynamic("throwForStatus")(throwForStatus.toJsFn)
    __obj.asInstanceOf[RawHttpResponse]
  }
}

