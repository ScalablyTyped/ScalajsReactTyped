package typingsJapgolly.reactAuthKit

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHigherOrderComponentsWithIsAuthenticatedMod {
  
  @JSImport("react-auth-kit/dist/higherOrderComponents/withIsAuthenticated", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    * @function
    * @name withIsAuthenticated
    * @description Inject Authentication status inside the Component's Prop
    * @param Component
    */
  inline def default[P /* <: withAuthHeaderProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @interface withAuthHeaderProps
    */
  trait withAuthHeaderProps extends StObject {
    
    var isAuth: String
  }
  object withAuthHeaderProps {
    
    inline def apply(isAuth: String): withAuthHeaderProps = {
      val __obj = js.Dynamic.literal(isAuth = isAuth.asInstanceOf[js.Any])
      __obj.asInstanceOf[withAuthHeaderProps]
    }
    
    extension [Self <: withAuthHeaderProps](x: Self) {
      
      inline def setIsAuth(value: String): Self = StObject.set(x, "isAuth", value.asInstanceOf[js.Any])
    }
  }
}
