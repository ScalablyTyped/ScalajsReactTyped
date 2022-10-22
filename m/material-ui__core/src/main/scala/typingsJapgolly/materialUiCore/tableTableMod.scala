package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.materialUiCoreStrings.table
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableTableMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [Table API](https://mui.com/api/table/)
    */
  @JSImport("@material-ui/core/Table/Table", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableTypeMap[js.Object, table]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.normal
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.checkbox
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.none
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.default
  */
  trait Padding extends StObject
  object Padding {
    
    inline def default: typingsJapgolly.materialUiCore.materialUiCoreStrings.default = "default".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.default]
    
    inline def checkbox: typingsJapgolly.materialUiCore.materialUiCoreStrings.checkbox = "checkbox".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.checkbox]
    
    inline def none: typingsJapgolly.materialUiCore.materialUiCoreStrings.none = "none".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.none]
    
    inline def normal: typingsJapgolly.materialUiCore.materialUiCoreStrings.normal = "normal".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.normal]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.small
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.medium
  */
  trait Size extends StObject
  object Size {
    
    inline def medium: typingsJapgolly.materialUiCore.materialUiCoreStrings.medium = "medium".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.medium]
    
    inline def small: typingsJapgolly.materialUiCore.materialUiCoreStrings.small = "small".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.stickyHeader
  */
  trait TableClassKey extends StObject
  object TableClassKey {
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def stickyHeader: typingsJapgolly.materialUiCore.materialUiCoreStrings.stickyHeader = "stickyHeader".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.stickyHeader]
  }
  
  type TableProps[D /* <: ElementType */, P] = OverrideProps[TableTypeMap[P, D], D]
  
  trait TableTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: TableClassKey
    
    var defaultComponent: D
    
    var props: P & typingsJapgolly.materialUiCore.anon.Padding
  }
  object TableTypeMap {
    
    inline def apply[P, D /* <: ElementType */](
      classKey: TableClassKey,
      defaultComponent: D,
      props: P & typingsJapgolly.materialUiCore.anon.Padding
    ): TableTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableTypeMap[P, D]]
    }
    
    extension [Self <: TableTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (TableTypeMap[P, D])) {
      
      inline def setClassKey(value: TableClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & typingsJapgolly.materialUiCore.anon.Padding): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableTypeMap[js.Object, table]]
  
  /* This means you don't have to write `default`, but can instead just say `tableTableMod.foo` */
  override def _to: OverridableComponent[TableTypeMap[js.Object, table]] = default
}
