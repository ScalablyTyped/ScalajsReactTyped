package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsPhotoCameraSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/PhotoCameraSmall", JSImport.Default)
  @js.native
  val default: FC[PhotoCameraSmallProps] = js.native
  
  trait PhotoCameraSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PhotoCameraSmallProps {
    
    inline def apply(): PhotoCameraSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PhotoCameraSmallProps]
    }
    
    extension [Self <: PhotoCameraSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PhotoCameraSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsPhotoCameraSmallMod.foo` */
  override def _to: FC[PhotoCameraSmallProps] = default
}
