package typingsJapgolly.awsSdkCredentialProviderNode

import typingsJapgolly.awsSdkCredentialProviderImds.distTypesRemoteProviderRemoteProviderInitMod.RemoteProviderInit
import typingsJapgolly.awsSdkTypes.distTypesCredentialsMod.CredentialProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRemoteProviderMod {
  
  @JSImport("@aws-sdk/credential-provider-node/dist-types/remoteProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@aws-sdk/credential-provider-node/dist-types/remoteProvider", "ENV_IMDS_DISABLED")
  @js.native
  val ENV_IMDS_DISABLED: /* "AWS_EC2_METADATA_DISABLED" */ String = js.native
  
  inline def remoteProvider(init: RemoteProviderInit): CredentialProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("remoteProvider")(init.asInstanceOf[js.Any]).asInstanceOf[CredentialProvider]
}
