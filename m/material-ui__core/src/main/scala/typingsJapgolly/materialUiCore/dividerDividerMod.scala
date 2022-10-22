package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Absolute
import typingsJapgolly.materialUiCore.materialUiCoreStrings.hr
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dividerDividerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Dividers](https://mui.com/components/dividers/)
    * - [Lists](https://mui.com/components/lists/)
    *
    * API:
    *
    * - [Divider API](https://mui.com/api/divider/)
    */
  @JSImport("@material-ui/core/Divider/Divider", JSImport.Default)
  @js.native
  val default: OverridableComponent[DividerTypeMap[js.Object, hr]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.absolute
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.inset
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.light
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.middle
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical
  */
  trait DividerClassKey extends StObject
  object DividerClassKey {
    
    inline def absolute: typingsJapgolly.materialUiCore.materialUiCoreStrings.absolute = "absolute".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.absolute]
    
    inline def inset: typingsJapgolly.materialUiCore.materialUiCoreStrings.inset = "inset".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.inset]
    
    inline def light: typingsJapgolly.materialUiCore.materialUiCoreStrings.light = "light".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.light]
    
    inline def middle: typingsJapgolly.materialUiCore.materialUiCoreStrings.middle = "middle".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.middle]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def vertical: typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical = "vertical".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.vertical]
  }
  
  type DividerProps[D /* <: ElementType */, P] = OverrideProps[DividerTypeMap[P, D], D]
  
  trait DividerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: DividerClassKey
    
    var defaultComponent: D
    
    var props: P & Absolute
  }
  object DividerTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: DividerClassKey, defaultComponent: D, props: P & Absolute): DividerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[DividerTypeMap[P, D]]
    }
    
    extension [Self <: DividerTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (DividerTypeMap[P, D])) {
      
      inline def setClassKey(value: DividerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Absolute): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[DividerTypeMap[js.Object, hr]]
  
  /* This means you don't have to write `default`, but can instead just say `dividerDividerMod.foo` */
  override def _to: OverridableComponent[DividerTypeMap[js.Object, hr]] = default
}
