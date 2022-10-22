package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.materialUiLab.anon.Color
import typingsJapgolly.materialUiLab.materialUiLabStrings.div
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object paginationItemPaginationItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Pagination](https://mui.com/components/pagination/)
    *
    * API:
    *
    * - [PaginationItem API](https://mui.com/api/pagination-item/)
    */
  @JSImport("@material-ui/lab/PaginationItem/PaginationItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiLab.materialUiLabStrings.root
    - typingsJapgolly.materialUiLab.materialUiLabStrings.page
    - typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall
    - typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge
    - typingsJapgolly.materialUiLab.materialUiLabStrings.textPrimary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.textSecondary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlined
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary
    - typingsJapgolly.materialUiLab.materialUiLabStrings.rounded
    - typingsJapgolly.materialUiLab.materialUiLabStrings.ellipsis
    - typingsJapgolly.materialUiLab.materialUiLabStrings.focusVisible
    - typingsJapgolly.materialUiLab.materialUiLabStrings.disabled
    - typingsJapgolly.materialUiLab.materialUiLabStrings.selected
    - typingsJapgolly.materialUiLab.materialUiLabStrings.icon
  */
  trait PaginationItemClassKey extends StObject
  object PaginationItemClassKey {
    
    inline def disabled: typingsJapgolly.materialUiLab.materialUiLabStrings.disabled = "disabled".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.disabled]
    
    inline def ellipsis: typingsJapgolly.materialUiLab.materialUiLabStrings.ellipsis = "ellipsis".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.ellipsis]
    
    inline def focusVisible: typingsJapgolly.materialUiLab.materialUiLabStrings.focusVisible = "focusVisible".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.focusVisible]
    
    inline def icon: typingsJapgolly.materialUiLab.materialUiLabStrings.icon = "icon".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.icon]
    
    inline def outlined: typingsJapgolly.materialUiLab.materialUiLabStrings.outlined = "outlined".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlined]
    
    inline def outlinedPrimary: typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary = "outlinedPrimary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedPrimary]
    
    inline def outlinedSecondary: typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary = "outlinedSecondary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.outlinedSecondary]
    
    inline def page: typingsJapgolly.materialUiLab.materialUiLabStrings.page = "page".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.page]
    
    inline def root: typingsJapgolly.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.root]
    
    inline def rounded: typingsJapgolly.materialUiLab.materialUiLabStrings.rounded = "rounded".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.rounded]
    
    inline def selected: typingsJapgolly.materialUiLab.materialUiLabStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.selected]
    
    inline def sizeLarge: typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge = "sizeLarge".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.sizeLarge]
    
    inline def sizeSmall: typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall = "sizeSmall".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.sizeSmall]
    
    inline def textPrimary: typingsJapgolly.materialUiLab.materialUiLabStrings.textPrimary = "textPrimary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.textPrimary]
    
    inline def textSecondary: typingsJapgolly.materialUiLab.materialUiLabStrings.textSecondary = "textSecondary".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.textSecondary]
  }
  
  type PaginationItemProps[D /* <: ElementType */, P] = OverrideProps[PaginationItemTypeMap[P, D], D]
  
  trait PaginationItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: PaginationItemClassKey
    
    var defaultComponent: D
    
    var props: P & Color
  }
  object PaginationItemTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: PaginationItemClassKey, defaultComponent: D, props: P & Color): PaginationItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationItemTypeMap[P, D]]
    }
    
    extension [Self <: PaginationItemTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (PaginationItemTypeMap[P, D])) {
      
      inline def setClassKey(value: PaginationItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Color): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[PaginationItemTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `paginationItemPaginationItemMod.foo` */
  override def _to: OverridableComponent[PaginationItemTypeMap[js.Object, div]] = default
}
