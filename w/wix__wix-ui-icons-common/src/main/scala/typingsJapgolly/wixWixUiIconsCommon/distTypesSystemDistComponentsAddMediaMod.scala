package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsAddMediaMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/AddMedia", JSImport.Default)
  @js.native
  val default: FC[AddMediaProps] = js.native
  
  trait AddMediaProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddMediaProps {
    
    inline def apply(): AddMediaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddMediaProps]
    }
    
    extension [Self <: AddMediaProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddMediaProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsAddMediaMod.foo` */
  override def _to: FC[AddMediaProps] = default
}
