package typingsJapgolly.matrixAppserviceBridge

import typingsJapgolly.matrixAppserviceBridge.libComponentsRequestMod.Request
import typingsJapgolly.matrixAppserviceBridge.libComponentsRequestMod.RequestOpts
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsRequestFactoryMod {
  
  @JSImport("matrix-appservice-bridge/lib/components/request-factory", "RequestFactory")
  @js.native
  open class RequestFactory () extends StObject {
    
    /* private */ var _rejects: Any = js.native
    
    /* private */ var _resolves: Any = js.native
    
    /* private */ var _timeouts: Any = js.native
    
    /**
      * Add a function which will be invoked for every request that is rejected.
      * @param fn The function to invoke. The first argument will be the
      * Request object, the second will be the rejection argument.
      */
    def addDefaultRejectCallback(fn: HandlerFunction): Unit = js.native
    
    /**
      * Add a function which will be invoked for every request that is resolved.
      * @param fn The function to invoke. The first argument will be the
      * Request object, the second will be the resolve argument.
      */
    def addDefaultResolveCallback(fn: HandlerFunction): Unit = js.native
    
    /**
      * Add a function which will be invoked for every request that has not been
      * resolved or rejected within a certain amount of time.
      * @param fn The function to invoke. The first argument will be the
      * Request object.
      * @param durationMs The number of milliseconds to wait for a
      * resolution to the request.
      */
    def addDefaultTimeoutCallback(fn: TimeoutFunction, durationMs: Double): Unit = js.native
    
    /**
      * Generate a new request.
      * @param opts The options to pass to the Request constructor, if any.
      * @return A new request object
      */
    def newRequest[T](): Request[T | Null] = js.native
    def newRequest[T](opts: RequestOpts[T]): Request[T | Null] = js.native
  }
  
  type HandlerFunction = js.Function2[/* req */ Request[Any], /* value */ Any, js.Promise[Any] | Any]
  
  type TimeoutFunction = js.Function1[/* req */ Request[Any], Unit]
}
