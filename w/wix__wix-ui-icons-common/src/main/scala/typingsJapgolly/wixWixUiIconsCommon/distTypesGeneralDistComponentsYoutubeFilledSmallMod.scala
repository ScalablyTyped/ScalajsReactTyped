package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsYoutubeFilledSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/YoutubeFilledSmall", JSImport.Default)
  @js.native
  val default: FC[YoutubeFilledSmallProps] = js.native
  
  trait YoutubeFilledSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object YoutubeFilledSmallProps {
    
    inline def apply(): YoutubeFilledSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[YoutubeFilledSmallProps]
    }
    
    extension [Self <: YoutubeFilledSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[YoutubeFilledSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsYoutubeFilledSmallMod.foo` */
  override def _to: FC[YoutubeFilledSmallProps] = default
}
