package typingsJapgolly.awsSdkHttpSerialization.mod

import typingsJapgolly.awsSdkTypes.httpMod.HeaderBag
import typingsJapgolly.awsSdkTypes.httpMod.QueryParameterBag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@aws-sdk/types.@aws-sdk/types.HttpRequest<string>> & @aws-sdk/types.@aws-sdk/types.HttpMessage<string> & {  method  :string} */
trait DerivedHttpRequest extends js.Object {
  var body: js.UndefOr[
    scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String
  ] = js.undefined
  var headers: js.UndefOr[HeaderBag] = js.undefined
  var hostname: js.UndefOr[String] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
  var query: js.UndefOr[QueryParameterBag] = js.undefined
}

object DerivedHttpRequest {
  @scala.inline
  def apply(
    body: scala.scalajs.js.typedarray.ArrayBuffer | scala.scalajs.js.typedarray.ArrayBufferView | String = null,
    headers: HeaderBag = null,
    hostname: String = null,
    method: String = null,
    path: String = null,
    port: Int | Double = null,
    protocol: String = null,
    query: QueryParameterBag = null
  ): DerivedHttpRequest = {
    val __obj = js.Dynamic.literal()
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[DerivedHttpRequest]
  }
}

