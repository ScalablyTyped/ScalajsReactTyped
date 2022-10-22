package typingsJapgolly.firebaseAuthTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/auth-types", "GithubAuthProvider_Instance")
@js.native
open class GithubAuthProviderInstance ()
  extends StObject
     with AuthProvider {
  
  def addScope(scope: String): AuthProvider = js.native
  
  /* CompleteClass */
  var providerId: String = js.native
  
  def setCustomParameters(customOAuthParameters: js.Object): AuthProvider = js.native
}
