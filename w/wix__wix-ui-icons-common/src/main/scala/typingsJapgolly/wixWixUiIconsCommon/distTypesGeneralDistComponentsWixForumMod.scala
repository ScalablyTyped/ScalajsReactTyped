package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsWixForumMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/WixForum", JSImport.Default)
  @js.native
  val default: FC[WixForumProps] = js.native
  
  trait WixForumProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WixForumProps {
    
    inline def apply(): WixForumProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WixForumProps]
    }
    
    extension [Self <: WixForumProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WixForumProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsWixForumMod.foo` */
  override def _to: FC[WixForumProps] = default
}
