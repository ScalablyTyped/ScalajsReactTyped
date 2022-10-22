package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsVisibileHiddenMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/VisibileHidden", JSImport.Default)
  @js.native
  val default: FC[VisibileHiddenProps] = js.native
  
  trait VisibileHiddenProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object VisibileHiddenProps {
    
    inline def apply(): VisibileHiddenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VisibileHiddenProps]
    }
    
    extension [Self <: VisibileHiddenProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[VisibileHiddenProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsVisibileHiddenMod.foo` */
  override def _to: FC[VisibileHiddenProps] = default
}
