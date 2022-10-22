package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsSortAscendingMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/SortAscending", JSImport.Default)
  @js.native
  val default: FC[SortAscendingProps] = js.native
  
  trait SortAscendingProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object SortAscendingProps {
    
    inline def apply(): SortAscendingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortAscendingProps]
    }
    
    extension [Self <: SortAscendingProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[SortAscendingProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsSortAscendingMod.foo` */
  override def _to: FC[SortAscendingProps] = default
}
