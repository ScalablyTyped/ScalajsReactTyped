package typingsJapgolly.nextAuth

import typingsJapgolly.nextAuth.anon.PartialOAuthConfigany
import typingsJapgolly.nextAuth.providersOauthMod.OAuthConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providersZohoMod {
  
  @JSImport("next-auth/providers/zoho", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(options: PartialOAuthConfigany): OAuthConfig[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[OAuthConfig[Any]]
}
