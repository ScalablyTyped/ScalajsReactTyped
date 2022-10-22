package typingsJapgolly.angularUiRouter

import typingsJapgolly.angularUiRouter.angularUiRouterStrings.onEnter
import typingsJapgolly.angularUiRouter.angularUiRouterStrings.onExit
import typingsJapgolly.angularUiRouter.angularUiRouterStrings.onRetain
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.TransitionStateHookFn
import typingsJapgolly.uirouterCore.mod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatebuildersOnEnterExitRetainMod {
  
  @JSImport("angular-ui-router/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStateHookBuilder(hookName: onEnter | onExit | onRetain): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
}
