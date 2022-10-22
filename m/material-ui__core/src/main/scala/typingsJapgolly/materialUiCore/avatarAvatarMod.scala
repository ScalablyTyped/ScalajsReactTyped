package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Alt
import typingsJapgolly.materialUiCore.materialUiCoreStrings.div
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarAvatarMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Avatars](https://mui.com/components/avatars/)
    *
    * API:
    *
    * - [Avatar API](https://mui.com/api/avatar/)
    */
  @JSImport("@material-ui/core/Avatar/Avatar", JSImport.Default)
  @js.native
  val default: OverridableComponent[AvatarTypeMap[js.Object, div]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDefault
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.circle
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.circular
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.rounded
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.square
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.img
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.fallback
  */
  trait AvatarClassKey extends StObject
  object AvatarClassKey {
    
    inline def circle: typingsJapgolly.materialUiCore.materialUiCoreStrings.circle = "circle".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.circle]
    
    inline def circular: typingsJapgolly.materialUiCore.materialUiCoreStrings.circular = "circular".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.circular]
    
    inline def colorDefault: typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDefault = "colorDefault".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.colorDefault]
    
    inline def fallback: typingsJapgolly.materialUiCore.materialUiCoreStrings.fallback = "fallback".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.fallback]
    
    inline def img: typingsJapgolly.materialUiCore.materialUiCoreStrings.img = "img".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.img]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
    
    inline def rounded: typingsJapgolly.materialUiCore.materialUiCoreStrings.rounded = "rounded".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.rounded]
    
    inline def square: typingsJapgolly.materialUiCore.materialUiCoreStrings.square = "square".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.square]
  }
  
  type AvatarProps[D /* <: ElementType */, P] = OverrideProps[AvatarTypeMap[P, D], D]
  
  trait AvatarTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: AvatarClassKey
    
    var defaultComponent: D
    
    var props: P & Alt
  }
  object AvatarTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: AvatarClassKey, defaultComponent: D, props: P & Alt): AvatarTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarTypeMap[P, D]]
    }
    
    extension [Self <: AvatarTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (AvatarTypeMap[P, D])) {
      
      inline def setClassKey(value: AvatarClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Alt): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[AvatarTypeMap[js.Object, div]]
  
  /* This means you don't have to write `default`, but can instead just say `avatarAvatarMod.foo` */
  override def _to: OverridableComponent[AvatarTypeMap[js.Object, div]] = default
}
