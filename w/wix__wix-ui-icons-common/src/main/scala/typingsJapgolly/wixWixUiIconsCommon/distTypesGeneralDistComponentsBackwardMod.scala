package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsBackwardMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Backward", JSImport.Default)
  @js.native
  val default: FC[BackwardProps] = js.native
  
  trait BackwardProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object BackwardProps {
    
    inline def apply(): BackwardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackwardProps]
    }
    
    extension [Self <: BackwardProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[BackwardProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsBackwardMod.foo` */
  override def _to: FC[BackwardProps] = default
}
