package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.SharedEnhancedButtonProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalEnhancedButtonMod {
  
  @JSImport("material-ui/internal/EnhancedButton", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EnhancedButtonProps, js.Object, Any]
  
  type EnhancedButton = japgolly.scalajs.react.facade.React.Component[EnhancedButtonProps & js.Object, js.Object]
  
  trait EnhancedButtonProps
    extends StObject
       with SharedEnhancedButtonProps[
          japgolly.scalajs.react.facade.React.Component[EnhancedButtonProps & js.Object, js.Object]
        ]
  object EnhancedButtonProps {
    
    inline def apply(): EnhancedButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancedButtonProps]
    }
  }
}
