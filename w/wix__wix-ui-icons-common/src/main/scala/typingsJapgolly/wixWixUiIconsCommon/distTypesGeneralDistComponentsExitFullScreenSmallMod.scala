package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsExitFullScreenSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/ExitFullScreenSmall", JSImport.Default)
  @js.native
  val default: FC[ExitFullScreenSmallProps] = js.native
  
  trait ExitFullScreenSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExitFullScreenSmallProps {
    
    inline def apply(): ExitFullScreenSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitFullScreenSmallProps]
    }
    
    extension [Self <: ExitFullScreenSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExitFullScreenSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsExitFullScreenSmallMod.foo` */
  override def _to: FC[ExitFullScreenSmallProps] = default
}
