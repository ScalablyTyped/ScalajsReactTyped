package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsAddItemSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/AddItemSmall", JSImport.Default)
  @js.native
  val default: FC[AddItemSmallProps] = js.native
  
  trait AddItemSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object AddItemSmallProps {
    
    inline def apply(): AddItemSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AddItemSmallProps]
    }
    
    extension [Self <: AddItemSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[AddItemSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsAddItemSmallMod.foo` */
  override def _to: FC[AddItemSmallProps] = default
}
