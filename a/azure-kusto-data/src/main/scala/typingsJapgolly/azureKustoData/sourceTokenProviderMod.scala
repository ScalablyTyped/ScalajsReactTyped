package typingsJapgolly.azureKustoData

import typingsJapgolly.azureCoreAuth.mod.TokenCredential
import typingsJapgolly.azureKustoData.sourceCloudSettingsMod.CloudInfo
import typingsJapgolly.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import typingsJapgolly.azureMsalNode.distConfigConfigurationMod.Configuration
import typingsJapgolly.azureMsalNode.mod.ConfidentialClientApplication
import typingsJapgolly.azureMsalNode.mod.PublicClientApplication
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTokenProviderMod {
  
  @JSImport("azure-kusto-data/source/tokenProvider", "ApplicationCertificateTokenProvider")
  @js.native
  open class ApplicationCertificateTokenProvider protected () extends MsalTokenProvider {
    def this(kustoUri: String, appClientId: String, certThumbprint: String, certPrivateKey: String) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certThumbprint: String,
      certPrivateKey: String,
      certX5c: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certThumbprint: String,
      certPrivateKey: String,
      certX5c: String,
      authorityId: String
    ) = this()
    def this(
      kustoUri: String,
      appClientId: String,
      certThumbprint: String,
      certPrivateKey: String,
      certX5c: Unit,
      authorityId: String
    ) = this()
    
    /* private */ var appClientId: Any = js.native
    
    /* private */ var certPrivateKey: Any = js.native
    
    /* private */ var certThumbprint: Any = js.native
    
    /* private */ var certX5c: Any = js.native
    
    var msalClient: ConfidentialClientApplication = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "ApplicationKeyTokenProvider")
  @js.native
  open class ApplicationKeyTokenProvider protected () extends MsalTokenProvider {
    def this(kustoUri: String, appClientId: String, appKey: String, authorityId: String) = this()
    
    /* private */ var appClientId: Any = js.native
    
    /* private */ var appKey: Any = js.native
    
    var msalClient: ConfidentialClientApplication = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "AzCliTokenProvider")
  @js.native
  open class AzCliTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, authorityId: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, authorityId: Unit, timeoutMs: Double) = this()
  }
  
  /* note: abstract class */ @JSImport("azure-kusto-data/source/tokenProvider", "AzureIdentityProvider")
  @js.native
  open class AzureIdentityProvider protected () extends CloudSettingsTokenProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, authorityId: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, authorityId: Unit, timeoutMs: Double) = this()
    
    /* protected */ var authorityId: js.UndefOr[String] = js.native
    
    /* private */ var credential: Any = js.native
    
    def getCredential(): TokenCredential = js.native
    
    /* private */ var timeoutMs: Any = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "BasicTokenProvider")
  @js.native
  open class BasicTokenProvider protected () extends TokenProviderBase {
    def this(kustoUri: String, token: String) = this()
    
    var token: String = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "CallbackTokenProvider")
  @js.native
  open class CallbackTokenProvider protected () extends TokenProviderBase {
    def this(kustoUri: String, callback: js.Function0[js.Promise[String]]) = this()
    
    def callback(): js.Promise[String] = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "DeviceLoginTokenProvider")
  @js.native
  open class DeviceLoginTokenProvider protected () extends MsalTokenProvider {
    def this(
      kustoUri: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit],
      authorityId: String
    ) = this()
    
    def deviceCodeCallback(response: DeviceCodeResponse): Unit = js.native
    
    var homeAccountId: js.UndefOr[String] = js.native
    
    var msalClient: PublicClientApplication = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "MsiTokenProvider")
  @js.native
  open class MsiTokenProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String) = this()
    def this(kustoUri: String, clientId: String) = this()
    def this(kustoUri: String, clientId: String, authorityId: String) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: String) = this()
    def this(kustoUri: String, clientId: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: String, authorityId: Unit, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, clientId: Unit, authorityId: Unit, timeoutMs: Double) = this()
    
    /* protected */ var clientId: js.UndefOr[String] = js.native
  }
  
  /* note: abstract class */ @JSImport("azure-kusto-data/source/tokenProvider", "TokenProviderBase")
  @js.native
  open class TokenProviderBase protected () extends StObject {
    /* protected */ def this(kustoUri: String) = this()
    
    def acquireToken(): js.Promise[TokenResponse] = js.native
    
    def context(): Record[String, Any] = js.native
    
    var kustoUri: String = js.native
    
    var scopes: js.Array[String] = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "UserPassTokenProvider")
  @js.native
  open class UserPassTokenProvider protected () extends MsalTokenProvider {
    def this(kustoUri: String, userName: String, password: String, authorityId: String) = this()
    
    var homeAccountId: js.UndefOr[String] = js.native
    
    var msalClient: PublicClientApplication = js.native
    
    var password: String = js.native
    
    var userName: String = js.native
  }
  
  @JSImport("azure-kusto-data/source/tokenProvider", "UserPromptProvider")
  @js.native
  open class UserPromptProvider protected () extends AzureIdentityProvider {
    def this(kustoUri: String, authorityId: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Double, loginHint: String) = this()
    def this(kustoUri: String, authorityId: String, timeoutMs: Unit, loginHint: String) = this()
    
    val MaxPort: /* 65536 */ Double = js.native
    
    val MinPort: /* 20000 */ Double = js.native
    
    /* private */ var getRandomPortInRange: Any = js.native
    
    /* private */ var loginHint: Any = js.native
  }
  
  /**
    * Token providers that require cloud settings to be configured - msal and azure identity
    */
  @js.native
  trait CloudSettingsTokenProvider extends TokenProviderBase {
    
    def acquireTokenWithCloudSettings(): js.Promise[TokenType | Null] = js.native
    
    def additionalCloudSettingsInit(): Unit = js.native
    
    /* protected */ var cloudInfo: CloudInfo = js.native
    
    def initClient(): Unit = js.native
    
    /* protected */ var initialized: Boolean = js.native
  }
  
  /**
    * Acquire a token from MSAL
    */
  @js.native
  trait MsalTokenProvider extends CloudSettingsTokenProvider {
    
    /* protected */ var authorityId: String = js.native
    
    /* protected */ var authorityUri: String = js.native
    
    /* private */ var clientId: Any = js.native
    
    def commonOptions(): Configuration = js.native
  }
  
  trait TokenResponse extends StObject {
    
    var accessToken: String
    
    var tokenType: String
  }
  object TokenResponse {
    
    inline def apply(accessToken: String, tokenType: String): TokenResponse = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenResponse]
    }
    
    extension [Self <: TokenResponse](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
  
  trait TokenType extends StObject {
    
    var accessToken: String
    
    var tokenType: String
  }
  object TokenType {
    
    inline def apply(accessToken: String, tokenType: String): TokenType = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], tokenType = tokenType.asInstanceOf[js.Any])
      __obj.asInstanceOf[TokenType]
    }
    
    extension [Self <: TokenType](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setTokenType(value: String): Self = StObject.set(x, "tokenType", value.asInstanceOf[js.Any])
    }
  }
}
