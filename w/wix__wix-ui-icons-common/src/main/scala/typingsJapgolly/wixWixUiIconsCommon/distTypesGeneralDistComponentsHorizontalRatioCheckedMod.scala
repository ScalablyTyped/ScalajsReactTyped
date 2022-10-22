package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsHorizontalRatioCheckedMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/HorizontalRatioChecked", JSImport.Default)
  @js.native
  val default: FC[HorizontalRatioCheckedProps] = js.native
  
  trait HorizontalRatioCheckedProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object HorizontalRatioCheckedProps {
    
    inline def apply(): HorizontalRatioCheckedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HorizontalRatioCheckedProps]
    }
    
    extension [Self <: HorizontalRatioCheckedProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[HorizontalRatioCheckedProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsHorizontalRatioCheckedMod.foo` */
  override def _to: FC[HorizontalRatioCheckedProps] = default
}
