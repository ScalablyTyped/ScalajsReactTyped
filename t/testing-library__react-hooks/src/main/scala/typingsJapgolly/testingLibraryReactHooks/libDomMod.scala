package typingsJapgolly.testingLibraryReactHooks

import typingsJapgolly.reactDom.testUtilsMod.VoidOrUndefinedOnly
import typingsJapgolly.std.Omit
import typingsJapgolly.testingLibraryReactHooks.anon.Act
import typingsJapgolly.testingLibraryReactHooks.anon.Rerender
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.CleanupCallback
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.RenderHookOptions
import typingsJapgolly.testingLibraryReactHooks.libTypesReactMod.RendererOptions
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.act
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.render
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.rerender
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.unmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDomMod {
  
  @JSImport("@testing-library/react-hooks/lib/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def act(callback: js.Function0[VoidOrUndefinedOnly]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def act_Promise(callback: js.Function0[js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("act")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def addCleanup(callback: CleanupCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def removeCleanup(callback: CleanupCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def renderHook[TProps, TResult](callback: js.Function1[/* props */ TProps, TResult]): (Rerender[TResult, TProps]) & (Omit[Act[TProps], render | act | rerender | unmount]) = ^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any]).asInstanceOf[(Rerender[TResult, TProps]) & (Omit[Act[TProps], render | act | rerender | unmount])]
  inline def renderHook[TProps, TResult](
    callback: js.Function1[/* props */ TProps, TResult],
    options: RenderHookOptions[TProps] & RendererOptions[TProps]
  ): (Rerender[TResult, TProps]) & (Omit[Act[TProps], render | act | rerender | unmount]) = (^.asInstanceOf[js.Dynamic].applyDynamic("renderHook")(callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[(Rerender[TResult, TProps]) & (Omit[Act[TProps], render | act | rerender | unmount])]
  
  inline def suppressErrorOutput(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrorOutput")().asInstanceOf[js.Function0[Unit]]
}
