package typingsJapgolly.reactToolbox

import typingsJapgolly.react.mod.Component
import typingsJapgolly.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHocPortalMod {
  
  @JSImport("react-toolbox/components/hoc/Portal", JSImport.Default)
  @js.native
  open class default ()
    extends Component[PortalProps, js.Object, Any]
  
  type Portal = japgolly.scalajs.react.facade.React.Component[PortalProps & js.Object, js.Object]
  
  trait PortalProps
    extends StObject
       with Props {
    
    var container: js.UndefOr[Any] = js.undefined
    
    var lockBody: js.UndefOr[Boolean] = js.undefined
  }
  object PortalProps {
    
    inline def apply(): PortalProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PortalProps]
    }
    
    extension [Self <: PortalProps](x: Self) {
      
      inline def setContainer(value: Any): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setLockBody(value: Boolean): Self = StObject.set(x, "lockBody", value.asInstanceOf[js.Any])
      
      inline def setLockBodyUndefined: Self = StObject.set(x, "lockBody", js.undefined)
    }
  }
}
