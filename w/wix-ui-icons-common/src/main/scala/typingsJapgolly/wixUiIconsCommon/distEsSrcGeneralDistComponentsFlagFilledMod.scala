package typingsJapgolly.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcGeneralDistComponentsFlagFilledMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/es/src/general/dist/components/FlagFilled", JSImport.Default)
  @js.native
  val default: FC[FlagFilledProps] = js.native
  
  trait FlagFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FlagFilledProps {
    
    inline def apply(): FlagFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagFilledProps]
    }
    
    extension [Self <: FlagFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FlagFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distEsSrcGeneralDistComponentsFlagFilledMod.foo` */
  override def _to: FC[FlagFilledProps] = default
}
