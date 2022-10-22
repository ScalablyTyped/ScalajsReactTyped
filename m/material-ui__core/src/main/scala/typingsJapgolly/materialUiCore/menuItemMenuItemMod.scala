package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.AlignItems
import typingsJapgolly.materialUiCore.anon.`7`
import typingsJapgolly.materialUiCore.anon.`8`
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.materialUiCoreStrings.props
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuItemMenuItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Menus](https://mui.com/components/menus/)
    *
    * API:
    *
    * - [MenuItem API](https://mui.com/api/menu-item/)
    * - inherits [ListItem API](https://mui.com/api/list-item/)
    */
  @JSImport("@material-ui/core/MenuItem/MenuItem", JSImport.Default)
  @js.native
  val default: (OverridableComponent[MenuItemTypeMap[`7`, li]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, li]]) = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.selected
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
  */
  trait MenuItemClassKey extends StObject
  object MenuItemClassKey {
    
    inline def dense: typingsJapgolly.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.dense]
    
    inline def gutters: typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typingsJapgolly.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.selected]
  }
  
  type MenuItemProps[D /* <: ElementType */, P] = OverrideProps[MenuItemTypeMap[P, D], D]
  
  /* Inlined @material-ui/types.@material-ui/types.Omit<@material-ui/core.@material-ui/core/ListItem.ListItemTypeMap<P, D>, 'classKey'> & {  classKey :@material-ui/core.@material-ui/core/MenuItem/MenuItem.MenuItemClassKey,   ListItemClasses :@material-ui/core.@material-ui/core/ListItem.ListItemProps<'li', {}>['classes']} */
  trait MenuItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    /**
      * `classes` prop applied to the [`ListItem`](/api/list-item/) element.
      */
    var ListItemClasses: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemProps<'li', {}>['classes'] */ js.Any
    
    var classKey: MenuItemClassKey
    
    var defaultComponent: D
    
    var props: typingsJapgolly.materialUiCore.materialUiCoreStrings.props & AlignItems
  }
  object MenuItemTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      ListItemClasses: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemProps<'li', {}>['classes'] */ js.Any,
      classKey: MenuItemClassKey,
      defaultComponent: D,
      props: props & AlignItems
    ): MenuItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(ListItemClasses = ListItemClasses.asInstanceOf[js.Any], classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemTypeMap[P, D]]
    }
    
    extension [Self <: MenuItemTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (MenuItemTypeMap[P, D])) {
      
      inline def setClassKey(value: MenuItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setListItemClasses(
        value: /* import warning: importer.ImportType#apply Failed type conversion: @material-ui/core.@material-ui/core/ListItem/ListItem.ListItemProps<'li', {}>['classes'] */ js.Any
      ): Self = StObject.set(x, "ListItemClasses", value.asInstanceOf[js.Any])
      
      inline def setProps(value: props & AlignItems): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = (OverridableComponent[MenuItemTypeMap[`7`, li]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, li]])
  
  /* This means you don't have to write `default`, but can instead just say `menuItemMenuItemMod.foo` */
  override def _to: (OverridableComponent[MenuItemTypeMap[`7`, li]]) & (ExtendButtonBase[MenuItemTypeMap[`8`, li]]) = default
}
