package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsFlagDismissSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/FlagDismissSmall", JSImport.Default)
  @js.native
  val default: FC[FlagDismissSmallProps] = js.native
  
  trait FlagDismissSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagDismissSmallProps {
    
    inline def apply(): FlagDismissSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagDismissSmallProps]
    }
    
    extension [Self <: FlagDismissSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagDismissSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsFlagDismissSmallMod.foo` */
  override def _to: FC[FlagDismissSmallProps] = default
}
