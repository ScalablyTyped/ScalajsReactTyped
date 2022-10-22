package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.anon.GetState
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventEmitter
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.PrivateValueStore
import typingsJapgolly.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Router
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseNavigationHelpersMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useNavigationHelpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ActionHelpers /* <: Record[String, js.Function0[Unit]] */, Action /* <: NavigationAction */, EventMap /* <: Record[String, Any] */](hasNavigatorIdOnActionGetStateEmitterRouter: Options[State, Action]): GetState & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasNavigatorIdOnActionGetStateEmitterRouter.asInstanceOf[js.Any]).asInstanceOf[GetState & (PrivateValueStore[js.Tuple3[ParamListBase, Any, Any]]) & EventEmitter[EventMap] & ActionHelpers]
  
  trait Options[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */] extends StObject {
    
    var emitter: NavigationEventEmitter[Any]
    
    def getState(): State
    
    var id: js.UndefOr[String] = js.undefined
    
    def onAction(action: NavigationAction): Boolean
    
    var router: Router[State, Action]
  }
  object Options {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */](
      emitter: NavigationEventEmitter[Any],
      getState: CallbackTo[State],
      onAction: NavigationAction => Boolean,
      router: Router[State, Action]
    ): Options[State, Action] = {
      val __obj = js.Dynamic.literal(emitter = emitter.asInstanceOf[js.Any], getState = getState.toJsFn, onAction = js.Any.fromFunction1(onAction), router = router.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options[State, Action]]
    }
    
    extension [Self <: Options[?, ?], State /* <: NavigationState[ParamListBase] */, Action /* <: NavigationAction */](x: Self & (Options[State, Action])) {
      
      inline def setEmitter(value: NavigationEventEmitter[Any]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: CallbackTo[State]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOnAction(value: NavigationAction => Boolean): Self = StObject.set(x, "onAction", js.Any.fromFunction1(value))
      
      inline def setRouter(value: Router[State, Action]): Self = StObject.set(x, "router", value.asInstanceOf[js.Any])
    }
  }
}
