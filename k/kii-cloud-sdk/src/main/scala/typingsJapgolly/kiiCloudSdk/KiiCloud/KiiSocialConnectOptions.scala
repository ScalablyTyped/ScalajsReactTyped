package typingsJapgolly.kiiCloudSdk.KiiCloud

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.kiiCloudSdk.anon.Accesstoken
  - typingsJapgolly.kiiCloudSdk.anon.Oauthtoken
*/
trait KiiSocialConnectOptions extends StObject
object KiiSocialConnectOptions {
  
  inline def Accesstoken(access_token: String): typingsJapgolly.kiiCloudSdk.anon.Accesstoken = {
    val __obj = js.Dynamic.literal(access_token = access_token.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.kiiCloudSdk.anon.Accesstoken]
  }
  
  inline def Oauthtoken(oauth_token: String, oauth_token_secret: String): typingsJapgolly.kiiCloudSdk.anon.Oauthtoken = {
    val __obj = js.Dynamic.literal(oauth_token = oauth_token.asInstanceOf[js.Any], oauth_token_secret = oauth_token_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.kiiCloudSdk.anon.Oauthtoken]
  }
}
