package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.toolbarToolbarMod.ToolbarTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [Toolbar API](https://mui.com/api/toolbar/)
    */
  @JSImport("@material-ui/core/Toolbar", JSImport.Default)
  @js.native
  val default: OverridableComponent[ToolbarTypeMap[js.Object, div]] = js.native
  
  type _To = OverridableComponent[ToolbarTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarMod.foo` */
  override def _to: OverridableComponent[ToolbarTypeMap[js.Object, div]] = default
}
