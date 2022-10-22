package typingsJapgolly.dispatchr

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.dispatchr.anon.ActionName
import typingsJapgolly.dispatchr.anon.FnCall
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dispatchr", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDispatcher(options: DispatcherOption): Dispatcher = ^.asInstanceOf[js.Dynamic].applyDynamic("createDispatcher")(options.asInstanceOf[js.Any]).asInstanceOf[Dispatcher]
  
  @js.native
  trait Dispatcher extends StObject {
    
    def createContext(context: js.Object): DispatcherContext = js.native
    
    def getStoreName(store: String): String = js.native
    def getStoreName(store: StoreClass): String = js.native
    
    def isRegistered(store: String): Boolean = js.native
    def isRegistered(store: StoreClass): Boolean = js.native
    
    def registerStore(store: StoreClass): Unit = js.native
  }
  
  @js.native
  trait DispatcherContext extends StObject {
    
    def dehydrate(): DispatcherState = js.native
    
    def dispatch(actionName: String, payload: Any): Unit = js.native
    
    var dispatcherInterface: DispatcherInterface = js.native
    
    def getStore(name: String): Store[js.Object] = js.native
    def getStore[T /* <: StoreClass */](name: T): T = js.native
    
    def rehydrate(dispatcherState: DispatcherState): Unit = js.native
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit = js.native
  }
  
  trait DispatcherError extends StObject {
    
    var message: String
    
    var meta: ActionName
    
    var `type`: String
  }
  object DispatcherError {
    
    inline def apply(message: String, meta: ActionName, `type`: String): DispatcherError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherError]
    }
    
    extension [Self <: DispatcherError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMeta(value: ActionName): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DispatcherInterface extends StObject {
    
    def getContext(): DispatcherContext
    
    def getStore(name: String): Store[js.Object]
    def getStore[T /* <: StoreClass */](name: T): T
    @JSName("getStore")
    var getStore_Original: FnCall
    
    def waitFor(stores: js.Array[String | StoreClass], callback: js.Function0[Unit]): Unit
    @JSName("waitFor")
    var waitFor_Original: js.Function2[/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit], Unit]
  }
  object DispatcherInterface {
    
    inline def apply(
      getContext: CallbackTo[DispatcherContext],
      getStore: FnCall,
      waitFor: (/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit]) => Callback
    ): DispatcherInterface = {
      val __obj = js.Dynamic.literal(getContext = getContext.toJsFn, getStore = getStore.asInstanceOf[js.Any], waitFor = js.Any.fromFunction2((t0: /* stores */ js.Array[String | StoreClass], t1: /* callback */ js.Function0[Unit]) => (waitFor(t0, t1)).runNow()))
      __obj.asInstanceOf[DispatcherInterface]
    }
    
    extension [Self <: DispatcherInterface](x: Self) {
      
      inline def setGetContext(value: CallbackTo[DispatcherContext]): Self = StObject.set(x, "getContext", value.toJsFn)
      
      inline def setGetStore(value: FnCall): Self = StObject.set(x, "getStore", value.asInstanceOf[js.Any])
      
      inline def setWaitFor(value: (/* stores */ js.Array[String | StoreClass], /* callback */ js.Function0[Unit]) => Callback): Self = StObject.set(x, "waitFor", js.Any.fromFunction2((t0: /* stores */ js.Array[String | StoreClass], t1: /* callback */ js.Function0[Unit]) => (value(t0, t1)).runNow()))
    }
  }
  
  trait DispatcherOption extends StObject {
    
    var errorHandler: js.UndefOr[js.Function2[/* e */ DispatcherError, /* context */ DispatcherContext, Unit]] = js.undefined
    
    var stores: js.UndefOr[js.Array[StoreClass]] = js.undefined
  }
  object DispatcherOption {
    
    inline def apply(): DispatcherOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DispatcherOption]
    }
    
    extension [Self <: DispatcherOption](x: Self) {
      
      inline def setErrorHandler(value: (/* e */ DispatcherError, /* context */ DispatcherContext) => Callback): Self = StObject.set(x, "errorHandler", js.Any.fromFunction2((t0: /* e */ DispatcherError, t1: /* context */ DispatcherContext) => (value(t0, t1)).runNow()))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setStores(value: js.Array[StoreClass]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
      
      inline def setStoresUndefined: Self = StObject.set(x, "stores", js.undefined)
      
      inline def setStoresVarargs(value: StoreClass*): Self = StObject.set(x, "stores", js.Array(value*))
    }
  }
  
  trait DispatcherState extends StObject {
    
    var stores: StringDictionary[Any]
  }
  object DispatcherState {
    
    inline def apply(stores: StringDictionary[Any]): DispatcherState = {
      val __obj = js.Dynamic.literal(stores = stores.asInstanceOf[js.Any])
      __obj.asInstanceOf[DispatcherState]
    }
    
    extension [Self <: DispatcherState](x: Self) {
      
      inline def setStores(value: StringDictionary[Any]): Self = StObject.set(x, "stores", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store[S] extends EventEmitter {
    
    var dehydrate: js.UndefOr[js.Function0[S]] = js.native
    
    def emitChange(): Unit = js.native
    
    var rehydrate: js.UndefOr[js.Function1[/* state */ S, Unit]] = js.native
    
    var shouldDehydrate: js.UndefOr[js.Function0[Boolean]] = js.native
  }
  
  @js.native
  trait StoreClass
    extends StObject
       with Instantiable0[Store[js.Object]] {
    
    var storeName: String = js.native
  }
}
