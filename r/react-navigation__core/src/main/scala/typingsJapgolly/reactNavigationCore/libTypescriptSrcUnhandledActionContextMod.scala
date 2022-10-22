package typingsJapgolly.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUnhandledActionContextMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/UnhandledActionContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]]] = js.native
  
  type _To = Context[js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcUnhandledActionContextMod.foo` */
  override def _to: Context[js.UndefOr[js.Function1[/* action */ NavigationAction, Unit]]] = default
}
