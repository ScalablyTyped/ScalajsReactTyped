package typingsJapgolly.reactBootstrap

import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.HTMLProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNavbarBrandMod {
  
  @JSImport("react-bootstrap/lib/NavbarBrand", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends Component[NavbarBrandProps, js.Object, Any]
  
  type NavbarBrand = japgolly.scalajs.react.facade.React.Component[NavbarBrandProps & js.Object, js.Object]
  
  trait NavbarBrandProps
    extends StObject
       with HTMLProps[
          japgolly.scalajs.react.facade.React.Component[NavbarBrandProps & js.Object, js.Object]
        ]
  object NavbarBrandProps {
    
    inline def apply(): NavbarBrandProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavbarBrandProps]
    }
  }
}
