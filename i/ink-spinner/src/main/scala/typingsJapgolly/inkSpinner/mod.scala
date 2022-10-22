package typingsJapgolly.inkSpinner

import typingsJapgolly.cliSpinners.mod.SpinnerName
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ink-spinner", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SpinnerProps, js.Object, Any]
  
  type Spinner = japgolly.scalajs.react.facade.React.Component[SpinnerProps & js.Object, js.Object]
  
  trait SpinnerProps extends StObject {
    
    /**
      * Type of a spinner to use. See https://github.com/sindresorhus/cli-spinners for available spinners.
      *
      * @default 'dot'
      */
    var `type`: js.UndefOr[SpinnerName] = js.undefined
  }
  object SpinnerProps {
    
    inline def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    extension [Self <: SpinnerProps](x: Self) {
      
      inline def setType(value: SpinnerName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
