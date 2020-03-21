package typingsJapgolly.expressSlowDown.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * express-slow-down options
  */
trait Options extends js.Object {
  /**
    * Max number of connections during `windowMs` before starting to delay responses.
    * Defaults to `1`. Set to `0` to disable delaying.
    */
  var delayAfter: js.UndefOr[Double] = js.undefined
  /**
    * How long to delay the response, multiplied by `(number recent hits - delayAfter)`.
    * Defaults to `1000` (1 second). Set to `0` to disable delaying.
    */
  var delayMs: js.UndefOr[Double] = js.undefined
  /**
    * Function used to generate keys. By default user IP address (`req.ip`) is used.
    * Default: `(req, res) => req.ip`
    */
  var keyGenerator: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, String]] = js.undefined
  /**
    * Maximum value for `delayMs` after many consecutive attempts, that is, after the n-th request,
    * the delay will be always `maxDelayMs`. Important when your application is running behind a
    * load balancer or reverse proxy that has a request timeout. Defaults to Infinity.
    */
  var maxDelayMs: js.UndefOr[Double] = js.undefined
  /**
    * Function to execute the first time the limit is reached within `windowMs`.
    * Default: `(req, res, opts) => {}`
    */
  var onLimitReached: js.UndefOr[
    js.Function3[/* req */ RequestWithSlowDown, /* res */ Response_, /* optionsUsed */ this.type, Unit]
  ] = js.undefined
  /**
    * Function used to skip requests. Returning `true` from the function will skip delaying for that request.
    * Default: `(req, res) => false`
    */
  var skip: js.UndefOr[js.Function2[/* req */ Request_[ParamsDictionary], /* res */ Response_, Boolean]] = js.undefined
  /**
    * When `true` failed requests (response status >= 400) won't be counted. Defaults to `false`.
    */
  var skipFailedRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true` successful requests (response status < 400) won't be counted. Defaults to `false`.
    */
  var skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined
  /**
    * The storage to use when persisting request attempts. By default, the MemoryStore is used.
    */
  var store: js.UndefOr[Store] = js.undefined
  /**
    * How long to keep records of requests in memory. Defaults to `60000` (1 minute)
    */
  var windowMs: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    delayAfter: Int | Double = null,
    delayMs: Int | Double = null,
    keyGenerator: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[String] = null,
    maxDelayMs: Int | Double = null,
    onLimitReached: (/* req */ RequestWithSlowDown, /* res */ Response_, Options) => Callback = null,
    skip: (/* req */ Request_[ParamsDictionary], /* res */ Response_) => CallbackTo[Boolean] = null,
    skipFailedRequests: js.UndefOr[Boolean] = js.undefined,
    skipSuccessfulRequests: js.UndefOr[Boolean] = js.undefined,
    store: Store = null,
    windowMs: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (delayAfter != null) __obj.updateDynamic("delayAfter")(delayAfter.asInstanceOf[js.Any])
    if (delayMs != null) __obj.updateDynamic("delayMs")(delayMs.asInstanceOf[js.Any])
    if (keyGenerator != null) __obj.updateDynamic("keyGenerator")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => keyGenerator(t0, t1).runNow()))
    if (maxDelayMs != null) __obj.updateDynamic("maxDelayMs")(maxDelayMs.asInstanceOf[js.Any])
    if (onLimitReached != null) __obj.updateDynamic("onLimitReached")(js.Any.fromFunction3((t0: /* req */ typingsJapgolly.expressSlowDown.mod.RequestWithSlowDown, t1: /* res */ typingsJapgolly.express.mod.Response_, t2: typingsJapgolly.expressSlowDown.mod.Options) => onLimitReached(t0, t1, t2).runNow()))
    if (skip != null) __obj.updateDynamic("skip")(js.Any.fromFunction2((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_) => skip(t0, t1).runNow()))
    if (!js.isUndefined(skipFailedRequests)) __obj.updateDynamic("skipFailedRequests")(skipFailedRequests.asInstanceOf[js.Any])
    if (!js.isUndefined(skipSuccessfulRequests)) __obj.updateDynamic("skipSuccessfulRequests")(skipSuccessfulRequests.asInstanceOf[js.Any])
    if (store != null) __obj.updateDynamic("store")(store.asInstanceOf[js.Any])
    if (windowMs != null) __obj.updateDynamic("windowMs")(windowMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

