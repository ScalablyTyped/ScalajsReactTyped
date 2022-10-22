package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsCropMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Crop", JSImport.Default)
  @js.native
  val default: FC[CropProps] = js.native
  
  trait CropProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object CropProps {
    
    inline def apply(): CropProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CropProps]
    }
    
    extension [Self <: CropProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[CropProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsCropMod.foo` */
  override def _to: FC[CropProps] = default
}
