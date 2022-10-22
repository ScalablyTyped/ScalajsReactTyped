package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesGeneralDistComponentsRadioButtonGroupMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/general/dist/components/RadioButtonGroup", JSImport.Default)
  @js.native
  val default: FC[RadioButtonGroupProps] = js.native
  
  trait RadioButtonGroupProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object RadioButtonGroupProps {
    
    inline def apply(): RadioButtonGroupProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RadioButtonGroupProps]
    }
    
    extension [Self <: RadioButtonGroupProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[RadioButtonGroupProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesGeneralDistComponentsRadioButtonGroupMod.foo` */
  override def _to: FC[RadioButtonGroupProps] = default
}
