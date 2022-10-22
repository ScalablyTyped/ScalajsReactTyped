package typingsJapgolly.materialUiLab

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ButtonBaseTypeMap
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiLab.materialUiLabStrings.button
import typingsJapgolly.materialUiLab.tabListTabListMod.TabListTypeMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/components/tabs/)
    *
    * API:
    *
    * - [TabList API](https://mui.com/api/tab-list/)
    * - inherits [Tabs API](https://mui.com/api/tabs/)
    */
  @JSImport("@material-ui/lab/TabList", JSImport.Default)
  @js.native
  val default: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = js.native
  
  type _To = OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tabListMod.foo` */
  override def _to: OverridableComponent[
    TabListTypeMap[js.Object, ExtendButtonBase[ButtonBaseTypeMap[js.Object, button]]]
  ] = default
}
