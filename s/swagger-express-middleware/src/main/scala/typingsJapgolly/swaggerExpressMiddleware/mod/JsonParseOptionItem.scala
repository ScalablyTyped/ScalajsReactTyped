package typingsJapgolly.swaggerExpressMiddleware.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonParseOptionItem extends js.Object {
  /**
    * if deflated bodies will be inflated. (default: true)
    */
  var inflate: js.UndefOr[Boolean] = js.undefined
  /**
    * Controls the maximum request body size.
    * If this is a number, then the value specifies the number of bytes; if it is a string, the value is passed to the bytes library for parsing.
    * Defaults to '100kb'
    */
  var limit: js.UndefOr[String | Double] = js.undefined
  /**
    * passed to JSON.parse().
    */
  var receiver: js.UndefOr[js.Function2[/* key */ String, /* value */ js.Any, _]] = js.undefined
  /**
    * only parse objects and arrays. (default: true)
    */
  var strict: js.UndefOr[Boolean] = js.undefined
  /**
    * The type option is used to determine what media type the middleware will parse.
    * This option can be a function or a string.
    * If a string, type option is passed directly to the type-is library and this can be an extension name (like json), a mime type (like application/json), or a mime * type with a wildcard (like * / * or * /json).
    * If a function, the type option is called as fn(req) and the request is parsed if it returns a truthy value. Defaults to application/json
    */
  var `type`: js.UndefOr[(js.Function1[/* req */ Request_[ParamsDictionary], String]) | String] = js.undefined
  /**
    * The verify option, if supplied, is called as verify(req, res, buf, encoding), where buf is a Buffer of the raw request body and encoding is the encoding of the request.
    * The parsing can be aborted by throwing an error.
    */
  var verify: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response, 
      /* buf */ Buffer, 
      /* encoding */ String, 
      Unit
    ]
  ] = js.undefined
}

object JsonParseOptionItem {
  @scala.inline
  def apply(
    inflate: js.UndefOr[Boolean] = js.undefined,
    limit: String | Double = null,
    receiver: (/* key */ String, /* value */ js.Any) => CallbackTo[js.Any] = null,
    strict: js.UndefOr[Boolean] = js.undefined,
    `type`: (js.Function1[/* req */ Request_[ParamsDictionary], String]) | String = null,
    verify: (/* req */ Request_[ParamsDictionary], /* res */ Response, /* buf */ Buffer, /* encoding */ String) => Callback = null
  ): JsonParseOptionItem = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(inflate)) __obj.updateDynamic("inflate")(inflate.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (receiver != null) __obj.updateDynamic("receiver")(js.Any.fromFunction2((t0: /* key */ java.lang.String, t1: /* value */ js.Any) => receiver(t0, t1).runNow()))
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (verify != null) __obj.updateDynamic("verify")(js.Any.fromFunction4((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.swaggerExpressMiddleware.mod.Response, t2: /* buf */ typingsJapgolly.node.Buffer, t3: /* encoding */ java.lang.String) => verify(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[JsonParseOptionItem]
  }
}

