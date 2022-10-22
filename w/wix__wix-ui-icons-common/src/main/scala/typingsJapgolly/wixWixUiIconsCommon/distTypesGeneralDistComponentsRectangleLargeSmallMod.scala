package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRectangleLargeSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/RectangleLargeSmall", JSImport.Default)
  @js.native
  val default: FC[RectangleLargeSmallProps] = js.native
  
  trait RectangleLargeSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RectangleLargeSmallProps {
    
    inline def apply(): RectangleLargeSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RectangleLargeSmallProps]
    }
    
    extension [Self <: RectangleLargeSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RectangleLargeSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRectangleLargeSmallMod.foo` */
  override def _to: FC[RectangleLargeSmallProps] = default
}
