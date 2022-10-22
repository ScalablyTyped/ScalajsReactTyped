package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsChatDisabedMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/ChatDisabed", JSImport.Default)
  @js.native
  val default: FC[ChatDisabedProps] = js.native
  
  trait ChatDisabedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChatDisabedProps {
    
    inline def apply(): ChatDisabedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChatDisabedProps]
    }
    
    extension [Self <: ChatDisabedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChatDisabedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsChatDisabedMod.foo` */
  override def _to: FC[ChatDisabedProps] = default
}
