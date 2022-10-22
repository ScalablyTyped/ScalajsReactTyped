package typingsJapgolly.callbackToAsyncIterator

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.AsyncIterableIterator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("callback-to-async-iterator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T, R](listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]]): AsyncIterableIterator[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any]).asInstanceOf[AsyncIterableIterator[T]]
  inline def default[T, R](
    listener: js.Function1[/* callback */ js.Function1[/* message */ T, Unit], js.Promise[R]],
    options: AsyncifyOptions[T, R]
  ): AsyncIterableIterator[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(listener.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[AsyncIterableIterator[T]]
  
  trait AsyncifyOptions[T, R] extends StObject {
    
    var buffering: js.UndefOr[Boolean] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* arg */ R, Unit | T]] = js.undefined
    
    var onError: js.UndefOr[js.Function0[js.Error]] = js.undefined
  }
  object AsyncifyOptions {
    
    inline def apply[T, R](): AsyncifyOptions[T, R] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncifyOptions[T, R]]
    }
    
    extension [Self <: AsyncifyOptions[?, ?], T, R](x: Self & (AsyncifyOptions[T, R])) {
      
      inline def setBuffering(value: Boolean): Self = StObject.set(x, "buffering", value.asInstanceOf[js.Any])
      
      inline def setBufferingUndefined: Self = StObject.set(x, "buffering", js.undefined)
      
      inline def setOnClose(value: /* arg */ R => Unit | T): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnError(value: CallbackTo[js.Error]): Self = StObject.set(x, "onError", value.toJsFn)
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
    }
  }
}
