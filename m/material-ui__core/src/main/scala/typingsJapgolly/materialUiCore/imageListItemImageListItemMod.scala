package typingsJapgolly.materialUiCore

import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.materialUiCore.anon.Rows
import typingsJapgolly.materialUiCore.materialUiCoreStrings.li
import typingsJapgolly.materialUiCore.overridableComponentMod.OverridableComponent
import typingsJapgolly.materialUiCore.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageListItemImageListItemMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Image List](https://mui.com/components/image-list/)
    *
    * API:
    *
    * - [ImageListItem API](https://mui.com/api/image-list-item/)
    */
  @JSImport("@material-ui/core/ImageListItem/ImageListItem", JSImport.Default)
  @js.native
  val default: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.root
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.item
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight
    - typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth
  */
  trait ImageListItemClassKey extends StObject
  object ImageListItemClassKey {
    
    inline def imgFullHeight: typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight = "imgFullHeight".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullHeight]
    
    inline def imgFullWidth: typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth = "imgFullWidth".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.imgFullWidth]
    
    inline def item: typingsJapgolly.materialUiCore.materialUiCoreStrings.item = "item".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.item]
    
    inline def root: typingsJapgolly.materialUiCore.materialUiCoreStrings.root = "root".asInstanceOf[typingsJapgolly.materialUiCore.materialUiCoreStrings.root]
  }
  
  type ImageListItemProps[D /* <: ElementType */, P] = OverrideProps[ImageListItemTypeMap[P, D], D]
  
  trait ImageListItemTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var classKey: ImageListItemClassKey
    
    var defaultComponent: D
    
    var props: P & Rows
  }
  object ImageListItemTypeMap {
    
    inline def apply[P, D /* <: ElementType */](classKey: ImageListItemClassKey, defaultComponent: D, props: P & Rows): ImageListItemTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(classKey = classKey.asInstanceOf[js.Any], defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageListItemTypeMap[P, D]]
    }
    
    extension [Self <: ImageListItemTypeMap[?, ?], P, D /* <: ElementType */](x: Self & (ImageListItemTypeMap[P, D])) {
      
      inline def setClassKey(value: ImageListItemClassKey): Self = StObject.set(x, "classKey", value.asInstanceOf[js.Any])
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Rows): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[ImageListItemTypeMap[js.Object, li]]
  
  /* This means you don't have to write `default`, but can instead just say `imageListItemImageListItemMod.foo` */
  override def _to: OverridableComponent[ImageListItemTypeMap[js.Object, li]] = default
}
