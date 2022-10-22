package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRevertMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/Revert", JSImport.Default)
  @js.native
  val default: FC[RevertProps] = js.native
  
  trait RevertProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RevertProps {
    
    inline def apply(): RevertProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RevertProps]
    }
    
    extension [Self <: RevertProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RevertProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRevertMod.foo` */
  override def _to: FC[RevertProps] = default
}
