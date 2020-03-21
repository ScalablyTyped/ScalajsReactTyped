package typingsJapgolly.greasemonkey.GM

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.greasemonkey.AnonOnabort
import typingsJapgolly.greasemonkey.greasemonkeyStrings.CONNECT
import typingsJapgolly.greasemonkey.greasemonkeyStrings.DELETE
import typingsJapgolly.greasemonkey.greasemonkeyStrings.GET
import typingsJapgolly.greasemonkey.greasemonkeyStrings.HEAD
import typingsJapgolly.greasemonkey.greasemonkeyStrings.OPTIONS
import typingsJapgolly.greasemonkey.greasemonkeyStrings.PATCH
import typingsJapgolly.greasemonkey.greasemonkeyStrings.POST
import typingsJapgolly.greasemonkey.greasemonkeyStrings.PUT
import typingsJapgolly.greasemonkey.greasemonkeyStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request[TContext] extends js.Object {
  /**
    * When true, the data is sent as a Blob
    * @default false
    */
  var binary: js.UndefOr[Boolean] = js.undefined
  /**
    * Any object (Compatibility: 1.10+). This object will also be the
    * context property of the Response Object.
    */
  var context: js.UndefOr[TContext] = js.undefined
  /**
    * Data to send in the request body. Usually for POST method requests.
    * If the data field contains form-encoded data, you usually must also
    * set the header `'Content-Type': 'application/x-www-form-urlencoded'`
    * in the `headers` field.
    */
  var data: js.UndefOr[String] = js.undefined
  /** A set of headers to include in the request */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  /** String type of HTTP request to make (E.G. "GET", "POST") */
  var method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT
  // Event handlers
  /** Will be called when the request is aborted */
  var onabort: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  /** Will be called if an error occurs while processing the request */
  var onerror: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  /** Will be called when the request has completed successfully */
  var onload: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  /** Will be called when the request progress changes */
  var onprogress: js.UndefOr[js.Function1[/* response */ ProgressResponse[TContext], Unit]] = js.undefined
  /** Will be called repeatedly while the request is in progress */
  var onreadystatechange: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  /** Will be called if/when the request times out */
  var ontimeout: js.UndefOr[js.Function1[/* response */ Response[TContext], Unit]] = js.undefined
  /**
    * A MIME type to specify with the request (e.g.
    * "text/html; charset=ISO-8859-1")
    */
  var overrideMimeType: js.UndefOr[String] = js.undefined
  /** Password to use for authentication purposes */
  var password: js.UndefOr[String] = js.undefined
  /**
    * When `true`, this is a synchronous request.
    * Be careful: The entire Firefox UI will be locked and frozen until the
    * request completes.In this mode, more data will be available in the
    * return value.
    */
  var synchronous: js.UndefOr[Boolean] = js.undefined
  /**
    * The number of milliseconds to wait before terminating the call. Zero
    * (the default) means wait forever.
    */
  var timeout: js.UndefOr[Double] = js.undefined
  /**
    * Object containing optional function callbacks to monitor the upload
    * of data.
    */
  var upload: js.UndefOr[AnonOnabort[TContext]] = js.undefined
  // Fields
  /**
    * The URL to make the request to. Must be an absolute URL, beginning
    * with the scheme. May be relative to the current page.
    */
  var url: String
  /** User name to use for authentication purposes. */
  var user: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply[TContext](
    method: GET | POST | PUT | DELETE | PATCH | HEAD | TRACE | OPTIONS | CONNECT,
    url: String,
    binary: js.UndefOr[Boolean] = js.undefined,
    context: TContext = null,
    data: String = null,
    headers: StringDictionary[String] = null,
    onabort: /* response */ Response[TContext] => Callback = null,
    onerror: /* response */ Response[TContext] => Callback = null,
    onload: /* response */ Response[TContext] => Callback = null,
    onprogress: /* response */ ProgressResponse[TContext] => Callback = null,
    onreadystatechange: /* response */ Response[TContext] => Callback = null,
    ontimeout: /* response */ Response[TContext] => Callback = null,
    overrideMimeType: String = null,
    password: String = null,
    synchronous: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    upload: AnonOnabort[TContext] = null,
    user: String = null
  ): Request[TContext] = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(binary)) __obj.updateDynamic("binary")(binary.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (onabort != null) __obj.updateDynamic("onabort")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onabort(t0).runNow()))
    if (onerror != null) __obj.updateDynamic("onerror")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onerror(t0).runNow()))
    if (onload != null) __obj.updateDynamic("onload")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onload(t0).runNow()))
    if (onprogress != null) __obj.updateDynamic("onprogress")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.ProgressResponse[TContext]) => onprogress(t0).runNow()))
    if (onreadystatechange != null) __obj.updateDynamic("onreadystatechange")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => onreadystatechange(t0).runNow()))
    if (ontimeout != null) __obj.updateDynamic("ontimeout")(js.Any.fromFunction1((t0: /* response */ typingsJapgolly.greasemonkey.GM.Response[TContext]) => ontimeout(t0).runNow()))
    if (overrideMimeType != null) __obj.updateDynamic("overrideMimeType")(overrideMimeType.asInstanceOf[js.Any])
    if (password != null) __obj.updateDynamic("password")(password.asInstanceOf[js.Any])
    if (!js.isUndefined(synchronous)) __obj.updateDynamic("synchronous")(synchronous.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    if (user != null) __obj.updateDynamic("user")(user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request[TContext]]
  }
}

