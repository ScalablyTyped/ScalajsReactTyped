package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsLoyaltyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Loyalty", JSImport.Default)
  @js.native
  val default: FC[LoyaltyProps] = js.native
  
  trait LoyaltyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LoyaltyProps {
    
    inline def apply(): LoyaltyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoyaltyProps]
    }
    
    extension [Self <: LoyaltyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LoyaltyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsLoyaltyMod.foo` */
  override def _to: FC[LoyaltyProps] = default
}
