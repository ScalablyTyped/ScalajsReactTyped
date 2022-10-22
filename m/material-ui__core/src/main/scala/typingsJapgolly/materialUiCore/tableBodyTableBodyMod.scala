package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.materialUiCoreStrings.tbody
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableTypeMap
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableBodyTableBodyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tables](https://mui.com/components/tables/)
    *
    * API:
    *
    * - [TableBody API](https://mui.com/api/table-body/)
    */
  @JSImport("@material-ui/core/TableBody/TableBody", JSImport.Default)
  @js.native
  val default: OverridableComponent[TableBodyTypeMap[js.Object, tbody]] = js.native
  
  type TableBodyClassKey = root
  
  type TableBodyProps[D /* <: ElementType */, P /* <: js.Object */] = OverrideProps[TableBodyTypeMap[P, D], D]
  
  trait TableBodyTypeMap[P /* <: js.Object */, D /* <: ElementType */]
    extends StObject
       with OverridableTypeMap {
    
    @JSName("classKey")
    var classKey_TableBodyTypeMap: TableBodyClassKey
    
    @JSName("defaultComponent")
    var defaultComponent_TableBodyTypeMap: D
    
    var props: P
  }
  object TableBodyTypeMap {
    
    inline def apply[P /* <: js.Object */, D /* <: ElementType */](classKey: TableBodyClassKey, defaultComponent: D, props: P): TableBodyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableBodyTypeMap[P, D]]
    }
    
    extension [Self <: TableBodyTypeMap[?, ?], P /* <: js.Object */, D /* <: ElementType */](x: Self & (TableBodyTypeMap[P, D])) {
      
      inline def setClassKey(value: TableBodyClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[TableBodyTypeMap[js.Object, tbody]]
  
  /* This means you don't have to write `default`, but can instead just say `tableBodyTableBodyMod.foo` */
  override def _to: OverridableComponent[TableBodyTypeMap[js.Object, tbody]] = default
}
