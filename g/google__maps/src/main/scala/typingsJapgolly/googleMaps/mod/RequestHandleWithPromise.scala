package typingsJapgolly.googleMaps.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestHandleWithPromise[T]
  extends StObject
     with RequestHandle[T] {
  
  /**
    * Returns the response as a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise).
    * This method is only available if you supplied the `Promise` constructor to the `createClient()` method when you constructed
    * the client object.
    */
  def asPromise(): js.Promise[ClientResponse[T]]
}
object RequestHandleWithPromise {
  
  inline def apply[T](
    asPromise: CallbackTo[js.Promise[ClientResponse[T]]],
    cancel: Callback,
    `finally`: js.Function0[Unit] => RequestHandle[T]
  ): RequestHandleWithPromise[T] = {
    val __obj = js.Dynamic.literal(asPromise = asPromise.toJsFn, cancel = cancel.toJsFn)
    __obj.updateDynamic("finally")(js.Any.fromFunction1(`finally`))
    __obj.asInstanceOf[RequestHandleWithPromise[T]]
  }
  
  extension [Self <: RequestHandleWithPromise[?], T](x: Self & RequestHandleWithPromise[T]) {
    
    inline def setAsPromise(value: CallbackTo[js.Promise[ClientResponse[T]]]): Self = StObject.set(x, "asPromise", value.toJsFn)
  }
}
