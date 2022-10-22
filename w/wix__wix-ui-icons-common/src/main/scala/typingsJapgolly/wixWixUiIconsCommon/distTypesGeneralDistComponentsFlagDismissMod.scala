package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsFlagDismissMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/FlagDismiss", JSImport.Default)
  @js.native
  val default: FC[FlagDismissProps] = js.native
  
  trait FlagDismissProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagDismissProps {
    
    inline def apply(): FlagDismissProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagDismissProps]
    }
    
    extension [Self <: FlagDismissProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagDismissProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsFlagDismissMod.foo` */
  override def _to: FC[FlagDismissProps] = default
}
