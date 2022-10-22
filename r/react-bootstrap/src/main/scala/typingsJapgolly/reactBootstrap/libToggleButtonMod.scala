package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.reactBootstrap.libButtonMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToggleButtonMod {
  
  @JSImport("react-bootstrap/lib/ToggleButton", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[ToggleButtonProps & ButtonProps, js.Object, Any]
  
  type ToggleButton = japgolly.scalajs.react.facade.React.Component[ToggleButtonProps & ButtonProps & js.Object, js.Object]
  
  trait ToggleButtonProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[ToggleButtonProps & ButtonProps & js.Object, js.Object]
        ] {
    
    @JSName("value")
    var value_ToggleButtonProps: Double | String
  }
  object ToggleButtonProps {
    
    inline def apply(value: Double | String): ToggleButtonProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToggleButtonProps]
    }
    
    extension [Self <: ToggleButtonProps](x: Self) {
      
      inline def setValue(value: Double | String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
