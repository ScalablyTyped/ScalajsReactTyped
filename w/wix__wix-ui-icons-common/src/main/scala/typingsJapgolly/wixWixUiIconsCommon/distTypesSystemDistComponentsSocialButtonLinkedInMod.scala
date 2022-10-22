package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsSocialButtonLinkedInMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/SocialButtonLinkedIn", JSImport.Default)
  @js.native
  val default: FC[SocialButtonLinkedInProps] = js.native
  
  trait SocialButtonLinkedInProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SocialButtonLinkedInProps {
    
    inline def apply(): SocialButtonLinkedInProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SocialButtonLinkedInProps]
    }
    
    extension [Self <: SocialButtonLinkedInProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SocialButtonLinkedInProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsSocialButtonLinkedInMod.foo` */
  override def _to: FC[SocialButtonLinkedInProps] = default
}
