package typingsJapgolly.reactBootstrap

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.ElementType
import org.scalajs.dom.Element
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import typingsJapgolly.react.mod.MouseEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSafeAnchorMod {
  
  @JSImport("react-bootstrap/lib/SafeAnchor", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[SafeAnchorProps, js.Object, Any]
  
  type SafeAnchor = japgolly.scalajs.react.facade.React.Component[SafeAnchorProps & js.Object, js.Object]
  
  trait SafeAnchorProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[SafeAnchorProps & js.Object, js.Object]
        ] {
    
    var componentClass: js.UndefOr[ElementType] = js.undefined
    
    @JSName("onClick")
    var onClick_SafeAnchorProps: js.UndefOr[MouseEventHandler[js.Object]] = js.undefined
    
    @JSName("role")
    var role_SafeAnchorProps: js.UndefOr[String] = js.undefined
  }
  object SafeAnchorProps {
    
    inline def apply(): SafeAnchorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SafeAnchorProps]
    }
    
    extension [Self <: SafeAnchorProps](x: Self) {
      
      inline def setComponentClass(value: ElementType): Self = StObject.set(x, "componentClass", value.asInstanceOf[js.Any])
      
      inline def setComponentClassUndefined: Self = StObject.set(x, "componentClass", js.undefined)
      
      inline def setOnClick(value: ReactMouseEventFrom[js.Object & Element] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & Element]) => value(t0).runNow()))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    }
  }
}
