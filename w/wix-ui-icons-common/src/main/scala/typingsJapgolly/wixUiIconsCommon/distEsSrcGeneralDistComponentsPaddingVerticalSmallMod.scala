package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsPaddingVerticalSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/PaddingVerticalSmall", JSImport.Default)
  @js.native
  val default: FC[PaddingVerticalSmallProps] = js.native
  
  trait PaddingVerticalSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object PaddingVerticalSmallProps {
    
    inline def apply(): PaddingVerticalSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PaddingVerticalSmallProps]
    }
    
    extension [Self <: PaddingVerticalSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[PaddingVerticalSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsPaddingVerticalSmallMod.foo` */
  override def _to: FC[PaddingVerticalSmallProps] = default
}
