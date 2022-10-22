package typingsJapgolly.uirouterAngularjs

import typingsJapgolly.uirouterAngularjs.uirouterAngularjsStrings.onEnter
import typingsJapgolly.uirouterAngularjs.uirouterAngularjsStrings.onExit
import typingsJapgolly.uirouterAngularjs.uirouterAngularjsStrings.onRetain
import typingsJapgolly.uirouterCore.libTransitionInterfaceMod.TransitionStateHookFn
import typingsJapgolly.uirouterCore.mod.StateObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStatebuildersOnEnterExitRetainMod {
  
  @JSImport("@uirouter/angularjs/lib/statebuilders/onEnterExitRetain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getStateHookBuilder(hookName: onEnter | onExit | onRetain): js.Function1[/* stateObject */ StateObject, TransitionStateHookFn] = ^.asInstanceOf[js.Dynamic].applyDynamic("getStateHookBuilder")(hookName.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* stateObject */ StateObject, TransitionStateHookFn]]
}
