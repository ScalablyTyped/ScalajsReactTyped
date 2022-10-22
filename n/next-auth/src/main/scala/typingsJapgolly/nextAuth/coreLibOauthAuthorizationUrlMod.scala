package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.CookiesRedirect
import typingsJapgolly.nextAuth.anon.Query
import typingsJapgolly.nextAuth.anon.Redirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreLibOauthAuthorizationUrlMod {
  
  @JSImport("next-auth/core/lib/oauth/authorization-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(hasOptionsQuery: Query): js.Promise[Redirect | CookiesRedirect] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasOptionsQuery.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Redirect | CookiesRedirect]]
}
