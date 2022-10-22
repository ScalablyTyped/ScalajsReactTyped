package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsMoreMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/More", JSImport.Default)
  @js.native
  val default: FC[MoreProps] = js.native
  
  trait MoreProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object MoreProps {
    
    inline def apply(): MoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MoreProps]
    }
    
    extension [Self <: MoreProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[MoreProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsMoreMod.foo` */
  override def _to: FC[MoreProps] = default
}
