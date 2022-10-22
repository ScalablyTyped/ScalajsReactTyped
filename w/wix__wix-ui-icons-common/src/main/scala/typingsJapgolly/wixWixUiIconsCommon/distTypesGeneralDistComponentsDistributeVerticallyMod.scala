package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsDistributeVerticallyMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/DistributeVertically", JSImport.Default)
  @js.native
  val default: FC[DistributeVerticallyProps] = js.native
  
  trait DistributeVerticallyProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object DistributeVerticallyProps {
    
    inline def apply(): DistributeVerticallyProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributeVerticallyProps]
    }
    
    extension [Self <: DistributeVerticallyProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[DistributeVerticallyProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsDistributeVerticallyMod.foo` */
  override def _to: FC[DistributeVerticallyProps] = default
}
