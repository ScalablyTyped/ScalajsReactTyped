package typingsJapgolly.zustand.anon

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.FunctionComponentElement
import typingsJapgolly.react.mod.ProviderProps
import typingsJapgolly.zustand.esmContextMod.UseContextStore
import typingsJapgolly.zustand.esmContextMod.WithoutCallSignature
import typingsJapgolly.zustand.vanillaMod.StoreApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UseStore[S /* <: StoreApi[Any] */] extends StObject {
  
  def Provider(hasCreateStoreChildren: Children[S]): FunctionComponentElement[ProviderProps[js.UndefOr[S]]]
  
  var useStore: UseContextStore[S]
  
  def useStoreApi(): WithoutCallSignature[S]
}
object UseStore {
  
  inline def apply[S /* <: StoreApi[Any] */](
    Provider: Children[S] => FunctionComponentElement[ProviderProps[js.UndefOr[S]]],
    useStore: UseContextStore[S],
    useStoreApi: CallbackTo[WithoutCallSignature[S]]
  ): UseStore[S] = {
    val __obj = js.Dynamic.literal(Provider = js.Any.fromFunction1(Provider), useStore = useStore.asInstanceOf[js.Any], useStoreApi = useStoreApi.toJsFn)
    __obj.asInstanceOf[UseStore[S]]
  }
  
  extension [Self <: UseStore[?], S /* <: StoreApi[Any] */](x: Self & UseStore[S]) {
    
    inline def setProvider(value: Children[S] => FunctionComponentElement[ProviderProps[js.UndefOr[S]]]): Self = StObject.set(x, "Provider", js.Any.fromFunction1(value))
    
    inline def setUseStore(value: UseContextStore[S]): Self = StObject.set(x, "useStore", value.asInstanceOf[js.Any])
    
    inline def setUseStoreApi(value: CallbackTo[WithoutCallSignature[S]]): Self = StObject.set(x, "useStoreApi", value.toJsFn)
  }
}
