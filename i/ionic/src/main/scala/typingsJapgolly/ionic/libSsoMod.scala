package typingsJapgolly.ionic

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionic.definitionsMod.IClient
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSsoMod {
  
  @JSImport("ionic/lib/sso", "Auth0OAuth2Flow")
  @js.native
  open class Auth0OAuth2Flow protected () extends OAuth2Flow {
    def this(
      hasEmailConnectionAudienceAuthorizationUrlTokenUrlClientIdOptions: Auth0OAuth2FlowOptions,
      e: OAuth2FlowDeps
    ) = this()
    
    val audience: String = js.native
    
    val connection: String = js.native
    
    val email: String = js.native
  }
  
  /* note: abstract class */ @JSImport("ionic/lib/sso", "OAuth2Flow")
  @js.native
  open class OAuth2Flow protected () extends StObject {
    def this(hasAuthorizationUrlTokenUrlClientIdRedirectHostRedirectPort: OAuth2FlowOptions, e: OAuth2FlowDeps) = this()
    
    val authorizationUrl: String = js.native
    
    /* protected */ def base64URLEncode(buffer: Buffer): String = js.native
    
    val clientId: String = js.native
    
    val e: OAuth2FlowDeps = js.native
    
    /* protected */ def generateAuthorizationParameters(challenge: String): AuthorizationParameters = js.native
    
    /* protected */ def generateChallenge(verifier: String): String = js.native
    
    /* protected */ def generateTokenParameters(authorizationCode: String, verifier: String): TokenParameters = js.native
    
    /* protected */ def generateVerifier(): String = js.native
    
    /* protected */ def getAccessToken(authorizationCode: String, verifier: String): js.Promise[String] = js.native
    
    /* protected */ def getAuthorizationCode(): js.Promise[String] = js.native
    
    /* protected */ def getSuccessHtml(): js.Promise[String] = js.native
    
    val redirectHost: String = js.native
    
    val redirectPort: Double = js.native
    
    def redirectUrl: String = js.native
    
    def run(): js.Promise[String] = js.native
    
    val tokenUrl: String = js.native
  }
  
  /* Inlined parent std.Partial<ionic.ionic/lib/sso.OAuth2FlowOptions> */
  trait Auth0OAuth2FlowOptions extends StObject {
    
    val audience: js.UndefOr[String] = js.undefined
    
    var authorizationUrl: js.UndefOr[String] = js.undefined
    
    var clientId: js.UndefOr[String] = js.undefined
    
    val connection: String
    
    val email: String
    
    var redirectHost: js.UndefOr[String] = js.undefined
    
    var redirectPort: js.UndefOr[Double] = js.undefined
    
    var tokenUrl: js.UndefOr[String] = js.undefined
  }
  object Auth0OAuth2FlowOptions {
    
    inline def apply(connection: String, email: String): Auth0OAuth2FlowOptions = {
      val __obj = js.Dynamic.literal(connection = connection.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any])
      __obj.asInstanceOf[Auth0OAuth2FlowOptions]
    }
    
    extension [Self <: Auth0OAuth2FlowOptions](x: Self) {
      
      inline def setAudience(value: String): Self = StObject.set(x, "audience", value.asInstanceOf[js.Any])
      
      inline def setAudienceUndefined: Self = StObject.set(x, "audience", js.undefined)
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationUrlUndefined: Self = StObject.set(x, "authorizationUrl", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
      
      inline def setConnection(value: String): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setRedirectHost(value: String): Self = StObject.set(x, "redirectHost", value.asInstanceOf[js.Any])
      
      inline def setRedirectHostUndefined: Self = StObject.set(x, "redirectHost", js.undefined)
      
      inline def setRedirectPort(value: Double): Self = StObject.set(x, "redirectPort", value.asInstanceOf[js.Any])
      
      inline def setRedirectPortUndefined: Self = StObject.set(x, "redirectPort", js.undefined)
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
      
      inline def setTokenUrlUndefined: Self = StObject.set(x, "tokenUrl", js.undefined)
    }
  }
  
  type AuthorizationParameters = StringDictionary[String]
  
  trait OAuth2FlowDeps extends StObject {
    
    val client: IClient
  }
  object OAuth2FlowDeps {
    
    inline def apply(client: IClient): OAuth2FlowDeps = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2FlowDeps]
    }
    
    extension [Self <: OAuth2FlowDeps](x: Self) {
      
      inline def setClient(value: IClient): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
    }
  }
  
  trait OAuth2FlowOptions extends StObject {
    
    val authorizationUrl: String
    
    val clientId: String
    
    val redirectHost: js.UndefOr[String] = js.undefined
    
    val redirectPort: js.UndefOr[Double] = js.undefined
    
    val tokenUrl: String
  }
  object OAuth2FlowOptions {
    
    inline def apply(authorizationUrl: String, clientId: String, tokenUrl: String): OAuth2FlowOptions = {
      val __obj = js.Dynamic.literal(authorizationUrl = authorizationUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], tokenUrl = tokenUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[OAuth2FlowOptions]
    }
    
    extension [Self <: OAuth2FlowOptions](x: Self) {
      
      inline def setAuthorizationUrl(value: String): Self = StObject.set(x, "authorizationUrl", value.asInstanceOf[js.Any])
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setRedirectHost(value: String): Self = StObject.set(x, "redirectHost", value.asInstanceOf[js.Any])
      
      inline def setRedirectHostUndefined: Self = StObject.set(x, "redirectHost", js.undefined)
      
      inline def setRedirectPort(value: Double): Self = StObject.set(x, "redirectPort", value.asInstanceOf[js.Any])
      
      inline def setRedirectPortUndefined: Self = StObject.set(x, "redirectPort", js.undefined)
      
      inline def setTokenUrl(value: String): Self = StObject.set(x, "tokenUrl", value.asInstanceOf[js.Any])
    }
  }
  
  type TokenParameters = StringDictionary[String]
}
