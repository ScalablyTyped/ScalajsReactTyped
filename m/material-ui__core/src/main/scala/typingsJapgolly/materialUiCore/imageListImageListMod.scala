package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Gap
import typingsJapgolly.materialUiCore.materialUiCoreStrings.root
import typingsJapgolly.materialUiCore.materialUiCoreStrings.ul
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListImageListMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageList API](https://mui.com/api/image-list/)
    */
  @JSImport("@material-ui/core/ImageList/ImageList", JSImport.Default)
  @js.native
  val default: OverridableComponent[ImageListTypeMap[js.Object, ul]] = js.native
  
  type ImageListClassKey = root
  
  type ImageListProps[D /* <: ElementType */, P] = OverrideProps[ImageListTypeMap[P, D], D]
  
  trait ImageListTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ImageListClassKey
    
    var defaultComponent: D
    
    var props: P & Gap
  }
  object ImageListTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ImageListClassKey, defaultComponent: D, props: P & Gap): ImageListTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListTypeMap[P, D]]
    }
    
    extension [Self <: ImageListTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ImageListTypeMap[P, D])) {
      
      inline def setClassKey(value: ImageListClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Gap): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ImageListTypeMap[js.Object, ul]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListImageListMod.foo` */
  override def _to: OverridableComponent[ImageListTypeMap[js.Object, ul]] = default
}
