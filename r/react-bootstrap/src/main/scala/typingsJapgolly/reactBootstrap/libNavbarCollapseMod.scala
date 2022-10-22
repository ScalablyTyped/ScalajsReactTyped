package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarCollapseMod {
  
  @JSImport("react-bootstrap/lib/NavbarCollapse", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarCollapseProps, js.Object, Any]
  
  type NavbarCollapse = japgolly.scalajs.react.facade.React.Component[NavbarCollapseProps & js.Object, js.Object]
  
  trait NavbarCollapseProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarCollapseProps & js.Object, js.Object]
        ]
  object NavbarCollapseProps {
    
    inline def apply(): NavbarCollapseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarCollapseProps]
    }
  }
}
