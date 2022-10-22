package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDateSyncMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DateSync", JSImport.Default)
  @js.native
  val default: FC[DateSyncProps] = js.native
  
  trait DateSyncProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DateSyncProps {
    
    inline def apply(): DateSyncProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DateSyncProps]
    }
    
    extension [Self <: DateSyncProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DateSyncProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDateSyncMod.foo` */
  override def _to: FC[DateSyncProps] = default
}
