package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsLowerCaseSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/LowerCaseSmall", JSImport.Default)
  @js.native
  val default: FC[LowerCaseSmallProps] = js.native
  
  trait LowerCaseSmallProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object LowerCaseSmallProps {
    
    inline def apply(): LowerCaseSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LowerCaseSmallProps]
    }
    
    extension [Self <: LowerCaseSmallProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[LowerCaseSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsLowerCaseSmallMod.foo` */
  override def _to: FC[LowerCaseSmallProps] = default
}
