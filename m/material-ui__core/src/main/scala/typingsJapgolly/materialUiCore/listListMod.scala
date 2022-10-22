package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Dense
import typingsJapgolly.materialUiCore.materialUiCoreStrings.ul
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    * - [Transfer List](https://mui.com/components/transfer-list/)
    *
    * API:
    *
    * - [List API](https://mui.com/api/list/)
    */
  @JSImport("@material-ui/core/List/List", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListTypeMap[js.Object, ul]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.padding
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader
  */
  trait ListClassKey extends StObject
  object ListClassKey {
    
    inline def dense: typingsJapgolly.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.dense]
    
    inline def padding: typingsJapgolly.materialUiCore.materialUiCoreStrings.padding = "padding".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.padding]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def subheader: typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader = "subheader".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.subheader]
  }
  
  type ListProps[D /* <: ElementType */, P] = OverrideProps[ListTypeMap[P, D], D]
  
  trait ListTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ListClassKey
    
    var defaultComponent: D
    
    var props: P & Dense
  }
  object ListTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ListClassKey, defaultComponent: D, props: P & Dense): ListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListTypeMap[P, D]]
    }
    
    extension [Self <: ListTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ListTypeMap[P, D])) {
      
      inline def setClassKey(value: ListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Dense): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `listListMod.foo` */
  override def _to: OverridableComponent[ListTypeMap[js.Object, ul]] = default
}
