package typingsJapgolly.xhr.mod

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.xhr.xhrStrings.DELETE
import typingsJapgolly.xhr.xhrStrings.GET
import typingsJapgolly.xhr.xhrStrings.HEAD
import typingsJapgolly.xhr.xhrStrings.OPTIONS
import typingsJapgolly.xhr.xhrStrings.POST
import typingsJapgolly.xhr.xhrStrings.PUT
import typingsJapgolly.xhr.xhrStrings._empty
import typingsJapgolly.xhr.xhrStrings.arraybuffer
import typingsJapgolly.xhr.xhrStrings.blob
import typingsJapgolly.xhr.xhrStrings.document
import typingsJapgolly.xhr.xhrStrings.json
import typingsJapgolly.xhr.xhrStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrBaseConfig extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
  var body: js.UndefOr[String | js.Any] = js.undefined
  var headers: js.UndefOr[XhrHeaders] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var useXDR: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}

object XhrBaseConfig {
  @scala.inline
  def apply(
    beforeSend: /* xhrObject */ XMLHttpRequest => Callback = null,
    body: String | js.Any = null,
    headers: XhrHeaders = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: _empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrBaseConfig = {
    val __obj = js.Dynamic.literal()
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1((t0: /* xhrObject */ org.scalajs.dom.raw.XMLHttpRequest) => beforeSend(t0).runNow()))
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (!js.isUndefined(json)) __obj.updateDynamic("json")(json.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (responseType != null) __obj.updateDynamic("responseType")(responseType.asInstanceOf[js.Any])
    if (!js.isUndefined(sync)) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrBaseConfig]
  }
}

