package typingsJapgolly.materialUiCore

import typingsJapgolly.materialUiCore.stylesCreateBreakpointsMod.Breakpoint
import typingsJapgolly.materialUiCore.withWidthWithWidthMod.WithWidth
import typingsJapgolly.materialUiCore.withWidthWithWidthMod.WithWidthOptions
import typingsJapgolly.materialUiCore.withWidthWithWidthMod.WithWidthProps
import typingsJapgolly.materialUiTypes.mod.PropInjector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthMod {
  
  @JSImport("@material-ui/core/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  inline def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
