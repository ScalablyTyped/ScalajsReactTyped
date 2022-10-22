package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.DisableGutters
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object containerContainerMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Container](https://mui.com/components/container/)
    *
    * API:
    *
    * - [Container API](https://mui.com/api/container/)
    */
  @JSImport("@material-ui/core/Container/Container", JSImport.Default)
  @js.native
  val default: OverridableComponent[ContainerTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.disableGutters
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXs
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthSm
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthMd
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthLg
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXl
  */
  trait ContainerClassKey extends StObject
  object ContainerClassKey {
    
    inline def disableGutters: typingsJapgolly.materialUiCore.materialUiCoreStrings.disableGutters = "disableGutters".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.disableGutters]
    
    inline def fixed: typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed = "fixed".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fixed]
    
    inline def maxWidthLg: typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthLg = "maxWidthLg".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthLg]
    
    inline def maxWidthMd: typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthMd = "maxWidthMd".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthMd]
    
    inline def maxWidthSm: typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthSm = "maxWidthSm".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthSm]
    
    inline def maxWidthXl: typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXl = "maxWidthXl".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXl]
    
    inline def maxWidthXs: typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXs = "maxWidthXs".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.maxWidthXs]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ContainerProps[D /* <: ElementType */, P] = OverrideProps[ContainerTypeMap[P, D], D]
  
  trait ContainerTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ContainerClassKey
    
    var defaultComponent: D
    
    var props: P & DisableGutters
  }
  object ContainerTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ContainerClassKey, defaultComponent: D, props: P & DisableGutters): ContainerTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContainerTypeMap[P, D]]
    }
    
    extension [Self <: ContainerTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ContainerTypeMap[P, D])) {
      
      inline def setClassKey(value: ContainerClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & DisableGutters): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ContainerTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `containerContainerMod.foo` */
  override def _to: OverridableComponent[ContainerTypeMap[js.Object, div]] = default
}
