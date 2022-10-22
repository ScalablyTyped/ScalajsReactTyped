package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsBookmarkFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/BookmarkFilled", JSImport.Default)
  @js.native
  val default: FC[BookmarkFilledProps] = js.native
  
  trait BookmarkFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BookmarkFilledProps {
    
    inline def apply(): BookmarkFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BookmarkFilledProps]
    }
    
    extension [Self <: BookmarkFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BookmarkFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsBookmarkFilledMod.foo` */
  override def _to: FC[BookmarkFilledProps] = default
}
