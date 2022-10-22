package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsEmailAlertSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/EmailAlertSmall", JSImport.Default)
  @js.native
  val default: FC[EmailAlertSmallProps] = js.native
  
  trait EmailAlertSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object EmailAlertSmallProps {
    
    inline def apply(): EmailAlertSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmailAlertSmallProps]
    }
    
    extension [Self <: EmailAlertSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[EmailAlertSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsEmailAlertSmallMod.foo` */
  override def _to: FC[EmailAlertSmallProps] = default
}
