package typingsJapgolly.azureMsalNode

import typingsJapgolly.azureMsalCommon.distAuthorityProtocolModeMod.ProtocolMode
import typingsJapgolly.azureMsalCommon.distCacheInterfaceIcachepluginMod.ICachePlugin
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.ApplicationTelemetry
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.AzureCloudOptions
import typingsJapgolly.azureMsalCommon.distConfigClientConfigurationMod.LoggerOptions
import typingsJapgolly.azureMsalCommon.distNetworkInetworkmoduleMod.INetworkModule
import typingsJapgolly.azureMsalNode.anon.PrivateKey
import typingsJapgolly.azureMsalNode.anon.RequiredNodeAuthOptions
import typingsJapgolly.azureMsalNode.anon.RequiredNodeSystemOptions
import typingsJapgolly.azureMsalNode.anon.RequiredNodeTelemetryOpti
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distConfigConfigurationMod {
  
  @JSImport("@azure/msal-node/dist/config/Configuration", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildAppConfiguration(hasAuthCacheSystemTelemetry: Configuration): NodeConfiguration = ^.asInstanceOf[js.Dynamic].applyDynamic("buildAppConfiguration")(hasAuthCacheSystemTelemetry.asInstanceOf[js.Any]).asInstanceOf[NodeConfiguration]
  
  trait CacheOptions extends StObject {
    
    var cachePlugin: js.UndefOr[ICachePlugin] = js.undefined
  }
  object CacheOptions {
    
    inline def apply(): CacheOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CacheOptions]
    }
    
    extension [Self <: CacheOptions](x: Self) {
      
      inline def setCachePlugin(value: ICachePlugin): Self = StObject.set(x, "cachePlugin", value.asInstanceOf[js.Any])
      
      inline def setCachePluginUndefined: Self = StObject.set(x, "cachePlugin", js.undefined)
    }
  }
  
  trait Configuration extends StObject {
    
    var auth: NodeAuthOptions
    
    var cache: js.UndefOr[CacheOptions] = js.undefined
    
    var system: js.UndefOr[NodeSystemOptions] = js.undefined
    
    var telemetry: js.UndefOr[NodeTelemetryOptions] = js.undefined
  }
  object Configuration {
    
    inline def apply(auth: NodeAuthOptions): Configuration = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAuth(value: NodeAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCache(value: CacheOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setSystem(value: NodeSystemOptions): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setSystemUndefined: Self = StObject.set(x, "system", js.undefined)
      
      inline def setTelemetry(value: NodeTelemetryOptions): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    }
  }
  
  trait NodeAuthOptions extends StObject {
    
    var authority: js.UndefOr[String] = js.undefined
    
    var authorityMetadata: js.UndefOr[String] = js.undefined
    
    var azureCloudOptions: js.UndefOr[AzureCloudOptions] = js.undefined
    
    var clientAssertion: js.UndefOr[String] = js.undefined
    
    var clientCapabilities: js.UndefOr[js.Array[String]] = js.undefined
    
    var clientCertificate: js.UndefOr[PrivateKey] = js.undefined
    
    var clientId: String
    
    var clientSecret: js.UndefOr[String] = js.undefined
    
    var cloudDiscoveryMetadata: js.UndefOr[String] = js.undefined
    
    var knownAuthorities: js.UndefOr[js.Array[String]] = js.undefined
    
    var protocolMode: js.UndefOr[ProtocolMode] = js.undefined
    
    var skipAuthorityMetadataCache: js.UndefOr[Boolean] = js.undefined
  }
  object NodeAuthOptions {
    
    inline def apply(clientId: String): NodeAuthOptions = {
      val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeAuthOptions]
    }
    
    extension [Self <: NodeAuthOptions](x: Self) {
      
      inline def setAuthority(value: String): Self = StObject.set(x, "authority", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadata(value: String): Self = StObject.set(x, "authorityMetadata", value.asInstanceOf[js.Any])
      
      inline def setAuthorityMetadataUndefined: Self = StObject.set(x, "authorityMetadata", js.undefined)
      
      inline def setAuthorityUndefined: Self = StObject.set(x, "authority", js.undefined)
      
      inline def setAzureCloudOptions(value: AzureCloudOptions): Self = StObject.set(x, "azureCloudOptions", value.asInstanceOf[js.Any])
      
      inline def setAzureCloudOptionsUndefined: Self = StObject.set(x, "azureCloudOptions", js.undefined)
      
      inline def setClientAssertion(value: String): Self = StObject.set(x, "clientAssertion", value.asInstanceOf[js.Any])
      
      inline def setClientAssertionUndefined: Self = StObject.set(x, "clientAssertion", js.undefined)
      
      inline def setClientCapabilities(value: js.Array[String]): Self = StObject.set(x, "clientCapabilities", value.asInstanceOf[js.Any])
      
      inline def setClientCapabilitiesUndefined: Self = StObject.set(x, "clientCapabilities", js.undefined)
      
      inline def setClientCapabilitiesVarargs(value: String*): Self = StObject.set(x, "clientCapabilities", js.Array(value*))
      
      inline def setClientCertificate(value: PrivateKey): Self = StObject.set(x, "clientCertificate", value.asInstanceOf[js.Any])
      
      inline def setClientCertificateUndefined: Self = StObject.set(x, "clientCertificate", js.undefined)
      
      inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
      
      inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
      
      inline def setClientSecretUndefined: Self = StObject.set(x, "clientSecret", js.undefined)
      
      inline def setCloudDiscoveryMetadata(value: String): Self = StObject.set(x, "cloudDiscoveryMetadata", value.asInstanceOf[js.Any])
      
      inline def setCloudDiscoveryMetadataUndefined: Self = StObject.set(x, "cloudDiscoveryMetadata", js.undefined)
      
      inline def setKnownAuthorities(value: js.Array[String]): Self = StObject.set(x, "knownAuthorities", value.asInstanceOf[js.Any])
      
      inline def setKnownAuthoritiesUndefined: Self = StObject.set(x, "knownAuthorities", js.undefined)
      
      inline def setKnownAuthoritiesVarargs(value: String*): Self = StObject.set(x, "knownAuthorities", js.Array(value*))
      
      inline def setProtocolMode(value: ProtocolMode): Self = StObject.set(x, "protocolMode", value.asInstanceOf[js.Any])
      
      inline def setProtocolModeUndefined: Self = StObject.set(x, "protocolMode", js.undefined)
      
      inline def setSkipAuthorityMetadataCache(value: Boolean): Self = StObject.set(x, "skipAuthorityMetadataCache", value.asInstanceOf[js.Any])
      
      inline def setSkipAuthorityMetadataCacheUndefined: Self = StObject.set(x, "skipAuthorityMetadataCache", js.undefined)
    }
  }
  
  trait NodeConfiguration extends StObject {
    
    var auth: RequiredNodeAuthOptions
    
    var cache: CacheOptions
    
    var system: RequiredNodeSystemOptions
    
    var telemetry: RequiredNodeTelemetryOpti
  }
  object NodeConfiguration {
    
    inline def apply(
      auth: RequiredNodeAuthOptions,
      cache: CacheOptions,
      system: RequiredNodeSystemOptions,
      telemetry: RequiredNodeTelemetryOpti
    ): NodeConfiguration = {
      val __obj = js.Dynamic.literal(auth = auth.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], system = system.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeConfiguration]
    }
    
    extension [Self <: NodeConfiguration](x: Self) {
      
      inline def setAuth(value: RequiredNodeAuthOptions): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setCache(value: CacheOptions): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setSystem(value: RequiredNodeSystemOptions): Self = StObject.set(x, "system", value.asInstanceOf[js.Any])
      
      inline def setTelemetry(value: RequiredNodeTelemetryOpti): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeSystemOptions extends StObject {
    
    var loggerOptions: js.UndefOr[LoggerOptions] = js.undefined
    
    var networkClient: js.UndefOr[INetworkModule] = js.undefined
    
    var proxyUrl: js.UndefOr[String] = js.undefined
  }
  object NodeSystemOptions {
    
    inline def apply(): NodeSystemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeSystemOptions]
    }
    
    extension [Self <: NodeSystemOptions](x: Self) {
      
      inline def setLoggerOptions(value: LoggerOptions): Self = StObject.set(x, "loggerOptions", value.asInstanceOf[js.Any])
      
      inline def setLoggerOptionsUndefined: Self = StObject.set(x, "loggerOptions", js.undefined)
      
      inline def setNetworkClient(value: INetworkModule): Self = StObject.set(x, "networkClient", value.asInstanceOf[js.Any])
      
      inline def setNetworkClientUndefined: Self = StObject.set(x, "networkClient", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
    }
  }
  
  trait NodeTelemetryOptions extends StObject {
    
    var application: js.UndefOr[ApplicationTelemetry] = js.undefined
  }
  object NodeTelemetryOptions {
    
    inline def apply(): NodeTelemetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeTelemetryOptions]
    }
    
    extension [Self <: NodeTelemetryOptions](x: Self) {
      
      inline def setApplication(value: ApplicationTelemetry): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      inline def setApplicationUndefined: Self = StObject.set(x, "application", js.undefined)
    }
  }
}
