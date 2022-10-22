package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.DisableSticky
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listSubheaderListSubheaderMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [ListSubheader API](https://mui.com/api/list-subheader/)
    */
  @JSImport("@material-ui/core/ListSubheader/ListSubheader", JSImport.Default)
  @js.native
  val default: OverridableComponent[ListSubheaderTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.inset
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.sticky
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters
  */
  trait ListSubheaderClassKey extends StObject
  object ListSubheaderClassKey {
    
    inline def colorInherit: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit = "colorInherit".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorInherit]
    
    inline def colorPrimary: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary = "colorPrimary".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorPrimary]
    
    inline def gutters: typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def inset: typingsJapgolly.materialUiCore.materialUiCoreStrings.inset = "inset".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.inset]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def sticky: typingsJapgolly.materialUiCore.materialUiCoreStrings.sticky = "sticky".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.sticky]
  }
  
  type ListSubheaderProps[D /* <: ElementType */, P] = OverrideProps[ListSubheaderTypeMap[P, D], D]
  
  trait ListSubheaderTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ListSubheaderClassKey
    
    var defaultComponent: D
    
    var props: P & DisableSticky
  }
  object ListSubheaderTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ListSubheaderClassKey, defaultComponent: D, props: P & DisableSticky): ListSubheaderTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ListSubheaderTypeMap[P, D]]
    }
    
    extension [Self <: ListSubheaderTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ListSubheaderTypeMap[P, D])) {
      
      inline def setClassKey(value: ListSubheaderClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableSticky): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ListSubheaderTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `listSubheaderListSubheaderMod.foo` */
  override def _to: OverridableComponent[ListSubheaderTypeMap[js.Object, li]] = default
}
