package typingsJapgolly.expressBrute.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.express.mod.RequestHandler
import typingsJapgolly.express.mod.Request_
import typingsJapgolly.express.mod.Response_
import typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Middleware.
  * @class
  */
trait ExpressBrute extends js.Object {
  /**
    * @summary Generates middleware that will bounce requests with the same key and IP address that happen faster than the current wait time by calling failCallback.
    * @param {Object} options The options.
    */
  def getMiddleware(options: Middleware): RequestHandler[ParamsDictionary]
  /**
    * @summary Middleware that will bounce requests that happen faster than the current wait time by calling failCallback.
    * @param {Request}     request     The HTTP request.
    * @param {Response}    response    The HTTP response.
    * @param {Function}    next        The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def prevent(request: Request_[ParamsDictionary], response: Response_, next: js.Function): RequestHandler[ParamsDictionary]
  /**
    * @summary Resets the wait time between requests back to its initial value.
    * @param {string}      ip      The IP address.
    * @param {string}      key     The key. response.
    * @param {Function}    next    The next middleware.
    * @return {RequestHandler} The Request handler.
    */
  def reset(ip: String, key: String, next: js.Function): RequestHandler[ParamsDictionary]
}

object ExpressBrute {
  @scala.inline
  def apply(
    getMiddleware: Middleware => CallbackTo[RequestHandler[ParamsDictionary]],
    prevent: (Request_[ParamsDictionary], Response_, js.Function) => CallbackTo[RequestHandler[ParamsDictionary]],
    reset: (String, String, js.Function) => CallbackTo[RequestHandler[ParamsDictionary]]
  ): ExpressBrute = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getMiddleware")(js.Any.fromFunction1((t0: typingsJapgolly.expressBrute.mod.Middleware) => getMiddleware(t0).runNow()))
    __obj.updateDynamic("prevent")(js.Any.fromFunction3((t0: typingsJapgolly.express.mod.Request_[typingsJapgolly.expressServeStaticCore.mod.ParamsDictionary], t1: typingsJapgolly.express.mod.Response_, t2: js.Function) => prevent(t0, t1, t2).runNow()))
    __obj.updateDynamic("reset")(js.Any.fromFunction3((t0: java.lang.String, t1: java.lang.String, t2: js.Function) => reset(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ExpressBrute]
  }
}

