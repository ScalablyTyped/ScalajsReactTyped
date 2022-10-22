package typingsJapgolly.octokitAuthToken

import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Authentication
import typingsJapgolly.octokitAuthToken.distTypesTypesMod.Token
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAuthMod {
  
  @JSImport("@octokit/auth-token/dist-types/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def auth(token: Token): js.Promise[Authentication] = ^.asInstanceOf[js.Dynamic].applyDynamic("auth")(token.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Authentication]]
}
