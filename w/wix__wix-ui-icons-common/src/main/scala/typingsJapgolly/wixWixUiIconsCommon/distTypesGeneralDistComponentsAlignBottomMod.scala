package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsAlignBottomMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/AlignBottom", JSImport.Default)
  @js.native
  val default: FC[AlignBottomProps] = js.native
  
  trait AlignBottomProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AlignBottomProps {
    
    inline def apply(): AlignBottomProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AlignBottomProps]
    }
    
    extension [Self <: AlignBottomProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AlignBottomProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsAlignBottomMod.foo` */
  override def _to: FC[AlignBottomProps] = default
}
