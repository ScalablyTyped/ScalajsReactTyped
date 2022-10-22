package typingsJapgolly.testingLibraryReactHooks

import typingsJapgolly.std.Omit
import typingsJapgolly.testingLibraryReactHooks.anon.Rerender
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.CleanupCallback
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.CreateRenderer
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.RenderHookOptions
import typingsJapgolly.testingLibraryReactHooks.libTypesMod.Renderer
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.act
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.render
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.rerender
import typingsJapgolly.testingLibraryReactHooks.testingLibraryReactHooksStrings.unmount
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCoreMod {
  
  @JSImport("@testing-library/react-hooks/lib/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addCleanup(callback: CleanupCallback): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("addCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def cleanup(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[js.Promise[Unit]]
  
  inline def createRenderHook[TProps, TResult, TRendererOptions /* <: js.Object */, TRenderer /* <: Renderer[TProps] */](createRenderer: CreateRenderer[TProps, TResult, TRendererOptions, TRenderer]): js.Function2[
    /* callback */ js.Function1[/* props */ TProps, TResult], 
    /* options */ js.UndefOr[RenderHookOptions[TProps] & TRendererOptions], 
    (Rerender[TResult, TProps]) & (Omit[TRenderer, render | act | rerender | unmount])
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("createRenderHook")(createRenderer.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* callback */ js.Function1[/* props */ TProps, TResult], 
    /* options */ js.UndefOr[RenderHookOptions[TProps] & TRendererOptions], 
    (Rerender[TResult, TProps]) & (Omit[TRenderer, render | act | rerender | unmount])
  ]]
  
  inline def removeCleanup(callback: CleanupCallback): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeCleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def suppressErrorOutput(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("suppressErrorOutput")().asInstanceOf[js.Function0[Unit]]
}
