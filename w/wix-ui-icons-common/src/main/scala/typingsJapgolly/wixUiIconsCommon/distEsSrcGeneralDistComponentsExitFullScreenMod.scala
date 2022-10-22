package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsExitFullScreenMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/ExitFullScreen", JSImport.Default)
  @js.native
  val default: FC[ExitFullScreenProps] = js.native
  
  trait ExitFullScreenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object ExitFullScreenProps {
    
    inline def apply(): ExitFullScreenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExitFullScreenProps]
    }
    
    extension [Self <: ExitFullScreenProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[ExitFullScreenProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsExitFullScreenMod.foo` */
  override def _to: FC[ExitFullScreenProps] = default
}
