package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Hover
import typingsJapgolly.materialUiCore.materialUiCoreStrings.tr
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableRowTableRowMod extends Shortcut {
  
  /**
    * Will automatically set dynamic row height
    * based on the material table element parent (head, body, etc).
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableRow API](https://mui.com/api/table-row/)
    */
  @JSImport("@material-ui/core/TableRow/TableRow", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableRowTypeMap[js.Object, tr]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.selected
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.hover
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.head
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.footer
  */
  trait TableRowClassKey extends StObject
  object TableRowClassKey {
    
    inline def footer: typingsJapgolly.materialUiCore.materialUiCoreStrings.footer = "footer".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.footer]
    
    inline def head: typingsJapgolly.materialUiCore.materialUiCoreStrings.head = "head".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.head]
    
    inline def hover: typingsJapgolly.materialUiCore.materialUiCoreStrings.hover = "hover".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.hover]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def selected: typingsJapgolly.materialUiCore.materialUiCoreStrings.selected = "selected".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.selected]
  }
  
  type TableRowProps[D /* <: ElementType */, P] = OverrideProps[TableRowTypeMap[P, D], D]
  
  trait TableRowTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: TableRowClassKey
    
    var defaultComponent: D
    
    var props: P & Hover
  }
  object TableRowTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: TableRowClassKey, defaultComponent: D, props: P & Hover): TableRowTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableRowTypeMap[P, D]]
    }
    
    extension [Self <: TableRowTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (TableRowTypeMap[P, D])) {
      
      inline def setClassKey(value: TableRowClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Hover): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableRowTypeMap[js.Object, tr]]
  
  /* This means you don't have to write `default`, but can instead just say `tableRowTableRowMod.foo` */
  override def _to: OverridableComponent[TableRowTypeMap[js.Object, tr]] = default
}
