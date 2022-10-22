package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarToggleMod {
  
  @JSImport("react-bootstrap/lib/NavbarToggle", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarToggleProps, js.Object, Any]
  
  type NavbarToggle = japgolly.scalajs.react.facade.React.Component[NavbarToggleProps & js.Object, js.Object]
  
  trait NavbarToggleProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarToggleProps & js.Object, js.Object]
        ] {
    
    @JSName("onClick")
    var onClick_NavbarToggleProps: js.UndefOr[MouseEventHandler[Any]] = js.undefined
  }
  object NavbarToggleProps {
    
    inline def apply(): NavbarToggleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarToggleProps]
    }
    
    extension [Self <: NavbarToggleProps](x: Self) {
      
      inline def setOnClick(value: ReactMouseEventFrom[Any & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[Any & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
}
