package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.std.Partial
import typingsJapgolly.zustand.middlewarePersistMod.PersistListener
import typingsJapgolly.zustand.middlewarePersistMod.PersistOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOptions[S, Ps] extends StObject {
  
  def clearStorage(): Unit
  
  def getOptions(): Partial[PersistOptions[S, Ps]]
  
  def hasHydrated(): Boolean
  
  def onFinishHydration(fn: PersistListener[S]): js.Function0[Unit]
  
  def onHydrate(fn: PersistListener[S]): js.Function0[Unit]
  
  def rehydrate(): js.Promise[Unit]
  
  def setOptions(options: Partial[PersistOptions[S, Ps]]): Unit
}
object GetOptions {
  
  inline def apply[S, Ps](
    clearStorage: Callback,
    getOptions: CallbackTo[Partial[PersistOptions[S, Ps]]],
    hasHydrated: CallbackTo[Boolean],
    onFinishHydration: PersistListener[S] => js.Function0[Unit],
    onHydrate: PersistListener[S] => js.Function0[Unit],
    rehydrate: CallbackTo[js.Promise[Unit]],
    setOptions: Partial[PersistOptions[S, Ps]] => Callback
  ): GetOptions[S, Ps] = {
    val __obj = js.Dynamic.literal(clearStorage = clearStorage.toJsFn, getOptions = getOptions.toJsFn, hasHydrated = hasHydrated.toJsFn, onFinishHydration = js.Any.fromFunction1(onFinishHydration), onHydrate = js.Any.fromFunction1(onHydrate), rehydrate = rehydrate.toJsFn, setOptions = js.Any.fromFunction1((t0: Partial[PersistOptions[S, Ps]]) => setOptions(t0).runNow()))
    __obj.asInstanceOf[GetOptions[S, Ps]]
  }
  
  extension [Self <: GetOptions[?, ?], S, Ps](x: Self & (GetOptions[S, Ps])) {
    
    inline def setClearStorage(value: Callback): Self = StObject.set(x, "clearStorage", value.toJsFn)
    
    inline def setGetOptions(value: CallbackTo[Partial[PersistOptions[S, Ps]]]): Self = StObject.set(x, "getOptions", value.toJsFn)
    
    inline def setHasHydrated(value: CallbackTo[Boolean]): Self = StObject.set(x, "hasHydrated", value.toJsFn)
    
    inline def setOnFinishHydration(value: PersistListener[S] => js.Function0[Unit]): Self = StObject.set(x, "onFinishHydration", js.Any.fromFunction1(value))
    
    inline def setOnHydrate(value: PersistListener[S] => js.Function0[Unit]): Self = StObject.set(x, "onHydrate", js.Any.fromFunction1(value))
    
    inline def setRehydrate(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "rehydrate", value.toJsFn)
    
    inline def setSetOptions(value: Partial[PersistOptions[S, Ps]] => Callback): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: Partial[PersistOptions[S, Ps]]) => value(t0).runNow()))
  }
}
