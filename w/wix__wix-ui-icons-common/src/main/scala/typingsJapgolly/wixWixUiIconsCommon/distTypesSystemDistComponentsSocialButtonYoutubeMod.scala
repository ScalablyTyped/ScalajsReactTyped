package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsSocialButtonYoutubeMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/SocialButtonYoutube", JSImport.Default)
  @js.native
  val default: FC[SocialButtonYoutubeProps] = js.native
  
  trait SocialButtonYoutubeProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialButtonYoutubeProps {
    
    inline def apply(): SocialButtonYoutubeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonYoutubeProps]
    }
    
    extension [Self <: SocialButtonYoutubeProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialButtonYoutubeProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsSocialButtonYoutubeMod.foo` */
  override def _to: FC[SocialButtonYoutubeProps] = default
}
