package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.materialUiCoreStrings.button
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.tabsTabsMod.TabsTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/core/Tabs", JSImport.Default)
  @js.native
  val default: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]] = js.native
  
  type _To = OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]]
  
  /* This means you don't have to write `default`, but can instead just say `tabsMod.foo` */
  override def _to: OverridableComponent[TabsTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]] = default
}
