package typingsJapgolly.reduxInjectableStore

import typingsJapgolly.redux.mod.Action
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.ReducersMapObject
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.redux.mod.StoreEnhancer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-injectable-store", "createInjectableStore")
  @js.native
  val createInjectableStore: InjectableStoreCreator = js.native
  
  @js.native
  trait InjectableStore[S]
    extends StObject
       with Store[S, AnyAction] {
    
    def clearReducers(): Unit = js.native
    
    def inject(namespace: String, reducer: Reducer[S, AnyAction]): Unit = js.native
    def inject(namespace: String, reducer: Reducer[S, AnyAction], force: Boolean): Unit = js.native
    
    def injectAll(reducers: ReducersMapObject[Any, Action[Any]]): Unit = js.native
    def injectAll(reducers: ReducersMapObject[Any, Action[Any]], force: Boolean): Unit = js.native
  }
  
  type InjectableStoreCreator = js.Function3[
    /* preloadedState */ js.UndefOr[Any], 
    /* enhancer */ js.UndefOr[StoreEnhancer[Any, js.Object]], 
    /* wrapReducer */ js.UndefOr[WrapReducer[Any]], 
    InjectableStore[Any]
  ]
  
  type WrapReducer[S] = js.Function1[/* reducer */ Reducer[S, AnyAction], Reducer[S, AnyAction]]
}
