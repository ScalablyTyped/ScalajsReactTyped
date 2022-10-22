package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsAddChannelMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/AddChannel", JSImport.Default)
  @js.native
  val default: FC[AddChannelProps] = js.native
  
  trait AddChannelProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddChannelProps {
    
    inline def apply(): AddChannelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddChannelProps]
    }
    
    extension [Self <: AddChannelProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddChannelProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsAddChannelMod.foo` */
  override def _to: FC[AddChannelProps] = default
}
