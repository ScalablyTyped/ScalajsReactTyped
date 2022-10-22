package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactBootstrap.libDropdownToggleMod.DropdownToggleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSplitToggleMod {
  
  @JSImport("react-bootstrap/lib/SplitToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SplitToggleProps, js.Object, Any]
  
  type SplitToggle = japgolly.scalajs.react.facade.React.Component[SplitToggleProps & js.Object, js.Object]
  
  trait SplitToggleProps
    extends StObject
       with DropdownToggleProps
  object SplitToggleProps {
    
    inline def apply(): SplitToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SplitToggleProps]
    }
  }
}
