package typingsJapgolly.materialUiLab

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import typingsJapgolly.materialUiLab.anon.Animation
import typingsJapgolly.materialUiLab.materialUiLabStrings.div
import typingsJapgolly.materialUiLab.materialUiLabStrings.span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object skeletonSkeletonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Skeleton](https://mui.com/components/skeleton/)
    *
    * API:
    *
    * - [Skeleton API](https://mui.com/api/skeleton/)
    */
  @JSImport("@material-ui/lab/Skeleton/Skeleton", JSImport.Default)
  @js.native
  val default: OverridableComponent[SkeletonTypeMap[js.Object, span]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiLab.materialUiLabStrings.root
    - typingsJapgolly.materialUiLab.materialUiLabStrings.text
    - typingsJapgolly.materialUiLab.materialUiLabStrings.rect
    - typingsJapgolly.materialUiLab.materialUiLabStrings.circle
    - typingsJapgolly.materialUiLab.materialUiLabStrings.pulse
    - typingsJapgolly.materialUiLab.materialUiLabStrings.wave
    - typingsJapgolly.materialUiLab.materialUiLabStrings.withChildren
    - typingsJapgolly.materialUiLab.materialUiLabStrings.fitContent
    - typingsJapgolly.materialUiLab.materialUiLabStrings.heightAuto
  */
  trait SkeletonClassKey extends StObject
  object SkeletonClassKey {
    
    inline def circle: typingsJapgolly.materialUiLab.materialUiLabStrings.circle = "circle".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.circle]
    
    inline def fitContent: typingsJapgolly.materialUiLab.materialUiLabStrings.fitContent = "fitContent".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.fitContent]
    
    inline def heightAuto: typingsJapgolly.materialUiLab.materialUiLabStrings.heightAuto = "heightAuto".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.heightAuto]
    
    inline def pulse: typingsJapgolly.materialUiLab.materialUiLabStrings.pulse = "pulse".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.pulse]
    
    inline def rect: typingsJapgolly.materialUiLab.materialUiLabStrings.rect = "rect".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.rect]
    
    inline def root: typingsJapgolly.materialUiLab.materialUiLabStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.root]
    
    inline def text: typingsJapgolly.materialUiLab.materialUiLabStrings.text = "text".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.text]
    
    inline def wave: typingsJapgolly.materialUiLab.materialUiLabStrings.wave = "wave".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.wave]
    
    inline def withChildren: typingsJapgolly.materialUiLab.materialUiLabStrings.withChildren = "withChildren".asInstanceOf[typingsJapgolly.materialUiLab.materialUiLabStrings.withChildren]
  }
  
  type SkeletonProps[D /* <: ElementType */, P] = OverrideProps[SkeletonTypeMap[P, D], D]
  
  trait SkeletonTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: SkeletonClassKey
    
    var defaultComponent: div
    
    var props: P & Animation
  }
  object SkeletonTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: SkeletonClassKey, props: P & Animation): SkeletonTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = "div", props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[SkeletonTypeMap[P, D]]
    }
    
    extension [Self <: SkeletonTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (SkeletonTypeMap[P, D])) {
      
      inline def setClassKey(value: SkeletonClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: div): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Animation): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[SkeletonTypeMap[js.Object, span]]
  
  /* This means you don't have to write `default`, but can instead just say `skeletonSkeletonMod.foo` */
  override def _to: OverridableComponent[SkeletonTypeMap[js.Object, span]] = default
}
