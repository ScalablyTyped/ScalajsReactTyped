package typingsJapgolly.findMyWay.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.findMyWay.AnonDeriveVersion
import typingsJapgolly.node.http2Mod.Http2ServerRequest
import typingsJapgolly.node.http2Mod.Http2ServerResponse
import typingsJapgolly.node.httpMod.IncomingMessage
import typingsJapgolly.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config[V /* <: HTTPVersion */] extends js.Object {
  var allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
  var defaultRoute: js.UndefOr[
    js.Function2[
      /* req */ Http2ServerRequest | IncomingMessage, 
      /* res */ Http2ServerResponse | ServerResponse, 
      Unit
    ]
  ] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined
  var maxParamLength: js.UndefOr[Double] = js.undefined
  var versioning: js.UndefOr[AnonDeriveVersion[V]] = js.undefined
}

object Config {
  @scala.inline
  def apply[V /* <: HTTPVersion */](
    allowUnsafeRegex: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    defaultRoute: (/* req */ Http2ServerRequest | IncomingMessage, /* res */ Http2ServerResponse | ServerResponse) => Callback = null,
    ignoreTrailingSlash: js.UndefOr[Boolean] = js.undefined,
    maxParamLength: Int | Double = null,
    versioning: AnonDeriveVersion[V] = null
  ): Config[V] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowUnsafeRegex)) __obj.updateDynamic("allowUnsafeRegex")(allowUnsafeRegex.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (defaultRoute != null) __obj.updateDynamic("defaultRoute")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.node.http2Mod.Http2ServerRequest | typingsJapgolly.node.httpMod.IncomingMessage, t1: /* res */ typingsJapgolly.node.http2Mod.Http2ServerResponse | typingsJapgolly.node.httpMod.ServerResponse) => defaultRoute(t0, t1).runNow()))
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash.asInstanceOf[js.Any])
    if (maxParamLength != null) __obj.updateDynamic("maxParamLength")(maxParamLength.asInstanceOf[js.Any])
    if (versioning != null) __obj.updateDynamic("versioning")(versioning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config[V]]
  }
}

