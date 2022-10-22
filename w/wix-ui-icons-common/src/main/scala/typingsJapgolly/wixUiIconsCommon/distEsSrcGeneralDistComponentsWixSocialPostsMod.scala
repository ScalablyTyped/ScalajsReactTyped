package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsWixSocialPostsMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/WixSocialPosts", JSImport.Default)
  @js.native
  val default: FC[WixSocialPostsProps] = js.native
  
  trait WixSocialPostsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixSocialPostsProps {
    
    inline def apply(): WixSocialPostsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixSocialPostsProps]
    }
    
    extension [Self <: WixSocialPostsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixSocialPostsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsWixSocialPostsMod.foo` */
  override def _to: FC[WixSocialPostsProps] = default
}
