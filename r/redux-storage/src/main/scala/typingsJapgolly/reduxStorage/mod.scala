package typingsJapgolly.reduxStorage

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.redux.mod.AnyAction
import typingsJapgolly.redux.mod.Dispatch
import typingsJapgolly.redux.mod.Middleware
import typingsJapgolly.redux.mod.Reducer
import typingsJapgolly.redux.mod.Store
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-storage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redux-storage", "LOAD")
  @js.native
  val LOAD: String = js.native
  
  @JSImport("redux-storage", "SAVE")
  @js.native
  val SAVE: String = js.native
  
  inline def createLoader[TState](engine: StorageEngine): Loader[TState] = ^.asInstanceOf[js.Dynamic].applyDynamic("createLoader")(engine.asInstanceOf[js.Any]).asInstanceOf[Loader[TState]]
  
  inline def createMiddleware(engine: StorageEngine): Middleware[js.Object, Any, Dispatch[AnyAction]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any]).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String]): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: js.Array[String]): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createMiddleware(engine: StorageEngine, actionBlacklist: js.Array[String], actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createMiddleware(engine: StorageEngine, actionBlacklist: Unit, actionWhitelist: js.Array[String]): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  inline def createMiddleware(engine: StorageEngine, actionBlacklist: Unit, actionWhitelist: ActionTypeCheckCallback): Middleware[js.Object, Any, Dispatch[AnyAction]] = (^.asInstanceOf[js.Dynamic].applyDynamic("createMiddleware")(engine.asInstanceOf[js.Any], actionBlacklist.asInstanceOf[js.Any], actionWhitelist.asInstanceOf[js.Any])).asInstanceOf[Middleware[js.Object, Any, Dispatch[AnyAction]]]
  
  inline def reducer[TState](reducer: Reducer[TState, AnyAction]): Reducer[TState, AnyAction] = ^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(reducer.asInstanceOf[js.Any]).asInstanceOf[Reducer[TState, AnyAction]]
  inline def reducer[TState](reducer: Reducer[TState, AnyAction], merger: StateMerger): Reducer[TState, AnyAction] = (^.asInstanceOf[js.Dynamic].applyDynamic("reducer")(reducer.asInstanceOf[js.Any], merger.asInstanceOf[js.Any])).asInstanceOf[Reducer[TState, AnyAction]]
  
  type ActionTypeCheckCallback = js.Function1[/* type */ String, Boolean]
  
  /**
    * Loader interface
    */
  type Loader[TState] = js.Function1[/* store */ Store[TState, AnyAction], PromiseLike[Any]]
  
  type StateMerger = js.Function2[/* oldState */ Any, /* newState */ Any, Any]
  
  trait StorageEngine extends StObject {
    
    /**
      * Load
      */
    def load(): PromiseLike[Any]
    
    /**
      * Save
      * @param state
      */
    def save(state: Any): PromiseLike[Any]
  }
  object StorageEngine {
    
    inline def apply(load: CallbackTo[PromiseLike[Any]], save: Any => PromiseLike[Any]): StorageEngine = {
      val __obj = js.Dynamic.literal(load = load.toJsFn, save = js.Any.fromFunction1(save))
      __obj.asInstanceOf[StorageEngine]
    }
    
    extension [Self <: StorageEngine](x: Self) {
      
      inline def setLoad(value: CallbackTo[PromiseLike[Any]]): Self = StObject.set(x, "load", value.toJsFn)
      
      inline def setSave(value: Any => PromiseLike[Any]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    }
  }
}
