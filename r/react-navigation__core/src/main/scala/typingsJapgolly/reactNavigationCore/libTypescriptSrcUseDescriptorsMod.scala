package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.anon.Dispatch
import typingsJapgolly.reactNavigationCore.anon.OptionsRoute
import typingsJapgolly.reactNavigationCore.anon.RouteRouteProp
import typingsJapgolly.reactNavigationCore.anon.SetOptions
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddKeyedListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.AddListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.Descriptor
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventConsumer
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventMapBase
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationHelpers
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.PrivateValueStore
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfig
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typingsJapgolly.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.action
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.beforeRemove
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.focus
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getParent
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseDescriptorsMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useDescriptors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
    hasStateScreensNavigationScreenOptionsDefaultScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter: Options[State, ScreenOptions, EventMap]
  ): Record[
    String, 
    Descriptor[
      ScreenOptions, 
      (Omit[
        Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
        getParent
      ]) & SetOptions[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
      RouteProp[ParamListBase, String]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateScreensNavigationScreenOptionsDefaultScreenOptionsOnActionGetStateSetStateAddListenerAddKeyedListenerOnRouteFocusRouterEmitter.asInstanceOf[js.Any]).asInstanceOf[Record[
    String, 
    Descriptor[
      ScreenOptions, 
      (Omit[
        Dispatch[State] & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]), 
        getParent
      ]) & SetOptions[ScreenOptions] & (EventConsumer[EventMap & EventMapCore[State]]) & (PrivateValueStore[js.Tuple3[ParamListBase, String, EventMap]]) & ActionHelpers, 
      RouteProp[ParamListBase, String]
    ]
  ]]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    var addKeyedListener: AddKeyedListener
    
    var addListener: AddListener
    
    var defaultScreenOptions: js.UndefOr[
        ScreenOptions | (js.Function1[/* props */ OptionsRoute[ScreenOptions], ScreenOptions])
      ] = js.undefined
    
    var emitter: NavigationEventEmitter[EventMap]
    
    def getState(): State
    
    var navigation: NavigationHelpers[ParamListBase, js.Object]
    
    def onAction(action: NavigationAction): Boolean
    
    def onRouteFocus(key: String): Unit
    
    var router: Router[State, NavigationAction]
    
    var screenOptions: js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]] = js.undefined
    
    var screens: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]]
    
    def setState(state: State): Unit
    
    var state: State
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      addKeyedListener: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Callback,
      addListener: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Callback,
      emitter: NavigationEventEmitter[EventMap],
      getState: CallbackTo[State],
      navigation: NavigationHelpers[ParamListBase, js.Object],
      onAction: NavigationAction => Boolean,
      onRouteFocus: String => Callback,
      router: Router[State, NavigationAction],
      screens: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]],
      setState: State => Callback,
      state: State
    ): Options[State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(addKeyedListener = js.Any.fromFunction3((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, t1: /* key */ String, t2: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => (addKeyedListener(t0, t1, t2)).runNow()), addListener = js.Any.fromFunction2((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, t1: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => (addListener(t0, t1)).runNow()), emitter = emitter.asInstanceOf[js.Any], getState = getState.toJsFn, navigation = navigation.asInstanceOf[js.Any], onAction = js.Any.fromFunction1(onAction), onRouteFocus = js.Any.fromFunction1((t0: String) => onRouteFocus(t0).runNow()), router = router.asInstanceOf[js.Any], screens = screens.asInstanceOf[js.Any], setState = js.Any.fromFunction1((t0: State) => setState(t0).runNow()), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: Options[?, ?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (Options[State, ScreenOptions, EventMap])) {
      
      inline def setAddKeyedListener(
        value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, /* key */ String, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => Callback
      ): Self = StObject.set(x, "addKeyedListener", js.Any.fromFunction3((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap */ /* type */ getState | beforeRemove, t1: /* key */ String, t2: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.KeyedListenerMap] */ /* listener */ js.Any) => (value(t0, t1, t2)).runNow()))
      
      inline def setAddListener(
        value: (/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => Callback
      ): Self = StObject.set(x, "addListener", js.Any.fromFunction2((t0: /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap */ /* type */ action | focus, t1: /* import warning: importer.ImportType#apply Failed type conversion: @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap[keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/NavigationBuilderContext.ListenerMap] */ /* listener */ js.Any) => (value(t0, t1)).runNow()))
      
      inline def setDefaultScreenOptions(value: ScreenOptions | (js.Function1[/* props */ OptionsRoute[ScreenOptions], ScreenOptions])): Self = StObject.set(x, "defaultScreenOptions", value.asInstanceOf[js.Any])
      
      inline def setDefaultScreenOptionsFunction1(value: /* props */ OptionsRoute[ScreenOptions] => ScreenOptions): Self = StObject.set(x, "defaultScreenOptions", js.Any.fromFunction1(value))
      
      inline def setDefaultScreenOptionsUndefined: Self = StObject.set(x, "defaultScreenOptions", js.undefined)
      
      inline def setEmitter(value: NavigationEventEmitter[EventMap]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: CallbackTo[State]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setNavigation(value: NavigationHelpers[ParamListBase, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOnAction(value: NavigationAction => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      inline def setOnRouteFocus(value: String => Callback): Self = StObject.set(x, "onRouteFocus", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
      
      inline def setRouter(value: Router[State, NavigationAction]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setScreenOptions(value: ScreenOptionsOrCallback[ScreenOptions]): Self = StObject.set(x, "screenOptions", value.asInstanceOf[js.Any])
      
      inline def setScreenOptionsFunction1(value: /* props */ RouteRouteProp => ScreenOptions): Self = StObject.set(x, "screenOptions", js.Any.fromFunction1(value))
      
      inline def setScreenOptionsUndefined: Self = StObject.set(x, "screenOptions", js.undefined)
      
      inline def setScreens(value: Record[String, ScreenConfigWithParent[State, ScreenOptions, EventMap]]): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
      
      inline def setSetState(value: State => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait ScreenConfigWithParent[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] extends StObject {
    
    var keys: js.Array[js.UndefOr[String]]
    
    var options: js.UndefOr[js.Array[js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]]] = js.undefined
    
    var props: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]
  }
  object ScreenConfigWithParent {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](
      keys: js.Array[js.UndefOr[String]],
      props: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]
    ): ScreenConfigWithParent[State, ScreenOptions, EventMap] = {
      val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScreenConfigWithParent[State, ScreenOptions, EventMap]]
    }
    
    extension [Self <: ScreenConfigWithParent[?, ?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */](x: Self & (ScreenConfigWithParent[State, ScreenOptions, EventMap])) {
      
      inline def setKeys(value: js.Array[js.UndefOr[String]]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysVarargs(value: js.UndefOr[String]*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setOptions(value: js.Array[js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: js.UndefOr[ScreenOptionsOrCallback[ScreenOptions]]*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setProps(value: RouteConfig[ParamListBase, String, State, ScreenOptions, EventMap]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ScreenOptionsOrCallback[ScreenOptions /* <: js.Object */] = ScreenOptions | (js.Function1[/* props */ RouteRouteProp, ScreenOptions])
}
