package typingsJapgolly.baseui

import typingsJapgolly.baseui.layoutGridTypesMod.GridProps
import typingsJapgolly.baseui.layoutGridTypesMod.SharedGridProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutGridGridMod {
  
  @JSImport("baseui/layout-grid/grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(
    hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides: GridProps
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasAlignBehaviorChildrenGridColumnsGridGapsGridGuttersGridMarginsGridMaxWidthGridStyleGridUnitOverrides.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/layout-grid/grid", "GridContext")
  @js.native
  val GridContext: Context[SharedGridProps] = js.native
}
