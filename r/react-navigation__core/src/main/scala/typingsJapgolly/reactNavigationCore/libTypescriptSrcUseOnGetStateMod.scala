package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.reactNavigationCore.libTypescriptSrcNavigationBuilderContextMod.GetStateListener
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseOnGetStateMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useOnGetState", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasGetStateGetStateListeners: Options): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasGetStateGetStateListeners.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Options extends StObject {
    
    def getState(): NavigationState[ParamListBase]
    
    var getStateListeners: Record[String, js.UndefOr[GetStateListener]]
  }
  object Options {
    
    inline def apply(
      getState: CallbackTo[NavigationState[ParamListBase]],
      getStateListeners: Record[String, js.UndefOr[GetStateListener]]
    ): Options = {
      val __obj = js.Dynamic.literal(getState = getState.toJsFn, getStateListeners = getStateListeners.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGetState(value: CallbackTo[NavigationState[ParamListBase]]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setGetStateListeners(value: Record[String, js.UndefOr[GetStateListener]]): Self = StObject.set(x, "getStateListeners", value.asInstanceOf[js.Any])
    }
  }
}
