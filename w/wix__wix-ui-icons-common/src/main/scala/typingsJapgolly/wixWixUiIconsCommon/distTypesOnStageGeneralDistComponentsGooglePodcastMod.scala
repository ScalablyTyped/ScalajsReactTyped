package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsGooglePodcastMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/GooglePodcast", JSImport.Default)
  @js.native
  val default: FC[GooglePodcastProps] = js.native
  
  trait GooglePodcastProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object GooglePodcastProps {
    
    inline def apply(): GooglePodcastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GooglePodcastProps]
    }
    
    extension [Self <: GooglePodcastProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[GooglePodcastProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsGooglePodcastMod.foo` */
  override def _to: FC[GooglePodcastProps] = default
}
