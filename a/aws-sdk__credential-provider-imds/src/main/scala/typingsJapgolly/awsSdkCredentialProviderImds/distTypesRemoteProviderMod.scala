package typingsJapgolly.awsSdkCredentialProviderImds

import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderImdsCredentialsMod.ImdsCredentials
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderConfig
import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.Credentials
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRemoteProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", "DEFAULT_MAX_RETRIES")
  @js.native
  val DEFAULT_MAX_RETRIES: /* 0 */ Double = js.native
  
  @JSImport("@aws-sdk/credential-provider-imds/dist-types/remoteProvider", "DEFAULT_TIMEOUT")
  @js.native
  val DEFAULT_TIMEOUT: /* 1000 */ Double = js.native
  
  inline def fromImdsCredentials(creds: ImdsCredentials): Credentials = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImdsCredentials")(creds.asInstanceOf[js.Any]).asInstanceOf[Credentials]
  
  inline def isImdsCredentials(arg: Any): /* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isImdsCredentials")(arg.asInstanceOf[js.Any]).asInstanceOf[/* is @aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/dist-types/remoteProvider/ImdsCredentials.ImdsCredentials */ Boolean]
  
  inline def providerConfigFromInit(hasMaxRetriesTimeout: RemoteProviderInit): RemoteProviderConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("providerConfigFromInit")(hasMaxRetriesTimeout.asInstanceOf[js.Any]).asInstanceOf[RemoteProviderConfig]
}
