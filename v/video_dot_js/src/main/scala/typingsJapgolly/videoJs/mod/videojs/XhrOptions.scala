package typingsJapgolly.videoJs.mod.videojs

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.XMLHttpRequest
import typingsJapgolly.videoJs.videoJsStrings.DELETE
import typingsJapgolly.videoJs.videoJsStrings.GET
import typingsJapgolly.videoJs.videoJsStrings.HEAD
import typingsJapgolly.videoJs.videoJsStrings.OPTIONS
import typingsJapgolly.videoJs.videoJsStrings.POST
import typingsJapgolly.videoJs.videoJsStrings.PUT
import typingsJapgolly.videoJs.videoJsStrings._empty
import typingsJapgolly.videoJs.videoJsStrings.arraybuffer
import typingsJapgolly.videoJs.videoJsStrings.blob
import typingsJapgolly.videoJs.videoJsStrings.document
import typingsJapgolly.videoJs.videoJsStrings.json
import typingsJapgolly.videoJs.videoJsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XhrOptions extends js.Object {
  var beforeSend: js.UndefOr[js.Function1[/* xhrObject */ XMLHttpRequest, Unit]] = js.undefined
  var body: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var json: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[DELETE | GET | HEAD | OPTIONS | POST | PUT] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  var responseType: js.UndefOr[_empty | arraybuffer | blob | document | json | text] = js.undefined
  var sync: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  var useXDR: js.UndefOr[Boolean] = js.undefined
  var username: js.UndefOr[String] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
  var xhr: js.UndefOr[XMLHttpRequest] = js.undefined
}

object XhrOptions {
  @scala.inline
  def apply(
    beforeSend: /* xhrObject */ XMLHttpRequest => Callback = null,
    body: js.Any = null,
    headers: js.Any = null,
    json: js.UndefOr[Boolean] = js.undefined,
    method: DELETE | GET | HEAD | OPTIONS | POST | PUT = null,
    password: String = null,
    responseType: _empty | arraybuffer | blob | document | json | text = null,
    sync: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    uri: String = null,
    url: String = null,
    useXDR: js.UndefOr[Boolean] = js.undefined,
    username: String = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined,
    xhr: XMLHttpRequest = null
  ): XhrOptions = {
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
    if (uri != null) __obj.updateDynamic("uri")(uri.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useXDR)) __obj.updateDynamic("useXDR")(useXDR.asInstanceOf[js.Any])
    if (username != null) __obj.updateDynamic("username")(username.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.asInstanceOf[js.Any])
    if (xhr != null) __obj.updateDynamic("xhr")(xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[XhrOptions]
  }
}

