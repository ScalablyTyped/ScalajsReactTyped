package typingsJapgolly.webpack.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemCacheFacade extends StObject {
  
  def get[T](callback: CallbackCache[T]): Unit
  
  def getPromise[T](): js.Promise[T]
  
  def provide[T](
    computer: js.Function1[/* arg0 */ CallbackNormalErrorCache[T], Unit],
    callback: CallbackNormalErrorCache[T]
  ): Unit
  
  def providePromise[T](computer: js.Function0[T | js.Promise[T]]): js.Promise[T]
  
  def store[T](data: T, callback: CallbackCache[Unit]): Unit
  
  def storePromise[T](data: T): js.Promise[Unit]
}
object ItemCacheFacade {
  
  inline def apply(
    get: CallbackCache[Any] => Callback,
    getPromise: CallbackTo[js.Promise[Any]],
    provide: (js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], CallbackNormalErrorCache[Any]) => Callback,
    providePromise: js.Function0[Any | js.Promise[Any]] => js.Promise[Any],
    store: (Any, CallbackCache[Unit]) => Callback,
    storePromise: Any => js.Promise[Unit]
  ): ItemCacheFacade = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1((t0: CallbackCache[Any]) => get(t0).runNow()), getPromise = getPromise.toJsFn, provide = js.Any.fromFunction2((t0: js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], t1: CallbackNormalErrorCache[Any]) => (provide(t0, t1)).runNow()), providePromise = js.Any.fromFunction1(providePromise), store = js.Any.fromFunction2((t0: Any, t1: CallbackCache[Unit]) => (store(t0, t1)).runNow()), storePromise = js.Any.fromFunction1(storePromise))
    __obj.asInstanceOf[ItemCacheFacade]
  }
  
  extension [Self <: ItemCacheFacade](x: Self) {
    
    inline def setGet(value: CallbackCache[Any] => Callback): Self = StObject.set(x, "get", js.Any.fromFunction1((t0: CallbackCache[Any]) => value(t0).runNow()))
    
    inline def setGetPromise(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "getPromise", value.toJsFn)
    
    inline def setProvide(
      value: (js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], CallbackNormalErrorCache[Any]) => Callback
    ): Self = StObject.set(x, "provide", js.Any.fromFunction2((t0: js.Function1[/* arg0 */ CallbackNormalErrorCache[Any], Unit], t1: CallbackNormalErrorCache[Any]) => (value(t0, t1)).runNow()))
    
    inline def setProvidePromise(value: js.Function0[Any | js.Promise[Any]] => js.Promise[Any]): Self = StObject.set(x, "providePromise", js.Any.fromFunction1(value))
    
    inline def setStore(value: (Any, CallbackCache[Unit]) => Callback): Self = StObject.set(x, "store", js.Any.fromFunction2((t0: Any, t1: CallbackCache[Unit]) => (value(t0, t1)).runNow()))
    
    inline def setStorePromise(value: Any => js.Promise[Unit]): Self = StObject.set(x, "storePromise", js.Any.fromFunction1(value))
  }
}
