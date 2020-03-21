package typingsJapgolly.reduxInjectableStore

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.redux.mod.StoreEnhancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redux-injectable-store", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  trait InjectableStore[S] extends Store[S, AnyAction] {
    def clearReducers(): Unit = js.native
    def inject(namespace: String, reducer: Reducer[_, AnyAction]): Unit = js.native
    def injectAll(reducers: StringDictionary[Reducer[_, AnyAction]]): Unit = js.native
  }
  
  @js.native
  trait InjectableStoreCreator extends js.Object {
    def apply[S](): InjectableStore[S] = js.native
    def apply[S](enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
    def apply[S](enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
    def apply[S](preloadedState: S): InjectableStore[S] = js.native
    def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object]): InjectableStore[S] = js.native
    def apply[S](preloadedState: S, enhancer: StoreEnhancer[S, js.Object], wrapReducer: WrapReducer[S]): InjectableStore[S] = js.native
  }
  
  val createInjectableStore: InjectableStoreCreator = js.native
  type WrapReducer[S] = js.Function1[/* reducer */ Reducer[S, AnyAction], Reducer[S, AnyAction]]
}

