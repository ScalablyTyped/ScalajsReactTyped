package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDocMovetoMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DocMoveto", JSImport.Default)
  @js.native
  val default: FC[DocMovetoProps] = js.native
  
  trait DocMovetoProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocMovetoProps {
    
    inline def apply(): DocMovetoProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocMovetoProps]
    }
    
    extension [Self <: DocMovetoProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocMovetoProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDocMovetoMod.foo` */
  override def _to: FC[DocMovetoProps] = default
}
