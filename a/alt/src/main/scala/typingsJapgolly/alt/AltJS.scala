package typingsJapgolly.alt

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AltJS {
  
  @js.native
  sealed trait lifeCycleEvents extends StObject
  @JSGlobal("AltJS.lifeCycleEvents")
  @js.native
  object lifeCycleEvents extends StObject {
    
    @js.native
    sealed trait bootstrap
      extends StObject
         with lifeCycleEvents
    
    @js.native
    sealed trait error
      extends StObject
         with lifeCycleEvents
    
    @js.native
    sealed trait init
      extends StObject
         with lifeCycleEvents
    
    @js.native
    sealed trait rollback
      extends StObject
         with lifeCycleEvents
    
    @js.native
    sealed trait snapshot
      extends StObject
         with lifeCycleEvents
  }
  
  @js.native
  trait Action[T] extends StObject {
    
    def apply(args: T): Unit = js.native
    
    def defer(data: Any): Unit = js.native
  }
  
  @js.native
  trait ActionHandler extends StObject {
    
    def apply(data: Any*): Any = js.native
  }
  
  type Actions = StringDictionary[Action[Any]]
  
  trait ActionsClass extends StObject {
    
    var actions: js.UndefOr[Actions] = js.undefined
    
    def dispatch(payload: Any*): Unit
    
    var generateActions: js.UndefOr[js.Function1[/* repeated */ String, Unit]] = js.undefined
  }
  object ActionsClass {
    
    inline def apply(dispatch: /* repeated */ Any => Callback): ActionsClass = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1((t0: /* repeated */ Any) => dispatch(t0).runNow()))
      __obj.asInstanceOf[ActionsClass]
    }
    
    extension [Self <: ActionsClass](x: Self) {
      
      inline def setActions(value: Actions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
      
      inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
      
      inline def setDispatch(value: /* repeated */ Any => Callback): Self = StObject.set(x, "dispatch", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setGenerateActions(value: /* repeated */ String => Callback): Self = StObject.set(x, "generateActions", js.Any.fromFunction1((t0: /* repeated */ String) => value(t0).runNow()))
      
      inline def setGenerateActionsUndefined: Self = StObject.set(x, "generateActions", js.undefined)
    }
  }
  
  type ActionsClassConstructor = Instantiable1[/* alt */ Alt, ActionsClass]
  
  @js.native
  trait Alt extends StObject {
    
    var actions: Actions = js.native
    
    //Actions methods
    def addActions(actionsName: String, ActionsClass: ActionsClassConstructor): Unit = js.native
    
    //Stores methods
    def addStore(name: String, store: StoreModel[Any]): Unit = js.native
    def addStore(name: String, store: StoreModel[Any], saveStore: Boolean): Unit = js.native
    
    def bootstrap(jsonData: String): Unit = js.native
    
    def createActions[T](ActionsClass: ActionsClassConstructor): T = js.native
    def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object): T = js.native
    def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: js.Object, constructorArgs: Any*): T = js.native
    def createActions[T](ActionsClass: ActionsClassConstructor, exportObj: Unit, constructorArgs: Any*): T = js.native
    
    def createStore[S](store: StoreModel[S]): AltStore[S] = js.native
    def createStore[S](store: StoreModel[S], name: String): AltStore[S] = js.native
    
    def dispatch(): Unit = js.native
    def dispatch(action: String): Unit = js.native
    def dispatch(action: String, data: js.Object): Unit = js.native
    def dispatch(action: String, data: js.Object, details: Any): Unit = js.native
    def dispatch(action: String, data: Unit, details: Any): Unit = js.native
    def dispatch(action: Unit, data: js.Object): Unit = js.native
    def dispatch(action: Unit, data: js.Object, details: Any): Unit = js.native
    def dispatch(action: Unit, data: Unit, details: Any): Unit = js.native
    def dispatch(action: Action[Any]): Unit = js.native
    def dispatch(action: Action[Any], data: js.Object): Unit = js.native
    def dispatch(action: Action[Any], data: js.Object, details: Any): Unit = js.native
    def dispatch(action: Action[Any], data: Unit, details: Any): Unit = js.native
    
    def flush(): js.Object = js.native
    
    def generateActions[T](actions: String*): T = js.native
    
    def getActions(actionsName: String): Actions = js.native
    
    def getStore(name: String): AltStore[Any] = js.native
    
    def recycle(stores: AltStore[Any]*): Unit = js.native
    
    def rollback(): Unit = js.native
    
    def takeSnapshot(storeNames: String*): String = js.native
  }
  
  trait AltConfig extends StObject {
    
    var batchingFunction: js.UndefOr[js.Function1[/* callback */ js.Function1[/* repeated */ Any, Any], Unit]] = js.undefined
    
    var deserialize: js.UndefOr[
        js.Function1[/* deserializeFn */ js.Function1[/* serialData */ String, js.Object], Unit]
      ] = js.undefined
    
    var dispatcher: js.UndefOr[Any] = js.undefined
    
    var serialize: js.UndefOr[js.Function1[/* serializeFn */ js.Function1[/* data */ js.Object, String], Unit]] = js.undefined
    
    var storeTransforms: js.UndefOr[js.Array[StateTransform]] = js.undefined
  }
  object AltConfig {
    
    inline def apply(): AltConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AltConfig]
    }
    
    extension [Self <: AltConfig](x: Self) {
      
      inline def setBatchingFunction(value: /* callback */ js.Function1[/* repeated */ Any, Any] => Callback): Self = StObject.set(x, "batchingFunction", js.Any.fromFunction1((t0: /* callback */ js.Function1[/* repeated */ Any, Any]) => value(t0).runNow()))
      
      inline def setBatchingFunctionUndefined: Self = StObject.set(x, "batchingFunction", js.undefined)
      
      inline def setDeserialize(value: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object] => Callback): Self = StObject.set(x, "deserialize", js.Any.fromFunction1((t0: /* deserializeFn */ js.Function1[/* serialData */ String, js.Object]) => value(t0).runNow()))
      
      inline def setDeserializeUndefined: Self = StObject.set(x, "deserialize", js.undefined)
      
      inline def setDispatcher(value: Any): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setSerialize(value: /* serializeFn */ js.Function1[/* data */ js.Object, String] => Callback): Self = StObject.set(x, "serialize", js.Any.fromFunction1((t0: /* serializeFn */ js.Function1[/* data */ js.Object, String]) => value(t0).runNow()))
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStoreTransforms(value: js.Array[StateTransform]): Self = StObject.set(x, "storeTransforms", value.asInstanceOf[js.Any])
      
      inline def setStoreTransformsUndefined: Self = StObject.set(x, "storeTransforms", js.undefined)
      
      inline def setStoreTransformsVarargs(value: StateTransform*): Self = StObject.set(x, "storeTransforms", js.Array(value*))
    }
  }
  
  @js.native
  trait AltFactory
    extends StObject
       with Instantiable0[Alt]
       with Instantiable1[/* config */ AltConfig, Alt]
  
  trait AltStore[S] extends StObject {
    
    def emitChange(): Unit
    
    def getState(): S
    
    def listen(handler: js.Function1[/* state */ S, Any]): js.Function0[Unit]
    
    def unlisten(handler: js.Function1[/* state */ S, Any]): Unit
  }
  object AltStore {
    
    inline def apply[S](
      emitChange: Callback,
      getState: CallbackTo[S],
      listen: js.Function1[/* state */ S, Any] => js.Function0[Unit],
      unlisten: js.Function1[/* state */ S, Any] => Callback
    ): AltStore[S] = {
      val __obj = js.Dynamic.literal(emitChange = emitChange.toJsFn, getState = getState.toJsFn, listen = js.Any.fromFunction1(listen), unlisten = js.Any.fromFunction1((t0: js.Function1[/* state */ S, Any]) => unlisten(t0).runNow()))
      __obj.asInstanceOf[AltStore[S]]
    }
    
    extension [Self <: AltStore[?], S](x: Self & AltStore[S]) {
      
      inline def setEmitChange(value: Callback): Self = StObject.set(x, "emitChange", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[S]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setListen(value: js.Function1[/* state */ S, Any] => js.Function0[Unit]): Self = StObject.set(x, "listen", js.Any.fromFunction1(value))
      
      inline def setUnlisten(value: js.Function1[/* state */ S, Any] => Callback): Self = StObject.set(x, "unlisten", js.Any.fromFunction1((t0: js.Function1[/* state */ S, Any]) => value(t0).runNow()))
    }
  }
  
  type ExportConfig = StringDictionary[js.Function1[/* repeated */ Any, Any]]
  
  type Source = StringDictionary[js.Function0[SourceModel[Any]]]
  
  trait SourceModel[S] extends StObject {
    
    def error(args: Any): Unit
    
    var interceptResponse: js.UndefOr[
        js.Function3[/* response */ Any, /* action */ Action[Any], /* repeated */ Any, Any]
      ] = js.undefined
    
    var loading: js.UndefOr[js.Function1[/* args */ Any, Unit]] = js.undefined
    
    var local: js.UndefOr[js.Function2[/* state */ Any, /* repeated */ Any, Any]] = js.undefined
    
    def remote(state: Any, args: Any*): js.Promise[S]
    
    var shouldFetch: js.UndefOr[js.Function1[/* fetchFn */ js.Function1[/* repeated */ Any, Boolean], Unit]] = js.undefined
    
    def success(state: S): Unit
  }
  object SourceModel {
    
    inline def apply[S](error: Any => Callback, remote: (Any, /* repeated */ Any) => js.Promise[S], success: S => Callback): SourceModel[S] = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1((t0: Any) => error(t0).runNow()), remote = js.Any.fromFunction2(remote), success = js.Any.fromFunction1((t0: S) => success(t0).runNow()))
      __obj.asInstanceOf[SourceModel[S]]
    }
    
    extension [Self <: SourceModel[?], S](x: Self & SourceModel[S]) {
      
      inline def setError(value: Any => Callback): Self = StObject.set(x, "error", js.Any.fromFunction1((t0: Any) => value(t0).runNow()))
      
      inline def setInterceptResponse(value: (/* response */ Any, /* action */ Action[Any], /* repeated */ Any) => Any): Self = StObject.set(x, "interceptResponse", js.Any.fromFunction3(value))
      
      inline def setInterceptResponseUndefined: Self = StObject.set(x, "interceptResponse", js.undefined)
      
      inline def setLoading(value: /* args */ Any => Callback): Self = StObject.set(x, "loading", js.Any.fromFunction1((t0: /* args */ Any) => value(t0).runNow()))
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setLocal(value: (/* state */ Any, /* repeated */ Any) => Any): Self = StObject.set(x, "local", js.Any.fromFunction2(value))
      
      inline def setLocalUndefined: Self = StObject.set(x, "local", js.undefined)
      
      inline def setRemote(value: (Any, /* repeated */ Any) => js.Promise[S]): Self = StObject.set(x, "remote", js.Any.fromFunction2(value))
      
      inline def setShouldFetch(value: /* fetchFn */ js.Function1[/* repeated */ Any, Boolean] => Callback): Self = StObject.set(x, "shouldFetch", js.Any.fromFunction1((t0: /* fetchFn */ js.Function1[/* repeated */ Any, Boolean]) => value(t0).runNow()))
      
      inline def setShouldFetchUndefined: Self = StObject.set(x, "shouldFetch", js.undefined)
      
      inline def setSuccess(value: S => Callback): Self = StObject.set(x, "success", js.Any.fromFunction1((t0: S) => value(t0).runNow()))
    }
  }
  
  type StateTransform = js.Function1[/* store */ StoreModel[Any], AltStore[Any]]
  
  trait StoreModel[S] extends StObject {
    
    var afterEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
    
    var alt: js.UndefOr[Alt] = js.undefined
    
    var beforeEach: js.UndefOr[js.Function2[/* payload */ js.Object, /* state */ js.Object, Unit]] = js.undefined
    
    //Actions
    var bindAction: js.UndefOr[js.Function2[/* action */ Action[Any], /* handler */ ActionHandler, Unit]] = js.undefined
    
    var bindActions: js.UndefOr[js.Function1[/* actions */ ActionsClass, Unit]] = js.undefined
    
    var bindListeners: js.UndefOr[js.Function1[/* config */ StringDictionary[Action[Any] | Actions], Unit]] = js.undefined
    
    // TODO: Embed dispatcher interface in def
    var dispatcher: js.UndefOr[Any] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var emitChange: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var exportAsync: js.UndefOr[js.Function1[/* source */ Source, Unit]] = js.undefined
    
    //Methods/Listeners
    var exportPublicMethods: js.UndefOr[js.Function1[/* exportConfig */ Any, Unit]] = js.undefined
    
    //instance
    var getInstance: js.UndefOr[js.Function0[AltStore[S]]] = js.undefined
    
    var getState: js.UndefOr[js.Function0[S]] = js.undefined
    
    var observe: js.UndefOr[js.Function1[/* alt */ Alt, Any]] = js.undefined
    
    var on: js.UndefOr[
        js.Function2[/* event */ lifeCycleEvents, /* callback */ js.Function0[Any], Unit]
      ] = js.undefined
    
    var onDeserialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ Any, Any], Unit]] = js.undefined
    
    //events
    var onSerialize: js.UndefOr[js.Function1[/* fn */ js.Function1[/* data */ Any, Any], Unit]] = js.undefined
    
    var otherwise: js.UndefOr[js.Function2[/* data */ Any, /* action */ Action[Any], Unit]] = js.undefined
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var reduce: js.UndefOr[js.Function2[/* state */ Any, /* config */ StoreReduce, js.Object]] = js.undefined
    
    var registerAsync: js.UndefOr[js.Function1[/* datasource */ Source, Unit]] = js.undefined
    
    //state
    var setState: (js.UndefOr[js.Function1[/* state */ S, Unit]]) & (js.UndefOr[
        js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
      ])
    
    var waitFor: (js.UndefOr[js.Function1[/* store */ AltStore[Any], Unit]]) & (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[Any] | js.Array[AltStore[Any]], Unit]])
  }
  object StoreModel {
    
    inline def apply[S](
      setState: (js.UndefOr[js.Function1[/* state */ S, Unit]]) & (js.UndefOr[
          js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
        ]),
      waitFor: (js.UndefOr[js.Function1[/* store */ AltStore[Any], Unit]]) & (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[Any] | js.Array[AltStore[Any]], Unit]])
    ): StoreModel[S] = {
      val __obj = js.Dynamic.literal(setState = setState.asInstanceOf[js.Any], waitFor = waitFor.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreModel[S]]
    }
    
    extension [Self <: StoreModel[?], S](x: Self & StoreModel[S]) {
      
      inline def setAfterEach(value: (/* payload */ js.Object, /* state */ js.Object) => Callback): Self = StObject.set(x, "afterEach", js.Any.fromFunction2((t0: /* payload */ js.Object, t1: /* state */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setAfterEachUndefined: Self = StObject.set(x, "afterEach", js.undefined)
      
      inline def setAlt(value: Alt): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      inline def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      inline def setBeforeEach(value: (/* payload */ js.Object, /* state */ js.Object) => Callback): Self = StObject.set(x, "beforeEach", js.Any.fromFunction2((t0: /* payload */ js.Object, t1: /* state */ js.Object) => (value(t0, t1)).runNow()))
      
      inline def setBeforeEachUndefined: Self = StObject.set(x, "beforeEach", js.undefined)
      
      inline def setBindAction(value: (/* action */ Action[Any], /* handler */ ActionHandler) => Callback): Self = StObject.set(x, "bindAction", js.Any.fromFunction2((t0: /* action */ Action[Any], t1: /* handler */ ActionHandler) => (value(t0, t1)).runNow()))
      
      inline def setBindActionUndefined: Self = StObject.set(x, "bindAction", js.undefined)
      
      inline def setBindActions(value: /* actions */ ActionsClass => Callback): Self = StObject.set(x, "bindActions", js.Any.fromFunction1((t0: /* actions */ ActionsClass) => value(t0).runNow()))
      
      inline def setBindActionsUndefined: Self = StObject.set(x, "bindActions", js.undefined)
      
      inline def setBindListeners(value: /* config */ StringDictionary[Action[Any] | Actions] => Callback): Self = StObject.set(x, "bindListeners", js.Any.fromFunction1((t0: /* config */ StringDictionary[Action[Any] | Actions]) => value(t0).runNow()))
      
      inline def setBindListenersUndefined: Self = StObject.set(x, "bindListeners", js.undefined)
      
      inline def setDispatcher(value: Any): Self = StObject.set(x, "dispatcher", value.asInstanceOf[js.Any])
      
      inline def setDispatcherUndefined: Self = StObject.set(x, "dispatcher", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEmitChange(value: Callback): Self = StObject.set(x, "emitChange", value.toJsFn)
      
      inline def setEmitChangeUndefined: Self = StObject.set(x, "emitChange", js.undefined)
      
      inline def setExportAsync(value: /* source */ Source => Callback): Self = StObject.set(x, "exportAsync", js.Any.fromFunction1((t0: /* source */ Source) => value(t0).runNow()))
      
      inline def setExportAsyncUndefined: Self = StObject.set(x, "exportAsync", js.undefined)
      
      inline def setExportPublicMethods(value: /* exportConfig */ Any => Callback): Self = StObject.set(x, "exportPublicMethods", js.Any.fromFunction1((t0: /* exportConfig */ Any) => value(t0).runNow()))
      
      inline def setExportPublicMethodsUndefined: Self = StObject.set(x, "exportPublicMethods", js.undefined)
      
      inline def setGetInstance(value: CallbackTo[AltStore[S]]): Self = StObject.set(x, "getInstance", value.toJsFn)
      
      inline def setGetInstanceUndefined: Self = StObject.set(x, "getInstance", js.undefined)
      
      inline def setGetState(value: CallbackTo[S]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setGetStateUndefined: Self = StObject.set(x, "getState", js.undefined)
      
      inline def setObserve(value: /* alt */ Alt => Any): Self = StObject.set(x, "observe", js.Any.fromFunction1(value))
      
      inline def setObserveUndefined: Self = StObject.set(x, "observe", js.undefined)
      
      inline def setOn(value: (/* event */ lifeCycleEvents, /* callback */ js.Function0[Any]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: /* event */ lifeCycleEvents, t1: /* callback */ js.Function0[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOnDeserialize(value: /* fn */ js.Function1[/* data */ Any, Any] => Callback): Self = StObject.set(x, "onDeserialize", js.Any.fromFunction1((t0: /* fn */ js.Function1[/* data */ Any, Any]) => value(t0).runNow()))
      
      inline def setOnDeserializeUndefined: Self = StObject.set(x, "onDeserialize", js.undefined)
      
      inline def setOnSerialize(value: /* fn */ js.Function1[/* data */ Any, Any] => Callback): Self = StObject.set(x, "onSerialize", js.Any.fromFunction1((t0: /* fn */ js.Function1[/* data */ Any, Any]) => value(t0).runNow()))
      
      inline def setOnSerializeUndefined: Self = StObject.set(x, "onSerialize", js.undefined)
      
      inline def setOnUndefined: Self = StObject.set(x, "on", js.undefined)
      
      inline def setOtherwise(value: (/* data */ Any, /* action */ Action[Any]) => Callback): Self = StObject.set(x, "otherwise", js.Any.fromFunction2((t0: /* data */ Any, t1: /* action */ Action[Any]) => (value(t0, t1)).runNow()))
      
      inline def setOtherwiseUndefined: Self = StObject.set(x, "otherwise", js.undefined)
      
      inline def setPreventDefault(value: Callback): Self = StObject.set(x, "preventDefault", value.toJsFn)
      
      inline def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      inline def setReduce(value: (/* state */ Any, /* config */ StoreReduce) => js.Object): Self = StObject.set(x, "reduce", js.Any.fromFunction2(value))
      
      inline def setReduceUndefined: Self = StObject.set(x, "reduce", js.undefined)
      
      inline def setRegisterAsync(value: /* datasource */ Source => Callback): Self = StObject.set(x, "registerAsync", js.Any.fromFunction1((t0: /* datasource */ Source) => value(t0).runNow()))
      
      inline def setRegisterAsyncUndefined: Self = StObject.set(x, "registerAsync", js.undefined)
      
      inline def setSetState(
        value: (js.UndefOr[js.Function1[/* state */ S, Unit]]) & (js.UndefOr[
              js.Function1[/* stateFn */ js.Function2[/* currentState */ S, /* nextState */ S, S], Unit]
            ])
      ): Self = StObject.set(x, "setState", value.asInstanceOf[js.Any])
      
      inline def setWaitFor(
        value: (js.UndefOr[js.Function1[/* store */ AltStore[Any], Unit]]) & (js.UndefOr[js.Function1[/* storeOrStores */ AltStore[Any] | js.Array[AltStore[Any]], Unit]])
      ): Self = StObject.set(x, "waitFor", value.asInstanceOf[js.Any])
    }
  }
  
  trait StoreReduce extends StObject {
    
    var action: Any
    
    var data: Any
  }
  object StoreReduce {
    
    inline def apply(action: Any, data: Any): StoreReduce = {
      val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[StoreReduce]
    }
    
    extension [Self <: StoreReduce](x: Self) {
      
      inline def setAction(value: Any): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
}
