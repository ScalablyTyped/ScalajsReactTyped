package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.AlignItems
import typingsJapgolly.materialUiCore.anon.Button
import typingsJapgolly.materialUiCore.anon.`4`
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listItemListItemMod extends Shortcut {
  
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
  @JSImport("@material-ui/core/ListItem/ListItem", JSImport.Default)
  @js.native
  val default: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.container
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.default
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.divider
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.button
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.secondaryAction
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.selected
  */
  trait ListItemClassKey extends StObject
  object ListItemClassKey {
    
    inline def default: typingsJapgolly.materialUiCore.materialUiCoreStrings.default = "default".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.default]
    
    inline def button: typingsJapgolly.materialUiCore.materialUiCoreStrings.button = "button".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.button]
    
    inline def container: typingsJapgolly.materialUiCore.materialUiCoreStrings.container = "container".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.container]
    
    inline def dense: typingsJapgolly.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.dense]
    
    inline def disabled: typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disabled]
    
    inline def divider: typingsJapgolly.materialUiCore.materialUiCoreStrings.divider = "divider".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.divider]
    
    inline def focusVisible: typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.focusVisible]
    
    inline def gutters: typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def secondaryAction: typingsJapgolly.materialUiCore.materialUiCoreStrings.secondaryAction = "secondaryAction".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.secondaryAction]
    
    inline def selected: typingsJapgolly.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.selected]
  }
  
  type ListItemProps[D /* <: ElementType */, P] = OverrideProps[ListItemTypeMap[P, D], D]
  
  trait ListItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ListItemClassKey
    
    var defaultComponent: D
    
    var props: P & AlignItems
  }
  object ListItemTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ListItemClassKey, defaultComponent: D, props: P & AlignItems): ListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListItemTypeMap[P, D]]
    }
    
    extension [Self <: ListItemTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ListItemTypeMap[P, D])) {
      
      inline def setClassKey(value: ListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AlignItems): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]])
  
  /* This means you don't have to write `default`, but can instead just say `listItemListItemMod.foo` */
  override def _to: (OverridableComponent[ListItemTypeMap[Button, li]]) & (ExtendButtonBase[ListItemTypeMap[`4`, div]]) = default
}
