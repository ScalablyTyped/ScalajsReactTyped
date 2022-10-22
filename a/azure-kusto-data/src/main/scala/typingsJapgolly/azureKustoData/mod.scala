package typingsJapgolly.azureKustoData

import typingsJapgolly.azureKustoData.sourceClientMod.default
import typingsJapgolly.azureMsalCommon.distResponseDeviceCodeResponseMod.DeviceCodeResponse
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("azure-kusto-data", "Client")
  @js.native
  open class Client protected () extends default {
    def this(kcsb: String) = this()
    def this(kcsb: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default) = this()
  }
  
  @JSImport("azure-kusto-data", "ClientRequestProperties")
  @js.native
  open class ClientRequestProperties ()
    extends typingsJapgolly.azureKustoData.sourceClientRequestPropertiesMod.default {
    def this(options: Record[String, Any]) = this()
    def this(options: Unit, parameters: Record[String, Any]) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any]) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: String) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any], clientRequestId: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: String, user: String) = this()
    def this(options: Unit, parameters: Record[String, Any], clientRequestId: Unit, user: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: String, user: String) = this()
    def this(options: Record[String, Any], parameters: Unit, clientRequestId: Unit, user: String) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String
    ) = this()
    def this(options: Record[String, Any], parameters: Record[String, Any], clientRequestId: Unit, user: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: String, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: String, user: Unit, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: String, application: String) = this()
    def this(options: Unit, parameters: Unit, clientRequestId: Unit, user: Unit, application: String) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Unit,
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Unit,
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: String,
      user: Unit,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: String,
      application: String
    ) = this()
    def this(
      options: Record[String, Any],
      parameters: Record[String, Any],
      clientRequestId: Unit,
      user: Unit,
      application: String
    ) = this()
  }
  
  @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
  @js.native
  open class KustoConnectionStringBuilder protected ()
    extends typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.default {
    def this(connectionString: String) = this()
  }
  /* static members */
  object KustoConnectionStringBuilder {
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.DefaultDatabaseName")
    @js.native
    val DefaultDatabaseName: /* "NetDefaultDB" */ String = js.native
    
    @JSImport("azure-kusto-data", "KustoConnectionStringBuilder.SecretReplacement")
    @js.native
    val SecretReplacement: /* "****" */ String = js.native
    
    inline def defaultDeviceCallback(response: DeviceCodeResponse): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultDeviceCallback")(response.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromExisting(other: typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("fromExisting")(other.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: String,
      applicationCertificateX5c: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationCertificateAuthentication(
      connectionString: String,
      aadAppId: String,
      applicationCertificatePrivateKey: String,
      applicationCertificateThumbprint: String,
      authorityId: Unit,
      applicationCertificateX5c: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationCertificateAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], applicationCertificatePrivateKey.asInstanceOf[js.Any], applicationCertificateThumbprint.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], applicationCertificateX5c.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadApplicationKeyAuthentication(connectionString: String, aadAppId: String, appKey: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadApplicationKeyAuthentication")(connectionString.asInstanceOf[js.Any], aadAppId.asInstanceOf[js.Any], appKey.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadDeviceAuthentication(connectionString: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(connectionString: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: String,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadDeviceAuthentication(
      connectionString: String,
      authorityId: Unit,
      deviceCodeCallback: js.Function1[/* response */ DeviceCodeResponse, Unit]
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadDeviceAuthentication")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], deviceCodeCallback.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    /**
      * @deprecated - use `withSystemManagedIdentity` or `withUserManagedIdentity` instead
      */
    inline def withAadManagedIdentities(connectionString: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadManagedIdentities(connectionString: String, msiClientId: Unit, authorityId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadManagedIdentities")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAadUserPasswordAuthentication(connectionString: String, userId: String, password: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAadUserPasswordAuthentication")(connectionString.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], password.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAccessToken(connectionString: String, accessToken: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAccessToken")(connectionString.asInstanceOf[js.Any], accessToken.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withAzLoginIdentity(connectionString: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withAzLoginIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withAzLoginIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withSystemManagedIdentity(connectionString: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withSystemManagedIdentity(connectionString: String, authorityId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withSystemManagedIdentity")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withTokenProvider(connectionString: String, tokenProvider: js.Function0[js.Promise[String]]): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withTokenProvider")(connectionString.asInstanceOf[js.Any], tokenProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserManagedIdentity(connectionString: String, msiClientId: String, authorityId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserManagedIdentity")(connectionString.asInstanceOf[js.Any], msiClientId.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    
    inline def withUserPrompt(connectionString: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = ^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: String,
      timeoutMs: Unit,
      loginHint: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: String,
      clientId: Unit,
      timeoutMs: Double,
      loginHint: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: String, clientId: Unit, timeoutMs: Unit, loginHint: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(
      connectionString: String,
      authorityId: Unit,
      clientId: String,
      timeoutMs: Double,
      loginHint: String
    ): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: String, timeoutMs: Unit, loginHint: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Double, loginHint: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
    inline def withUserPrompt(connectionString: String, authorityId: Unit, clientId: Unit, timeoutMs: Unit, loginHint: String): typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder = (^.asInstanceOf[js.Dynamic].applyDynamic("withUserPrompt")(connectionString.asInstanceOf[js.Any], authorityId.asInstanceOf[js.Any], clientId.asInstanceOf[js.Any], timeoutMs.asInstanceOf[js.Any], loginHint.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.azureKustoData.sourceConnectionBuilderMod.KustoConnectionStringBuilder]
  }
  
  object KustoDataErrors {
    
    @JSImport("azure-kusto-data", "KustoDataErrors.KustoAuthenticationError")
    @js.native
    open class KustoAuthenticationError protected ()
      extends typingsJapgolly.azureKustoData.sourceErrorsMod.KustoAuthenticationError {
      def this(message: String, inner: js.Error, tokenProviderName: String, context: Record[String, Any]) = this()
      def this(message: String, inner: Unit, tokenProviderName: String, context: Record[String, Any]) = this()
    }
    
    @JSImport("azure-kusto-data", "KustoDataErrors.ThrottlingError")
    @js.native
    open class ThrottlingError protected ()
      extends typingsJapgolly.azureKustoData.sourceErrorsMod.ThrottlingError {
      def this(message: String) = this()
      def this(message: String, inner: js.Error) = this()
    }
  }
}
