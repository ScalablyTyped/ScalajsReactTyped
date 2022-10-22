package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsContentFilterMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ContentFilter", JSImport.Default)
  @js.native
  val default: FC[ContentFilterProps] = js.native
  
  trait ContentFilterProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ContentFilterProps {
    
    inline def apply(): ContentFilterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContentFilterProps]
    }
    
    extension [Self <: ContentFilterProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ContentFilterProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsContentFilterMod.foo` */
  override def _to: FC[ContentFilterProps] = default
}
