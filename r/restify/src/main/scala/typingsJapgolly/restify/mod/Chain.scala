package typingsJapgolly.restify.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Chain extends js.Object {
  /** Prevents calling next multiple times */
  var onceNext: Boolean
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: Boolean
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): Unit
  /** Returns the number of handlers */
  def count(): Double
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler]
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[_]): Unit
}

object Chain {
  @scala.inline
  def apply(
    add: RequestHandler => Callback,
    count: CallbackTo[Double],
    getHandlers: CallbackTo[js.Array[RequestHandler]],
    onceNext: Boolean,
    run: (Request, Response, js.Function0[js.Any]) => Callback,
    strictNext: Boolean
  ): Chain = {
    val __obj = js.Dynamic.literal(onceNext = onceNext.asInstanceOf[js.Any], strictNext = strictNext.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.restify.mod.RequestHandler) => add(t0).runNow()))
    __obj.updateDynamic("count")(count.toJsFn)
    __obj.updateDynamic("getHandlers")(getHandlers.toJsFn)
    __obj.updateDynamic("run")(js.Any.fromFunction3((t0: typingsJapgolly.restify.mod.Request, t1: typingsJapgolly.restify.mod.Response, t2: js.Function0[js.Any]) => run(t0, t1, t2).runNow()))
    __obj.asInstanceOf[Chain]
  }
}

