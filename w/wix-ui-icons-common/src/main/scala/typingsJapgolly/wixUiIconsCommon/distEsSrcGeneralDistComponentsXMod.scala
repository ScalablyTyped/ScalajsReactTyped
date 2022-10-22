package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsXMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/X", JSImport.Default)
  @js.native
  val default: FC[XProps] = js.native
  
  trait XProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object XProps {
    
    inline def apply(): XProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[XProps]
    }
    
    extension [Self <: XProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[XProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsXMod.foo` */
  override def _to: FC[XProps] = default
}
