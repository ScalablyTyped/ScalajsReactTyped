package typingsJapgolly.materialUiCore

import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Button
import typingsJapgolly.materialUiCore.anon.`4`
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.listItemListItemMod.ListItemTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemMod extends Shortcut {
  
  /**
    * Uses an additional container component if `ListItemSecondaryAction` is the last child.
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@material-ui/core/ListItem", JSImport.Default)
  @js.native
  val default: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = js.native
  
  type _To = (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]])
  
  /* This means you don't have to write `default`, but can instead just say `listItemMod.foo` */
  override def _to: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = default
}
