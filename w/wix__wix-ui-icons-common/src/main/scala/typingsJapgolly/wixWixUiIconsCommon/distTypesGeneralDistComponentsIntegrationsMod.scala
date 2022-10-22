package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsIntegrationsMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Integrations", JSImport.Default)
  @js.native
  val default: FC[IntegrationsProps] = js.native
  
  trait IntegrationsProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object IntegrationsProps {
    
    inline def apply(): IntegrationsProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IntegrationsProps]
    }
    
    extension [Self <: IntegrationsProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[IntegrationsProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsIntegrationsMod.foo` */
  override def _to: FC[IntegrationsProps] = default
}
