package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesResponsiveEditorGeneralDistComponentsSlideShowVerticalMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/responsive-editor/general/dist/components/SlideShowVertical", JSImport.Default)
  @js.native
  val default: FC[SlideShowVerticalProps] = js.native
  
  trait SlideShowVerticalProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SlideShowVerticalProps {
    
    inline def apply(): SlideShowVerticalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlideShowVerticalProps]
    }
    
    extension [Self <: SlideShowVerticalProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SlideShowVerticalProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesResponsiveEditorGeneralDistComponentsSlideShowVerticalMod.foo` */
  override def _to: FC[SlideShowVerticalProps] = default
}
