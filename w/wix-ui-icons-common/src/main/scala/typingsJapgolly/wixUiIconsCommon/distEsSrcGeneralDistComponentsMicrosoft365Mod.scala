package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsMicrosoft365Mod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/Microsoft365", JSImport.Default)
  @js.native
  val default: FC[Microsoft365Props] = js.native
  
  trait Microsoft365Props
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object Microsoft365Props {
    
    inline def apply(): Microsoft365Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Microsoft365Props]
    }
    
    extension [Self <: Microsoft365Props](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[Microsoft365Props]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsMicrosoft365Mod.foo` */
  override def _to: FC[Microsoft365Props] = default
}
