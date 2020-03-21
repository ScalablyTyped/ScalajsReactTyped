package typingsJapgolly.expressRateLimit.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.NextFunction
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The funciton to handle requests once `max` is exceeded. It receives the request and response objects.
    * The "next" param is available if you need to pass to the next middleware. The `req.rateLimit` object
    * has `limit`, `current`, and `remaining` number of requests, and if the store provides it, a `resetTime`
    * Date object.
    * Default: `(req, res, next) => res.status(options.statusCode).send(options.message)`
    */
  var handler: js.UndefOr[
    js.Function3[/* req */ Request_[ParamsDictionary], /* res */ Response_, /* next */ NextFunction, _]
  ] = js.undefined
  /**
    * Enable headers for request limit (`X-RateLimit-Limit`) and current usage (`X-RateLimit-Remaining`) on all
    * responses andtime to wait before retrying (`Retry-After`) when `max` is exceeded. Defaults to `true`.
    */
  var headers: js.UndefOr[Boolean] = js.undefined
  /**
    * Function used to generate keys. Defaults to using `req.ip`.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, String]] = js.undefined
  /**
    * Max number of connections during `windowMs` before sending a 429 response. May be a `number` or
    * a function that returns a `number` or a `Promise<number>`. Defaults to `5`. Set to `0` to disable.
    */
  var max: js.UndefOr[Double | MaxValueFn] = js.undefined
  /**
    * Error message sent to user when `max` is exceeded. May be a `string`, JSON object, or any other value
    * that Express's `req.send()` supports. Defaults to `'Too many requests, please try again later.'`.
    */
  var message: js.UndefOr[String | Buffer | Message] = js.undefined
  /**
    * Function that is called the first time `max` is exceeded. The `req.rateLimit` object has `limit`, `current`,
    * and `remaining` number of requests and, if the store provides it, a `resetTime` Date object. Default is
    * an empty function.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response_, 
      /* optionsUsed */ this.type, 
      Unit
    ]
  ] = js.undefined
  /**
    * Function used to skip requests. Returning `true` from the function will skip limiting for that request. Defaults to
    * always `false` (count all requests).
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, Boolean]] = js.undefined
  /**
    * When set to `true`, failed requests (status >= 400, request canceled or errored) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * When set to `true`, successful requests (status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * HTTP status code returned when `max` is exceeded. Defaults to `429`.
    */
  var statusCode: js.UndefOr[Double] = js.undefined
  /**
    * The storage to use when persisting rate limit attempts.
    */
  var store: js.UndefOr[Store] = js.undefined
  /**
    * How long in milliseconds to keep records of requests in memory. Defaults to `60000` (1 minute).
    */
  var windowMs: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    handler: (/* req */ Request_[ParamsDictionary], /* res */ Response_, /* next */ NextFunction) => CallbackTo[js.Any] = null,
    headers: js.UndefOr[Boolean] = js.undefined,
    keyGenerator: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[String] = null,
    max: Double | MaxValueFn = null,
    message: String | Buffer | Message = null,
    onLimitReached: (/* req */ Request_[ParamsDictionary], /* res */ Response_, Options) => Callback = null,
    skip: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    skipFailedRequests: js.UndefOr[Boolean] = js.undefined,
    skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined,
    statusCode: Int | Double = null,
    store: Store = null,
    windowMs: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (handler != null) __obj.updateDynamic("handler")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_, t2: /* next */ typingsJapgolly.express.mod.NextFunction) => handler(t0, t1, t2).runNow()))
    if (!js.isUndefined(headers)) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (keyGenerator != null) __obj.updateDynamic("keyGenerator")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => keyGenerator(t0, t1).runNow()))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (onLimitReached != null) __obj.updateDynamic("onLimitReached")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_, t2: typingsJapgolly.expressRateLimit.mod.Options) => onLimitReached(t0, t1, t2).runNow()))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => skip(t0, t1).runNow()))
    if (!js.isUndefined(skipFailedRequests)) __obj.updateDynamic("skipFailedRequests")(skipFailedRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSuccessfulRequests)) __obj.updateDynamic("skipSuccessfulRequests")(skipSuccessfulRequests.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (windowMs != null) __obj.updateDynamic("windowMs")(windowMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

