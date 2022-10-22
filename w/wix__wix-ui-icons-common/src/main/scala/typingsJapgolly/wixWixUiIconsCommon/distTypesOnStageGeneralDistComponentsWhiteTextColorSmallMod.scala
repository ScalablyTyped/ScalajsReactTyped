package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesOnStageGeneralDistComponentsWhiteTextColorSmallMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/on-stage/general/dist/components/WhiteTextColorSmall", JSImport.Default)
  @js.native
  val default: FC[WhiteTextColorSmallProps] = js.native
  
  trait WhiteTextColorSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object WhiteTextColorSmallProps {
    
    inline def apply(): WhiteTextColorSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WhiteTextColorSmallProps]
    }
    
    extension [Self <: WhiteTextColorSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[WhiteTextColorSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesOnStageGeneralDistComponentsWhiteTextColorSmallMod.foo` */
  override def _to: FC[WhiteTextColorSmallProps] = default
}
