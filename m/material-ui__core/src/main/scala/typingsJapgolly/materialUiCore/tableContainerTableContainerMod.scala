package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableTypeMap
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableContainerTableContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableContainer API](https://mui.com/api/table-container/)
    */
  @JSImport("@material-ui/core/TableContainer/TableContainer", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableContainerTypeMap[js.Object, div]] = js.native
  
  type TableContainerClassKey = root
  
  type TableContainerProps[D /* <: ElementType */, P /* <: js.Object */] = OverrideProps[TableContainerTypeMap[P, D], D]
  
  trait TableContainerTypeMap[P /* <: js.Object */, D /* <: ElementType */]
    extends StObject
       with OverridableTypeMap {
    
    @JSName("classKey")
    var classKey_TableContainerTypeMap: TableContainerClassKey
    
    @JSName("defaultComponent")
    var defaultComponent_TableContainerTypeMap: D
    
    var props: P
  }
  object TableContainerTypeMap {
    
    inline def apply[P /* <: js.Object */, D /* <: ElementType */](classKey: TableContainerClassKey, defaultComponent: D, props: P): TableContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableContainerTypeMap[P, D]]
    }
    
    extension [Self <: TableContainerTypeMap[?, ?], P /* <: js.Object */, D /* <: ElementType */](x: Self & (TableContainerTypeMap[P, D])) {
      
      inline def setClassKey(value: TableContainerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableContainerTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `tableContainerTableContainerMod.foo` */
  override def _to: OverridableComponent[TableContainerTypeMap[js.Object, div]] = default
}
