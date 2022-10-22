package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVignetteMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Vignette", JSImport.Default)
  @js.native
  val default: FC[VignetteProps] = js.native
  
  trait VignetteProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VignetteProps {
    
    inline def apply(): VignetteProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VignetteProps]
    }
    
    extension [Self <: VignetteProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VignetteProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVignetteMod.foo` */
  override def _to: FC[VignetteProps] = default
}
