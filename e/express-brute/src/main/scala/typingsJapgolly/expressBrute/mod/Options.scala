package typingsJapgolly.expressBrute.mod

import japgolly.scalajs.react.Callback
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * @summary Specify whether or not a simplified reset method should be attached at req.brute.reset. The simplified method takes only a callback, and resets all ExpressBrute middleware that was called on the current request. If multiple instances of ExpressBrute have middleware on the same request, only those with attachResetToRequest set to true will be reset (default: true)
    */
  var attachResetToRequest: js.UndefOr[Boolean] = js.undefined
  /**
    * @summary Gets called with (req, res, next, nextValidRequestDate) when a request is rejected (default: ExpressBrute.FailForbidden)
    */
  var failCallback: js.UndefOr[
    js.Function4[
      /* req */ Request_[ParamsDictionary], 
      /* res */ Response_, 
      /* next */ js.Function, 
      /* nextValidRequestDate */ js.Any, 
      Unit
    ]
  ] = js.undefined
  /**
    * @summary The number of retires the user has before they need to start waiting (default: 2)
    */
  var freeRetries: js.UndefOr[Double] = js.undefined
  /**
    * @summary Gets called whenever an error occurs with the persistent store from which ExpressBrute cannot recover. It is passed an object containing the properties message (a description of the message), parent (the error raised by the session store), and [key, ip] or [req, res, next] depending on whether or the error occurs during reset or in the middleware itself.
    */
  var handleStoreError: js.UndefOr[js.Any] = js.undefined
  /**
    * @summary The length of time (in seconds since the last request) to remember the number of requests that have been made by an IP. By default it will be set to maxWait * the number of attempts before you hit maxWait to discourage simply waiting for the lifetime to expire before resuming an attack. With default values this is about 6 hours.
    */
  var lifetime: js.UndefOr[Double] = js.undefined
  /**
    * @summary The maximum amount of time (in milliseconds) between requests the user needs to wait (default: 15 minutes). The wait for a given request is determined by adding the time the user needed to wait for the previous two requests.
    */
  var maxWait: js.UndefOr[Double] = js.undefined
  /**
    * @summary The initial wait time (in milliseconds) after the user runs out of retries (default: 500 milliseconds)
    */
  var minWait: js.UndefOr[Double] = js.undefined
  /**
    * @summary Defines whether the lifetime counts from the time of the last request that ExpressBrute didn't prevent for a given IP (true) or from of that IP's first request (false). Useful for allowing limits over fixed periods of time, for example: a limited number of requests per day. (Default: true).
    */
  var refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    attachResetToRequest: js.UndefOr[Boolean] = js.undefined,
    failCallback: (/* req */ Request_[ParamsDictionary], /* res */ Response_, /* next */ js.Function, /* nextValidRequestDate */ js.Any) => Callback = null,
    freeRetries: Int | Double = null,
    handleStoreError: js.Any = null,
    lifetime: Int | Double = null,
    maxWait: Int | Double = null,
    minWait: Int | Double = null,
    refreshTimeoutOnRequest: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attachResetToRequest)) __obj.updateDynamic("attachResetToRequest")(attachResetToRequest.asInstanceOf[js.Any])
    if (failCallback != null) __obj.updateDynamic("failCallback")(js.Any.fromFunction4((t0: /* req */ typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: /* res */ typingsJapgolly.express.mod.Response_, t2: /* next */ js.Function, t3: /* nextValidRequestDate */ js.Any) => failCallback(t0, t1, t2, t3).runNow()))
    if (freeRetries != null) __obj.updateDynamic("freeRetries")(freeRetries.asInstanceOf[js.Any])
    if (handleStoreError != null) __obj.updateDynamic("handleStoreError")(handleStoreError.asInstanceOf[js.Any])
    if (lifetime != null) __obj.updateDynamic("lifetime")(lifetime.asInstanceOf[js.Any])
    if (maxWait != null) __obj.updateDynamic("maxWait")(maxWait.asInstanceOf[js.Any])
    if (minWait != null) __obj.updateDynamic("minWait")(minWait.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshTimeoutOnRequest)) __obj.updateDynamic("refreshTimeoutOnRequest")(refreshTimeoutOnRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

