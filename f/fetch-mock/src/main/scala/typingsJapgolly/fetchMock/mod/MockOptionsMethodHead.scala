package typingsJapgolly.fetchMock.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.fetchMock.fetchMockStrings.HEAD
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MockOptionsMethodHead extends MockOptions {
  @JSName("method")
  var method_MockOptionsMethodHead: js.UndefOr[HEAD] = js.undefined
}

object MockOptionsMethodHead {
  @scala.inline
  def apply(
    body: String | js.Object = null,
    functionMatcher: (/* url */ String, /* opts */ MockRequest) => CallbackTo[Boolean] = null,
    headers: StringDictionary[String | Double] = null,
    includeContentLength: js.UndefOr[Boolean] = js.undefined,
    matcher: MockMatcher = null,
    method: HEAD = null,
    name: String = null,
    overwriteRoutes: js.UndefOr[Boolean] = js.undefined,
    params: StringDictionary[String] = null,
    query: StringDictionary[String] = null,
    repeat: Int | Double = null,
    response: MockResponse | MockResponseFunction = null,
    sendAsJson: js.UndefOr[Boolean] = js.undefined
  ): MockOptionsMethodHead = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (functionMatcher != null) __obj.updateDynamic("functionMatcher")(js.Any.fromFunction2((t0: /* url */ java.lang.String, t1: /* opts */ typingsJapgolly.fetchMock.mod.MockRequest) => functionMatcher(t0, t1).runNow()))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContentLength)) __obj.updateDynamic("includeContentLength")(includeContentLength.asInstanceOf[js.Any])
    if (matcher != null) __obj.updateDynamic("matcher")(matcher.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(overwriteRoutes)) __obj.updateDynamic("overwriteRoutes")(overwriteRoutes.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (repeat != null) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    if (response != null) __obj.updateDynamic("response")(response.asInstanceOf[js.Any])
    if (!js.isUndefined(sendAsJson)) __obj.updateDynamic("sendAsJson")(sendAsJson.asInstanceOf[js.Any])
    __obj.asInstanceOf[MockOptionsMethodHead]
  }
}

