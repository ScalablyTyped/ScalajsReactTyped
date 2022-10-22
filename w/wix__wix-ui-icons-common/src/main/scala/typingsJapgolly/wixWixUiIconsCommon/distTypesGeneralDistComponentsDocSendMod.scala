package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDocSendMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DocSend", JSImport.Default)
  @js.native
  val default: FC[DocSendProps] = js.native
  
  trait DocSendProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DocSendProps {
    
    inline def apply(): DocSendProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocSendProps]
    }
    
    extension [Self <: DocSendProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DocSendProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDocSendMod.foo` */
  override def _to: FC[DocSendProps] = default
}
