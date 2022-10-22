package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsArrowDownMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/ArrowDown", JSImport.Default)
  @js.native
  val default: FC[ArrowDownProps] = js.native
  
  trait ArrowDownProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ArrowDownProps {
    
    inline def apply(): ArrowDownProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArrowDownProps]
    }
    
    extension [Self <: ArrowDownProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ArrowDownProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsArrowDownMod.foo` */
  override def _to: FC[ArrowDownProps] = default
}
