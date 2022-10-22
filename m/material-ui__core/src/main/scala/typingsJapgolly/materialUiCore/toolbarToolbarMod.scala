package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Variant
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object toolbarToolbarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [App Bar](https://mui.com/components/app-bar/)
    *
    * API:
    *
    * - [Toolbar API](https://mui.com/api/toolbar/)
    */
  @JSImport("@material-ui/core/Toolbar/Toolbar", JSImport.Default)
  @js.native
  val default: OverridableComponent[ToolbarTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.regular
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.dense
  */
  trait ToolbarClassKey extends StObject
  object ToolbarClassKey {
    
    inline def dense: typingsJapgolly.materialUiCore.materialUiCoreStrings.dense = "dense".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.dense]
    
    inline def gutters: typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters = "gutters".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.gutters]
    
    inline def regular: typingsJapgolly.materialUiCore.materialUiCoreStrings.regular = "regular".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.regular]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ToolbarProps[D /* <: ElementType */, P] = OverrideProps[ToolbarTypeMap[P, D], D]
  
  trait ToolbarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ToolbarClassKey
    
    var defaultComponent: D
    
    var props: P & Variant
  }
  object ToolbarTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ToolbarClassKey, defaultComponent: D, props: P & Variant): ToolbarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarTypeMap[P, D]]
    }
    
    extension [Self <: ToolbarTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ToolbarTypeMap[P, D])) {
      
      inline def setClassKey(value: ToolbarClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Variant): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ToolbarTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `toolbarToolbarMod.foo` */
  override def _to: OverridableComponent[ToolbarTypeMap[js.Object, div]] = default
}
