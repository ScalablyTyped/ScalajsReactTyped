package typingsJapgolly.azureKustoData

import typingsJapgolly.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceConnectionBuilderMod {
  
  @JSImport("azure-kusto-data/source/connectionBuilder", JSImport.Default)
  @js.native
  open class default protected () extends KustoConnectionStringBuilder {
    def this(connectionString: String) = this()
  }
  /* static members */
  object default {
    
    @JSImport("azure-kusto-data/source/connectionBuilder", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/source/connectionBuilder", "default.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/source/connectionBuilder", "default.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def defaultDeviceCallback(response: DeviceCodeResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultDeviceCallback")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromExisting(other: KustoConnectionStringBuilder): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExisting")(other.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String,
      applicationCertificateX5c: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: Unit,
      applicationCertificateX5c: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    /**
      * @deprecated - use `withSystemManagedIdentity` or `withUserManagedIdentity` instead
      */
    inline def withAadManagedIdentities(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserPrompt(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Unit,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: Unit,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: Unit,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
  
  @JSImport("azure-kusto-data/source/connectionBuilder", "KustoConnectionStringBuilder")
  @js.native
  open class KustoConnectionStringBuilder protected () extends StObject {
    def this(connectionString: String) = this()
    
    var aadFederatedSecurity: js.UndefOr[Boolean] = js.native
    
    var aadUserId: js.UndefOr[String] = js.native
    
    var accessToken: js.UndefOr[String] = js.native
    
    var applicationCertificatePrivateKey: js.UndefOr[String] = js.native
    
    var applicationCertificateThumbprint: js.UndefOr[String] = js.native
    
    var applicationCertificateX5c: js.UndefOr[String] = js.native
    
    var applicationClientId: js.UndefOr[String] = js.native
    
    var applicationKey: js.UndefOr[String] = js.native
    
    var authorityId: String = js.native
    
    var dataSource: js.UndefOr[String] = js.native
    
    var deviceCodeCallback: js.UndefOr[js.Function1[/* response */ DeviceCodeResponse, Unit]] = js.native
    
    var initialCatalog: js.UndefOr[String] = js.native
    
    var loginHint: js.UndefOr[String] = js.native
    
    var msiClientId: js.UndefOr[String] = js.native
    
    var password: js.UndefOr[String] = js.native
    
    var timeoutMs: js.UndefOr[Double] = js.native
    
    def toString(removeSecrets: Boolean): String = js.native
    
    var tokenProvider: js.UndefOr[js.Function0[js.Promise[String]]] = js.native
    
    var useAzLoginAuth: js.UndefOr[Boolean] = js.native
    
    var useDeviceCodeAuth: js.UndefOr[Boolean] = js.native
    
    var useManagedIdentityAuth: js.UndefOr[Boolean] = js.native
    
    var useUserPromptAuth: js.UndefOr[Boolean] = js.native
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data/source/connectionBuilder", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data/source/connectionBuilder", "KustoConnectionStringBuilder.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data/source/connectionBuilder", "KustoConnectionStringBuilder.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def defaultDeviceCallback(response: DeviceCodeResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultDeviceCallback")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromExisting(other: KustoConnectionStringBuilder): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExisting")(other.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String,
      applicationCertificateX5c: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: Unit,
      applicationCertificateX5c: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    /**
      * @deprecated - use `withSystemManagedIdentity` or `withUserManagedIdentity` instead
      */
    inline def withAadManagedIdentities(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    
    inline def withUserPrompt(connectionString: String): KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Unit,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: Unit,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: Unit,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Unit, loginHint: String): KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[KustoConnectionStringBuilder]
  }
}
