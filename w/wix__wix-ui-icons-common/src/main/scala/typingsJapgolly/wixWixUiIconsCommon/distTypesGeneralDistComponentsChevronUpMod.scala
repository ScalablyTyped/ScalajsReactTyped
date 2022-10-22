package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsChevronUpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ChevronUp", JSImport.Default)
  @js.native
  val default: FC[ChevronUpProps] = js.native
  
  trait ChevronUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ChevronUpProps {
    
    inline def apply(): ChevronUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChevronUpProps]
    }
    
    extension [Self <: ChevronUpProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ChevronUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsChevronUpMod.foo` */
  override def _to: FC[ChevronUpProps] = default
}
