package typingsJapgolly.restify.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chain extends StObject {
  
  /** Utilize the given middleware `handler` */
  def add(handler: RequestHandler): Unit
  
  /** Returns the number of handlers */
  def count(): Double
  
  /** Get handlers of a chain instance */
  def getHandlers(): js.Array[RequestHandler]
  
  /** Prevents calling next multiple times */
  var onceNext: Boolean
  
  /** Handle server requests, punting them down the middleware stack. */
  def run(req: Request, res: Response, done: js.Function0[Any]): Unit
  
  /** Throws error when next() is called more than once, enables onceNext option */
  var strictNext: Boolean
}
object Chain {
  
  inline def apply(
    add: RequestHandler => Callback,
    count: CallbackTo[Double],
    getHandlers: CallbackTo[js.Array[RequestHandler]],
    onceNext: Boolean,
    run: (Request, Response, js.Function0[Any]) => Callback,
    strictNext: Boolean
  ): Chain = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1((t0: RequestHandler) => add(t0).runNow()), count = count.toJsFn, getHandlers = getHandlers.toJsFn, onceNext = onceNext.asInstanceOf[js.Any], run = js.Any.fromFunction3((t0: Request, t1: Response, t2: js.Function0[Any]) => (run(t0, t1, t2)).runNow()), strictNext = strictNext.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chain]
  }
  
  extension [Self <: Chain](x: Self) {
    
    inline def setAdd(value: RequestHandler => Callback): Self = StObject.set(x, "add", js.Any.fromFunction1((t0: RequestHandler) => value(t0).runNow()))
    
    inline def setCount(value: CallbackTo[Double]): Self = StObject.set(x, "count", value.toJsFn)
    
    inline def setGetHandlers(value: CallbackTo[js.Array[RequestHandler]]): Self = StObject.set(x, "getHandlers", value.toJsFn)
    
    inline def setOnceNext(value: Boolean): Self = StObject.set(x, "onceNext", value.asInstanceOf[js.Any])
    
    inline def setRun(value: (Request, Response, js.Function0[Any]) => Callback): Self = StObject.set(x, "run", js.Any.fromFunction3((t0: Request, t1: Response, t2: js.Function0[Any]) => (value(t0, t1, t2)).runNow()))
    
    inline def setStrictNext(value: Boolean): Self = StObject.set(x, "strictNext", value.asInstanceOf[js.Any])
  }
}
