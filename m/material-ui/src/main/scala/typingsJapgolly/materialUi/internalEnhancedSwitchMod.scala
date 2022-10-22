package typingsJapgolly.materialUi

import typingsJapgolly.materialUi.MaterialUI.Switches.CommonEnhancedSwitchProps
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object internalEnhancedSwitchMod {
  
  @JSImport("material-ui/internal/EnhancedSwitch", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EnhancedSwitchProps, js.Object, Any]
  
  type EnhancedSwitch = japgolly.scalajs.react.facade.React.Component[EnhancedSwitchProps & js.Object, js.Object]
  
  trait EnhancedSwitchProps
    extends StObject
       with CommonEnhancedSwitchProps[
          japgolly.scalajs.react.facade.React.Component[EnhancedSwitchProps & js.Object, js.Object]
        ]
  object EnhancedSwitchProps {
    
    inline def apply(): EnhancedSwitchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnhancedSwitchProps]
    }
  }
}
