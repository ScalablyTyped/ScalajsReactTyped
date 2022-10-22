package typingsJapgolly.wixWixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.SVGElement
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSystemDistComponentsFormFieldWarningFilledMod extends Shortcut {
  
  @JSImport("@wix/wix-ui-icons-common/dist/types/system/dist/components/FormFieldWarningFilled", JSImport.Default)
  @js.native
  val default: FC[FormFieldWarningFilledProps] = js.native
  
  trait FormFieldWarningFilledProps
    extends StObject
       with SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String | Double] = js.undefined
  }
  object FormFieldWarningFilledProps {
    
    inline def apply(): FormFieldWarningFilledProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormFieldWarningFilledProps]
    }
    
    extension [Self <: FormFieldWarningFilledProps](x: Self) {
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = FC[FormFieldWarningFilledProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesSystemDistComponentsFormFieldWarningFilledMod.foo` */
  override def _to: FC[FormFieldWarningFilledProps] = default
}
