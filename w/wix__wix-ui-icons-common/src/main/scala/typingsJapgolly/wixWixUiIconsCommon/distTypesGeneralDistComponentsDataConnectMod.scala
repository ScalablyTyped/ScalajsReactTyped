package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDataConnectMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DataConnect", JSImport.Default)
  @js.native
  val default: FC[DataConnectProps] = js.native
  
  trait DataConnectProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DataConnectProps {
    
    inline def apply(): DataConnectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataConnectProps]
    }
    
    extension [Self <: DataConnectProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DataConnectProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDataConnectMod.foo` */
  override def _to: FC[DataConnectProps] = default
}
