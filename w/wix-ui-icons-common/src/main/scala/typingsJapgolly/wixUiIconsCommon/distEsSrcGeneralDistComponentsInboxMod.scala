package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsInboxMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/Inbox", JSImport.Default)
  @js.native
  val default: FC[InboxProps] = js.native
  
  trait InboxProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object InboxProps {
    
    inline def apply(): InboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InboxProps]
    }
    
    extension [Self <: InboxProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[InboxProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsInboxMod.foo` */
  override def _to: FC[InboxProps] = default
}
