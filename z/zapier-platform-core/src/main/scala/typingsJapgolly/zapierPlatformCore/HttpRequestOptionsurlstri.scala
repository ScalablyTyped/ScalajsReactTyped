package typingsJapgolly.zapierPlatformCore

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.experimental.ReadableStream
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.Agent
import typingsJapgolly.zapierPlatformCore.mod.HttpMethod
import typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.error
import typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.follow
import typingsJapgolly.zapierPlatformCore.zapierPlatformCoreStrings.manual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined zapier-platform-core.zapier-platform-core.HttpRequestOptions & {  url  :string} */
trait HttpRequestOptionsurlstri extends js.Object {
  var agent: js.UndefOr[Agent] = js.undefined
  var body: js.UndefOr[String | Buffer | ReadableStream[_] | js.Object] = js.undefined
  var compress: js.UndefOr[Boolean] = js.undefined
  var follow: js.UndefOr[Double] = js.undefined
  var form: js.UndefOr[js.Object] = js.undefined
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  var json: js.UndefOr[js.Object | js.Array[_]] = js.undefined
  var method: js.UndefOr[HttpMethod] = js.undefined
  var params: js.UndefOr[js.Object] = js.undefined
  var raw: js.UndefOr[Boolean] = js.undefined
  var redirect: js.UndefOr[manual | error | follow] = js.undefined
  var removeMissingValuesFrom: js.UndefOr[AnonBody] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object HttpRequestOptionsurlstri {
  @scala.inline
  def apply(
    agent: Agent = null,
    body: String | Buffer | ReadableStream[_] | js.Object = null,
    compress: js.UndefOr[Boolean] = js.undefined,
    follow: Int | Double = null,
    form: js.Object = null,
    headers: StringDictionary[String] = null,
    json: js.Object | js.Array[_] = null,
    method: HttpMethod = null,
    params: js.Object = null,
    raw: js.UndefOr[Boolean] = js.undefined,
    redirect: manual | error | follow = null,
    removeMissingValuesFrom: AnonBody = null,
    size: Int | Double = null,
    timeout: Int | Double = null,
    url: String = null
  ): HttpRequestOptionsurlstri = {
    val __obj = js.Dynamic.literal()
    if (agent != null) __obj.updateDynamic("agent")(agent.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (!js.isUndefined(compress)) __obj.updateDynamic("compress")(compress.asInstanceOf[js.Any])
    if (follow != null) __obj.updateDynamic("follow")(follow.asInstanceOf[js.Any])
    if (form != null) __obj.updateDynamic("form")(form.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (json != null) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (removeMissingValuesFrom != null) __obj.updateDynamic("removeMissingValuesFrom")(removeMissingValuesFrom.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRequestOptionsurlstri]
  }
}

