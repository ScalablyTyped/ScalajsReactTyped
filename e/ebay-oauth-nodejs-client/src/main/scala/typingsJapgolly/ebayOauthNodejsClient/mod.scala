package typingsJapgolly.ebayOauthNodejsClient

import typingsJapgolly.ebayOauthNodejsClient.anon.Prompt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ebay-oauth-nodejs-client", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with EbayAuthToken {
    def this(options: EbayAuthTokenOptions) = this()
  }
  
  @js.native
  trait EbayAuthToken extends StObject {
    
    def exchangeCodeForAccessToken(environment: EbayEnvironment, code: String): js.Promise[String] = js.native
    
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: String): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: String, options: Prompt): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: js.Array[String]): String = js.native
    def generateUserAuthorizationUrl(environment: EbayEnvironment, scopes: js.Array[String], options: Prompt): String = js.native
    
    def getAccessToken(environment: EbayEnvironment, refreshToken: String, scopes: String): js.Promise[String] = js.native
    def getAccessToken(environment: EbayEnvironment, refreshToken: String, scopes: js.Array[String]): js.Promise[String] = js.native
    
    def getApplicationToken(environment: EbayEnvironment): js.Promise[String] = js.native
    def getApplicationToken(environment: EbayEnvironment, scopes: String): js.Promise[String] = js.native
    def getApplicationToken(environment: EbayEnvironment, scopes: js.Array[String]): js.Promise[String] = js.native
    
    def getRefreshToken(): String = js.native
    
    def setRefreshToken(refreshToken: String): Unit = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ebayOauthNodejsClient.anon.FilePath
    - typingsJapgolly.ebayOauthNodejsClient.anon.BaseUrl
  */
  trait EbayAuthTokenOptions extends StObject
  object EbayAuthTokenOptions {
    
    inline def BaseUrl(clientId: String, clientSecret: String): typingsJapgolly.ebayOauthNodejsClient.anon.BaseUrl = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ebayOauthNodejsClient.anon.BaseUrl]
    }
    
    inline def FilePath(filePath: String): typingsJapgolly.ebayOauthNodejsClient.anon.FilePath = {
      val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsJapgolly.ebayOauthNodejsClient.anon.FilePath]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX
    - typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION
  */
  trait EbayEnvironment extends StObject
  object EbayEnvironment {
    
    inline def PRODUCTION: typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION = "PRODUCTION".asInstanceOf[typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.PRODUCTION]
    
    inline def SANDBOX: typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX = "SANDBOX".asInstanceOf[typingsJapgolly.ebayOauthNodejsClient.ebayOauthNodejsClientStrings.SANDBOX]
  }
}
