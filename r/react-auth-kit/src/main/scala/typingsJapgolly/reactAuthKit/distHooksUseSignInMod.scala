package typingsJapgolly.reactAuthKit

import typingsJapgolly.reactAuthKit.distTypesMod.signInFunctionParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHooksUseSignInMod {
  
  @JSImport("react-auth-kit/dist/hooks/useSignIn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *@function
    *@name useSignIn
    *@description Authentication SignIn Hook
    *@returns - Sign In function
    */
  inline def default(): js.Function1[/* signInConfig */ signInFunctionParams, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Function1[/* signInConfig */ signInFunctionParams, Boolean]]
}
