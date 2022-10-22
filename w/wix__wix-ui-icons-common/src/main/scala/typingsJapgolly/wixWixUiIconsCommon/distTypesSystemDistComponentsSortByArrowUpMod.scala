package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsSortByArrowUpMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/SortByArrowUp", JSImport.Default)
  @js.native
  val default: FC[SortByArrowUpProps] = js.native
  
  trait SortByArrowUpProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortByArrowUpProps {
    
    inline def apply(): SortByArrowUpProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortByArrowUpProps]
    }
    
    extension [Self <: SortByArrowUpProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortByArrowUpProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsSortByArrowUpMod.foo` */
  override def _to: FC[SortByArrowUpProps] = default
}
