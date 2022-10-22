package typingsJapgolly.wixUiCore

import typingsJapgolly.react.mod.ButtonHTMLAttributes
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiCore.wixUiCoreStrings.button
import typingsJapgolly.wixUiCore.wixUiCoreStrings.reset
import typingsJapgolly.wixUiCore.wixUiCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEsSrcComponentsDeprecatedButtonButtonMod {
  
  @JSImport("wix-ui-core/dist/es/src/components/deprecated/button/Button", "Button")
  @js.native
  val Button: FunctionComponent[ButtonProps] = js.native
  
  trait ButtonProps
    extends StObject
       with ButtonHTMLAttributes[Any] {
    
    /** Type of the button - submit / button / reset */
    @JSName("type")
    var type_ButtonProps: js.UndefOr[submit | button | reset] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setType(value: submit | button | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
