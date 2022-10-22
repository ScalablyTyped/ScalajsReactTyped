package typingsJapgolly.recoil

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.recoil.mod.CachePolicyWithoutEquality
import typingsJapgolly.recoil.mod.ComponentInfo
import typingsJapgolly.recoil.mod.DefaultValue
import typingsJapgolly.recoil.mod.GetCallback
import typingsJapgolly.recoil.mod.GetRecoilValue
import typingsJapgolly.recoil.mod.Loadable
import typingsJapgolly.recoil.mod.MutableSnapshot
import typingsJapgolly.recoil.mod.RecoilRootProps
import typingsJapgolly.recoil.mod.RecoilState
import typingsJapgolly.recoil.mod.RecoilStateInfo
import typingsJapgolly.recoil.mod.RecoilValue
import typingsJapgolly.recoil.mod.ResetRecoilState
import typingsJapgolly.recoil.mod.SelectorCallbackInterface
import typingsJapgolly.recoil.mod.SetRecoilState
import typingsJapgolly.recoil.mod.Snapshot
import typingsJapgolly.recoil.mod.StoreID
import typingsJapgolly.recoil.mod.WrappedValue
import typingsJapgolly.recoil.recoilBooleans.`false`
import typingsJapgolly.recoil.recoilBooleans.`true`
import typingsJapgolly.recoil.recoilStrings.`keep-all`
import typingsJapgolly.recoil.recoilStrings.`most-recent`
import typingsJapgolly.recoil.recoilStrings.get
import typingsJapgolly.recoil.recoilStrings.lru
import typingsJapgolly.recoil.recoilStrings.set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0`
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: `keep-all`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(eviction = "keep-all")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEviction(value: `keep-all`): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1`
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: `most-recent`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(eviction = "most-recent")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setEviction(value: `most-recent`): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: Node
  }
  object Children {
    
    inline def apply(): Children = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    }
  }
  
  trait Components[T] extends StObject {
    
    var components: js.Iterable[ComponentInfo]
    
    var nodes: js.Iterable[RecoilValue[T]]
  }
  object Components {
    
    inline def apply[T](components: js.Iterable[ComponentInfo], nodes: js.Iterable[RecoilValue[T]]): Components[T] = {
      val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Components[T]]
    }
    
    extension [Self <: Components[?], T](x: Self & Components[T]) {
      
      inline def setComponents(value: js.Iterable[ComponentInfo]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setNodes(value: js.Iterable[RecoilValue[T]]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    }
  }
  
  trait Eviction
    extends StObject
       with CachePolicyWithoutEquality {
    
    var eviction: lru
    
    var maxSize: Double
  }
  object Eviction {
    
    inline def apply(maxSize: Double): Eviction = {
      val __obj = js.Dynamic.literal(eviction = "lru", maxSize = maxSize.asInstanceOf[js.Any])
      __obj.asInstanceOf[Eviction]
    }
    
    extension [Self <: Eviction](x: Self) {
      
      inline def setEviction(value: lru): Self = StObject.set(x, "eviction", value.asInstanceOf[js.Any])
      
      inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    }
  }
  
  trait Get extends StObject {
    
    var get: GetRecoilValue
    
    var getCallback: GetCallback
  }
  object Get {
    
    inline def apply(
      get: /* recoilVal */ RecoilValue[Any] => Any,
      getCallback: /* fn */ js.Function1[
          /* interface */ SelectorCallbackInterface, 
          js.Function1[/* args */ js.Array[Any], Any]
        ] => js.Function1[/* args */ js.Array[Any], Any]
    ): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), getCallback = js.Any.fromFunction1(getCallback))
      __obj.asInstanceOf[Get]
    }
    
    extension [Self <: Get](x: Self) {
      
      inline def setGet(value: /* recoilVal */ RecoilValue[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setGetCallback(
        value: /* fn */ js.Function1[
              /* interface */ SelectorCallbackInterface, 
              js.Function1[/* args */ js.Array[Any], Any]
            ] => js.Function1[/* args */ js.Array[Any], Any]
      ): Self = StObject.set(x, "getCallback", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait GetInfoUNSTABLE[T] extends StObject {
    
    def getInfo_UNSTABLE[S](recoilValue: RecoilValue[S]): RecoilStateInfo[S] = js.native
    
    def getLoadable[S](recoilValue: RecoilValue[S]): Loadable[S] = js.native
    
    // Accessors to read other atoms/selectors
    def getPromise[S](recoilValue: RecoilValue[S]): js.Promise[S] = js.native
    
    var node: RecoilState[T] = js.native
    
    // Subscribe callbacks to events.
    // Atom effect observers are called before global transaction observers
    def onSet(
      param: js.Function3[/* newValue */ T, /* oldValue */ T | DefaultValue, /* isReset */ Boolean, Unit]
    ): Unit = js.native
    
    var parentStoreID_UNSTABLE: js.UndefOr[StoreID] = js.native
    
    def resetSelf(): Unit = js.native
    
    // Call synchronously to initialize value or async to change it later
    def setSelf(param: T): Unit = js.native
    def setSelf(param: js.Function1[/* param */ T | DefaultValue, T | DefaultValue | WrappedValue[T]]): Unit = js.native
    def setSelf(param: js.Promise[T | DefaultValue]): Unit = js.native
    def setSelf(param: DefaultValue): Unit = js.native
    def setSelf(param: WrappedValue[T]): Unit = js.native
    
    var storeID: StoreID = js.native
    
    var trigger: set | get = js.native
  }
  
  trait InitializeState
    extends StObject
       with RecoilRootProps {
    
    var children: Node
    
    var initializeState: js.UndefOr[js.Function1[/* mutableSnapshot */ MutableSnapshot, Unit]] = js.undefined
    
    var `override`: js.UndefOr[`true`] = js.undefined
  }
  object InitializeState {
    
    inline def apply(): InitializeState = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.asInstanceOf[InitializeState]
    }
    
    extension [Self <: InitializeState](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setInitializeState(value: /* mutableSnapshot */ MutableSnapshot => Callback): Self = StObject.set(x, "initializeState", js.Any.fromFunction1((t0: /* mutableSnapshot */ MutableSnapshot) => value(t0).runNow()))
      
      inline def setInitializeStateUndefined: Self = StObject.set(x, "initializeState", js.undefined)
      
      inline def setOverride(value: `true`): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
      
      inline def setOverrideUndefined: Self = StObject.set(x, "override", js.undefined)
    }
  }
  
  trait IsInitialized extends StObject {
    
    var isInitialized: js.UndefOr[Boolean] = js.undefined
    
    var isModified: js.UndefOr[Boolean] = js.undefined
  }
  object IsInitialized {
    
    inline def apply(): IsInitialized = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IsInitialized]
    }
    
    extension [Self <: IsInitialized](x: Self) {
      
      inline def setIsInitialized(value: Boolean): Self = StObject.set(x, "isInitialized", value.asInstanceOf[js.Any])
      
      inline def setIsInitializedUndefined: Self = StObject.set(x, "isInitialized", js.undefined)
      
      inline def setIsModified(value: Boolean): Self = StObject.set(x, "isModified", value.asInstanceOf[js.Any])
      
      inline def setIsModifiedUndefined: Self = StObject.set(x, "isModified", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait Override
    extends StObject
       with RecoilRootProps {
    
    var children: Node
    
    var `override`: `false`
  }
  object Override {
    
    inline def apply(): Override = {
      val __obj = js.Dynamic.literal(children = null)
      __obj.updateDynamic("override")(false)
      __obj.asInstanceOf[Override]
    }
    
    extension [Self <: Override](x: Self) {
      
      inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
      
      inline def setChildrenNull: Self = StObject.set(x, "children", null)
      
      inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setOverride(value: `false`): Self = StObject.set(x, "override", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviousSnapshot extends StObject {
    
    var previousSnapshot: Snapshot
    
    var snapshot: Snapshot
  }
  object PreviousSnapshot {
    
    inline def apply(previousSnapshot: Snapshot, snapshot: Snapshot): PreviousSnapshot = {
      val __obj = js.Dynamic.literal(previousSnapshot = previousSnapshot.asInstanceOf[js.Any], snapshot = snapshot.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousSnapshot]
    }
    
    extension [Self <: PreviousSnapshot](x: Self) {
      
      inline def setPreviousSnapshot(value: Snapshot): Self = StObject.set(x, "previousSnapshot", value.asInstanceOf[js.Any])
      
      inline def setSnapshot(value: Snapshot): Self = StObject.set(x, "snapshot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reset extends StObject {
    
    var get: GetRecoilValue
    
    var reset: ResetRecoilState
    
    var set: SetRecoilState
  }
  object Reset {
    
    inline def apply(
      get: /* recoilVal */ RecoilValue[Any] => Any,
      reset: /* recoilVal */ RecoilState[Any] => Callback,
      set: (/* recoilVal */ RecoilState[Any], /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => Callback
    ): Reset = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), reset = js.Any.fromFunction1((t0: /* recoilVal */ RecoilState[Any]) => reset(t0).runNow()), set = js.Any.fromFunction2((t0: /* recoilVal */ RecoilState[Any], t1: /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => (set(t0, t1)).runNow()))
      __obj.asInstanceOf[Reset]
    }
    
    extension [Self <: Reset](x: Self) {
      
      inline def setGet(value: /* recoilVal */ RecoilValue[Any] => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setReset(value: /* recoilVal */ RecoilState[Any] => Callback): Self = StObject.set(x, "reset", js.Any.fromFunction1((t0: /* recoilVal */ RecoilState[Any]) => value(t0).runNow()))
      
      inline def setSet(
        value: (/* recoilVal */ RecoilState[Any], /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => Callback
      ): Self = StObject.set(x, "set", js.Any.fromFunction2((t0: /* recoilVal */ RecoilState[Any], t1: /* newVal */ Any | DefaultValue | (js.Function1[/* prevValue */ Any, Any | DefaultValue])) => (value(t0, t1)).runNow()))
    }
  }
}
