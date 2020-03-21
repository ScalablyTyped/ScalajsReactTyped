package typingsJapgolly.gapi.gapi.client

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestOptions extends js.Object {
  /**
    * The HTTP request body (applies to PUT or POST).
    */
  var body: js.UndefOr[js.Any] = js.undefined
  /**
    * If supplied, the request is executed immediately and no gapi.client.HttpRequest object is returned
    */
  var callback: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * Additional HTTP request headers
    */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
    * The HTTP request method to use. Default is GET
    */
  var method: js.UndefOr[String] = js.undefined
  /**
    * URL params in key-value pair form
    */
  var params: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL to handle the request
    */
  var path: String
}

object RequestOptions {
  @scala.inline
  def apply(
    path: String,
    body: js.Any = null,
    callback: js.UndefOr[CallbackTo[js.Any]] = js.undefined,
    headers: js.Any = null,
    method: String = null,
    params: js.Any = null
  ): RequestOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    callback.foreach(p => __obj.updateDynamic("callback")(p.toJsFn))
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
}

