package typingsJapgolly.reactNavigationCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNavigationCore.anon.PreventRemove
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcPreventRemoveContextMod extends Shortcut {
  
  @JSImport("@react-navigation/core/lib/typescript/src/PreventRemoveContext", JSImport.Default)
  @js.native
  val default: Context[js.UndefOr[typingsJapgolly.reactNavigationCore.anon.PreventedRoutes]] = js.native
  
  type PreventedRoutes = Record[String, PreventRemove]
  
  type _To = Context[js.UndefOr[typingsJapgolly.reactNavigationCore.anon.PreventedRoutes]]
  
  /* This means you don't have to write `default`, but can instead just say `libTypescriptSrcPreventRemoveContextMod.foo` */
  override def _to: Context[js.UndefOr[typingsJapgolly.reactNavigationCore.anon.PreventedRoutes]] = default
}
