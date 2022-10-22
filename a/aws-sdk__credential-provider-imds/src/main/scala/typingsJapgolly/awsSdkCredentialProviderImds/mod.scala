package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesTypesMod.InstanceMetadataCredentials
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.Endpoint
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Provider
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.httpMod.RequestOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@aws-sdk/credential-provider-imds", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_AUTH_TOKEN")
  @js.native
  val ENV_CMDS_AUTH_TOKEN: /* "AWS_CONTAINER_AUTHORIZATION_TOKEN" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_FULL_URI")
  @js.native
  val ENV_CMDS_FULL_URI: /* "AWS_CONTAINER_CREDENTIALS_FULL_URI" */ String = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds", "ENV_CMDS_RELATIVE_URI")
  @js.native
  val ENV_CMDS_RELATIVE_URI: /* "AWS_CONTAINER_CREDENTIALS_RELATIVE_URI" */ String = js.native
  
  inline def fromContainerMetadata(): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")().asInstanceOf[CredentialProvider]
  inline def fromContainerMetadata(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("fromContainerMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
  
  inline def fromInstanceMetadata(): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")().asInstanceOf[Provider[InstanceMetadataCredentials]]
  inline def fromInstanceMetadata(init: RemoteProviderInit): Provider[InstanceMetadataCredentials] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInstanceMetadata")(init.asInstanceOf[js.Any]).asInstanceOf[Provider[InstanceMetadataCredentials]]
  
  inline def getInstanceMetadataEndpoint(): js.Promise[Endpoint] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceMetadataEndpoint")().asInstanceOf[js.Promise[Endpoint]]
  
  inline def httpRequest(options: RequestOptions): js.Promise[Buffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("httpRequest")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Buffer]]
  
  inline def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("providerConfigFromInit")(hasMaxRetriesTimeout.asInstanceOf[js.Any]).asInstanceOf[RemoteProviderConfig]
}
