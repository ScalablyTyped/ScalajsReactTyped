package typingsJapgolly.reactAuthKit

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.reactAuthKit.distTypesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHigherOrderComponentsWithSignInMod {
  
  @JSImport("react-auth-kit/dist/higherOrderComponents/withSignIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @public
    * @function
    * @name withSignIn
    * @description Inject sign in functionality inside the Component's Prop
    * @param Component
    */
  inline def default[P /* <: withSignInProps */](Component: ComponentType[P]): FunctionComponent[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Component.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[P]]
  
  /**
    * @interface withSignInProps
    */
  trait withSignInProps extends StObject {
    
    def signIn(params: signInFunctionParams): Boolean
  }
  object withSignInProps {
    
    inline def apply(signIn: signInFunctionParams => Boolean): withSignInProps = {
      val __obj = js.Dynamic.literal(signIn = js.Any.fromFunction1(signIn))
      __obj.asInstanceOf[withSignInProps]
    }
    
    extension [Self <: withSignInProps](x: Self) {
      
      inline def setSignIn(value: signInFunctionParams => Boolean): Self = StObject.set(x, "signIn", js.Any.fromFunction1(value))
    }
  }
}
