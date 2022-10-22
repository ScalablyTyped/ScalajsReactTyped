package typingsJapgolly.forgeApis.mod

import typingsJapgolly.forgeApis.anon.Refreshtoken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("forge-apis", "AuthClientThreeLegged")
@js.native
open class AuthClientThreeLegged protected ()
  extends StObject
     with AuthClient {
  def this(
    clientId: String,
    clientSecret: String,
    redirectUri: String,
    scopes: js.Array[Scope],
    autoRefresh: Boolean
  ) = this()
  
  def generateAuthUrl(state: String): String = js.native
  
  def getToken(code: String): js.Promise[AuthToken] = js.native
  
  def refreshToken(credentials: Refreshtoken): js.Promise[AuthToken] = js.native
  def refreshToken(credentials: Refreshtoken, scope: js.Array[Scope]): js.Promise[AuthToken] = js.native
}
