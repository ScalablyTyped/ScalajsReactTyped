package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.anon.KeyString
import typingsJapgolly.reactNavigationCore.anon.`4`
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.ChildBeforeRemoveListener
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.EventMapCore
import typingsJapgolly.reactNavigationCore.libTypescriptSrcUseEventEmitterMod.NavigationEventEmitter
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOnPreventRemoveMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnPreventRemove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasGetStateEmitterBeforeRemoveListeners: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasGetStateEmitterBeforeRemoveListeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def shouldPreventRemove(
    emitter: NavigationEventEmitter[EventMapCore[Any]],
    beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
    currentRoutes: js.Array[KeyString],
    nextRoutes: js.Array[`4`],
    action: NavigationAction
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shouldPreventRemove")(emitter.asInstanceOf[js.Any], beforeRemoveListeners.asInstanceOf[js.Any], currentRoutes.asInstanceOf[js.Any], nextRoutes.asInstanceOf[js.Any], action.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]]
    
    var emitter: NavigationEventEmitter[EventMapCore[Any]]
    
    def getState(): NavigationState[ParamListBase]
  }
  object Options {
    
    inline def apply(
      beforeRemoveListeners: Record[String, js.UndefOr[ChildBeforeRemoveListener]],
      emitter: NavigationEventEmitter[EventMapCore[Any]],
      getState: CallbackTo[NavigationState[ParamListBase]]
    ): Options = {
      val __obj = js.Dynamic.literal(beforeRemoveListeners = beforeRemoveListeners.asInstanceOf[js.Any], emitter = emitter.asInstanceOf[js.Any], getState = getState.toJsFn)
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setBeforeRemoveListeners(value: Record[String, js.UndefOr[ChildBeforeRemoveListener]]): Self = StObject.set(x, "beforeRemoveListeners", value.asInstanceOf[js.Any])
      
      inline def setEmitter(value: NavigationEventEmitter[EventMapCore[Any]]): Self = StObject.set(x, "emitter", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: CallbackTo[NavigationState[ParamListBase]]): Self = StObject.set(x, "getState", value.toJsFn)
    }
  }
}
