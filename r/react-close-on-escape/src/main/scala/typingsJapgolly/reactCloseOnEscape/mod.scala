package typingsJapgolly.reactCloseOnEscape

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-close-on-escape", JSImport.Default)
  @js.native
  open class default ()
    extends Component[CloseOnEscapeProps, js.Object, Any]
  
  type CloseOnEscape = japgolly.scalajs.react.facade.React.Component[CloseOnEscapeProps & js.Object, js.Object]
  
  trait CloseOnEscapeProps extends StObject {
    
    /**
      * Callback triggered by pressing ESC
      */
    def onEscape(): Unit
  }
  object CloseOnEscapeProps {
    
    inline def apply(onEscape: Callback): CloseOnEscapeProps = {
      val __obj = js.Dynamic.literal(onEscape = onEscape.toJsFn)
      __obj.asInstanceOf[CloseOnEscapeProps]
    }
    
    extension [Self <: CloseOnEscapeProps](x: Self) {
      
      inline def setOnEscape(value: Callback): Self = StObject.set(x, "onEscape", value.toJsFn)
    }
  }
}
