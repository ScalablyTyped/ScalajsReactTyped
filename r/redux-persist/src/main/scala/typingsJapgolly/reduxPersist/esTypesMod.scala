package typingsJapgolly.reduxPersist

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.redux.mod.StoreEnhancer
import typingsJapgolly.redux.mod.StoreEnhancerStoreCreator
import typingsJapgolly.reduxPersist.anon.Persist
import typingsJapgolly.reduxPersist.reduxPersistBooleans.`false`
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREGISTER
import typingsJapgolly.reduxPersist.reduxPersistStrings.persistSlashREHYDRATE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esTypesMod {
  
  type MigrationManifest = StringDictionary[js.Function1[/* state */ PersistedState, PersistedState]]
  
  /**
    * @desc
    * `HSS` means HydratedSubState
    * `ESS` means EndSubState
    * `S` means State
    * `RS` means RawState
    */
  trait PersistConfig[S, RS, HSS, ESS] extends StObject {
    
    var blacklist: js.UndefOr[js.Array[String]] = js.undefined
    
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @desc Used for migrations.
      */
    var getStoredState: js.UndefOr[
        js.Function1[/* config */ PersistConfig[S, RS, HSS, ESS], js.Promise[PersistedState]]
      ] = js.undefined
    
    var key: String
    
    /**
      * @deprecated keyPrefix is going to be removed in v6.
      */
    var keyPrefix: js.UndefOr[String] = js.undefined
    
    var migrate: js.UndefOr[PersistMigrate] = js.undefined
    
    var serialize: js.UndefOr[Boolean] = js.undefined
    
    var stateReconciler: js.UndefOr[`false` | StateReconciler[S]] = js.undefined
    
    var storage: Storage
    
    var throttle: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transforms: js.UndefOr[js.Array[Transform[HSS, ESS, S, RS]]] = js.undefined
    
    var version: js.UndefOr[Double] = js.undefined
    
    var whitelist: js.UndefOr[js.Array[String]] = js.undefined
    
    var writeFailHandler: js.UndefOr[js.Function1[/* err */ js.Error, Unit]] = js.undefined
  }
  object PersistConfig {
    
    inline def apply[S, RS, HSS, ESS](key: String, storage: Storage): PersistConfig[S, RS, HSS, ESS] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], storage = storage.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistConfig[S, RS, HSS, ESS]]
    }
    
    extension [Self <: PersistConfig[?, ?, ?, ?], S, RS, HSS, ESS](x: Self & (PersistConfig[S, RS, HSS, ESS])) {
      
      inline def setBlacklist(value: js.Array[String]): Self = StObject.set(x, "blacklist", value.asInstanceOf[js.Any])
      
      inline def setBlacklistUndefined: Self = StObject.set(x, "blacklist", js.undefined)
      
      inline def setBlacklistVarargs(value: String*): Self = StObject.set(x, "blacklist", js.Array(value*))
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setGetStoredState(value: /* config */ PersistConfig[S, RS, HSS, ESS] => js.Promise[PersistedState]): Self = StObject.set(x, "getStoredState", js.Any.fromFunction1(value))
      
      inline def setGetStoredStateUndefined: Self = StObject.set(x, "getStoredState", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefix(value: String): Self = StObject.set(x, "keyPrefix", value.asInstanceOf[js.Any])
      
      inline def setKeyPrefixUndefined: Self = StObject.set(x, "keyPrefix", js.undefined)
      
      inline def setMigrate(value: (/* state */ PersistedState, /* currentVersion */ Double) => js.Promise[PersistedState]): Self = StObject.set(x, "migrate", js.Any.fromFunction2(value))
      
      inline def setMigrateUndefined: Self = StObject.set(x, "migrate", js.undefined)
      
      inline def setSerialize(value: Boolean): Self = StObject.set(x, "serialize", value.asInstanceOf[js.Any])
      
      inline def setSerializeUndefined: Self = StObject.set(x, "serialize", js.undefined)
      
      inline def setStateReconciler(value: `false` | StateReconciler[S]): Self = StObject.set(x, "stateReconciler", value.asInstanceOf[js.Any])
      
      inline def setStateReconcilerFunction4(value: (/* inboundState */ Any, S, S, /* config */ PersistConfig[S, Any, Any, Any]) => S): Self = StObject.set(x, "stateReconciler", js.Any.fromFunction4(value))
      
      inline def setStateReconcilerUndefined: Self = StObject.set(x, "stateReconciler", js.undefined)
      
      inline def setStorage(value: Storage): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setThrottleUndefined: Self = StObject.set(x, "throttle", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransforms(value: js.Array[Transform[HSS, ESS, S, RS]]): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
      
      inline def setTransformsUndefined: Self = StObject.set(x, "transforms", js.undefined)
      
      inline def setTransformsVarargs(value: (Transform[HSS, ESS, S, RS])*): Self = StObject.set(x, "transforms", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
      
      inline def setWhitelist(value: js.Array[String]): Self = StObject.set(x, "whitelist", value.asInstanceOf[js.Any])
      
      inline def setWhitelistUndefined: Self = StObject.set(x, "whitelist", js.undefined)
      
      inline def setWhitelistVarargs(value: String*): Self = StObject.set(x, "whitelist", js.Array(value*))
      
      inline def setWriteFailHandler(value: /* err */ js.Error => Callback): Self = StObject.set(x, "writeFailHandler", js.Any.fromFunction1((t0: /* err */ js.Error) => value(t0).runNow()))
      
      inline def setWriteFailHandlerUndefined: Self = StObject.set(x, "writeFailHandler", js.undefined)
    }
  }
  
  type PersistMigrate = js.Function2[/* state */ PersistedState, /* currentVersion */ Double, js.Promise[PersistedState]]
  
  trait PersistState extends StObject {
    
    var rehydrated: Boolean
    
    var version: Double
  }
  object PersistState {
    
    inline def apply(rehydrated: Boolean, version: Double): PersistState = {
      val __obj = js.Dynamic.literal(rehydrated = rehydrated.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistState]
    }
    
    extension [Self <: PersistState](x: Self) {
      
      inline def setRehydrated(value: Boolean): Self = StObject.set(x, "rehydrated", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  type PersistedState = js.UndefOr[Persist]
  
  trait Persistoid extends StObject {
    
    def flush(): js.Promise[Any]
    
    def update(state: js.Object): Unit
  }
  object Persistoid {
    
    inline def apply(flush: CallbackTo[js.Promise[Any]], update: js.Object => Callback): Persistoid = {
      val __obj = js.Dynamic.literal(flush = flush.toJsFn, update = js.Any.fromFunction1((t0: js.Object) => update(t0).runNow()))
      __obj.asInstanceOf[Persistoid]
    }
    
    extension [Self <: Persistoid](x: Self) {
      
      inline def setFlush(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setUpdate(value: js.Object => Callback): Self = StObject.set(x, "update", js.Any.fromFunction1((t0: js.Object) => value(t0).runNow()))
    }
  }
  
  /**
    * A persistor is a redux store unto itself, allowing you to purge stored state, flush all
    * pending state serialization and immediately write to disk
    */
  trait Persistor extends StObject {
    
    def dispatch(action: PersistorAction): PersistorAction
    
    def flush(): js.Promise[Any]
    
    def getState(): PersistorState
    
    def pause(): Unit
    
    def persist(): Unit
    
    def purge(): js.Promise[Any]
    
    def subscribe(callback: PersistorSubscribeCallback): js.Function0[Any]
  }
  object Persistor {
    
    inline def apply(
      dispatch: PersistorAction => PersistorAction,
      flush: CallbackTo[js.Promise[Any]],
      getState: CallbackTo[PersistorState],
      pause: Callback,
      persist: Callback,
      purge: CallbackTo[js.Promise[Any]],
      subscribe: PersistorSubscribeCallback => js.Function0[Any]
    ): Persistor = {
      val __obj = js.Dynamic.literal(dispatch = js.Any.fromFunction1(dispatch), flush = flush.toJsFn, getState = getState.toJsFn, pause = pause.toJsFn, persist = persist.toJsFn, purge = purge.toJsFn, subscribe = js.Any.fromFunction1(subscribe))
      __obj.asInstanceOf[Persistor]
    }
    
    extension [Self <: Persistor](x: Self) {
      
      inline def setDispatch(value: PersistorAction => PersistorAction): Self = StObject.set(x, "dispatch", js.Any.fromFunction1(value))
      
      inline def setFlush(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "flush", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[PersistorState]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setPause(value: Callback): Self = StObject.set(x, "pause", value.toJsFn)
      
      inline def setPersist(value: Callback): Self = StObject.set(x, "persist", value.toJsFn)
      
      inline def setPurge(value: CallbackTo[js.Promise[Any]]): Self = StObject.set(x, "purge", value.toJsFn)
      
      inline def setSubscribe(value: PersistorSubscribeCallback => js.Function0[Any]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reduxPersist.esTypesMod.RehydrateAction
    - typingsJapgolly.reduxPersist.esTypesMod.RegisterAction
  */
  trait PersistorAction extends StObject
  object PersistorAction {
    
    inline def RegisterAction(key: String): typingsJapgolly.reduxPersist.esTypesMod.RegisterAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("persist/REGISTER")
      __obj.asInstanceOf[typingsJapgolly.reduxPersist.esTypesMod.RegisterAction]
    }
    
    inline def RehydrateAction(key: String): typingsJapgolly.reduxPersist.esTypesMod.RehydrateAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("persist/REHYDRATE")
      __obj.asInstanceOf[typingsJapgolly.reduxPersist.esTypesMod.RehydrateAction]
    }
  }
  
  trait PersistorOptions extends StObject {
    
    var enhancer: js.UndefOr[StoreEnhancer[Any, js.Object]] = js.undefined
  }
  object PersistorOptions {
    
    inline def apply(): PersistorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PersistorOptions]
    }
    
    extension [Self <: PersistorOptions](x: Self) {
      
      inline def setEnhancer(
        value: /* next */ StoreEnhancerStoreCreator[js.Object, js.Object] => StoreEnhancerStoreCreator[Any, js.Object]
      ): Self = StObject.set(x, "enhancer", js.Any.fromFunction1(value))
      
      inline def setEnhancerUndefined: Self = StObject.set(x, "enhancer", js.undefined)
    }
  }
  
  trait PersistorState extends StObject {
    
    var bootstrapped: Boolean
    
    var registry: js.Array[String]
  }
  object PersistorState {
    
    inline def apply(bootstrapped: Boolean, registry: js.Array[String]): PersistorState = {
      val __obj = js.Dynamic.literal(bootstrapped = bootstrapped.asInstanceOf[js.Any], registry = registry.asInstanceOf[js.Any])
      __obj.asInstanceOf[PersistorState]
    }
    
    extension [Self <: PersistorState](x: Self) {
      
      inline def setBootstrapped(value: Boolean): Self = StObject.set(x, "bootstrapped", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: js.Array[String]): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryVarargs(value: String*): Self = StObject.set(x, "registry", js.Array(value*))
    }
  }
  
  type PersistorSubscribeCallback = js.Function0[Any]
  
  trait RegisterAction
    extends StObject
       with PersistorAction {
    
    var key: String
    
    var `type`: persistSlashREGISTER
  }
  object RegisterAction {
    
    inline def apply(key: String): RegisterAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("persist/REGISTER")
      __obj.asInstanceOf[RegisterAction]
    }
    
    extension [Self <: RegisterAction](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setType(value: persistSlashREGISTER): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait RehydrateAction
    extends StObject
       with PersistorAction {
    
    var err: js.UndefOr[RehydrateErrorType | Null] = js.undefined
    
    var key: String
    
    var payload: js.UndefOr[js.Object | Null] = js.undefined
    
    var `type`: persistSlashREHYDRATE
  }
  object RehydrateAction {
    
    inline def apply(key: String): RehydrateAction = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("persist/REHYDRATE")
      __obj.asInstanceOf[RehydrateAction]
    }
    
    extension [Self <: RehydrateAction](x: Self) {
      
      inline def setErr(value: RehydrateErrorType): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrNull: Self = StObject.set(x, "err", null)
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: js.Object): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadNull: Self = StObject.set(x, "payload", null)
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
      
      inline def setType(value: persistSlashREHYDRATE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type RehydrateErrorType = Any
  
  type StateReconciler[S] = js.Function4[
    /* inboundState */ Any, 
    /* state */ S, 
    /* reducedState */ S, 
    /* config */ PersistConfig[S, Any, Any, Any], 
    S
  ]
  
  trait Storage extends StObject {
    
    def getItem(key: String, args: Any*): Any
    
    def removeItem(key: String, args: Any*): Any
    
    def setItem(key: String, value: Any, args: Any*): Any
  }
  object Storage {
    
    inline def apply(
      getItem: (String, /* repeated */ Any) => Any,
      removeItem: (String, /* repeated */ Any) => Any,
      setItem: (String, Any, /* repeated */ Any) => Any
    ): Storage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction2(getItem), removeItem = js.Any.fromFunction2(removeItem), setItem = js.Any.fromFunction3(setItem))
      __obj.asInstanceOf[Storage]
    }
    
    extension [Self <: Storage](x: Self) {
      
      inline def setGetItem(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "getItem", js.Any.fromFunction2(value))
      
      inline def setRemoveItem(value: (String, /* repeated */ Any) => Any): Self = StObject.set(x, "removeItem", js.Any.fromFunction2(value))
      
      inline def setSetItem(value: (String, Any, /* repeated */ Any) => Any): Self = StObject.set(x, "setItem", js.Any.fromFunction3(value))
    }
  }
  
  trait Transform[HSS, ESS, S, RS] extends StObject {
    
    var in: TransformInbound[HSS, ESS, S]
    
    var out: TransformOutbound[ESS, HSS, RS]
  }
  object Transform {
    
    inline def apply[HSS, ESS, S, RS](
      in: (HSS, /* keyof S */ /* key */ String, S) => ESS,
      out: (ESS, /* keyof RS */ /* key */ String, RS) => HSS
    ): Transform[HSS, ESS, S, RS] = {
      val __obj = js.Dynamic.literal(in = js.Any.fromFunction3(in), out = js.Any.fromFunction3(out))
      __obj.asInstanceOf[Transform[HSS, ESS, S, RS]]
    }
    
    extension [Self <: Transform[?, ?, ?, ?], HSS, ESS, S, RS](x: Self & (Transform[HSS, ESS, S, RS])) {
      
      inline def setIn(value: (HSS, /* keyof S */ /* key */ String, S) => ESS): Self = StObject.set(x, "in", js.Any.fromFunction3(value))
      
      inline def setOut(value: (ESS, /* keyof RS */ /* key */ String, RS) => HSS): Self = StObject.set(x, "out", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * @desc
    * `SS` means SubState
    * `ESS` means EndSubState
    * `S` means State
    */
  type TransformInbound[SS, ESS, S] = js.Function3[/* subState */ SS, /* keyof S */ /* key */ String, /* state */ S, ESS]
  
  /**
    * @desc
    * `SS` means SubState
    * `HSS` means HydratedSubState
    * `RS` means RawState
    */
  type TransformOutbound[SS, HSS, RS] = js.Function3[/* state */ SS, /* keyof RS */ /* key */ String, /* rawState */ RS, HSS]
  
  trait WebStorage
    extends StObject
       with Storage {
    
    /**
      * @desc Fetches key and returns item in a promise.
      */
    def getItem(key: String): js.Promise[String | Null]
    
    /**
      * @desc Removes value for key.
      */
    def removeItem(key: String): js.Promise[Unit]
    
    /**
      * @desc Sets value for key and returns item in a promise.
      */
    def setItem(key: String, item: String): js.Promise[Unit]
  }
  object WebStorage {
    
    inline def apply(
      getItem: String => js.Promise[String | Null],
      removeItem: String => js.Promise[Unit],
      setItem: (String, String) => js.Promise[Unit]
    ): WebStorage = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), removeItem = js.Any.fromFunction1(removeItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[WebStorage]
    }
    
    extension [Self <: WebStorage](x: Self) {
      
      inline def setGetItem(value: String => js.Promise[String | Null]): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      inline def setRemoveItem(value: String => js.Promise[Unit]): Self = StObject.set(x, "removeItem", js.Any.fromFunction1(value))
      
      inline def setSetItem(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
