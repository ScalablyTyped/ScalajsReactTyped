package typingsJapgolly.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationContainerRef
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcNavigationContainerRefContextMod extends Shortcut {
  
  /**
    * Context which holds the route prop for a screen.
    */
  @JSImport("@react-navigation/core/lib/typescript/src/NavigationContainerRefContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[NavigationContainerRef[ParamListBase]]] = js.native
  
  type _To = Context[js.UndefOr[NavigationContainerRef[ParamListBase]]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcNavigationContainerRefContextMod.foo` */
  override def _to: Context[js.UndefOr[NavigationContainerRef[ParamListBase]]] = default
}
