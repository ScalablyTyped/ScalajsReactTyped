package typingsJapgolly.expressHttpProxy.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.httpMod.IncomingHttpHeaders
import typingsJapgolly.node.httpMod.OutgoingHttpHeaders
import typingsJapgolly.node.httpMod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyOptions extends js.Object {
  var filter: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, Boolean]] = js.undefined
  var https: js.UndefOr[Boolean] = js.undefined
  /**
    * The byte limit of the body. This is the number of bytes or any string
    * format supported by `bytes`, for example `1000`, `'500kb'` or `'3mb'`.
    * See https://github.com/stream-utils/raw-body/blob/master/index.d.ts
    */
  var limit: js.UndefOr[Double | String] = js.undefined
  var memoizeHost: js.UndefOr[Boolean] = js.undefined
  var parseReqBody: js.UndefOr[Boolean] = js.undefined
  var preserveHostHdr: js.UndefOr[Boolean] = js.undefined
  var proxyErrorHandler: js.UndefOr[js.Function3[/* err */ js.Any, /* res */ Response_, /* next */ NextFunction, _]] = js.undefined
  var proxyReqBodyDecorator: js.UndefOr[
    js.Function2[/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary], _]
  ] = js.undefined
  var proxyReqOptDecorator: js.UndefOr[
    js.Function2[
      /* proxyReqOpts */ RequestOptions, 
      /* srcReq */ Request_[ParamsDictionary], 
      RequestOptions | js.Promise[RequestOptions]
    ]
  ] = js.undefined
  var proxyReqPathResolver: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary], String]] = js.undefined
  var reqAsBuffer: js.UndefOr[Boolean] = js.undefined
  var reqBodyEncoding: js.UndefOr[String | Null] = js.undefined
  var skipToNextHandlerFilter: js.UndefOr[js.Function1[/* proxyRes */ Response_, Boolean]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var userResDecorator: js.UndefOr[
    js.Function4[
      /* proxyRes */ Response_, 
      /* proxyResData */ js.Any, 
      /* userReq */ Request_[ParamsDictionary], 
      /* userRes */ Response_, 
      Buffer | String | (js.Promise[Buffer | String])
    ]
  ] = js.undefined
  var userResHeaderDecorator: js.UndefOr[
    js.Function5[
      /* headers */ IncomingHttpHeaders, 
      /* userReq */ Request_[ParamsDictionary], 
      /* userRes */ Response_, 
      /* proxyReq */ Request_[ParamsDictionary], 
      /* proxyRes */ Response_, 
      OutgoingHttpHeaders
    ]
  ] = js.undefined
}

object ProxyOptions {
  @scala.inline
  def apply(
    filter: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    https: js.UndefOr[Boolean] = js.undefined,
    limit: Double | String = null,
    memoizeHost: js.UndefOr[Boolean] = js.undefined,
    parseReqBody: js.UndefOr[Boolean] = js.undefined,
    preserveHostHdr: js.UndefOr[Boolean] = js.undefined,
    proxyErrorHandler: (/* err */ js.Any, /* res */ Response_, /* next */ NextFunction) => CallbackTo[js.Any] = null,
    proxyReqBodyDecorator: (/* bodyContent */ js.Any, /* srcReq */ Request_[ParamsDictionary]) => CallbackTo[js.Any] = null,
    proxyReqOptDecorator: (/* proxyReqOpts */ RequestOptions, /* srcReq */ Request_[ParamsDictionary]) => CallbackTo[RequestOptions | js.Promise[RequestOptions]] = null,
    proxyReqPathResolver: /* req */ Request_[ParamsDictionary] => CallbackTo[String] = null,
    reqAsBuffer: js.UndefOr[Boolean] = js.undefined,
    reqBodyEncoding: String = null,
    skipToNextHandlerFilter: /* proxyRes */ Response_ => CallbackTo[Boolean] = null,
    timeout: Int | Double = null,
    userResDecorator: (/* proxyRes */ Response_, /* proxyResData */ js.Any, /* userReq */ Request_[ParamsDictionary], /* userRes */ Response_) => CallbackTo[Buffer | String | (js.Promise[Buffer | String])] = null,
    userResHeaderDecorator: (/* headers */ IncomingHttpHeaders, /* userReq */ Request_[ParamsDictionary], /* userRes */ Response_, /* proxyReq */ Request_[ParamsDictionary], /* proxyRes */ Response_) => CallbackTo[OutgoingHttpHeaders] = null
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal()
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => filter(t0, t1).runNow()))
    if (!js.isUndefined(https)) __obj.updateDynamic("https")(https.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(memoizeHost)) __obj.updateDynamic("memoizeHost")(memoizeHost.asInstanceOf[js.Any])
    if (!js.isUndefined(parseReqBody)) __obj.updateDynamic("parseReqBody")(parseReqBody.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveHostHdr)) __obj.updateDynamic("preserveHostHdr")(preserveHostHdr.asInstanceOf[js.Any])
    if (proxyErrorHandler != null) __obj.updateDynamic("proxyErrorHandler")(js.Any.fromFunction3((t0: /* err */ js.Any, t1: /* res */ typingsJapgolly.express.mod.Response_, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => proxyErrorHandler(t0, t1, t2).runNow()))
    if (proxyReqBodyDecorator != null) __obj.updateDynamic("proxyReqBodyDecorator")(js.Any.fromFunction2((t0: /* bodyContent */ js.Any, t1: /* srcReq */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => proxyReqBodyDecorator(t0, t1).runNow()))
    if (proxyReqOptDecorator != null) __obj.updateDynamic("proxyReqOptDecorator")(js.Any.fromFunction2((t0: /* proxyReqOpts */ typingsJapgolly.node.httpMod.RequestOptions, t1: /* srcReq */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => proxyReqOptDecorator(t0, t1).runNow()))
    if (proxyReqPathResolver != null) __obj.updateDynamic("proxyReqPathResolver")(js.Any.fromFunction1((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary]) => proxyReqPathResolver(t0).runNow()))
    if (!js.isUndefined(reqAsBuffer)) __obj.updateDynamic("reqAsBuffer")(reqAsBuffer.asInstanceOf[js.Any])
    if (reqBodyEncoding != null) __obj.updateDynamic("reqBodyEncoding")(reqBodyEncoding.asInstanceOf[js.Any])
    if (skipToNextHandlerFilter != null) __obj.updateDynamic("skipToNextHandlerFilter")(js.Any.fromFunction1((t0: /* proxyRes */ typingsJapgolly.express.mod.Response_) => skipToNextHandlerFilter(t0).runNow()))
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (userResDecorator != null) __obj.updateDynamic("userResDecorator")(js.Any.fromFunction4((t0: /* proxyRes */ typingsJapgolly.express.mod.Response_, t1: /* proxyResData */ js.Any, t2: /* userReq */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t3: /* userRes */ typingsJapgolly.express.mod.Response_) => userResDecorator(t0, t1, t2, t3).runNow()))
    if (userResHeaderDecorator != null) __obj.updateDynamic("userResHeaderDecorator")(js.Any.fromFunction5((t0: /* headers */ typingsJapgolly.node.httpMod.IncomingHttpHeaders, t1: /* userReq */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t2: /* userRes */ typingsJapgolly.express.mod.Response_, t3: /* proxyReq */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t4: /* proxyRes */ typingsJapgolly.express.mod.Response_) => userResHeaderDecorator(t0, t1, t2, t3, t4).runNow()))
    __obj.asInstanceOf[ProxyOptions]
  }
}

