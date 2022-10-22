package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarHeaderMod {
  
  @JSImport("react-bootstrap/lib/NavbarHeader", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarHeaderProps, js.Object, Any]
  
  type NavbarHeader = japgolly.scalajs.react.facade.React.Component[NavbarHeaderProps & js.Object, js.Object]
  
  trait NavbarHeaderProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarHeaderProps & js.Object, js.Object]
        ]
  object NavbarHeaderProps {
    
    inline def apply(): NavbarHeaderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarHeaderProps]
    }
  }
}
