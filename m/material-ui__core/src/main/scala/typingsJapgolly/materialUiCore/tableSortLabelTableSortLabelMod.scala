package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.ClassKeyTableSortLabelClassKeyDefaultComponentD
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBase
import typingsJapgolly.materialUiCore.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.span
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSortLabelTableSortLabelMod extends Shortcut {
  
  /**
    * A button based label for placing inside `TableCell` for column sorting.
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableSortLabel API](https://mui.com/api/table-sort-label/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@material-ui/core/TableSortLabel/TableSortLabel", JSImport.Default)
  @js.native
  val default: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.active
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.icon
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionDesc
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionAsc
  */
  trait TableSortLabelClassKey extends StObject
  object TableSortLabelClassKey {
    
    inline def active: typingsJapgolly.materialUiCore.materialUiCoreStrings.active = "active".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.active]
    
    inline def icon: typingsJapgolly.materialUiCore.materialUiCoreStrings.icon = "icon".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.icon]
    
    inline def iconDirectionAsc: typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionAsc = "iconDirectionAsc".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionAsc]
    
    inline def iconDirectionDesc: typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionDesc = "iconDirectionDesc".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.iconDirectionDesc]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type TableSortLabelProps[D /* <: ElementType */, P] = OverrideProps[TableSortLabelTypeMap[P, D], D]
  
  type TableSortLabelTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[ClassKeyTableSortLabelClassKeyDefaultComponentD[P, D]]
  
  type _To = ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `tableSortLabelTableSortLabelMod.foo` */
  override def _to: ExtendButtonBase[TableSortLabelTypeMap[js.Object, span]] = default
}
