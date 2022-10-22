package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.materialUiCoreStrings.tfoot
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableTypeMap
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableFooterTableFooterMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableFooter API](https://mui.com/api/table-footer/)
    */
  @JSImport("@material-ui/core/TableFooter/TableFooter", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = js.native
  
  type TableFooterClassKey = root
  
  type TableFooterProps[D /* <: ElementType */, P /* <: js.Object */] = OverrideProps[TableFooterTypeMap[P, D], D]
  
  trait TableFooterTypeMap[P /* <: js.Object */, D /* <: ElementType */]
    extends StObject
       with OverridableTypeMap {
    
    @JSName("classKey")
    var classKey_TableFooterTypeMap: TableFooterClassKey
    
    @JSName("defaultComponent")
    var defaultComponent_TableFooterTypeMap: D
    
    var props: P
  }
  object TableFooterTypeMap {
    
    inline def apply[P /* <: js.Object */, D /* <: ElementType */](classKey: TableFooterClassKey, defaultComponent: D, props: P): TableFooterTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableFooterTypeMap[P, D]]
    }
    
    extension [Self <: TableFooterTypeMap[?, ?], P /* <: js.Object */, D /* <: ElementType */](x: Self & (TableFooterTypeMap[P, D])) {
      
      inline def setClassKey(value: TableFooterClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableFooterTypeMap[js.Object, tfoot]]
  
  /* This means you don't have to write `default`, but can instead just say `tableFooterTableFooterMod.foo` */
  override def _to: OverridableComponent[TableFooterTypeMap[js.Object, tfoot]] = default
}
