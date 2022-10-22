package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.anon.NavigationHelpersParamLis
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typingsJapgolly.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseNavigationCacheMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */](hasStateGetStateNavigationSetOptionsRouterEmitter: Options[State, EventMap]): NavigationCache[State, ScreenOptions, EventMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasStateGetStateNavigationSetOptionsRouterEmitter.asInstanceOf[js.Any]).asInstanceOf[NavigationCache[State, ScreenOptions, EventMap]]
  
  type NavigationCache[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: Record[String, Any] */] = Record[
    String, 
    NavigationProp[ParamListBase, String, js.UndefOr[String], State, ScreenOptions, EventMap]
  ]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */] extends StObject {
    
    var emitter: NavigationEventEmitter[EventMap]
    
    def getState(): State
    
    var navigation: NavigationHelpersParamLis
    
    var router: Router[State, NavigationAction]
    
    def setOptions(cb: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]): Unit
    
    var state: State
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */](
      emitter: NavigationEventEmitter[EventMap],
      getState: CallbackTo[State],
      navigation: NavigationHelpersParamLis,
      router: Router[State, NavigationAction],
      setOptions: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Callback,
      state: State
    ): Options[State, EventMap] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = getState.toJsFn, navigation = navigation.asInstanceOf[js.Any], router = router.asInstanceOf[js.Any], setOptions = js.Any.fromFunction1((t0: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]) => setOptions(t0).runNow()), state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, EventMap]]
    }
    
    extension [Self <: Options[?, ?], State /* <: NavigationState[ParamListBase] */, EventMap /* <: Record[String, Any] */](x: Self & (Options[State, EventMap])) {
      
      inline def setEmitter(value: NavigationEventEmitter[EventMap]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: CallbackTo[State]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setNavigation(value: NavigationHelpersParamLis): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setRouter(value: Router[State, NavigationAction]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
      
      inline def setSetOptions(
        value: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]] => Callback
      ): Self = StObject.set(x, "setOptions", js.Any.fromFunction1((t0: js.Function1[/* options */ Record[String, js.Object], Record[String, js.Object]]) => value(t0).runNow()))
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
}
