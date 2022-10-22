package typingsJapgolly.reactAuthKit

import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPrivateRouteMod extends Shortcut {
  
  @JSImport("react-auth-kit/dist/PrivateRoute", JSImport.Default)
  @js.native
  val default: FunctionComponent[RequireAuthProps] = js.native
  
  trait RequireAuthProps extends StObject {
    
    var children: Element
    
    var loginPath: String
  }
  object RequireAuthProps {
    
    inline def apply(children: VdomElement, loginPath: String): RequireAuthProps = {
      val __obj = js.Dynamic.literal(children = children.rawElement.asInstanceOf[js.Any], loginPath = loginPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequireAuthProps]
    }
    
    extension [Self <: RequireAuthProps](x: Self) {
      
      inline def setChildren(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
      
      inline def setLoginPath(value: String): Self = StObject.set(x, "loginPath", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FunctionComponent[RequireAuthProps]
  
  /* This means you don't have to write `default`, but can instead just say `distPrivateRouteMod.foo` */
  override def _to: FunctionComponent[RequireAuthProps] = default
}
